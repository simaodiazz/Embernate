package com.github.simaodiazz.embernate.configuration.strategy;

public interface ConfigurationFoundationStrategy {

    void dialect();

    void url();

    void user();

    void password();

    void driver();

    void maximumPoolSize();

    void minimumIdle();

    void idleTimeout();

    Configuration build();

}