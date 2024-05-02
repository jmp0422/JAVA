package com.multi.hw;

public class HW1_1 {
    private String subject;
    private String time;
    private String name;

    public HW1_1(String subject, String time, String name) {
        this.subject = subject;
        this.time = time;
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HW1_1{" +
                "subject='" + subject + '\'' +
                ", time='" + time + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
