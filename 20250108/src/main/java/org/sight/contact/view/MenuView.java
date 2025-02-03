package org.sight.contact.view;

import org.sight.contact.controller.R;

public class MenuView extends View {

    @Override
    public void display() {
        setLine("메뉴");
        System.out.println("1.등록   2.수정");
        System.out.println("3.검색   4.종료");
        setLine();
        R.choice = getInteger("입력");
    }
}
