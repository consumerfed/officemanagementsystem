/**
 * 
 */
package net.cfed.oms.model;

import java.util.Comparator;
import java.util.Date;

/**
 * @author IT
 *
 */
public class BranchModel implements Comparator<BranchModel> {
	
	private int branchId = 0;
	private String branchName = null;
	private int branchCode = 0;
	private String category = null;
	private String constituency = null;
	private String address = null;
	private String district = null;
	private Date openingDate = null;
	private Date closedDate = null;
	private Long lat;
	private Long lon;
	private String link = null;
	private String status = null;
	
	private int branchTypeId = 0;
	private String branchTypeName = "zo";
	private String branchReportingOffice = "ho";
	private int branchTypeHirerachy = 2;
	private String branchTypeStatus = "Y";
	private String branchTypeDesc = "testing";
	
	private int branchSale = 0;
	
	public Long getLat() {
		return lat;
	}
	public void setLat(Long lat) {
		this.lat = lat;
	}
	public Long getLon() {
		return lon;
	}
	public void setLon(Long lon) {
		this.lon = lon;
	}

	
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Date getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}
	public Date getClosedDate() {
		return closedDate;
	}
	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

	/**
	 * @return the branchTypeId
	 */
	public int getBranchTypeId() {
		return branchTypeId;
	}
	/**
	 * @param branchTypeId the branchTypeId to set
	 */
	public void setBranchTypeId(int branchTypeId) {
		this.branchTypeId = branchTypeId;
	}
	/**
	 * @return the branchTypeName
	 */
	public String getBranchTypeName() {
		return branchTypeName;
	}
	/**
	 * @param branchTypeName the branchTypeName to set
	 */
	public void setBranchTypeName(String branchTypeName) {
		this.branchTypeName = branchTypeName;
	}
	/**
	 * @return the branchReportingOffice
	 */
	public String getBranchReportingOffice() {
		return branchReportingOffice;
	}
	/**
	 * @param branchReportingOffice the branchReportingOffice to set
	 */
	public void setBranchReportingOffice(String branchReportingOffice) {
		this.branchReportingOffice = branchReportingOffice;
	}
	/**
	 * @return the branchTypeHirerachy
	 */
	public int getBranchTypeHirerachy() {
		return branchTypeHirerachy;
	}
	/**
	 * @param branchTypeHirerachy the branchTypeHirerachy to set
	 */
	public void setBranchTypeHirerachy(int branchTypeHirerachy) {
		this.branchTypeHirerachy = branchTypeHirerachy;
	}
	/**
	 * @return the branchTypeStatus
	 */
	public String getBranchTypeStatus() {
		return branchTypeStatus;
	}
	/**
	 * @param branchTypeStatus the branchTypeStatus to set
	 */
	public void setBranchTypeStatus(String branchTypeStatus) {
		this.branchTypeStatus = branchTypeStatus;
	}
	/**
	 * @return the branchTypeDesc
	 */
	public String getBranchTypeDesc() {
		return branchTypeDesc;
	}
	/**
	 * @param branchTypeDesc the branchTypeDesc to set
	 */
	public void setBranchTypeDesc(String branchTypeDesc) {
		this.branchTypeDesc = branchTypeDesc;
	}
	public void setBranchSale(int branchSale) {
		this.branchSale = branchSale;
	}
	public int getBranchSale() {
		return branchSale;
	}
	@Override
	public int compare(BranchModel branch1, BranchModel branch2) {
		// TODO Auto-generated method stub
		double sale1 = branch1.getBranchSale();
		double sale2 = branch2.getBranchSale();
		return (int) (sale1 - sale2);
	}
	
	


	
}
