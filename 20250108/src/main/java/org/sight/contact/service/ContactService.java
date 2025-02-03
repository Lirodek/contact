package org.sight.contact.service;

import org.sight.contact.controller.R;
import org.sight.contact.model.PersonVo;

import java.util.ArrayList;

public class ContactService {

    public void insert(PersonVo vo){
        R.personVoList.add(vo);
        System.out.println("연락처가 추가되었습니다.");
    }


    public void search(PersonVo personVo) {
        String name = personVo.getName();

        R.searchList = new ArrayList<>();
        for(PersonVo temp : R.personVoList){
            if(temp.getName().indexOf(name) >= 0){
                R.searchList.add(temp);
            }
        }

        System.out.println("검색된 연락처는 " + R.searchList.size() + "건입니다.");
        int index = 1;
        for(PersonVo temp : R.searchList){
            System.out.println(index++ + ". " +temp);
        }
    }
}
