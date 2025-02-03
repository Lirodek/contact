package org.sight.contact.view;

import org.sight.contact.controller.R;
import org.sight.contact.model.PersonVo;

import java.util.ArrayList;

public class SearchView extends View{
    @Override
    public void display() {
        setLine("연락처 검색");
        String name = getString("이름");

        R.personVo.setName(name);
    }
}
