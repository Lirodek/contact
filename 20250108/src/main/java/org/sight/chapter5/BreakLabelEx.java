package org.sight.chapter5;

public class BreakLabelEx {
    public static void main(String[] args) {
        int i,j,k = 0;

        Label:
        for(i=0; i<10; i++){
            System.out.println("i :: " + i);
            for(j=0; j<3; j++){
                System.out.println(++k+" t");
                if(k== 10){
                    break Label;
                }
            }
        }

        System.out.println("Program End");
    }
}
