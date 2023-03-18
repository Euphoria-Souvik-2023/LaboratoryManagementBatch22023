package com.example.laboratorymanagement.utility;

public class Bill {
    private String name,email,phoneNo,address,deliveryDate;
    private int age;
    Bill(String name,String email,String phoneNo,String deliveryDate,String address,int age){
        this.name=name;
        this.email=email;
        this.phoneNo=phoneNo;
        this.deliveryDate=deliveryDate;
        this.address=address;
        this.age=age;
    }
    String getName(){
        return name;
    }
    String getMail(){
        return email;
    }
    String getPhoneNo(){
        return phoneNo;
    }
    String getAddress(){
        return address;
    }
    String getDeliveryDate(){
        return deliveryDate;
    }
    int getAge(){
        return age;
    }
}
