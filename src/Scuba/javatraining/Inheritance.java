package Scuba.javatraining;






//Java supports Single,Multilevel and Hierarchical
//Multiple inheritance is not supported in Java.
//To achieve Multiple Inheritance we will use Interface


class Parent { // Base class
    Parent() {
        System.out.println("This is a Parent default constructor");
    }


    void display() { //Over ridding Example //Same method signature
        System.out.println("This is a Parent method or behaviour");
    }
}


class Child extends Parent { // Derived class


    Child() {
        //super();
        System.out.println("This is a child default constructor");


    }


    void display() { //Overridding
         super.display();


        System.out.println("This is a child behaviour ");
    }

}

    public class Inheritance {
    	
    public static void main(String[] args) {
        
    	Parent parent =new Parent();
    	parent.display();
    
    Child Child =new Child();
    Child.display();


        // new Child();
        //new Child().display();
    }
    }


    











