package org.sight.chapter7;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("age", 1);
        map.put("name", "bae");


        Integer age = (Integer) map.get("age");
        String name = (String) map.get("name");

        System.out.println("age :: " + age);
        System.out.println("name :: " + name);


        Map<String, Object> map2 = new HashMap<>(Map.of("key1", "value1"));
        System.out.println("map2 value :: " + map2.get("key1").toString());



    }
}
