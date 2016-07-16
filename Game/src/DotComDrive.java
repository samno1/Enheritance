import java.util.Scanner;

/**
 * Created by sam on 16.07.16.
 */
public class DotComDrive {
    public static void main(String[]args){
        int numOfGuess=0;
        GameHelper helper = new GameHelper();
        DotCom dot = new DotCom();
        int randomNum= (int)(Math.random()*5);
        int [] locations = {randomNum,randomNum+1,randomNum+2};
        dot.setLocationCells(locations);

        boolean isAlive = true;
                while (isAlive == true){
                    String guess =helper.getUserInput("Введите Число ");
                    String result = dot.checkYourself(guess);
                numOfGuess++;
                    if (result.equals("Потопил")){
                        isAlive = false;
                        System.out.println(" Игра окончена");
                        System.out.println(" Вам потребовалос "+ numOfGuess+" попыток(и)");
                    }
            }
        }
}
