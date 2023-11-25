package uk.co.iamsimonsmale.facades.DynmicString.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class DynamicStringMakerBeanDefinitionRegistrarConfiguration {
  @Bean
  @ConditionalOnProperty("uk.co.iamsimonsmale.dynamic-strings.lastName")
  public static DynamicStringMakerBeanDefinitionRegistrar beanDefinitionRegistrar(Environment environment) {
    return new DynamicStringMakerBeanDefinitionRegistrar(environment);
  }
}