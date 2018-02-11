package com.corebits.imumzone.exception;

import javax.ejb.ApplicationException;

/**
 *
 * @author Oche
 */
@ApplicationException(rollback=true)
public class IMumZoneException extends Exception{
    private static final long serialVersionUID = 1L;

    public IMumZoneException() {
    }

    public IMumZoneException(String message) {
        super(message);
    }

    public IMumZoneException(String message, Throwable cause) {
        super(message, cause);
    }

    public IMumZoneException(Throwable cause) {
        super(cause);
    }

    public IMumZoneException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }    
}
