package com.htjs.designpattern.principles.demo5;

public class Agent {

    private Star star;
    private Fans fans;
    private Company company;

    public void meeting() {
        System.out.println("明星:" + star.getName() + "参加了与粉丝:" + fans.getName() + "见面会");
    }

    public void business() {
        System.out.println("明星:" + star.getName() + "参加了与公司:" + company.getName() + "洽谈会");
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
