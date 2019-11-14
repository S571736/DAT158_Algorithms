import java.util.ArrayList;
import java.util.Random;
public class Test {
    public static ArrayList<Boolean> randomized(int lengde){
        Random r = new Random();
        ArrayList<Boolean> l = new ArrayList<>();

        for (int i = 0; i < lengde; i++) {
            boolean v = r.nextBoolean();
            l.add(v);
        }
        return l;
    }
    public static void main(String[] args) {
        ArrayList<Boolean> l = randomized(20);

        l.forEach(b ->System.out.println(b));

    }
}
