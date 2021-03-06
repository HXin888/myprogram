package com.myprogram.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by hjk on 2017/12/24.
 */
@Entity
@Table(name = "stu")
public class Stu implements Serializable {
    private int sno;
    private String sname;
    private int sage;
    private int ssex;
    private String simage;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stime;//入学时间
    private String sphone;//电话号码

    private Cls cls;

    public Stu() {
    }

    public Stu(int sno, String sname, int sage, int ssex, String simage, Date stime, String sphone) {
        this.sno = sno;
        this.sname = sname;
        this.sage = sage;
        this.ssex = ssex;
        this.simage = simage;
        this.stime = stime;
        this.sphone = sphone;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSimage() {
        return simage;
    }

    public void setSimage(String simage) {
        this.simage = simage;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public int getSsex() {
        return ssex;
    }

    public void setSsex(int ssex) {
        this.ssex = ssex;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public Date getStime() {
        return stime;
    }

    @Column(columnDefinition = "date")
    public void setStime(Date stime) {
        this.stime = stime;
    }

    @ManyToOne
    @JoinColumn(name = "scno")
    public Cls getCls() {
        return cls;
    }

    public void setCls(Cls cls) {
        this.cls = cls;
    }
}
