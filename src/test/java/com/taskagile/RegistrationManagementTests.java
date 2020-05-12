package com.taskagile;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.taskagile.domain.common.model.user.User;
import com.taskagile.domain.common.security.PasswordEncryptor;
import com.taskagile.domain.model.user.EmailAddressExistsException;
import com.taskagile.domain.model.user.RegistrationException;
import com.taskagile.domain.model.user.RegistrationManagement;
import com.taskagile.domain.model.user.UserRepository;
import com.taskagile.domain.model.user.UsernameExistsException;
@SpringBootTest
public class RegistrationManagementTests {

	  private UserRepository repositoryMock;
	  private PasswordEncryptor passwordEncryptorMock;
	  private RegistrationManagement instance;
    
	  @Before
	  public void setUp() {
		    repositoryMock = mock(UserRepository.class);
		    passwordEncryptorMock = mock(PasswordEncryptor.class);
		    instance = new RegistrationManagement(repositoryMock, passwordEncryptorMock);
	  }
	  
	  @Test(expected = UsernameExistsException.class)
	  public void register_existedUsername_shouldFail() throws RegistrationException {
	    String username = "existUsername";
	    String emailAddress = "sunny@taskagile.com";
	    String password = "MyPassword!";
	    // We just return an empty user object to indicate an existing user
	    when(repositoryMock.findByUsername(username)).thenReturn(new User());
	    instance.register(username, emailAddress, password);
	    System.out.println("test");

	  }
	  
	  @Test(expected = EmailAddressExistsException.class)
	  public void register_existedEmailAddress_shouldFail() throws RegistrationException {
	    String username = "sunny";
	    String emailAddress = "exist@taskagile.com";
	    String password = "MyPassword!";
	    // We just return an empty user object to indicate an existing user
	    when(repositoryMock.findByEmailAddress(emailAddress)).thenReturn(new User());
	    instance.register(username, emailAddress, password);
	    System.out.println("test");
	  }
	  
	  
	  
	
}
