package com.cg.eauction.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "auctions")
public class Auctions {
	@Id
	private int biddingid;
	@Id
	private int productid;
	@Column(name = "productName" , length = 25 )
	private String productName;
	@Column(name = "bidprice" , columnDefinition = "numeric(8,2)" )
	private int bidprice;
	@Id
	private int customerid;
	@Id
	private int vendorid;
	
	private Date date;
	
	
	

}
