package it.unibo.mmw.distsys;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public String getEmailMessage() {
        return "Hello, from EmailService!";
    }
}
