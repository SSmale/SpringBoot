package uk.co.iamsimonsmale.facades;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.co.iamsimonsmale.facades.DynmicString.DynamicStringMaker;

@Service
public class myStrings {
  // @Autowired
  // private Map<String, DynamicStringMaker> stringBeans;

  @Autowired
  private DynamicStringMaker simonBean;

  public String fullName() {
    return simonBean.fullname();
  }

}
