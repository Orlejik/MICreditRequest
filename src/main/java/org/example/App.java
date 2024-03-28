package org.example;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {

        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i <=10 ; i++) {
            ints.add(i);
        }

        System.out.println("We have List of Integers : " + ints);

        getRandomElem(ints);

    }


    public static int getRandomElem(List<Integer> elems){
        int min = 1;
        int max = elems.size();

        Random rand = new Random();
        int n = rand.nextInt(max+1);
        System.out.printf("Random int is %d, and the value is %d", n, elems.get(n));
        return elems.get(n);
    }
}
