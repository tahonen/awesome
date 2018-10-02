package com.redhat.emeatigers.awesome;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AwesomeController {
    @RequestMapping("/awesome")
    public ResponseEntity<?> awesome() {
        try {
            return ResponseEntity.ok("Fantastic");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ResponseEntity.ok("Error");
    }



}
