package academy.devdojo.introduction;

public class ConditionalStatements {
    static void main(String[] args) {
        int age = 15;
        boolean isAllowedToBuyAlcohol = age >=18;

        if (isAllowedToBuyAlcohol){
            System.out.println("AUTHORIZED FOR ALCOHOL");
        }else {
            System.out.println("DENIED ALCOHOL");
        }
    }
}
