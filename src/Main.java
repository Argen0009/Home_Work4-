import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> list1 = new ArrayList<>();
        ArrayList<String>list2 =new ArrayList<>();
        ArrayList<String >list3 = new ArrayList<>();
        String A;
        System.out.println("list A:");
        for (int i = 0; i <5; i++) {
            A = scanner.nextLine();
            list1.add(A);
        }
        String B;
        System.out.println("list B:");
        for (int i = 0; i < 5; i++) {
            B = scanner.nextLine();
            list2.add(B);
        }
        System.out.println(list1);
        Collections.reverse(list2);
        System.out.println(list2);
        for (int i = 0; i < list1.size(); i++) {
            list3.addAll(i,Collections.singleton(list1.get(i)));
        }
        int c1= 1;
        for (int j = 0; j < list2.size(); j++) {
            list3.addAll(c1,Collections.singleton(list2.get(j)));
            c1 +=2;
        }
        System.out.println(list3);
        list3.sort(Comparator.comparing(String::length));
        System.out.println(list3);
    }
}