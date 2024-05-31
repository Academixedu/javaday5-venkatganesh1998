package com.example;

public class Buy {
    public static void main(String[] args) {
        int a,b;
a=10;
b=1;
int sum=totalMethod(a,b);
String name ="raj";
System.out.println("total : "+sum);
display(name);
    }

    public static int totalMethod(int x,int y){
        
        return x+y;
    }

    public static void display(String name){
        System.out.println("name : "+name);
    }
    
}
