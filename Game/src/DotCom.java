import java.util.Scanner;

/**
 * Created by sam on 16.07.16.
 */
public class DotCom {
    int[] locationCells;
    int numOfHits=0;

    public String checkYourself(String stringGuess ){
        int guess=Integer.parseInt(stringGuess);
        String result = "Мимоооо";
            for (int cell : locationCells) {
                if (guess == cell) {
                    result = "Попал";
                    numOfHits++;
                }
            }
            if (numOfHits == locationCells.length) {
                result = "Потопил !!!!";
        }
            System.out.println(result);
            return result;

    }
    void setLocationCells(int[] locationCells){
        this.locationCells=locationCells;
    }


}
