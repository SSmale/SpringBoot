package uk.co.iamsimonsmale.business.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.co.iamsimonsmale.facades.myStrings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/test")
public class proto {

  @Autowired
  private myStrings stringFacade;

  @GetMapping(value = "/facade")
  public String getFacadeString() {
    return stringFacade.fullName();
  }

}
