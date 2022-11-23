package Model;

import java.time.LocalDateTime;

public class MemoVo {


    public int count;
    public String name;
    public String password;
    public String memo;
    public LocalDateTime createdAt;


    public MemoVo(int count, String name, String password, String memo, LocalDateTime createdAt) {
        this.count = count;
        this.name = name;
        this.password = password;
        this.memo = memo;
        this.createdAt = LocalDateTime.now();

    }



    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public void updateMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return memo;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String formatForFile() {
        return this.count + this.name + this.memo;

    }

    @Override
    public String toString() {
        return
                "count=" + count +
                        ", Name='" + name + '\'' +
                        ", Passowrd='" + password + '\'' +
                        ", Memo='" + memo + '\'' +
                        ", CreationTime=" + createdAt +
                        '}';
    }


}