import java.util.LinkedList;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int a,b;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        a = inp.nextInt();
        System.out.println("Sayi giriniz :");
        b = inp.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();

        int i = 2;
        while (i < 10) {
            if (a % i == 0 && b % i == 0) {
                list.add(i);
            }
            i++;
        }


        int ebob = list.getLast();
        System.out.println("EBOB :" + list.getLast());
        System.out.println("EKOK :"+ (a*b / (ebob)));


    }
}
