/**
 * 
 */
package com.wipro.validations;

import java.util.Arrays;
import java.util.Random;
import java.lang.Character;
import com.wipro.bean.CabBean;
import com.wipro.userexceptions.NegativeKilometerException;

/**
 * @author Balaji Natarajan
 *
 */
public class TripValidator {
	static int totalAmount;
	static int receiptId;
	/**
	 * @return the totalAmount
	 */
	public int getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public static void setTotalAmount(int totalAmt) {
		totalAmount = totalAmt;
	}

	/**
	 * @return the receiptId
	 */
	public int getReceiptId() {
		return receiptId;
	}

	/**
	 * @param receiptId the receiptId to set
	 */
	public static void setReceiptId(int recptId) {
		receiptId = recptId;
	}

	public static String printBillAmount(CabBean cabbean) {
		int count = 0;
		if(cabbean.getBookingID().startsWith("AD") && cabbean.getBookingID().length() == 7) {
			for(int i = 0; i < 7; i++ ) {
				if(Character.isDigit(cabbean.getBookingID().charAt(i))) {
					count ++;
				}
			}
			if (count != 5) {
				return "Invalid Booking ID";
			}
		}
		else
			return "Invalid Booking ID";
		
		if(cabbean.getUserID()<1001 || cabbean.getUserID() > 1500)
			return "Invalid User ID";
		
		String[] cablist = new String[]{"Tata Indica","Tata Indigo","BMW","Logan"};
		if( !Arrays.asList(cablist).contains(cabbean.getCabType()) )
			return "Invalid Cab Type";
		
		Integer km = Integer.parseInt(cabbean.getKmsUsed());
		if( km < 0 ) {
			try {
				throw new NegativeKilometerException();
			}
			catch(NegativeKilometerException e){
				return e.toString();
			}
		}
		int[] amt = amountGenerator(km,cabbean.getCabType());
		setTotalAmount(amt[1]);
		setReceiptId(amt[0]);
		String stmt="Total Amount : " +amt[1]+ ", Receipt ID : " +amt[0];
		return stmt;
	}
	
	public static int[] amountGenerator(int kmsUsed, String cabType) {
		int receiptno = 10000 + new Random().nextInt(90000);
		int bill = 1;
		switch(cabType) {
		case "Tata Indica" : 
			bill = 12 * kmsUsed;
			break;
		case "Tata Indigo" :
			bill = 10 * kmsUsed;
			break;
		case "BMW" :
			bill = 45 * kmsUsed;
			break;
		case "Logan" :
			bill = 31 * kmsUsed;
			break;
		default : 
			System.out.print("Invalid Cab type");
		}
		int[] total = {receiptno,bill};
		return total;
	}
}
