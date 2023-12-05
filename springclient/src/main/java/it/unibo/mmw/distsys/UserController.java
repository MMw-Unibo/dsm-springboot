package it.unibo.mmw.distsys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    private final UserService userService;

    // Constructor injection
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Setter injection
    private EmailService emailService;

    @Autowired
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    // Field injection
    @Autowired
    private LoggingService loggingService;

    @GetMapping("/greetUser")
    @ResponseBody
    public String greetUser() {
        String userMessage = userService.getUserMessage();
        String emailMessage = emailService.getEmailMessage();
        String logMessage = loggingService.getLogMessage();

        return userMessage + "\n" + emailMessage +  "\n" + logMessage;
    }
}
