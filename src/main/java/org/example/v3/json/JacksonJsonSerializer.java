package org.example.v3.json;


import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonJsonSerializer implements JsonSerializer {

    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public String toJson(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException("JSON serialization failed", e);
        }
    }
}

