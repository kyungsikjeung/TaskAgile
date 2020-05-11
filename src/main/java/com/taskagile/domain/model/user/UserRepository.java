package com.taskagile.domain.model.user;

import com.taskagile.domain.common.model.user.User;

public interface UserRepository {
	User findByUsername(String username);
	User findByEmailAddress(String emailAddress);
	void save(User user);
}
