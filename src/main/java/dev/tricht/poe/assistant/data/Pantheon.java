package dev.tricht.poe.assistant.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Pantheon {
    @JsonProperty("name")
    private String boss;
    @JsonProperty("stat text")
    private String pantheonStatText;
}
