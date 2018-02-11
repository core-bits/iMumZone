package com.corebits.imumzone.util;

/**
 *
 * @author Tommy
 */
import java.util.concurrent.ThreadLocalRandom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PasswordGenerator {

    private static final Logger logger = LoggerFactory.getLogger(PasswordGenerator.class);

    private static final char[] specialChars = new char[]{'.', '_', '!', '$', '=', '@'};

    private PasswordGenerator() {}

    /**
     *
     * @return char
     */
    private static char randomAlphabetic() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        int letterIndex = rnd.nextInt(26) + 65;
        char letter = (char) letterIndex;
        return rnd.nextBoolean() ? Character.toLowerCase(letter) : letter;
    }

    /**
     *
     * @return char
     */
    private static char randomNumber() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        int numberIndex = rnd.nextInt(10) + 48;
        return (char) numberIndex;
    }

    /**
     *
     * @return char
     */
    private static char randomSpecial() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        int i = rnd.nextInt(specialChars.length);
        return specialChars[i];
    }

    /**
     * Metodo per generare una password random che rispetti le roles di
     * {@link PasswordCheckRules}
     *
     * @param userId
     * @return array di char
     */
    public static char[] generate(String userId) {
        logger.info("generate(String) -> userId: {}", userId);
        char[] password = null;
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        do {
            int size = rnd.nextInt(13) + 8;
            password = new char[size];
            password[0] = randomAlphabetic();

            for (byte i = 1; i < (password.length - 1); i++) {
                switch (rnd.nextInt(3)) {
                    case 0:
                        password[i] = randomAlphabetic();
                        break;
                    case 1:
                        password[i] = randomNumber();
                        break;
                    default:
                        password[i] = randomSpecial();
                        break;
                }
            }

            password[password.length - 1] = randomAlphabetic();

        } while (!PasswordCheckRules.isValid(userId, password));

        logger.info("password => {}", password);
        return password;
    }

	public static void main(String[] args) {
		System.out.println("Password: " + new String(generate("oche.omale@gmail.com")));
	}
}
