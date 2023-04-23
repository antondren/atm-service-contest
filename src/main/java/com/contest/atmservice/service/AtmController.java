package com.contest.atmservice.service;

import com.contest.atmservice.dto.AtmRequest;
import com.contest.atmservice.dto.AtmResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AtmController {

    @PostMapping("/atms/calculateOrder")
    public ResponseEntity<List<AtmResponse>> calculateOrder(@RequestBody List<AtmRequest> request) {
        return ResponseEntity.ok(AtmService.sortRequests(request));
    }
}
