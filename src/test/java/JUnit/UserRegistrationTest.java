package JUnit;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserRegistrationTest {
	//positive test to check first name
	@Test
	public void testfirstName_shouldReturnTrue() {
		String firstName = "Atharva";
		boolean isValidFirstName = UserRegistration.isValidFirstName(firstName);
		assertTrue(isValidFirstName);
	}

	//failed test to check first name
	@Test
	public void testfirstName_shouldReturnFalse() {
		String firstName = "athArva";
		boolean isValidFirstName = UserRegistration.isValidFirstName(firstName);
		assertTrue(isValidFirstName);
	}

	//positive test to check last name
	@Test
	public void testlastName_shouldReturnTrue() {
		String lastName = "Joshi";
		boolean isValidLastName = UserRegistration.isValidLastName(lastName);
		assertTrue(isValidLastName);
	}
	
	//failed test to check last name
	@Test
	public void testlastName_shouldReturnFalse() {
		String lastName = "JoShi";
		boolean isValidLastName = UserRegistration.isValidLastName(lastName);
		assertTrue(isValidLastName);
	}
	
	//positive test to check last name
	@Test
	public void testmobileNumber_shouldReturnTrue() {
		String mobileno = "91 9665654666";
		boolean isValidMobileNo = UserRegistration.isValidMobileNo(mobileno);
		assertTrue(isValidMobileNo);
	}
	
	//failed test to check last name
	@Test
	public void testmobileNumber_shouldReturnFalse() {
		String mobileno = "9665654666";
		boolean isValidMobileNo = UserRegistration.isValidMobileNo(mobileno);
		assertTrue(isValidMobileNo);
	}
	
	//positive test to check email id
	@Test
	public void testemail_shouldReturnTrue() {
		String email = "joshicarrier@gmail.com";
		boolean isValidEmailId = UserRegistration.isValidEmailId(email);
		assertTrue(isValidEmailId);
	}
	
	//failed test to check email id
	@Test
	public void testemail_shouldReturnFalse() {
		String email = "#joshi#@carrier@gmail.com";
		boolean isValidEmailId = UserRegistration.isValidEmailId(email);
		assertTrue(isValidEmailId);
	}
	
	//positive test to check password
	@Test
	public void testpassword_shouldReturnTrue() {
		String password = "Jc@npj2021";
		boolean isValidPassword = UserRegistration.isValidPassword(password);
		assertTrue(isValidPassword);
	}
	
	//failed test to check password
	@Test
	public void testpassword_shouldReturnFlase() {
		String password = "Jc2021";
		boolean isValidPassword = UserRegistration.isValidPassword(password);
		assertTrue(isValidPassword);
	}	
}
