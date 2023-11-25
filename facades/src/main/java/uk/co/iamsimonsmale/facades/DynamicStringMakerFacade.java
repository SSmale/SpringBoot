package uk.co.iamsimonsmale.facades;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.co.iamsimonsmale.facades.DynmicString.DynamicStringMaker;

@Service
public class DynamicStringMakerFacade {

  @Autowired
  private DynamicStringMaker simonBean;

  @Autowired
  private DynamicStringMaker griffinBean;

  public String fullName() {
    return simonBean.fullname() + griffinBean.fullname();
  }

}
