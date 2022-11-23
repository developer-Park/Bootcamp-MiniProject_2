package com.miniprj.memo.Page;

import java.time.LocalDateTime;

public class MemoPage {

    private  String name;
    private  String content;
    private  String password;

    private LocalDateTime writedate;

     private MemoPage(String name, String content, String password) {
         this.name = name;
         this.content = content;
         this.password = password;
         this.writedate = LocalDateTime.now();
     }

    public static Object newInstance(String name, String content, String password) {
         return new MemoPage(name, content, password);
    }
}
