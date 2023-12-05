package it.unibo.mmw.distsys;

import java.time.OffsetDateTime;

import org.springframework.stereotype.Service;

@Service
public class LoggingService {
    
    
    public String getLogMessage() {
        return OffsetDateTime.now() + "\t" + "This is the first log of your App";
    }
}
    
