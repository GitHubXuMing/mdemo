package com.company.mybatis.dao.entity;

public class EmpDeptDTO {
    private String ename;
    private String dname;

    public EmpDeptDTO(String ename, String dname) {
        this.ename = ename;
        this.dname = dname;
    }

    public EmpDeptDTO() {
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "EmpDeptDTO{" +
                "ename='" + ename + '\'' +
                ", dname='" + dname + '\'' +
                '}';
    }
}
