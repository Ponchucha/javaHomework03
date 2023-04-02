import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
// Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class task02 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList <Integer> array = new ArrayList<>();
        for (int k = 0; k < rand.nextInt(10, 20); k++) {
            array.add(rand.nextInt(0, 10));
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        Iterator check = array.iterator();
        while(check.hasNext()){
            if ((Integer)check.next() % 2 == 0){
                check.remove();
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
