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


public class OOPS {
    public static void main (String[] args){
        Student s1 = new Student();
        s1.name = "mofiz";
        s1.roll = 12;
        s1.password = "abc";
        s1.marks[0] = 90;
        s1.marks[1] = 80;
        s1.marks[2] = 70;
        
        Student s2 = new Student(s1);
        s2.password = "xyz";

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}


class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }


    Student(){
        marks = new int[3];
        System.out.println("Hello");
    }
}