package my.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ReadinessController {
    @GetMapping("/readiness")
    public ResponseEntity<String> getReadiness() {

        //pretty dummy, just for demo purposes
        Random rand = new Random();
        int randomValue = rand.nextInt(100);
        if (randomValue > 80) {
            return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
