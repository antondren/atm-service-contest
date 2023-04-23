package com.contest.atmservice.service;

import com.contest.atmservice.dto.AtmRequest;
import com.contest.atmservice.dto.AtmRequestType;
import com.contest.atmservice.dto.AtmResponse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AtmServiceTest {

    @Test
    void testSorting() {
        List<AtmResponse> sortedRequests = AtmService.sortRequests(createAtmRequests());
        assertEquals(sortedRequests, createAtmResponsesForCheck());
    }

    private List<AtmRequest> createAtmRequests() {
        List<AtmRequest> atmRequests = new ArrayList<>();

        atmRequests.add(new AtmRequest(4, AtmRequestType.STANDARD, 1));
        atmRequests.add(new AtmRequest(1, AtmRequestType.STANDARD, 1));
        atmRequests.add(new AtmRequest(2, AtmRequestType.STANDARD, 1));
        atmRequests.add(new AtmRequest(3, AtmRequestType.PRIORITY, 2));
        atmRequests.add(new AtmRequest(3, AtmRequestType.STANDARD, 1));
        atmRequests.add(new AtmRequest(2, AtmRequestType.SIGNAL_LOW, 1));
        atmRequests.add(new AtmRequest(5, AtmRequestType.STANDARD, 2));
        atmRequests.add(new AtmRequest(5, AtmRequestType.FAILURE_RESTART, 1));

        return atmRequests;
    }

    private List<AtmResponse> createAtmResponsesForCheck() {
        List<AtmResponse> atmResponses = new ArrayList<>();

        atmResponses.add(new AtmResponse(1, 1));
        atmResponses.add(new AtmResponse(2, 1));
        atmResponses.add(new AtmResponse(3, 2));
        atmResponses.add(new AtmResponse(3, 1));
        atmResponses.add(new AtmResponse(4, 1));
        atmResponses.add(new AtmResponse(5, 1));
        atmResponses.add(new AtmResponse(5, 2));

        return atmResponses;
    }

}