// public class OOPS {
//     public static void main(String args[]){
//         // Pen p1 = new Pen(); // created a pen object p1
//         // p1.setColor("Blue");
//         // System.out.println(p1.color);

//         // p1.setTip(5);
//         // System.out.println(p1.tip);

//         // p1.color = "Yellow";
//         // System.out.println(p1.color);

// //         BankAccount myAccount = new BankAccount();
// //         myAccount.username = "MofizUsmani";
// //         // myAccount.password = "abcdefghi";
// //         myAccount.setPassword("abcdefghi");
// //         System.out.println(myAccount.getPassword());

// //         Pen p1 = new Pen();
// //         p1.setColor("Green");
// //         System.out.println(p1.getColor());

// //         p1.setTip(10);
// //         System.out.println(p1.getTip());
// //     }
// // }

// // class Pen {
// //     String color;
// //     int tip;

// //     String getColor(){
// //         return this.color;
// //     }

// //     int getTip(){
// //         return this.tip;
// //     }

// //     void setColor(String newColor){
// //         this.color = newColor;
// //     }

// //     void setTip(int tip){
// //         this.tip = tip;
// //     }
// // }

// // class BankAccount {
// //     public String username;
// //     private String password;
// //     public void setPassword(String pwd){
// //         password = pwd;
// //     }

// //     // Getter to get Password
// //     String getPassword(){
// //         return this.password;
// //     }
// // }

// // class Pen {
// //     String color; 
// //     int tip;

// //     void setColor(String newColor){
// //         color = newColor;
// //     }

// //     void setTip(int newTip){
// //         tip = newTip; 
// //     }
// // }


// // class Student {
// //     String name;
// //     int age;
// //     float percentage;

// //     void calcPercentage(int phy, int chem, int math) {
// //         percentage = (phy + chem + math) / 3;
// //     }
// // }



// Types of Constructors
// public class OOPS {
//     public static void main(String[] args){
//         Student s1 = new Student();
//         Student s2 = new Student("Mofiz");
//         Student s3 = new Student(12);
//         System.out.println(s2.name);
//         System.out.println(s3.roll);
//     }
// }


// //Constructors
// class Student {
//     String name;
//     int roll;

//     // Non-parametrazied constructor
//     Student(){
//         System.out.println("constructor is called...");
//     }

//     // Parametarized Constructor
//     Student(String name){
//         this.name = name;
//     }

//     // Parametarized Constructor
//     Student(int roll){
//         this.roll = roll;
//     }
// }



// 
// public class OOPS {
//     public static void main (String[] args){
//         Student s1 = new Student();
//         s1.name = "mofiz";
//         s1.roll = 12;
//         s1.password = "abc";
//         s1.marks[0] = 90;
//         s1.marks[1] = 80;
//         s1.marks[2] = 70;
        
//         // Deep copy constructor - creates a new Student object by copying-
//         // values from another Student object
//         Student s2 = new Student(s1); // 
//         s1.marks[2] = 90;


//         for(int i=0; i<3; i++){
//             System.out.println(s2.marks[i]);
//         }
//     }
// }


// class Student {
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     // Shallow Copy Constructor
//     // Student(Student s1){
//     //     marks = new int[3];
//     //     this.name = s1.name;
//     //     this.roll = s1.roll;
//     //     this.marks = s1.marks;
//     // }


//     // Deep Copy Constructor
//     Student(Student s1){
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         for(int i=0; i<marks.length; i++){
//             this.marks[i] = s1.marks[i]; 
//         }
//     }


//     Student(){
//         marks = new int[3];
//         System.out.println("Hello");
//     }
// }




// // Inheritance   (Single Level)
// public class OOPS {
//     public static void main(String[] args){
//         Fish shark = new Fish();
//         shark.color = "Golden";
//         shark.eat();
//         System.out.println(shark.color);
//     }
// }


// // Base Class
// class Animal {
//     String color;

//     void eat() {
//         System.out.println("Eats");
//     }

//     void breathe() {
//         System.out.println("Breathes");
//     }
// }


// // Derived Class 
// class Fish extends Animal {
//     int fins;

//     void swim(){
//         System.out.println("Swims in water");
//     }
// }





// Inheritance   (Multilevel Inheritance)
// public class OOPS {
//     public static void main(String[] args) {
//         Shark s = new Shark();

//         s.eat();    // from Animal
//         s.swim();   // from Fish
//         s.attack(); // from Shark
//     }
// }


// // Base Class
// class Animal {
//     void eat() {
//         System.out.println("Eats food");
//     }
// }

// // Derived Class 1
// class Fish extends Animal {
//     void swim() {
//         System.out.println("Swims in water");
//     }
// }

// // Derived Class 2 (inherits Fish, which inherits Animal)
// class Shark extends Fish {
//     void attack() {
//         System.out.println("Attacks other fish");
//     }
// }





// Inheritance  (Hierarchial Inheritance)
// public class OOPS {
//     public static void main(String[] args){
//          Dog d = new Dog();
//         d.eat();  // from Animal
//         d.bark(); // from Dog

//         Cat c = new Cat();
//         c.eat();  // from Animal
//         c.meow(); // from Cat

//         Fish f = new Fish();
//         f.eat();  // from Animal
//         f.swim(); // from Fish
//     }
// }



// // Base Class (Parent)
// class Animal {
//     void eat() {
//         System.out.println("Eats food");
//     }
// }

// // Child 1
// class Dog extends Animal {
//     void bark() {
//         System.out.println("Barks loudly");
//     }
// }

// // Child 2
// class Cat extends Animal {
//     void meow() {
//         System.out.println("Meows softly");
//     }
// }

// // Child 3
// class Fish extends Animal {
//     void swim() {
//         System.out.println("Swims in water");
//     }
// }








// Method Overloading
// public class OOPS {
//     public static void main(String[] args) {
//         Calculator c = new Calculator();
//         System.out.println(c.add(5, 10));      // calls int version
//         System.out.println(c.add(5.5, 10.5)); // calls double version
//     }
// }


// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }

//     double add(double a, double b) {
//         return a + b;
//     }
// }







// Method Overriding
// public class OOPS {
//     public static void main(String[] args) {
//         Animal a;
//         a = new Animal();
//         a.sound();
//         a = new Dog();
//         a.sound(); // Dog barks (runtime decision)

//         a = new Cat();
//         a.sound(); // Cat meows
//     }
// }


// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal {
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }





// User Defined Package
// import mypack.MyClass;  // import the package

// class OOPS {
//     public static void main(String[] args) {
//         MyClass obj = new MyClass();
//         obj.display();
//     }
// }






// Abstraction in Java
public class OOPS {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c =  new Chicken();
        c.eat();
        c.walk();
    }
}


abstract class Animal {
    // normal method
    void eat(){
        System.out.println("Animal Eats");
    }
    
    // abstract method (no body)
    abstract void walk();
}


class Horse extends Animal {
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}


class Chicken extends Animal {
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}