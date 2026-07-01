package com.example.jpademo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface UserRepo extends JpaRepository<UserClassSpringBoot, Long> {

}
