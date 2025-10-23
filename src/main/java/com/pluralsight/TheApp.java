package com.pluralsight;

public class TheApp {

    public static void main(String[] args) {

        //first format....
        System.out.println(NameFormatter.format("David", "Aldair"));
        //second format....
        System.out.println(NameFormatter.format("Mr.",
                "David",
                "Aldair",
                "Quiñonez",
                "PhD"));
    }
}
