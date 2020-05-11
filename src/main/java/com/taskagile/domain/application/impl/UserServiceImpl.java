package com.taskagile.domain.application.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.taskagile.domain.application.UserService;
import com.taskagile.domain.application.commands.RegistrationCommand;
import com.taskagile.domain.common.event.DomainEventPublisher;
import com.taskagile.domain.common.mail.MailManager;
import com.taskagile.domain.common.mail.MessageVariable;
import com.taskagile.domain.common.model.user.User;
import com.taskagile.domain.model.user.RegistrationException;
import com.taskagile.domain.model.user.RegistrationManagement;
import com.taskagile.domain.model.user.events.UserRegisteredEvent;


/**
 * @author jk
 * Api 호출 -> intf(service.regist(RegistrationPayload.RegistrationCommand()) 의 구현부 
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
	private RegistrationManagement registrationManagement;
	private DomainEventPublisher domainEventPublisher;
	private MailManager mailManager;
	
	public UserServiceImpl(RegistrationManagement registrationManagement,DomainEventPublisher domainEventPublisher,MailManager mailManager) {
		this.registrationManagement = registrationManagement;
		this.domainEventPublisher = domainEventPublisher;
		this.mailManager = mailManager;
	}
	
	@Override
	public void register(RegistrationCommand command) throws RegistrationException {
		Assert.notNull(command,"parameter `command` must not be null");
		User newUser = registrationManagement.register(command.getUsername(),command.getEmailAddress(),command.getPassword());
		sendwelcomeMessage(newUser);
		domainEventPublisher.publish(new UserRegisteredEvent(newUser));
	}
	
	private void sendwelcomeMessage(User user) {
		mailManager.send(user.getEmailAddress(),"Welcome to TaskAgile","welcome.ftl",MessageVariable.from("user",user));
	}
	
}
