package uk.co.iamsimonsmale.facades.DynmicString.ConfigurationProperties;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "uk.co.iamsimonsmale.dynamic-strings")
public record Multi(
                String lastName,
                List<Single> configs) {
}
