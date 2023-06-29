package com.demo.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="User12")

public class MyUser {
	@Id
	
	
	private int uid;
	private String uname;
	@OneToMany
	 private Set<Address> addr;
	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyUser(int uid, String uname,Set <Address> addr ) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.addr = addr;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Set<Address> getAddr() {
		return addr;
	}
	public void setAddr(Set<Address> addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", addr=" + addr + "]";
	}
	
	
	

}
