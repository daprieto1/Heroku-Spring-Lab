package edu.eci.services.contracts;

import edu.eci.models.User;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface IUserServices {
    User create(User user);
    User get(UUID id);
    User get(String name);
}
