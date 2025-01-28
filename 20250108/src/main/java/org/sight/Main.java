package org.sight;

import org.sight.chapter6.Dog;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        System.out.println(" ========================= ");
//
//
//        boolean isPrsent = isAllPresent("baeGwangmin", "", "terran");
//        System.out.println("isPresent :: " + isPrsent);
//
//        System.out.println(" ========================= ");

//        Object t;
//
//        // 박싱
//        Integer boxing = 10;
//
//        // 언박싱
//        int unboxing = boxing;
//
//
//        t = Integer.parseInt("123");
//        if(t instanceof Integer){
//            System.out.println("integer");
//        }
//        System.out.println(t);

        String test = "hello";
        Optional<Integer> optionBox = isNumber(test);

        if(optionBox.isPresent()){
            System.out.println("is int :: " + optionBox.get());
        } else {
            System.out.println("is not int.");
        }

    }

    public static Optional<Integer> isNumber(String str){
        try{
            return Optional.of(Integer.valueOf(str));
        } catch (Exception e){
            return Optional.ofNullable(null);
        }

    }

    // 스트링을 입력받아서 한건도 비어있지 않은지 확인합니다.
    public static boolean isAllPresent(String ...args){
        for(String arg : args){
            boolean isFlag = arg == null;
            if(!isFlag && arg.trim().isEmpty()){
                isFlag = true;
            }

            if(isFlag){
                return false;
            }
        }
        return true;
    }
}