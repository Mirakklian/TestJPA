package com.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.entity.User;
import com.jpa.service.UserDAOService;
import com.jpa.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	
	private static final Logger log=LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		// Save User
		User user=new User("Jill","Admin");
		userRepository.save(user);
		log.info("New User Created: "+user);
	}
	
	 

}
