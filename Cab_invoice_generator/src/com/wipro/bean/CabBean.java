/**
 * 
 */
package com.wipro.bean;

/**
 * @author Balaji Natarajan
 *
 */
public class CabBean {
	private String bookingID; 
	private int userID; 
	private String username;
	private String cabType;
	private String kmsUsed;
	private float totalAmount;
	private int receiptNo;
	/**
	 * @return the bookingID
	 */
	public String getBookingID() {
		return bookingID;
	}
	/**
	 * @param bookingID the bookingID to set
	 */
	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}
	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the cabType
	 */
	public String getCabType() {
		return cabType;
	}
	/**
	 * @param cabType the cabType to set
	 */
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}
	/**
	 * @return the kmsUsed
	 */
	public String getKmsUsed() {
		return kmsUsed;
	}
	/**
	 * @param kmsUsed the kmsUsed to set
	 */
	public void setKmsUsed(String kmsUsed) {
		this.kmsUsed = kmsUsed;
	}
	/**
	 * @return the totalAmount
	 */
	public float getTotalAmount() {
		return totalAmount;
	}
	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * @return the receiptNo
	 */
	public int getReceiptNo() {
		return receiptNo;
	}
	/**
	 * @param receiptNo the receiptNo to set
	 */
	public void setReceiptNo(int receiptNo) {
		this.receiptNo = receiptNo;
	}

}
