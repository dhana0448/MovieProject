package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
@ApiModel("Movie Entity")
@Entity
public class Movies implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int mid;
	//@NotNull(message="Null values are not allowed")
	private String mname;
	//@Min(value=1,message="Give Rating Between 1 and 5")
	//@Max(value=5,message="Give Rating Between 1 and 5")
	private String mgenre;
	private double mratings;
	//@NotNull(message="Null values are not allowed")
	
	public Movies(int mid, String mname, String mgenre, double mratings) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mgenre = mgenre;
		this.mratings = mratings;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMgenre() {
		return mgenre;
	}

	public void setMgenre(String mgenre) {
		this.mgenre = mgenre;
	}

	public double getMratings() {
		return mratings;
	}

	public void setMratings(double mratings) {
		this.mratings = mratings;
	}

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
