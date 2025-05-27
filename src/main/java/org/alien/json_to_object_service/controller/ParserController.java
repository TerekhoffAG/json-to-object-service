package org.alien.json_to_object_service.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.alien.json_to_object_service.api.ParseApi;

public class ParserController implements ParseApi {
    @Override
    public String parseJson(JsonNode jsonNode) {
        return "";
    }
}
