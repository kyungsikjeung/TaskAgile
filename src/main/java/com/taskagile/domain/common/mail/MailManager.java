package com.taskagile.domain.common.mail;

public interface MailManager {
	void send(String emailAddString, String subject, String template, MessageVariable... variables);
}
