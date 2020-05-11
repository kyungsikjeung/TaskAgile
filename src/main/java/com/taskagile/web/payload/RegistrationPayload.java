package com.taskagile.web.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.taskagile.domain.application.commands.RegistrationCommand;

public class RegistrationPayload {
	
	@Size(min=2, max=10 , message="사용자명은 최소 2자리 이상 10자리 이하이여야 합니다." )
	@NotNull
	private String username;
	
	@Size(min=2, max=10 , message="사용자명은 최소 2자리 이상 10자리 이하이여야 합니다." )
	@Email(message="이메일 주소가 유효하지 않습니다." )
	private String emailAddress;
	
	@Size(min=6,max=30,message="비밀번호는 최소 6자리 이상 30자리 이하이여야 합니다.")
	@NotNull
	private String password;
	
	public RegistrationCommand toCommand() {
		return new RegistrationCommand(this.username,this.emailAddress,this.password); 
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
