package academy.devdojo.introduction;

public class TernaryOperator {
    static void main(String[] args) {
        //if salary > 2000 "buy ps5" "dont buy"
        double salary = 3500D;
        String ShouldBuyMessage = "buy ps5";
        String ShouldNotBuyMessage = "not enough money for ps5 broke";
        String displayMessage = salary>2000? ShouldBuyMessage:ShouldNotBuyMessage;
        // (condition ? <TRUE> : <FALSE>
        // i need to store the values of a ternary operator somewhere,
        //they cant be there just hanging arround
        System.out.println(displayMessage);

    }
}
