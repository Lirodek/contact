package org.sight.contact.view;

import org.sight.contact.controller.R;

public class ModifyView extends View{
    @Override
    public void display() {
        setLine("연락처 수정");
        String name = getString("수정할 연락처의 이름");

        R.personVo.setName(name);

        R.cs.search(R.personVo);

        System.out.println("어떤 연락처를 수정하시겠습니까?");
        int index = getInteger("선택") - 1;
        if(index < 0 || index >= R.searchList.size()){
            System.out.println("올바르지 않은 선택입니다.");
            return;
        }

        R.personVo = R.searchList.get(index);
        name = getString("이름(" +R.personVo.getName()+ ")");
        int number = getPhoneNumber("전화번호("+R.personVo.getNumber()+")");
        String group = getString("그룹("+R.personVo.getGroup()+")");

        R.personVo.setName(name);
        R.personVo.setNumber(number);
        R.personVo.setGroup(group);
    }
}
