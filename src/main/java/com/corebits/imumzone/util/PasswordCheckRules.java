package com.corebits.imumzone.util;

/**
 *
 * @author Tommy
 */
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Classe di controllo delle regole di definizione delle passord di GV. Creation
 * date: (04/07/2002 18.00.25)
 *
 * @author: Mario Scionti
 */
public class PasswordCheckRules {

    protected String sOldPassword = null;
    protected String sNewPassword = null;
    protected String sUserId = null;
    protected int ilenOldPassword = 0;
    protected int ilenNewPassword = 0;
    protected int ilenUserId = 0;

    private final Set<String> oViolatedRules = new LinkedHashSet<>();

    /**
     * Inserire qui la descrizione del metodo. Data di creazione: (07/07/2002
     * 11.45.35)
     *
     * @param oldPassword java.lang.String
     * @param newPassword java.lang.String
     * @param userId java.lang.String
     */
    public PasswordCheckRules(String userId, String oldPassword, String newPassword) {
        sUserId = userId;
        sOldPassword = oldPassword;
        sNewPassword = newPassword;

        // controlli degli spazi interni
        if (middleSpace(newPassword)) {
            oViolatedRules.add("NEWPASSWORD_ERR_SPACE");
        }

        // lunghezza delle password e della userid
        ilenOldPassword = sOldPassword.length();
        ilenNewPassword = sNewPassword.length();
        ilenUserId = sUserId.length();
    }

    /**
     * Controlla che la stringa contenga un carattere numerico. Creation date:
     * (05/07/2002 8.53.40)
     *
     * @return boolean
     * @param str java.lang.String
     */
    protected boolean checkDigits(String str) {
        String checkStr = str;
        boolean allValid = true;
        char ch;
        for (int i = 0; i < checkStr.length(); i++) {
            ch = checkStr.charAt(i);
            if (!Character.isDigit(ch)) {
                allValid = false;
                break;
            }
        }
        return allValid;
    }

    /**
     * Controlla che la stringa contenga una lettera dell'alfabeto. Creation
     * date: (05/07/2002 8.45.30)
     *
     * @return boolean
     * @param str java.lang.String
     */
    protected boolean checkLetters(String str) {
        String checkStr = str;
        boolean allValid = false;
        char ch;
        for (int i = 0; i < checkStr.length(); i++) {
            ch = checkStr.charAt(i);
            if (Character.isLetter(ch)) {
                allValid = true;
                break;
            }
        }
        return allValid;
    }

    /**
     * Controlla che la stringa contenga almeno un carattere alfabetico.
     * Creation date: (05/07/2002 8.45.30)
     *
     * @return boolean
     * @param str java.lang.String
     */
    protected boolean checkOneAlphabetic(String str) {
        String checkStr = str;
        boolean allValid = false;
        char ch;
        for (int i = 0; i < checkStr.length(); i++) {
            ch = checkStr.charAt(i);
            if (Character.isLetter(ch)) {
                allValid = true;
                break;
            }
        }
        return allValid;
    }

    /**
     * Controlla che la stringa contenga almeno un carattere non alfabetico.
     * Creation date: (05/07/2002 8.45.30)
     *
     * @return boolean
     * @param str java.lang.String
     */
    protected boolean checkOneNotAlphabetic(String str) {
        String checkStr = str;
        boolean allValid = false;
        char ch;
        for (int i = 0; i < checkStr.length(); i++) {
            ch = checkStr.charAt(i);
            if (!Character.isLetter(ch)) {
                allValid = true;
                break;
            }
        }
        return allValid;
    }

    /**
     * Ritorna true se ci sono spazi all'interno della password Creation date:
     * (10/07/2002 9.26.29)
     *
     * @param str java.lang.String
     * @return boolean
     */
    protected boolean middleSpace(String str) {
        return str.contains(" ");
    }

    /**
     * LDAP Regola R1: controlla che la lunghezza della password sia almeno di 8
     * caratteri . Creation date: (04/07/2002 18.20.44)
     */
    protected void rulesR1() {
        if (sNewPassword.length() < 8 || sNewPassword.length() > 20) {
            oViolatedRules.add("password_err_r1");
        }
    }

    /**
     * LDAP Regola R2: controlla che la password contenga almeno un carattere
     * alfabetico ed uno non alfabetico. Creation date: (04/07/2002 18.20.44)
     */
    protected void rulesR2() {
        if (!(checkOneAlphabetic(sNewPassword) && checkOneNotAlphabetic(sNewPassword))) {
            oViolatedRules.add("password_err_r2");
        }
    }

    /**
     * Regola R3: controlla che la password non contenga caratteri numerici
     * nella prima e nell'ultima posizione. Creation date: (05/07/2002 16.01.22)
     */
    protected void rulesR3() {
        char chFirst;
        char chLast;
        chFirst = sNewPassword.charAt(0);
        chLast = sNewPassword.charAt(ilenNewPassword - 1);
        if (Character.isDigit(chFirst) || Character.isDigit(chLast)) {
            oViolatedRules.add("password_err_r3");
        }
    }

    /**
     * LDAP lo estende alla history delle PWD Regola R4: controlla che la
     * password non contenga più di 3 caratteri consecutivi uguali a quelli
     * usati nella password precedente. Data di creazione: (06/07/2002 22.46.31)
     */
    protected void rulesR4() {
        // numero max di caratteri contigui permessi
        // nella old password
        int iConst = 4;
        // sottosSubNewPswinga della nuova password
        String sSubNewPsw;
        for (int iIndex = 0; iIndex <= ilenNewPassword - iConst; iIndex++) {
            sSubNewPsw = sNewPassword.substring(iIndex, iIndex + iConst);
            // se esiste l'occorrenza in old Passwd sollevo eccezione
            if (sOldPassword.contains(sSubNewPsw)) {
                oViolatedRules.add("password_err_r4");
            }
        }
    }

    /**
     * LDAP Regola R5: controlla che la password non contenga più di 2 caratteri
     * consecutivi uguali. Creation date: (05/07/2002 16.26.18)
     */
    protected void rulesR5() {
        String sSubSequence;
        char cChar;
        for (int iIndex = 0; iIndex < ilenNewPassword; iIndex++) {
            cChar = sNewPassword.charAt(iIndex);
            sSubSequence = new String(new char[]{cChar, cChar, cChar});
            if (sNewPassword.indexOf(sSubSequence, iIndex) != -1) {
                oViolatedRules.add("password_err_r5");
            }
        }
    }

    /**
     * Regola R6: controlla che la password non contenga la userid
     * dell'assegnatario. Creation date: (05/07/2002 16.26.18)
     */
    protected void rulesR6() {
        if (sNewPassword.toUpperCase().contains(sUserId.toUpperCase())) {
            oViolatedRules.add("password_err_r6");
        }
    }

    /**
     * Verfifica che le regole di definizione di una nuova password siano
     * rispettate. Creation date: (04/07/2002 18.19.56)
     * @return
     */
    public Set<String> verifyRules() {
        rulesR1();
        rulesR2();
        rulesR3();
        rulesR4();
        rulesR5();
        rulesR6();

        return oViolatedRules;
    }

    public static boolean isValid(String userId, char[] password) {
        PasswordCheckRules checkRules = new PasswordCheckRules(userId, "", new String(password));
        Set<String> errors = checkRules.verifyRules();
        return errors == null || errors.isEmpty();
    }

}
