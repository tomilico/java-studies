package academy.devdojo.introduction;

public class LoopStatements02 {
    static void main(String[] args) {
        //print all even numbers from 0 to 1000000
        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
