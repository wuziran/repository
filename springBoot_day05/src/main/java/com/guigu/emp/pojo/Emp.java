package com.guigu.emp.pojo;

public class Emp {
    private Integer id;

    private String empnum;

    private String empname;

    private String gender;

    private String birthday;

    private String phone;

    private String address;

    private String duty;

    private Integer deptid;
    private Dept d;
    
    public Dept getD() {
		return d;
	}

	public void setD(Dept d) {
		this.d = d;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpnum() {
        return empnum;
    }

    public void setEmpnum(String empnum) {
        this.empnum = empnum == null ? null : empnum.trim();
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    
    

	public Emp(String empnum, String empname, String gender, String birthday, String phone, String address, String duty,
			Integer deptid) {
		super();
		this.empnum = empnum;
		this.empname = empname;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
		this.duty = duty;
		this.deptid = deptid;
	}

	public Emp(Integer id, String empnum, String empname, String gender, String birthday, String phone, String address,
			String duty, Integer deptid, Dept d) {
		super();
		this.id = id;
		this.empnum = empnum;
		this.empname = empname;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
		this.duty = duty;
		this.deptid = deptid;
		this.d = d;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", empnum=" + empnum + ", empname=" + empname + ", gender=" + gender + ", birthday="
				+ birthday + ", phone=" + phone + ", address=" + address + ", duty=" + duty + ", deptid=" + deptid
				+ ", d=" + d + "]";
	}
    
}