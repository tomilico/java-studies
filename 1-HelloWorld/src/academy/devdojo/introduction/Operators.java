package academy.devdojo.introduction;

public class Operators {
    static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        double result = (double) number02 / number01;
        System.out.println("oi"+result);

        int module = 0;
        System.out.println(module);

        boolean isTenLowerThanTwenty = 10 < 20;
        System.out.println(isTenLowerThanTwenty);

        boolean isTenLowerOrEqualsThanTwenty = 10 <= 20;
        System.out.println(isTenLowerOrEqualsThanTwenty);

        int age = 29;
        float salary = 3500F;
        boolean isLegalOlderThanThirty = age >=30 && salary>=4612;
        boolean isLegalYoungerThanThirty = age <30 && salary>=3381;

        System.out.println(isLegalOlderThanThirty);
        System.out.println(isLegalYoungerThanThirty);

        double currentAccount = 299;
        double savingsAccount = 3000;
        float ps5Price = 500;
        boolean canBeBought = currentAccount > ps5Price || savingsAccount >ps5Price;

        //assignment = += -= /= %=
        double bonus = 1800;
        bonus += 1000; //bonus = bonus +1000
        bonus -=1000; //bonus = bonus -1000
        bonus /= 2; // bonus = bonus / 2
        bonus %= 2; // bonus = bonus % 2

        //Unary
        int count = 0;
        count++;
        System.out.println(count);

        System.out.println(bonus);


    }
}
//in this case would result 0 because of int
// we should cast the result to turn the result into the type that we want it to be