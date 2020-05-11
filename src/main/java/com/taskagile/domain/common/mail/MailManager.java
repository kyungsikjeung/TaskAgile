package com.taskagile.domain.common.mail;

public interface MailManager {
	/** 이메일 발송 (이메일주소,제목,템플릿, 메세지 베리어블에 키 벨류는 왜들어가는지 알수가 없음..) */
	void send(String emailAddString, String subject, String template, MessageVariable... variables);
}
