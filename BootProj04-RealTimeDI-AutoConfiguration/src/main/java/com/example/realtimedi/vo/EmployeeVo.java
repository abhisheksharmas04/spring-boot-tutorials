package com.example.realtimedi.vo;

public class EmployeeVo {
    
    private String empNo;
    private String ename;
    private String job;
    private String sal;
    private String deptNo;
    private String mgrNo;
	
    public EmployeeVo() {
		
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getMgrNo() {
		return mgrNo;
	}

	public void setMgrNo(String mgrNo) {
		this.mgrNo = mgrNo;
	}    
    
}

/*
    While developing Java bean it recomanded to take wrapper data type(like Integer,Long,Double and etc..) bean properties rather  simple data types(int,long,double,and etc) becoz simple type numberic value holds "0" as default value where as wrapper hold null.
 */