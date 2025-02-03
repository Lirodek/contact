package org.sight.contact.controller;

import org.sight.contact.model.PersonVo;
import org.sight.contact.service.ContactService;
import org.sight.contact.view.*;
import org.sight.legacy.Main;

import java.util.ArrayList;
import java.util.List;

public class R {

    public static PersonVo personVo = new PersonVo();
    public static List<PersonVo> personVoList = new ArrayList<PersonVo>(
            List.of(
                    new PersonVo("차무식", 1012345679, "기본"),
                    new PersonVo("김민준", 1012345678, "기본"),
                    new PersonVo("이하준", 1012345670, "기본"),
                    new PersonVo("정지호", 1012345671, "기본"),
                    new PersonVo("박주원", 1012345672, "기본"),
                    new PersonVo("강주호", 1012345673, "기본"),
                    new PersonVo("박주호", 1012345674, "기본")
            )
    );
    public static List<PersonVo> searchList = new ArrayList<>();

    public static ViewContainer vc = new ViewContainer();
    public static ContactController cc = new ContactController();
    public static ContactService cs = new ContactService();

    public static View v = new View();
    public static MenuView mv = new MenuView();
    public static InsertView iv = new InsertView();
    public static SearchView sv = new SearchView();
    public static ModifyView fv = new ModifyView();

    public static int choice;               // 메뉴선택때 사용할거.
}
