package edu.mills.cs180a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static edu.mills.cs180a.EmailAddressParser.isValid;

class EmailAddressParserTest {

	@Test
	void isValidRejectsNull() {
		assertFalse(isValid(null),
				"isValid() should reject null");
	}
	
	@Test
	void isValidRejectsEmptyString() {
		assertFalse(isValid(""),
				"isValid() should reject the empty string");
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "hello", "@@@", "foo@bar" })
	void isValidRejectsMalformedEmails(String candidate) {
		assertFalse(isValid(candidate),
				"isValid() should reject \"" + candidate + "\"");
	}
}
