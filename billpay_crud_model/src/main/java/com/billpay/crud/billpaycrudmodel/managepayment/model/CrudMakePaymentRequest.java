package com.billpay.crud.billpaycrudmodel.managepayment.model;

import java.util.List;

import lombok.Data;

@Data
public class CrudMakePaymentRequest {
	
	private String sourceAccount;
	private List<CrudBillPaymentInfoItem> payments;
	private String paymentType;
	private String paymentActionType;

}
