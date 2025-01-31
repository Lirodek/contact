package org.sight.contact.view;

import java.util.Scanner;

public class View {
    public static Scanner sc = new Scanner(System.in);

    public void display(){

    }

    public void setLine(String s){
        System.out.println("======== " + s + " ========");
    }

    public String getString(String s){
        String getS;

        try{
            System.out.println(s);
            getS = sc.nextLine();
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
            return getString(s);
        }

        return getS;
    }

    public int getInteger(String s){
        int integer;
        try{
            System.out.println(s);
            integer = sc.nextInt();
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다. (숫자를 입력해주세요.)");
            return getInteger(s);
        }

        return integer;
    }
}
