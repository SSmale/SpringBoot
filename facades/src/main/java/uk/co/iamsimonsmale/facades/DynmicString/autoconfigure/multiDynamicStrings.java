package uk.co.iamsimonsmale.facades.DynmicString.autoconfigure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import uk.co.iamsimonsmale.facades.DynmicString.DynamicStringMaker;
import uk.co.iamsimonsmale.facades.DynmicString.ConfigurationProperties.multi;
import uk.co.iamsimonsmale.facades.DynmicString.ConfigurationProperties.single;

@Configuration
public class multiDynamicStrings {

  @Autowired
  private multi multiConfig;

  @Autowired
  private ConfigurableListableBeanFactory beanFactory;

  @Bean
  public Map<String, DynamicStringMaker> makeMakers() {
    Map<String, DynamicStringMaker> beanList = new HashMap<>();

    for (single config : multiConfig.configs()) {
      DynamicStringMaker newBean = new DynamicStringMaker(multiConfig.lastName(), config.firstName());
      beanFactory.registerSingleton(config.beanName(), newBean);
    }

    return beanList;

  }

}
