package uk.co.iamsimonsmale.facades.dynmicstring.ConfigurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "uk.co.iamsimonsmale.configs")
public record Single(String beanName, String firstName) {}
