package uk.co.iamsimonsmale.facades.dynmicstring.ConfigurationProperties;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "uk.co.iamsimonsmale.dynamic-strings")
public record Multi(String lastName, List<Single> configs) {}
