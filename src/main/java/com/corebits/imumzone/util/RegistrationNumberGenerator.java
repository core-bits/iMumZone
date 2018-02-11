
package com.corebits.nucleus.util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Tommy
 */
public final class RegistrationNumberGenerator {
    private static final int INIT_HOSPITAL_NUMBER = 200000;
    private static final int INIT_HMO_NUMBER = 400000;
    
    private RegistrationNumberGenerator(){}
    
    public static synchronized int generateRandomWithinRange(int origin, int bound){
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        return rnd.nextInt(origin, bound);
    }
    
    public static synchronized int generateRandomWithinRange(int bound){
        return generateRandomWithinRange(0, bound);
    }
    
    public static synchronized String generateRegistrationNumber(){
        int numberIndex = generateRandomWithinRange(10000000) + 48;
        return String.valueOf(numberIndex);
    }
    
    public static synchronized String generateInvoiceNumber(){
        int numberIndex = generateRandomWithinRange(10000000) + 58;
        return String.valueOf(numberIndex);
    }
    
    public static synchronized String generatePaymentEvidenceReferenceNumber(){
        int numberIndex = generateRandomWithinRange(10000000) + 98;
        return String.valueOf(numberIndex);
    }
    
    public static synchronized String generateTransactionPostingReferenceNumber(){
        int numberIndex = generateRandomWithinRange(10000000) + 108;
        return String.valueOf(numberIndex);
    }
    
    public static synchronized String generateBalanceHistoryReferenceNumber(){
        int numberIndex = generateRandomWithinRange(10000000) + 508;
        return String.valueOf(numberIndex);
    }
    public static String generateNumberByExistingCount(int start, int existingTotal){
        if(existingTotal < 0){
            return String.valueOf("000000");
        }
        int next = start + existingTotal + 1;
        return String.valueOf(next);
    }
    
    public static String generateBalanceHospitalNumber(int existingCount){
        return generateNumberByExistingCount(INIT_HOSPITAL_NUMBER, existingCount);
    }
    
    public static String generateBalanceHMONumber(int existingCount){
        return generateNumberByExistingCount(INIT_HMO_NUMBER, existingCount);
    }
    
    
    private static synchronized String generatePersonalNumber() {
        Long ctm = System.nanoTime();
        String ss = ctm.toString().substring(11);
        Random r = new Random();
        int randomInt = r.nextInt(100);
        ss = ss.concat(String.valueOf(randomInt));
        if (ss.length() < 6) {
            int diff = 6 - ss.length();
            for (int i = 0; i < diff; i++) {
                ss = ss.concat(String.valueOf(i));
            }
        }
        return ss;
    }
    
    public static synchronized String generateCareId(String hospital, String hmo, int lastTotal){
        if(hospital == null || hmo == null){
            return "N/A";
        }
        String count = lastTotal >= 0 && lastTotal < 10 ? String.format("00%s", lastTotal + 1) 
                : lastTotal >= 10 && lastTotal < 100 ? String.format("0%s", lastTotal + 1) 
                : String.format("%s", lastTotal + 1);
        return String.format("%s%s%s", hmo, hospital, count);
    }
    
    public static synchronized String generatePersonalNumber(String prefix){
        return prefix != null ? String.format("%s%s", prefix, generatePersonalNumber()) : generatePersonalNumber();
    }
}
