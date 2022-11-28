package Service;


import Model.MemoVo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Memolist {
    private Scanner sc = new Scanner(System.in);
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<MemoVo> memos;
    private int count = 0;

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
                System.out.print("Enter Count : ");
                int id = sc.nextInt();
                updateMemo(id);

            } else if (a == 4) {
                System.out.print("Enter Count : ");
                int id = sc.nextInt();
                deleteMemo(id);

            } else if (a == 5) {
                break;

            } else {
                //System.out.print("Error : No option ");
                indexChecker();
            }
        }
    }

    private void deleteMemo(int id) {

        for (MemoVo memoVo : memos) {
            if (id == memoVo.getCount()) {
                System.out.print("Enter Password for Delete : ");
                String password = sc.next();

                if (Objects.equals(password, memoVo.getPassword())) {
                    memos.remove(id - 1);
                    System.out.print("Success Delete!!");
                    break;
                }
            }
        }
        for (int i = 0; i <= memos.size() - 1; i++) {
            if (i == 0) {
                memos.get(i).setCount(1);

            } else {
                memos.get(i).setCount(i + 1);
            }
        }
        count = count - 1;
    }


    private void updateMemo(int id) {
        String password = "";
        for (MemoVo memoVo : memos) {
            if (id == memoVo.getCount()) {
                System.out.print("Enter Password for Update : ");
                password = sc.next();

                if (Objects.equals(password, memoVo.getPassword())) {
                    System.out.println(memoVo.getMemo());
                    System.out.print("Enter Update memo : ");
                    String memo = sc.next();
                    memoVo.updateMemo(memo);
                    memoVo.setCreatedAt(LocalDateTime.now());
                    System.out.println("Success Update");
                    break;
                }
            }
        }
    }


    private void addMemo(String name, String password, String memo) {
        count++;
        MemoVo memoVo = new MemoVo(count, name, password, memo, createdAt);
        memos.add(memoVo);
        System.out.println("Success add information. Thanks.");
    }

    private void checkMemo() {
        for (MemoVo memo1 : memos) {
            System.out.println(memo1.toString());
        }
    }

    private void indexChecker() {
        for (int i = 0; i < memos.size(); i++) {
            System.out.println(memos.get(i).getCount());
        }
    }
}





