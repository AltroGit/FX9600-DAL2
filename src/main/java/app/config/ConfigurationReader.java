package app.config;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConfigurationReader {

    private ObjectMapper mapper = new ObjectMapper();

    public Configuration readConfigurationFrom(String filePath) throws IOException {
        return  mapper.readValue(new File(filePath), Configuration.class);
    }
}
