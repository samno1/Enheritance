import java.util.Scanner;

/**
 * Created by sam on 16.07.16.
 */
public class DotComDrive {
    public static void main(String[]args){
        DotCom dot = new DotCom();
        int[] locatons ={2,3,4};
        dot.setLocationCells(locatons);
           //
                while (true){
                Scanner scan = new Scanner(System.in);
                System.out.print(" Введите число ячейка : ");
                String userGuess = scan.nextLine();
                String result = dot.checkYourself(userGuess);

                String testResult = "Неудача";
                if (result.equals("Попал")) {
                    testResult = " Проиден";
                }
                if (result.equals("Потопил")) {
                    testResult = " Конец игры";
                    break;
                }
                System.out.println(testResult);
            }
        }
}
