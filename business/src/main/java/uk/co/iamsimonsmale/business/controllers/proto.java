package uk.co.iamsimonsmale.business.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.iamsimonsmale.facades.DynamicStringMakerFacade;

@RestController
@RequestMapping("/test")
public class proto {

  @Autowired private DynamicStringMakerFacade stringFacade;

  @GetMapping(value = "/facade")
  public String getFacadeString() {
    return stringFacade.fullName();
  }
}
