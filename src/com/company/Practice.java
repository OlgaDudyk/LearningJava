package com.company;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Java Variables
        //Create a variable named carName and assign the value Volvo to it.
        String carName = "Volvo";

        //Create a variable named maxSpeed and assign the value 120 to it.
        int maxSpeed = 120;

        //Display the sum of 5 + 10, using two variables: x and y.
        int x = 5;
        int y = 10;
        System.out.println(x + 10);

        //Create a variable called z, assign x + y to it, and display the result.
        int a = 5;
        int b = 10;
        int z = a + b;
        System.out.println(z);

        //Fill in the missing parts to create three variables of the same type, using a comma-separated list
        int num1=1, num2=2, num3=3;
        System.out.println(num1 + num2 + num3);

        //Java Data Types
        //Add the correct data type for the following variables
        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Hello World";

        //Type casting - convert the following double type (myDouble) to an int type
        double myDouble = 9.78;
        int myInt = (int) myDouble;

        //Java Operators
        //Multiply 10 with 5, and print the result
        System.out.println(10 * 5);

        //Divide 10 by 5, and print the result
        System.out.println(10 / 5);

        //Use the correct operator to increase the value of the variable x by 1
        int xx = 10;
        System.out.println("x");
        System.out.println(++xx);
        System.out.println(xx++);

        //Use the addition assignment operator to add the value 5 to the variable n
        int n = 10;
        n += 5;

        //Java Strings
        //Fill in the missing part to create a greeting variable of type String and assign it the value Hello.
        String greeting = "Hello";

        //Use the correct method to print the length of the txt string.
        String txt = "Hello";
        System.out.println(txt.length());

        //Convert the value of txt1 to upper case
        String txt1 = "Hello";
        System.out.println(txt.toUpperCase());

        //Use the correct operator to concatenate two strings
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + lastName);

        //Use the correct method to concatenate two strings
        String FirstName = "John";
        String LastName = "Doe";
        System.out.println(FirstName.concat(LastName));

        //Return the index (position) of the first occurrence of "e" in the following string
        String text = "Hello Everybody";
        System.out.println(text.indexOf("e"));

        //Java Math
        //Use the correct method to find the highest value of e and s
        int e = 5;
        int s = 10;
        Math.max (e, s);

        //Use the correct method to find the square root of g
        int g = 16;
        Math.sqrt(g);

        //Use the correct method to return a random number between 0 (inclusive), and 1 (exclusive)
        Math.random();

        //Java Booleans
        //Fill in the missing parts to print the values true and false
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        //Fill in the missing parts to print the value true
        int i = 10;
        int q = 9;
        System.out.println(i > q);

        //Java If...Else
        //Print "Hello World" if t is greater than tt
        int t = 50;
        int tt = 10;
        if (t > tt) {
            System.out.println("Hello World");
        }

        //Print "Hello World" if w is equal to u
        int w = 50;
        int u = 50;
        if (w == u){
            System.out.println("Hello World");
        }

        //Print "Yes" if A is equal to B, otherwise print "No"
        int A = 50;
        int B = 50;
        if (A == B){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //Print "1" if x is equal to y, print "2" if x is greater than y, otherwise print "3"
        int X = 50;
        int Y = 50;
        if (X == Y){
            System.out.println("1");
        }else if (X > Y){
            System.out.println("2");
        }else {
            System.out.println("3");
        }

        //Insert the missing parts to complete the following "short hand if...else statement" (ternary operator)
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        //Java Arrays
        //Create an array of type String called cars

        String[] cars = {"Volvo", "BMW", "Ford"};

        //Print the second item in the cars array.
        String[] Cars = {"Volvo", "BMW", "Ford"};
        System.out.println(Cars [1]);

        //Change the value from "Volvo" to "Opel", in the cars array.
        String[] cars2 = {"Volvo", "BMW", "Ford"};
        cars2[0] = "Opel";
        System.out.println(cars2[0]);

        //Find out how many elements the cars array have
        String[] cars3 = {"Volvo", "BMW", "Ford"};
        System.out.println(cars3.length);

        //Loop through the items in the cars array
        String[] Cars2 = {"Volvo", "BMW", "Ford"};
        for (String m : Cars2) {
            System.out.println(m);
        }

        //Insert the missing parts to create a two-dimensional array
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7,} };


    }

}
