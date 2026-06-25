package com.example.jpademo;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    UserRepo userrepo;
    public UserService(UserRepo userrepo) {
        this.userrepo = userrepo;
    }
 
    public UserClassSpringBoot create(UserClassSpringBoot user) {
        return userrepo.save(user);
    }

    public List<UserClassSpringBoot> getAllUsers() {
        return userrepo.findAll();
    }
}
