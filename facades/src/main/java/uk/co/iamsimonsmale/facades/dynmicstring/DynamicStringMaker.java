package uk.co.iamsimonsmale.facades.dynmicstring;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DynamicStringMaker {
  private String lastName;
  private String firstName;

  public String fullname() {
    return firstName + " " + lastName;
  }
}
