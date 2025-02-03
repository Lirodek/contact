package org.sight.contact.view;

import java.util.Scanner;

public class View {
    public static Scanner sc = new Scanner(System.in);

    public void display(){

    }

    public void setLine(String s){
        System.out.println("======== " + s + " ========");
    }

    public void setLine(){
        System.out.println("=====================");
    }

    public String getString(String s){
        String getS;

        try{
            System.out.printf(s + " : ");
            getS = sc.next();
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
            return getString(s);
        }

        return getS;
    }

    public int getPhoneNumber(String s){
        String getS;
        int phoneNumber;

        try{
            System.out.printf(s + " : ");
            getS = sc.next();

            getS = getS.trim().replaceAll("[/-]", "");
            phoneNumber = Integer.parseInt(getS);
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
            return getPhoneNumber(s);
        }

        return phoneNumber;
    }

    public int getInteger(String s){
        int integer;
        try{
            System.out.printf(s + " : ");
            integer = sc.nextInt();
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다. (숫자를 입력해주세요.)");
            return getInteger(s);
        }

        return integer;
    }
}
