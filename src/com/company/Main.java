package com.company;

public class Main {

    public static void main(String[] args) {
	/*
         Relational Operators
         < : less than
         < = : Less than or equal to
         > : greater than
         > = : greater than or equal to
         = : equals
         = / : not equal to

         Logical Operators
         && : and
         | | : or
         ! : not






    */


        int a = 2;
        int b = 4;
        int x = 6;
        int y = 8;


        System.out.println("a = 2");
        System.out.println("b = 4");
        System.out.println("x = 6");
        System.out.println("y = 1");

        if (a == x && y + y == a) {
            //will this method run?
            System.out.println("a == x && y + y == a");
        }   // No, This will not run because a does NOT equal x even though  y + y does.




        if(a != x && y + y == a){
            // Will this system run?
            System.out.println("a != x && y + y == a");
            // Yes, this will run because one of our conditions is true. All you need is a single true condition for an OR operator to be true.
        }


        }
}

