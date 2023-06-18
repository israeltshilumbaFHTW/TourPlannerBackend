package com.example.demo.service.Enums;

public enum ResponseMessage {
    POST_TOUR_SUCCESS("{\"message\":\"successfully added\"}"),
    POST_TOUR_FAIL("{\"message\":\"adding failed\"}"),
    DELETE_TOUR_FAIL("{\"message\":\"deleting tour failed\"}"),
    DELETE_TOUR_SUCCESS("{\"message\":\"tour successfully deleted\"}"),
    DELETE_TOUR_LOG_SUCCESS("{\"message\":\"tourLog successfully deleted\"}"),
    DELETE_TOUR_LOG_FAIL("{\"message\":\"tourLog successfully deleted\"}");

    private String responseStatus;
    private ResponseMessage(String responseStatus) {
        this.responseStatus = responseStatus;
    }
    public String getResponseStatus() {
        return this.responseStatus;
    }


}
