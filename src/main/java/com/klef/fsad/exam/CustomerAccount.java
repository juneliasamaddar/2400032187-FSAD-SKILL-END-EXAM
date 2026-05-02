package com.klef.fsad.exam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "customer_table")

public class CustomerAccount {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "sid")
	private int id;
	@Column (name = "sname", length = 50, nullable = false)
	private String name;
	@Column(name = "description")
	private String description;

	@Column(name = "date")
	private String date;

	@Column(name = "status")
	private boolean status;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ClientDemo [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date
				+ ", status=" + status + "]";
	}
	

}
