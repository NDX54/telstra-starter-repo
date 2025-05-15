package au.com.telstra.simcardactivator.controller;

import au.com.telstra.simcardactivator.controller.dto.SimCardDto;
import au.com.telstra.simcardactivator.service.SimCardActivatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class SimCardActivatorController {

    private final SimCardActivatorService simCardActivatorService;

    public SimCardActivatorController(SimCardActivatorService simCardActivatorService) {
        this.simCardActivatorService = simCardActivatorService;
    }

    @PostMapping("/activate")
    public ResponseEntity<Object> activateSim(@RequestBody SimCardDto simCardDto) {

        return simCardActivatorService.activate(simCardDto);
    }
}
