package com.miniprj.memo.Page;

import java.util.Scanner;

public class MemoFunc {
    private int pageNum;
    private int memolength = 0;

    private final MemoPage[] memoPages;

    private final int MAX_MEMO = 5;


    public MemoFunc() {
        this.memoPages = new MemoPage[MAX_MEMO];
    }

    public void printAllMemo() {
    }

    public void addMemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요");
        String name = sc.nextLine();
        System.out.println("내용을 입력해주세요");
        String content = sc.nextLine();
        System.out.println("비밀번호를 입력해주세요");
        String password = sc.nextLine();

        memoPages[this.memolength++] = (MemoPage) MemoPage.newInstance(name, content, password);

        System.out.println("작성완료");

        }

    public void updateMemo() {
    }

    public void deleteMemo() {
        System.out.println("삭제하실 메모의 번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int selectedNumber = sc.nextInt();
        while(true) {
            if(
            System.out.println("메모의 비밀번호를 입력해주세요");
            )else(
                System.out.println("비밀번호가 틀렸습니다 다시 입력해주세요");
            )
        }
        System.out.println("삭제 되었습니다");
    }
}
