package com.bw.bean;

public class Goods {

	private int id;
	
	private String name;
	
	private int tid;
	
	private String date;
	
	private String tname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Goods(int id, String name, int tid, String date, String tname) {
		super();
		this.id = id;
		this.name = name;
		this.tid = tid;
		this.date = date;
		this.tname = tname;
	}

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", tid=" + tid + ", date=" + date + ", tname=" + tname + "]";
	}
	
	
}
