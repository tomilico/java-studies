package academy.devdojo.introduction;

public class LoopStatement04 {
    static void main(String[] args) {
        //given a car total price, for example 20000
        // I want to find how much and for how long ill have to pay monthly
        //condition: the monthly payment cannot be lower than 1000

        double totalPrice = 20000;
        for (int i = 1; i < totalPrice; i++) {
            double monthlyPrice = totalPrice / i;
            if (monthlyPrice < 1000) {
                break;
            }
            System.out.println("Months " + i + "Price: " + monthlyPrice);

        }
    }
}
