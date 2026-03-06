package academy.devdojo.introduction;

public class SwitchExercice {
    //Using switch, print if the day is business day or weekend day
    //giving the numbers 1 -7, 1 being sunday
    static void main(String[] args) {
        byte day = 1;

        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business Day");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}