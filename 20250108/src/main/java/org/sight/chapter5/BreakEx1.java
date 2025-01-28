package org.sight.chapter5;

public class BreakEx1 {
    public static void main(String[] args) {
        int i,j,k = 0;

        for(i=0; i<10; i++){
            System.out.println("i :: " + i);
            for(j=0; j<3; j++){
                System.out.println(++k+" t");
                if(k== 10){
                    break;
                }
            }
        }

        System.out.println("Program End");
    }
}
