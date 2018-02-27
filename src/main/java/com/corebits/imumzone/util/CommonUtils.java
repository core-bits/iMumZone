package com.corebits.imumzone.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Tommy
 */
public final class CommonUtils {

    static ReflectionToStringBuilder builder;

    static final Logger LOGGER = LoggerFactory.getLogger(CommonUtils.class);
    public static final String UNKNOWN = "0000000";
    public static final String CURRENCY_FORMAT_1 = "NGN ###,###.##";

    private CommonUtils() {
    }

    public static synchronized String generateToken() {
        Random random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }

    public static boolean isPhoneNumber(String str) {
        Pattern p = Pattern.compile("[0-9]");
        String s = str.substring(1);
        try {
            Matcher m = p.matcher(s);
            boolean resultss = m.find();
            if (resultss && s.length() == 13 && str.startsWith("+")) {
                return true;
            } else {
                System.out.println("Invalid phone number entered!!!!");
                return false;
            }
        } catch (Exception ex) {
            LOGGER.error("CommonUtils::isPhoneNumber {}", ex.getMessage());
        }
        return false;
    }

    public static boolean isNumberOnly(String str) {
        Pattern p = Pattern.compile("\\d{10}");//Fixed length of 10 digit
        try {
            Matcher m = p.matcher(str);
            boolean resultss = m.find();
            return resultss;
        } catch (Exception ex) {
            LOGGER.error("CommonUtils::isNumberOnly {}", ex.getMessage());
        }
        return false;
    }

    public static boolean isDecimalNumber(String str) {
        Pattern p = Pattern.compile("^\\d+(\\.\\d{1,2})?$");
        try {
            boolean resultss = p.matcher(str).matches();
            return resultss;
        } catch (Exception ex) {
            LOGGER.error("CommonUtils::isDecimalNumber {}", ex.getMessage());
        }
        return false;
    }

    public String formatNumber(String number) {
        String trim = number.substring(1);
        String newnumber = "+234" + trim;
        return newnumber;
    }

    public static String formatAmount(String amount) {
        String format = "%," + (amount.length() + 1) + ".2f";
        return String.format(format, Double.parseDouble(amount));
    }

    public static Date formatDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("EEE d MMM yyyy HH:mm:ss");
        Date localDate = null;

        try {
            TimeZone tz = TimeZone.getTimeZone("Africa/Lagos");
            format.setTimeZone(tz);
            localDate = format.parse("" + date);
        } catch (ParseException pe) {
            LOGGER.error("Exception in Util.formatDate : {}", pe.getMessage());
        }
        return localDate;
    }

    public static String formatDate1(Date date) {
        SimpleDateFormat format1 = new SimpleDateFormat("EEE MMM d hh:mm:ss a z yyyy");
        String d = "";
        try {
            TimeZone tz = TimeZone.getTimeZone("Africa/Lagos");
            format1.setTimeZone(tz);
            d = format1.format(date);
        } catch (Exception pe) {
            LOGGER.error("Exception in Util.formatDate : {}", pe.getMessage());
        }
        return d;
    }

    public static boolean checkDate(Date start, Date end) {
        if (end != null && end.after(start) || start != null && start.equals(end) || start != null && start.before(end)) {
            return true;
        }
        return end == null && start != null || start == null && end != null;
    }

    public static boolean checkNull(String value) {
        return value == null || value.equals("null");
    }

    public static String hashPassword(String password) {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            byte[] bs;
            bs = messageDigest.digest(password.getBytes());
            for (int i = 0; i < 5; i++) {
                String hexVal = Integer.toHexString(0xFF & bs[i]);
                if (hexVal.length() == 1) {
                    sb.append("0");
                }
                sb.append(hexVal);
            }
        } catch (NoSuchAlgorithmException ex) {
            LOGGER.error("CommonUtils::hashPassword => {0}", ex.getMessage());
        }
        return sb.toString();
    }

    public static Date convertStringToDate(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            TimeZone tz = TimeZone.getTimeZone("Africa/Lagos");
            formatter.setTimeZone(tz);
            date = formatter.parse(dateString);
        } catch (ParseException e) {
            LOGGER.error("convertStringToDate :{0}", e.getMessage());
            e.printStackTrace(System.out);
        }
        return date;
    }

    public static long getTimeDifference(Timestamp t1, Timestamp t2) {
        t1.setNanos(t1.getNanos());
        t2.setNanos(t2.getNanos());
        LOGGER.debug("Time one : {}", t1);
        LOGGER.debug("Time two : {}", t2);
        // The actual diff...
        long firstTime = (getTimeNoMillis(t1) * 1000000) + t1.getNanos();
        long secondTime = (getTimeNoMillis(t2) * 1000000) + t2.getNanos();
        long diff = Math.abs(firstTime - secondTime); // diff is in nanos
        LOGGER.debug("diff => {}", diff);
        return diff;
    }

    private static long getTimeNoMillis(Timestamp t) {
        return t.getTime() - (t.getNanos() / 1000000);
    }

    public static long getTimeDifference1(Timestamp transactionDate, Timestamp windowTime) {
        long diff = 0;
        try {
            diff = ((Math.abs(transactionDate.getTime() - windowTime.getTime())) / 1000);

        } catch (Exception ex) {
            LOGGER.error("Exception in caught getTimeDifference1 : {0}", ex.getMessage());
        }
        return diff;
    }

    public static String likePrefix(String prefix) {
        return prefix + "%";
    }

    public static String likeSuffix(String suffix) {
        return "%" + suffix;
    }

    public static String likeAll(String param) {
        return likeSuffix(likePrefix(param));
    }

    public static Date getDefaultDateOfBirth() {
        int year = RegistrationNumberGenerator.generateRandomWithinRange(25, 51) * -1;
        return getDefaultDateValue(year);
    }

    public static Date getDefaultCareExpiryDate() {
        int year = RegistrationNumberGenerator.generateRandomWithinRange(1, 2);
        return getDefaultDateValue(year);
    }

    public static Date getDefaultDateValue(int year) {
        Calendar cal = Calendar.getInstance();
        int month = RegistrationNumberGenerator.generateRandomWithinRange(1, 13);
        int day = RegistrationNumberGenerator.generateRandomWithinRange(1, 32);
        cal.add(Calendar.YEAR, year);
        cal.add(Calendar.MONTH, month);
        cal.add(Calendar.DATE, day);
        return cal.getTime();
    }

    /**
     * Method to generate the toString of a generic object.
     *
     * @param <T> {#link T}
     * @param object
     * @return String or null
     */
    public static <T> String toString(T object) {
        builder = new ReflectionToStringBuilder(object, ToStringStyle.DEFAULT_STYLE);
        return builder.toString();
    }

    public static String formatCurrency(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        myFormatter.applyPattern("#,#00.0#");
        return myFormatter.format(value);
    }

}
