package org.sight.contact.view;

import org.sight.contact.controller.R;
import org.sight.contact.model.PersonVo;

public class InsertView extends View {

    @Override
    public void display() {
        setLine("연락처 추가");
        String name = getString("이름");
        int number = getPhoneNumber("전화번호");
        String group = getString("그룹");
        R.personVo = new PersonVo(name, number, group);
    }
}
