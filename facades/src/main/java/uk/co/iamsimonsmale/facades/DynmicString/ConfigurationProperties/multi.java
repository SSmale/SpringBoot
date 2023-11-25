package uk.co.iamsimonsmale.facades.DynmicString.ConfigurationProperties;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public record multi(
        String lastName,
        List<single> configs) {

}
