package Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Сколько строк? ");
        int size = input.nextInt();
        String array[] = new String[size+1];
        System.out.println("Введите строки поочерёдно : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextLine();
        }

        int a = 0;
        int n = 0;
        for (int c = 0; c < array.length; c++) {
            String D = array[c];
            int k = 0;
            String AA;
            String BB;
            for (int j = 0; j < D.length(); j++) {
                AA = D.substring(j+1,D.length());
                BB = D.substring(j,j+1);
                if (AA.contains(BB) == false) {
                    k++;
                }
            }
            if (k > a) {
                a = k;
                n = c;
            }
        }
        System.out.printf("Строка с максимальным количеством различных символов: " + array[n]);
    }
}
