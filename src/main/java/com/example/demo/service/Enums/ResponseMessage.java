package com.example.demo.service.Enums;

public enum ResponseMessage {
    POST_TOUR_SUCCESS("{\"message\":\"successfully added\"}"),
    POST_TOUR_FAIL("{\"message\":\"adding failed\"}");

    private String responseStatus;
    private ResponseMessage(String responseStatus) {
        this.responseStatus = responseStatus;
    }
    public String getResponseStatus() {
        return this.responseStatus;
    }


}
