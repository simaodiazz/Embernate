package com.github.simaodiazz.embernate.configuration.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Configuration {

    private String dialect;
    private String url;
    private String user;
    private String password;
    private String driver;
    private int maximumPoolSize;
    private int minimumIdle;
    private int idleTimeout;

}
