/**
 * Created by sam on 30.06.16.
 */
public class Main {
    public static void main(String[]args){
    Movie one =new Movie();
        one.title="The sleeping beauty";
        one.genre="Drama";
        one.rating = 7;
        Movie two = new Movie();
        two.title="Coming to America";
        two.genre = " Melodrama";
        two.rating = 8;
        two.PlayIt();
        Movie three = new Movie();
        three.title="Zveropolyc";
        three.genre = "Animation";
        three.rating = 9;
    }
}
