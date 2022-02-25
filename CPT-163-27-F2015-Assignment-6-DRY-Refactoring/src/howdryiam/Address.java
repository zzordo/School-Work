/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howdryiam;

/**
 *
 * @author samuraipanzer
 */
public class Address {
  private String attn = "";
  private String street = "";
  private String city = "";
  private String state = "";
  private String zip = "";

  public Address(String attn, String street, String city, String state, String zip) {
	this.attn = attn;
	this.city = city;
	this.state = state;
	this.street = street;
	this.zip = zip;
  }

  public String getAttn() {
	return attn;
  }

  public void setAttn(String attn) {
	this.attn = attn;
  }

  public String getStreet() {
	return street;
  }

  public void setStreet(String street) {
	this.street = street;
  }

  public String getCity() {
	return city;
  }

  public void setCity(String city) {
	this.city = city;
  }

  public String getState() {
	return state;
  }

  public void setState(String state) {
	this.state = state;
  }

  public String getZip() {
	return zip;
  }

  public void setZip(String zip) {
	this.zip = zip;
  }
}
