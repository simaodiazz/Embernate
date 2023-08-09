package com.github.simaodiazz.embernate.configuration.strategy;

import java.io.File;

public class PropertiesConfigurationStrategy implements ConfigurationFoundationStrategy {

    private Configuration configuration;
    private File file;

    public PropertiesConfigurationStrategy(File file) {
        this.configuration = new Configuration();
        this.file = file;
    }

    @Override
    public void dialect() {

    }

    @Override
    public void url() {

    }

    @Override
    public void user() {

    }

    @Override
    public void password() {

    }

    @Override
    public void driver() {

    }

    @Override
    public void maximumPoolSize() {

    }

    @Override
    public void minimumIdle() {

    }

    @Override
    public void idleTimeout() {

    }

    @Override
    public Configuration build() {
        return null;
    }
}
