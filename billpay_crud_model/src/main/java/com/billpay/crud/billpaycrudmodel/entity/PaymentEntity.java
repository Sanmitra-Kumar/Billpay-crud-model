package com.billpay.crud.billpaycrudmodel.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "Payment_Demo")
@Data
public class PaymentEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "UNIID")
	private Long id;
	
	@Column(name = "PMTTYP")
	private String paymentType;
	
	@Column(name = "PMTMTHD")
	private String paymentMethod;
	
	@Column(name = "PFREQ")
	private String paymentFrequency;
	
	@Column(name = "RLMTTYP")
	private String recurringLimitType;
	
	@Column(name = "PETNAME")
	private String payeeNickname;
	
	@Column(name = "PDATE")
	private String paymentDate;
	
	@Column(name = "TXNAMT")
	private BigDecimal transactionAmount;
	
	@Column(name = "NXTDATE")
	private String nextPaymentDate;
	
	@Column(name = "PMTCNT")
	private BigDecimal totalPaymentCount;
	
	@Column(name = "TTAMT")
	private BigDecimal totalTransactionAmount;
	
	@Column(name = "REFNO")
	private String paymentReferenceNumber;
	
	@Column(name = "RREFNO")
	private String recurringReferenceNumber;

}
