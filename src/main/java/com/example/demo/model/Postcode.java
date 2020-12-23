package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Postcode {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String value;

    @OneToMany(mappedBy = "postcode")
  private List<Address> addresses;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  @Override
  public String toString() {
    return "Postcode{" +
            "id=" + id +
            ", value='" + value + '\'' +
            ", addresses=" + addresses +
            '}';
  }
}
