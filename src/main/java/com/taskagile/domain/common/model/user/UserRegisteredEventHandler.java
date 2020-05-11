package com.taskagile.domain.common.model.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.taskagile.domain.model.user.events.UserRegisteredEvent;

@Component
public class UserRegisteredEventHandler {

	private final static Logger log = LoggerFactory.getLogger(UserRegisteredEventHandler.class);
	
	@EventListener(UserRegisteredEventHandler.class)
	public void handleEvent(UserRegisteredEvent event) {
		log.debug("Handling `{}` registration evnet", event.getUser().getEmailAddress());
	}
	
}
