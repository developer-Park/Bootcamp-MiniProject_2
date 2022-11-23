package Service;


import Model.MemoVo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Memolist {

    private Scanner sc = new Scanner(System.in);


    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private ArrayList<MemoVo> memos;

    private int count;

    public Memolist() {
        this.memos = new ArrayList<>();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public void display() {

        while (true) {
            System.out.println("1.ADD");
            System.out.println("2.MemoList");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            System.out.print("Enter Input : ");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.print("Enter name : ");
                String name = sc.next();
                System.out.print("Enter password : ");
                String password = sc.next();
                System.out.print("Enter memo : ");
                String memo = sc.next();
                addMemo(name, password, memo);
            } else if (a == 2) {
                System.out.println("Check memo list ");
                System.out.println("");
                checkMemo();
            } else if (a == 3) {
                System.out.print("Enter Id : ");
                int id = sc.nextInt();
                updateMemo(id);

            } else if (a == 4) {
                System.out.print("Enter Id : ");
                int id = sc.nextInt();
                deleteMemo(id);

            } else if (a == 5) {
                break;
            } else {
                System.out.println("Error: No option input");
            }
        }

    }

    private void deleteMemo(int id) {

        memos.remove(id);
        System.out.print("Success Delete!!");

        int arrayLength = memos.size();

        for (int i=0; i<memos.size();i++) {
            System.out.println(memos.get(i));
            count += i;

        }
    }

    private void updateMemo(int id) {

        for (MemoVo memoVo : memos) {
            if (id == memoVo.getCount()) {
                System.out.println(memoVo.getMemo());
                System.out.print("Enter Update memo : ");

                String memo = sc.next();

                memoVo.updateMemo(memo);
                memoVo.setCreatedAt(LocalDateTime.now());


                System.out.println("Success Update");
                break;
            } else {
                System.out.println("Fail");
                break;
            }
        }
    }


    private void addMemo(String name, String password, String memo) {
        count += 1;
        MemoVo memoVo = new MemoVo(count, name, password, memo, createdAt);
        memos.add(memoVo);
        System.out.println("Success add information. Thanks.");


    }

    private void checkMemo() {
        for (MemoVo memo1 : memos) {
            System.out.println(memo1.toString());
        }
    }


}



