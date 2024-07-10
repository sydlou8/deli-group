package com.pluralsight.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliController {
    private final DeliApp deliApp;

    public DeliController(DeliApp deliApp) {
        this.deliApp = deliApp;
    }

    @GetMapping("/run")
    public void runDeliApp() {
        deliApp.run();
    }
}