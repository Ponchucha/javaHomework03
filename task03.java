import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/*Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее ариф. из этого списка. */
public class task03 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList <Integer> array = new ArrayList<>();
        for (int k = 0; k < rand.nextInt(5, 10); k++) {
            array.add(rand.nextInt(0, 20));
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        int min = 10;
        int max = 0;
        int num = 0;
        int sum = 0;
        Iterator pickOver = array.iterator();
        while(pickOver.hasNext()){
            num = (Integer)pickOver.next();
            if(num > max){
                max = num;
            }
            else if (num < min){
                min = num;
            }
            sum += num;
        }
        System.out.printf("min = %d\nmax = %d\naverage = %f", min, max, (double)sum/(double)array.size());
    }
}
