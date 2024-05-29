package org.example;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String yamlFilePath = "src/main/resources/application.yaml"; // Update the path to your application.yaml file
        org.example.ConfigFromYaml.APPConfig appConfig = readConfigFromYaml(yamlFilePath);

        if (appConfig != null) {
            Note17PushtoWdataParams params = appConfig.getNote17PushtoWdataParams();
            System.out.println("Environment: " + params.getEnv());
            System.out.println("Wdata Base URL: " + params.getWdataBaseUrl());
            System.out.println("Data DNS Base URL: " + params.getDataDnsBaseUrl());
            System.out.println("Wdata Username: " + params.getWdataBaseUrl());
        }
    }

    public static org.example.ConfigFromYaml.APPConfig readConfigFromYaml(String filePath) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            return mapper.readValue(new File(filePath), org.example.ConfigFromYaml.APPConfig.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

