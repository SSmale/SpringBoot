package uk.co.iamsimonsmale.facades.dynmicstring.autoconfigure;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.env.Environment;
import uk.co.iamsimonsmale.facades.dynmicstring.DynamicStringMaker;
import uk.co.iamsimonsmale.facades.dynmicstring.ConfigurationProperties.Multi;

public class DynamicStringMakerBeanDefinitionRegistrar
    implements BeanDefinitionRegistryPostProcessor {

  public static final String PROPERTIES_PREFIX = "uk.co.iamsimonsmale.dynamic-strings";
  private final Multi multi;

  public DynamicStringMakerBeanDefinitionRegistrar(Environment environment) {
    multi = Binder.get(environment).bind(PROPERTIES_PREFIX, Bindable.of(Multi.class))
        .orElseThrow(IllegalStateException::new);
  }

  @Override
  public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry)
      throws BeansException {
    multi.configs().forEach(config -> {
      GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
      beanDefinition.setBeanClass(DynamicStringMaker.class);
      beanDefinition
          .setInstanceSupplier(() -> new DynamicStringMaker(multi.lastName(), config.firstName()));
      registry.registerBeanDefinition(config.beanName(), beanDefinition);
    });
  }

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
      throws BeansException {}
}
