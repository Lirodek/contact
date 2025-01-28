package org.sight.chapter5;

public class ContinueLabelEx {
    public static void main(String[] args) {
        int i, j, a = 0, max;
        boolean even;

        Label:
        for(i=1; i<=5; i++){
            a+=1;
            max = i;
            j = 1;

            Label2:
            while(true){
                System.out.println(j + " t");
                if(j == max){
                    System.out.println();
                    continue Label;
                }
                j++;
            }
        }

    }
}
