package org.alien.json_to_object_service.api;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ParseApi {

    @PostMapping("/parse")
    String parseJson(@RequestBody JsonNode jsonNode);

}
