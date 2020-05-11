package com.taskagile.infrastructure;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.taskagile.domain.common.model.user.User;
import com.taskagile.domain.model.user.UserRepository;

@Repository
public class HibernateUserRepository extends HibernateSupport implements UserRepository {
	
	public HibernateUserRepository(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public User findByUsername(String username) {
		Query<User> query = getSession().createQuery("from User where username=:username", User.class);
		query.setParameter("username",username);
		return query.uniqueResult();
	}

	@Override
	public User findByEmailAddress(String emailAddress) {
		Query<User> query = getSession().createQuery("from user where emaailAddress = :emailAddress",User.class);
		return query.uniqueResult();
	}

	@Override
	public void save(User user) {
		entityManager.persist(user);
		entityManager.flush();
	}
	
	
	
}
