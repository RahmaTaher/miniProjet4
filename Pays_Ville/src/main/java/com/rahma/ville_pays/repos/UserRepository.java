package com.rahma.ville_pays.repos;

import com.rahma.ville_pays.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
	User findByUsername (String username);

}
