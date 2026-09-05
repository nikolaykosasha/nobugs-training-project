package org.example.module.cleancode.designpatterns.task1_ConfigurationManager;

public class ConfigurationManager {
    public Configuration configuration;
    private static ConfigurationManager configurationManager;

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }
}
