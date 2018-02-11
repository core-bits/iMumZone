package com.corebits.imumzone.type;

/**
 *
 * @author Tommy
 */
import java.util.Arrays;
import java.util.Optional;

public enum DateTimeFormatterType {

    SLASH_SEPARATOR_MMDDYYYY("MM/DD/YYYY", "MM/dd/yyyy"),
    SLASH_SEPARATOR_DDMMYYYY("DD/MM/YYYY", "dd/MM/yyyy"),
    HYPHEN_SEPARATOR_YYYYMMDD("YYYY-MM-DD", "yyyy-MM-dd"),
    NO_SEPARATOR_YYYYMMDD("YYYYMMDD", "yyyyMMdd"),
    HH00_11_MM_SS("HH00-11:MI:SS AM/PM", "KK:mm:ss a"),
    HH01_12_MM_SS("HH01-12:MI:SS AM/PM", "hh:mm:ss a"),
    HH24_MM_SS("HH24:MI:SS", "HH:mm:ss");

    private final String value;
    private final String pattern;

    private DateTimeFormatterType(String v, String p) {
        this.value = v;
        this.pattern = p;
    }

    /**
     * Valore del Formatter Type
     *
     * @return {@link String}
     */
    public String getValue() {
        return value;
    }

    /**
     * Pattern da utilizzare con un {@link java.text.Format}
     *
     * @return {@link String}
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Metodo per recuperare un type dato il valore.
     *
     * @param value {@link String}
     * @return {@link FormatterType}
     */
    public static DateTimeFormatterType getByValue(String value) {
        Optional<DateTimeFormatterType> optionalState = Arrays.stream(values())
                .filter(s -> s.value.equals(value)).findFirst();
        if (Optional.empty().equals(optionalState)) {
            throw new EnumConstantNotPresentException(DateTimeFormatterType.class, value);
        }
        return optionalState.get();
    }

}
