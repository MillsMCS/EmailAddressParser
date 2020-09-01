package edu.mills.cs180a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static edu.mills.cs180a.EmailAddressParser.*;

class EmailAddressParserTest {

	@Test
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
	
	@Test
	void getUserNameWithValidEmails() {
		assertEquals("susan", getUserName("susan@mills.edu"));
	}
	
	@Test
	void getUserNameRejectsMalformedEmails() {
		assertThrows(IllegalArgumentException.class,
				new Executable() {
					@Override
					public void execute() {
						getUserName(null);
					}
		});
		assertThrows(IllegalArgumentException.class,
				() -> getUserName(null));
	}
}
