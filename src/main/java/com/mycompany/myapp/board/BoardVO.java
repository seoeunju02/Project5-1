package com.mycompany.myapp.board;

import java.util.Date;

public class BoardVO {
    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }


    private int seq;
//    private String category;
    private String groups;
    private String home;
    private String gre;

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getGre() {
        return gre;
    }

    public void setGre(String gre) {
        this.gre = gre;
    }

    public String getHscore() {
        return hscore;
    }

    public void setHscore(String hscore) {
        this.hscore = hscore;
    }

    public String getGscore() {
        return gscore;
    }

    public void setGscore(String gscore) {
        this.gscore = gscore;
    }

    public String getShoot() {
        return shoot;
    }

    public void setShoot(String shoot) {
        this.shoot = shoot;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public String getLeaves() {
        return leaves;
    }

    public void setLeaves(String leaves) {
        this.leaves = leaves;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    private String hscore;
    private String gscore;
    private String shoot;
    private String warning;
    private String leaves;
    private Date regdate;
}
