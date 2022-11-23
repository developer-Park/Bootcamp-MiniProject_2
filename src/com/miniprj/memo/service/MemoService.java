package com.miniprj.memo.service;


import com.miniprj.memo.Page.MemoFunc;

import java.util.Scanner;

public class MemoService {
    private final MemoFunc memoFunc;

    public MemoService() {
        this.memoFunc = new MemoFunc();
    }

    public void run() {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("    *메모장 입니다*   ");
            System.out.println("원하시는 번호를 입력해주세요");
            System.out.println("1.입력 2.목록 보기 3.수정 4.삭제 5.종료 >");

            int selectedNumber = sc.nextInt();

            if (1 == selectedNumber) {
                memoFunc.addMemo();
            } else if (2 == selectedNumber) {
                memoFunc.printAllMemo();
            } else if (3 == selectedNumber) {
                memoFunc.updateMemo();
            } else if (4 == selectedNumber) {
                memoFunc.deleteMemo();
            } else if (5 == selectedNumber) {
                break;
            } else {
                System.out.println("");
                System.out.println("번호를 다시입력해주세요");
                System.out.println("");
            }
        }
    }
}

