package com.taskagile.domain.common.model.user;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.taskagile.domain.common.model.AbstractBaseEntity;

@Entity
@Table(name="user")
public class User extends AbstractBaseEntity {

	private static final long serialVersionUID = 309301898305472054L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="username", nullable=false, length=50, unique=true)
	private String username;
	
	@Column(name="email_address", nullable=false, length=100, unique = true)
	private String emailAddress;
	
	@Column(name="password", nullable=false, length=30)
	private String password;
	
	@Column(name="first_name", nullable=false,length=45)
	private String firstName;
	
	@Column(name="last_name", nullable=false, length=45)
	private String lastName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date", nullable=false)
	private Date createdDate;
	
	  /**
	   * Create new user during registration
	   */
	  public static User create(String username, String emailAddress, String password) {
	    User user = new User();
	    user.username = username;
	    user.emailAddress = emailAddress;
	    user.password = password;
	    user.firstName = "";
	    user.lastName = "";
	    user.createdDate = new Date();
	    return user;
	  }
	
	
	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}


	public String getEmailAddress() {
		return emailAddress;
	}

	public String getPssword() {
		return password;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public Date getCreatedDate() {
		return createdDate;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(username,emailAddress);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", emailAddress=" + emailAddress + ", pssword=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", createdDate=" + createdDate + "]";
	}

}
