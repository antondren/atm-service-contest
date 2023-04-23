package com.contest.atmservice.dto;

public record AtmRequest(int region, AtmRequestType requestType, int atmId) {

}