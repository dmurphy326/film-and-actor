package com.cooksys.backend.solid.model;
// Generated Jul 7, 2016 12:03:47 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * SalesByStore generated by hbm2java
 */
@Entity
@Table(name = "sales_by_store", catalog = "sakila")
public class SalesByStore implements java.io.Serializable {

	private SalesByStoreId id;

	public SalesByStore() {
	}

	public SalesByStore(SalesByStoreId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "store", column = @Column(name = "store", length = 101)),
			@AttributeOverride(name = "manager", column = @Column(name = "manager", length = 91)),
			@AttributeOverride(name = "totalSales", column = @Column(name = "total_sales", precision = 27)) })
	public SalesByStoreId getId() {
		return this.id;
	}

	public void setId(SalesByStoreId id) {
		this.id = id;
	}

}
