package com.contest.atmservice.service;

import com.contest.atmservice.dto.AtmRequest;
import com.contest.atmservice.dto.AtmResponse;

import java.util.Comparator;
import java.util.List;

public class AtmService {

    private AtmService() {}

    public static List<AtmResponse> sortRequests(List<AtmRequest> atmRequests) {
        return atmRequests
                .stream()
                .sorted(getComparator())
                .map(r ->new AtmResponse(r.region(), r.atmId()))
                .distinct()
                .toList();
    }

    private static Comparator<AtmRequest> getComparator() {
        return Comparator
                .comparing(AtmRequest::region)
                .thenComparing(atmRequest -> atmRequest.requestType().getPriority())
                .thenComparing(AtmRequest::atmId);
    }
}
