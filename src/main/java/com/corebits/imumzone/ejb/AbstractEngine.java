package com.corebits.imumzone.ejb;

import com.corebits.imumzone.exception.IMumZoneException;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Oche
 */
@Stateless
public class AbstractEngine {

    @PersistenceContext
    protected EntityManager em;

//    public AbstractEngine() {
//        Objects.requireNonNull(em, "EntityManager can not be null");
//    }

    public <T> T create(T t) {
        em.persist(t);
        em.flush();
        em.refresh(t);
        return t;
    }

    public <T> T find(Class<T> type, Object id) {
        return (T) em.find(type, id);
    }

    public <T> void delete(Class<T> type, Object id) {
        Object object = em.getReference(type, id);
        em.remove(object);
    }

    public <T> T update(T t) {
        return em.merge(t);
    }

    public <T> List<T> findWithNativeQuery(String nativeQuery, Class<T> type) {
        return em.createNativeQuery(nativeQuery, type).getResultList();
    }

    public <T> List<T> findWithNativeQuery(String nativeQuery, Class<T> type, Map<String, Object> params) {
        Query query = buildNativeQuery(nativeQuery, type, params, -1, 0);
        return query.getResultList();
    }

    public <T> List<T> findWithNativeQuery(String nativeQuery, Class<T> type, Map<String, Object> params, int offset, int resultLimit) {
        Query query = buildNativeQuery(nativeQuery, type, params, offset, resultLimit);
        return query.getResultList();
    }

    public <T> List<T> findWithNamedQuery(String namedQuery) {
        return findWithNamedQuery(namedQuery, null, -1, 0);
    }

    public <T> T findWithNamedQuerySingle(String namedQuery, Map<String, Object> params) throws IMumZoneException {
        Query query = buildNamedQuery(namedQuery, params, -1, 0);
        return (T) query.getSingleResult();
    }

    public <T> List<T> findWithNamedQuery(String namedQuery, Map<String, Object> params, int offset, int resultLimit) {
        Query query = buildNamedQuery(namedQuery, params, offset, resultLimit);
        return query.getResultList();
    }

    public <T> List<T> findWithNamedQuery(String namedQuery, Map<String, Object> params) {
        Query query = buildNamedQuery(namedQuery, params, -1, 0);
        return query.getResultList();
    }

    private Query buildNamedQuery(String namedQuery, Map<String, Object> params, int offset, int resultLimit) {
        Query query = em.createNamedQuery(namedQuery);
        if (offset > -1) {
            query.setFirstResult(offset);
        }
        if (resultLimit > 0) {
            query.setMaxResults(resultLimit);
        }
        if (params != null && !params.isEmpty()) {
            params.entrySet().stream().forEach((entry) -> {
                query.setParameter(entry.getKey(), entry.getValue());
            });
        }
        return query;
    }

    private <T> Query buildNativeQuery(String nativeQuery, Class<T> type, Map<String, Object> params, int offset, int resultLimit) {
        Query query = em.createNativeQuery(nativeQuery, type);
        if (offset > -1) {
            query.setFirstResult(offset);
        }
        if (resultLimit > 0) {
            query.setMaxResults(resultLimit);
        }
        if (params != null && !params.isEmpty()) {
            params.entrySet().stream().forEach((entry) -> {
                query.setParameter(entry.getKey(), entry.getValue());
            });
        }
        return query;
    }

    public int insertNativeQuery(String query) {
        return em.createNativeQuery(query).executeUpdate();
    }
}
