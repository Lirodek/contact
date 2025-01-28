package org.sight.chapter5;

public class ContinueEx {
    public static void main(String[] args) {
        int i;
        boolean even;

        for(i = 1; i <= 10; i++) {
            even = i % 2 == 0;
            if(even){
                continue;
            }
            System.out.println("odd number :: " + i);
        }
    }
}
