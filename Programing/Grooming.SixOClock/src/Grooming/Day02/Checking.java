package Grooming.Day02;

class SuperClass{
    public static void m(){
        System.out.println("Super class static method");
    }
}

class BaseClass extends SuperClass{
    public static void m(){
        SuperClass.m();
        System.out.println("base class static method");
    }
}



public class Checking {

    public static void main(String[] args) {
      BaseClass.m();

    }
    
}
