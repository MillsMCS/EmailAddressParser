package edu.mills.cs180a;

/**
 * Static utility class for parsing and validating email addresses.
 */
public class EmailAddressParser {
    private EmailAddressParser() {}
    
    /**
     * Tests whether an email address is syntactically valid.
     * The criteria used are those specified in
     * <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     *
     * @param email the email address to test
     * @return {@code true} if the email address is valid,
     * {@code false} otherwise
     */
    public static boolean isValid(String email) {
        return true;
    }
    
    /**
     * Gets the user name associated with the provided email address.
     * The user name is the portion before the at-sign (@).
     * 
     * @param email the email address
     * @return the user name
     * @throws IllegalArgumentException if the email address is malformed
     */
    public static String getUserName(String email) {
    	return null;
    }
    
    /**
     * Gets the host name associated with the provided email address.
     * The user name is the portion after the at-sign (@).
     * 
     * @param email the email address
     * @return the host name
     * @throws IllegalArgumentException if the email address is malformed
     */
    public static String getHostName(String email) {
    	return null;
    }
}
