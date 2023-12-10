package uk.co.iamsimonsmale.facades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.iamsimonsmale.facades.dynmicstring.DynamicStringMaker;

@Service
public class DynamicStringMakerFacade {

  @Autowired private DynamicStringMaker simonBean;

  @Autowired private DynamicStringMaker griffinBean;

  public String fullName() {
    return simonBean.fullname() + griffinBean.fullname();
  }
}
