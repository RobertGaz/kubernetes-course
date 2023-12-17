package my.controller;

import my.service.Mp3GetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ReadinessController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReadinessController.class);

    @GetMapping("/readiness")
    public ResponseEntity<String> getReadiness() {

        //pretty dummy, just for demo purposes
        Random rand = new Random();
        int randomValue = rand.nextInt(100);
        if (randomValue > 80) {
            LOGGER.info("Service readiness is: NOT READY.");
            return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
        }

        LOGGER.info("Service readiness is: READY.");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
