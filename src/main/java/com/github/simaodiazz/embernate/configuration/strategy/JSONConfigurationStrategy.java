package com.github.simaodiazz.embernate.configuration.strategy;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;

public class JSONConfigurationStrategy implements ConfigurationFoundationStrategy {

    private final File file;
    private final Gson gson;

    public JSONConfigurationStrategy(File file) {
        this.file = file;
        this.gson = new Gson();
    }

    @Override
    public void dialect() { }

    @Override
    public void url() { }

    @Override
    public void user() { }

    @Override
    public void password() { }

    @Override
    public void driver() { }

    @Override
    public void maximumPoolSize() { }

    @Override
    public void minimumIdle() { }

    @Override
    public void idleTimeout() { }

    @Override
    public Configuration build() {
        try (FileReader reader = new FileReader(file)) {
            return gson.fromJson(reader, Configuration.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
