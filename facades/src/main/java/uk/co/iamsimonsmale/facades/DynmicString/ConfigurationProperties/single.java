package uk.co.iamsimonsmale.facades.DynmicString.ConfigurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public record single(
        String beanName,
        String firstName) {
}
