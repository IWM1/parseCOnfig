package org.example;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Note17PushtoWdataParams {
    @JsonProperty(required = true)
    public String env;
    @JsonProperty(required = true)
    public String wdataBaseUrl;
    @JsonProperty(required = true)
    public String dataDnsBaseUrl;
}
