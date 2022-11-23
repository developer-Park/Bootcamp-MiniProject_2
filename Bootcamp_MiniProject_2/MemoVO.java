//메모 한 건에 대한 정보를 가진 클래스
//메모는 글 번호, 작성자 이름, 비밀번호, 게시글, 작성일(컴퓨터 시스템의 날짜와 시간을 자동으로 저장) 가지고 있다.
//글의 수정 시, 수정 시간으로 시간이 변경된다.


package Bootcamp_MiniProject_2;

import java.time.LocalDateTime;
import java.util.Date;

public class MemoVO {
    private int no;             // 글번호
    private String name;        // 작성자 이름
    private String password;    // 비밀번호
    private String memo;        // 게시글
    private LocalDateTime writeDate;     // 작성일(컴퓨터 시스템의 날짜와 시간을 자동으로 저장)

    //초기화
    public MemoVO(int no, String name, String password, String memo, Date writeDate) {
        super();
        this.no = no;
        this.name = name;
        this.password = password;
        this.memo = memo;
        this.writeDate = LocalDateTime.now();

    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getMemo() {
        return memo;
    }

    public String setMemo(String memo) {
        this.memo = memo;
    }

    public LocalDateTime getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(LocalDateTime writeDate) {
        this.writeDate = writeDate;
    }

    @Override
    public String toString() {
        return "MemoVO [no=" + no + ", name=" + name + ", password=" + password + ", memo=" + memo + ", writeDate="
                + writeDate + "]";

    }

