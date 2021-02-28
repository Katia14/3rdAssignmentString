package com.company;

public class Main {

      //Assignment_3
    public static void main(String[] args) {
        String name = "John";
        String regex = "[a-zA-Z]+";
        System.out.println(name.matches(regex));

        String username = "s20surname";
        String regex1 = "[a-zA-Z][0-9]{2}[a-zA-Z]+";
        System.out.println(username.matches(regex1));

        String personCodeOfLatvian = "121200-11311";
        String regex2 = "[0-9]{6}-[0-9]{5}";
        System.out.println(personCodeOfLatvian.matches(regex2));
        System.out.println();

    }
}
// I did not manage to solve Assignment 4 and 5


