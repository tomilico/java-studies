package academy.devdojo.introduction;

public class ConditionalStatements02 {
    static void main(String[] args) {
        //age <15 == junior
        //age >=15 && age < 18 == senior
        //age >=18 == masters

        int age = 15;
        if (age <15){
            System.out.println("JUNIOR");
        }else if (age>=15 && age <18){
            System.out.println("SENIOR");
        }else {
            System.out.println("MASTERS");
        }
    }
}
