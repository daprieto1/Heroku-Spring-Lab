package edu.eci.services;

import edu.eci.models.User;
import edu.eci.services.contracts.IUserServices;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserServices implements IUserServices{
    @Override
    public User create(User user) {
        return new User("Pedro", UUID.randomUUID());
    }

    @Override
    public User get(UUID id) {
        return new User("Pedro", UUID.randomUUID());
    }

    @Override
    public User get(String name) {
        return null;
    }
}
