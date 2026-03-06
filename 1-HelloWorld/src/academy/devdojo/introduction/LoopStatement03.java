package academy.devdojo.introduction;

public class LoopStatement03 {
    static void main(String[] args) {
        //given a total nnumber, for example 50, print the first 25
        int maxNumber = 50;
        for (int i = 0; i < maxNumber; i++) {
            if (i>25){
                break;
            }
            System.out.println(i);
        }
    }
}
