
package com.enzofalvo.applicationspring.services;

import com.enzofalvo.applicationspring.entities.User;
import com.enzofalvo.applicationspring.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
    
    public User findById (Long id) {
        Optional <User> obj = repository.findById(id);
        return obj.get();
    }
    
    public User insert (User obj) {
        return repository.save(obj);
    }
}


