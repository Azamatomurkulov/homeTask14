package array;

import java.util.Random;

public class Array {
    public static void main(String[] args){

        final int[] ms = new int[10];
        Random rn = new Random();
        for (int i = 0; i < ms.length; i++) {
            ms[i] = rn.nextInt(10)+1;
            System.out.print(ms[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < ms.length; i++) {
            ms[i] = rn.nextInt(20)+10;
            System.out.print(ms[i]+" ");
        }//после присвоения ссылки на объект, уже нельзя ее изменить, но можно изменять состояние объекта.
    }
}
