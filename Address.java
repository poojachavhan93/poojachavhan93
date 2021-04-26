package com.company;

public class Address {

public String city;
public String street;
public String state;


public Address(String city,String street,String state){

    this.city=  city;
    this.street = street;
    this.state = state;
}

    public Address() {

    }

    public String getCity(){
    return  city;
}

public void setCity(String city)
{
    this.city = city;
}

    public String getStreet(){
        return  street;
    }

    public void setStreet(String Street)
    {
        this.city = city;
    }
    public String getState(){
        return  state;
    }

    public void setState(String State)
    {
        this.state = state;
    }

public String getAddressDetails()
{
    return "City: " + city + ", Street: " + street + ", State: " + state ;
}


}
