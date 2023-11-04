package com.prodemy.miniproject.repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
=======
import com.prodemy.miniproject.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
>>>>>>> branch 'master' of https://github.com/ZakiID18/mini-project.git

<<<<<<< HEAD
import com.prodemy.miniproject.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByName(String name);
	
=======
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
>>>>>>> branch 'master' of https://github.com/ZakiID18/mini-project.git
}
