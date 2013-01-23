package org.springframework.samples.mvc.ajax.account;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.core.style.ToStringCreator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@Entity
public class Account implements Serializable {

	private static final long serialVersionUID = 1513207428686438208L;
	
	@Id
    @Column(name = "id")
    private Long id;
	
	@Column(name = "left")
	private int left;
    
	@Column(name = "right")
	private int right;
	
	
    private static final AtomicLong idSequence = new AtomicLong();
    
    
    
    @Id
    @Column(name = "id")
    public Long getId() {
		return id;
	}

    
	public void setId(Long id) {
		this.id = id;
	}


	Long assignId() {
		this.id = idSequence.incrementAndGet();
		return id;
	}
    
    
	public int getLeft() {return left;}
    public void setLeft(int left) {this.left = left;}
    public int getRight() {return right;}
    public void setRight(int right) {this.right = right;}
}