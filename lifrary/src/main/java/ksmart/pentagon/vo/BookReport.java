package ksmart.pentagon.vo;

public class BookReport {
	private String bReportCode;
	private String lCode;
	private String uId;
	private String uName;
	private String biIsbn;
	private String biImg;
	private String bReportTitle;
	private String bReportContent;
	private String bReportOpen;
	private int bReportStar;
	private int bPageView;
	private String bReportDate;
	public String getbReportCode() {
		return bReportCode;
	}
	public void setbReportCode(String bReportCode) {
		this.bReportCode = bReportCode;
	}
	public String getlCode() {
		return lCode;
	}
	public void setlCode(String lCode) {
		this.lCode = lCode;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getBiIsbn() {
		return biIsbn;
	}
	public void setBiIsbn(String biIsbn) {
		this.biIsbn = biIsbn;
	}
	public String getBiImg() {
		return biImg;
	}
	public void setBiImg(String biImg) {
		this.biImg = biImg;
	}
	public String getbReportTitle() {
		return bReportTitle;
	}
	public void setbReportTitle(String bReportTitle) {
		this.bReportTitle = bReportTitle;
	}
	public String getbReportContent() {
		return bReportContent;
	}
	public void setbReportContent(String bReportContent) {
		this.bReportContent = bReportContent;
	}
	public String getbReportOpen() {
		return bReportOpen;
	}
	public void setbReportOpen(String bReportOpen) {
		this.bReportOpen = bReportOpen;
	}
	public int getbReportStar() {
		return bReportStar;
	}
	public void setbReportStar(int bReportStar) {
		this.bReportStar = bReportStar;
	}
	public int getbPageView() {
		return bPageView;
	}
	public void setbPageView(int bPageView) {
		this.bPageView = bPageView;
	}
	public String getbReportDate() {
		return bReportDate;
	}
	public void setbReportDate(String bReportDate) {
		this.bReportDate = bReportDate;
	}
	@Override
	public String toString() {
		return "BookReport [bReportCode=" + bReportCode + ", lCode=" + lCode + ", uId=" + uId + ", uName=" + uName
				+ ", biIsbn=" + biIsbn + ", biImg=" + biImg + ", bReportTitle=" + bReportTitle + ", bReportContent="
				+ bReportContent + ", bReportOpen=" + bReportOpen + ", bReportStar=" + bReportStar + ", bPageView="
				+ bPageView + ", bReportDate=" + bReportDate + ", getbReportCode()=" + getbReportCode()
				+ ", getlCode()=" + getlCode() + ", getuId()=" + getuId() + ", getuName()=" + getuName()
				+ ", getBiIsbn()=" + getBiIsbn() + ", getBiImg()=" + getBiImg() + ", getbReportTitle()="
				+ getbReportTitle() + ", getbReportContent()=" + getbReportContent() + ", getbReportOpen()="
				+ getbReportOpen() + ", getbReportStar()=" + getbReportStar() + ", getbPageView()=" + getbPageView()
				+ ", getbReportDate()=" + getbReportDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
