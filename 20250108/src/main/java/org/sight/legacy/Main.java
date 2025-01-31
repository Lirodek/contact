package org.sight.legacy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    static class Person{
        private String name;
        private int number;
        private String group;
        public Person(String name, int number, String group) {
            this.name = name;
            this.number = number;
            this.group = group;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return name + " | " + number + " | " + group;
        }
    }

    public static void main(String[] args) {
        /**
         * 전화번호 : Number, not null
         * 이름 : String, not null
         * 그룹(ex : 친구, 직장동료, 학교동기, 기타, 미지정), 외래키, not null
         *
         * 전화번호 프로그램 실행시 목록이 나오고 등록, 수정이 있었으면 한다.
         */
        List<Person> peopleList = new ArrayList<>(
                List.of(
                        new Person("차무식", 1012345679, "기본"),
                        new Person("김민준", 1012345678, "기본"),
                        new Person("이하준", 1012345670, "기본"),
                        new Person("정지호", 1012345671, "기본"),
                        new Person("박주원", 1012345672, "기본"),
                        new Person("강주호", 1012345673, "기본"),
                        new Person("박주호", 1012345674, "기본")
                )
        );
        List<Person> searchList = new ArrayList<>();
        Optional<Integer> option;
        String name;
        String numberString;
        String group;
        int phoneNumber;
        int choice = 0;

        Label:
        while(true){

            System.out.println("======================");
            System.out.println("전화기록부 입니다.");
            for(Person person : peopleList){
                System.out.println(person.getName());
            }
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 검색");
            System.out.println("4. 종료");
            System.out.println("======================");
            System.out.printf("입력 :: ");
            choice = sc.nextInt();

            switch (choice){
                case 1-> {
                    System.out.println("연락처를 등록합니다.");
                    System.out.printf("이름 : ");
                    name = sc.next();
                    if(!isPresent(name)){
                        System.out.println("이름을 입력해 주세요. ");
                        break;
                    }
                    System.out.printf("전화번호 : ");
                    numberString = sc.next();
                    option = isNumber(numberString);
                    if(option.isEmpty()){
                        System.out.println("올바른 전화번호를 입력해주세요.");
                        System.out.println("입력된 전화번호 : " + numberString);
                        break;
                    }
                    phoneNumber = option.get();

                    System.out.printf("그룹 : ");
                    group = sc.next();
                    if(!isPresent(name)){
                        System.out.println("그룹을 입력해 주세요. ");
                        break;
                    }

                    peopleList.add(new Person(name, phoneNumber, group));
                } case 2 -> {
                    // STEP 1. searchList를 초기화 해주고. 이름을 입력받는다.
                    searchList = new ArrayList();
                    System.out.printf("이름 : ");
                    name = sc.next();

                    // STEP 2. 이름을 입력하지 않았다면 FAIL
                    if(!isPresent(name)){
                        System.out.println("수정하실 연락처 이름을 입력해주세요.");
                        break;
                    }

                    // STEP 3. 연락처에서 검색한 이름을 searchList에 저장해준다.
                    for(Person person : peopleList){
                        if(person.getName().indexOf(name) != -1){
                            searchList.add(person);
                        }
                    }

                    // STEP 4. 검색값이 없다면 FAIL 입니다.
                    if(searchList.isEmpty()){
                        System.out.println(name + "을 찾을 수 없습니다.");
                        break;
                    }

                    // STEP 5. 검색된 결과를 조회합니다.
                    int index = 1;
                    for(Person person : searchList){
                        System.out.println(index++ + "번 " + person.toString());
                    }

                    // STEP 6.
                    System.out.println("수정하실 전화번호를 입력해주세요.");
                    System.out.printf("입력: ");
                    index = sc.nextInt() - 1;
                    System.out.println("index :: " + index);
                    if(index < 0 || index >= searchList.size()){
                        System.out.println("올바르지 않은 선택입니다.");
                        break;
                    }
                    Person modifyPerson = searchList.get(index);

                    System.out.printf("이름 : ");
                    name = sc.next();
                    if(!isPresent(name)){
                        System.out.println("이름을 입력해 주세요. ");
                        break;
                    }
                    System.out.printf("전화번호 : ");
                    numberString = sc.next();
                    option = isNumber(numberString);
                    if(option.isEmpty()){
                        System.out.println("올바른 전화번호를 입력해주세요.");
                        System.out.println("입력된 전화번호 : " + numberString);
                        break;
                    }
                    phoneNumber = option.get();

                    System.out.printf("그룹 : ");
                    group = sc.next();
                    if(!isPresent(name)){
                        System.out.println("그룹을 입력해 주세요. ");
                        break;
                    }

                    modifyPerson.setName(name);
                    modifyPerson.setNumber(phoneNumber);
                    modifyPerson.setGroup(group);
                } case 3 -> {
                    // STEP 1. searchList를 초기화 해주고. 이름을 입력받는다.
                    searchList = new ArrayList();
                    System.out.printf("이름 : ");
                    name = sc.next();

                    // STEP 2. 이름을 입력하지 않았다면 FAIL
                    if(!isPresent(name)){
                        System.out.println("검색하실 이름을 입력해주세요.");
                        break;
                    }

                    // STEP 3. 연락처에서 검색한 이름을 searchList에 저장해준다.
                    for(Person person : peopleList){
                        if(person.getName().indexOf(name) != -1){
                            searchList.add(person);
                        }
                    }

                    // STEP 4. 검색값이 없다면 FAIL 입니다.
                    if(searchList.isEmpty()){
                        System.out.println(name + "을 찾을 수 없습니다.");
                        break;
                    }

                    // STEP 5. 검색된 결과를 조회합니다.
                    for(Person person : searchList){
                        System.out.println(person.toString());
                    }
                } case 4 -> {
                    System.exit(0);
                    break Label;
                } default -> {

                }
            }
        }

        System.out.println("프로그램을 종료합니다. exit(0)");

    }

    // 파라미터가 비어있는지 확인한다.
    public static boolean isPresent(String str){
        if(str == null || str.trim().isEmpty()){
            return false;
        }

        return true;
    }

    // 받은 전화번호가 number인지 확인한다.
    public static Optional<Integer> isNumber(String str){
        str = str.trim().replaceAll("-", "");
        if(str.trim().isEmpty()){
            System.out.println("문자열이 비어있습니다.");
            return Optional.empty();
        }
        try{
            return Optional.of(Integer.parseInt(str));
        } catch (Exception e){
            System.out.println("전화번호를 변환하는 과정에서 오류가 발생했습니다.");
            System.out.println(e.getMessage());
            return Optional.empty();
        }
    }

}
