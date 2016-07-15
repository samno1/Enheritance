/**
 * Created by sam on 15.07.16.
 */
public class ClockTestDrive {
    public static void main(String args[]){
        Clock c = new Clock();
        c.setTime("12:45");
        String tod = c.getTime();
        System.out.println(" Vremya="+tod);
    }
}
