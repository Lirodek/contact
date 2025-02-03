package org.sight.contact.controller;

import org.sight.contact.enums.MENU;
import org.sight.contact.model.PersonVo;

import java.util.ArrayList;

public class ContactController {

    public void action(){

        R.personVoList.forEach(System.out::println);

        if(R.choice == 0){
            R.vc.run(R.mv);
        }

        switch (R.choice) {
            case MENU.MENU_INSERT -> {
                R.vc.run(R.iv);
                R.cs.insert(R.personVo);
            }
            case MENU.MENU_MODIFY -> {
                R.vc.run(R.fv);
            }
            case MENU.MENU_SEARCH -> {
                R.vc.run(R.sv);
                R.cs.search(R.personVo);
            }
            case MENU.MENU_END -> {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }
        }

        R.choice = 0;
        R.personVo = new PersonVo();
        R.searchList = new ArrayList<>();




    }
}
