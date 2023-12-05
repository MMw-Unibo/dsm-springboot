package it.unibo.mmw.distsys;


import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUserMessage() {
        return "Hello, from UserService!";
    }
}