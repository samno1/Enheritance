/**
 * Created by sam on 01.07.16.
 */
public class Echo {
    int count =0;

    public int max(int x, int y){
        int max;
        if (x>y) {
            max =x;
            System.out.println(" Max = "+max);
        }else {
            max = y;
            System.out.println(" Max = "+ max);
        }
        return max;
    }
}
