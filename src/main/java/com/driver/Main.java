package com.driver;

public class Main {

    public static void main(String[] args){
        RWOnly rwOnly=new RWOnly();
       // rwOnly.name="Avinash kumar";
        //compile time error
        rwOnly.setName("Avinash kumar");
        System.out.print(rwOnly.getName());
    }
}
