package com.prodemy.miniproject.repository;

<<<<<<< HEAD
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;

import com.prodemy.miniproject.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	// WHERE email=?
	User findByEmail(String email);
	
	// WHERE name=?
//	User findByName(String name);
//	
//	// WHERE name LIKE '%name%'
//	List<User> findByNameLike(String name);
//	
//	// WHERE name LIKE 'name%'
//	List<User> findByNameStartsWith(String name);
//		
//	// WHERE name LIKE '%name'
//	List<User> findByEndsWith(String name);
//	
//	// Order all names (desc)
//	Streamable<User> findAllByOrderByNameDesc();
	
	
=======
import com.prodemy.miniproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
>>>>>>> branch 'master' of https://github.com/ZakiID18/mini-project.git

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
