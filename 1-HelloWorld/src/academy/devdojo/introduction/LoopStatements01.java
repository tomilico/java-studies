package academy.devdojo.introduction;

public class LoopStatements01 {
    static void main(String[] args) {
        int counter = 12;
        while(counter <10) {
            System.out.println(++counter);
        }
        counter =20;
        do {
            System.out.println("inside do while" + ++counter);
        }while (counter<10);

        for(int i = 0;i<10;i++){
            System.out.println("inside for" +1);
        }
    }
}
