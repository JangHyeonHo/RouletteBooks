package dto;

import java.util.Date;

import other.AutoLinePrint;

public class BookList implements DTOTestInterface {
	
	/**
	 * 장르들<br>
	 * BookList.GENRES[장르번호]로 장르를 쉽게 등록할 수 있다.
	 * <h2>----장르번호 소개----</h2>
	 * 0 : 문화/역사<br>
	 * 1 : 유아/어린이/청소년<br>
	 * 2 : 참고서/자격증<br>
	 * 3 : 자연과학/IT<br>
	 * 4 : 예술/인물<br>
	 * 5 : 여행/잡지/취미<br>
	 * 6 : 사회/정치/경제/경영<br>
	 * 7 : 만화/라이트노벨<br>
	 * 8 : 기타<br>
	 * 
	 * */
	public static final String[] GENRES = {"문화/역사","유아/어린이/청소년","참고서/자격증",
			"자연과학/IT","예술/인물","여행/잡지/취미","사회/정치/경제/경영","만화/라이트노벨","기타"};
	
	private String bnum;
	private String bname;
	private String pname;
	private int bprice;
	private Date bPublicationDate;
	private int bPageNum;
	private String bIntroduce;
	private String bToc;
	private int bRentalPrice;
	private String bImgOriginName;
	private String bImgStoreName;
	private String bGenre;
	private String bIsbn;
	private int bPublisherPrice;
	private int bContractNum;
	private String bPublisherNum;
	private int bHit;
	
	
	
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBnum() {
		return bnum;
	}

	public BookList setBnum(String bnum) {
		this.bnum = bnum;
		return this;
	}

	public int getBprice() {
		return bprice;
	}

	public BookList setBprice(int bprice) {
		this.bprice = bprice;
		return this;
	}

	public Date getbPublicationDate() {
		return bPublicationDate;
	}

	public BookList setbPublicationDate(Date bPublicationDate) {
		this.bPublicationDate = bPublicationDate;
		return this;
	}

	public int getbPageNum() {
		return bPageNum;
	}

	public BookList setbPageNum(int bPageNum) {
		this.bPageNum = bPageNum;
		return this;
	}

	public String getbIntroduce() {
		return bIntroduce;
	}

	public BookList setbIntroduce(String bIntroduce) {
		this.bIntroduce = bIntroduce;
		return this;
	}

	public String getbToc() {
		return bToc;
	}

	public BookList setbToc(String bToc) {
		this.bToc = bToc;
		return this;
	}

	public int getbRentalPrice() {
		return bRentalPrice;
	}

	public BookList setbRentalPrice(int bRentalPrice) {
		this.bRentalPrice = bRentalPrice;
		return this;
	}

	public String getbImgOriginName() {
		return bImgOriginName;
	}

	public BookList setbImgOriginName(String bImgOriginName) {
		this.bImgOriginName = bImgOriginName;
		return this;
	}

	public String getbImgStoreName() {
		return bImgStoreName;
	}

	public BookList setbImgStoreName(String bImgStoreName) {
		this.bImgStoreName = bImgStoreName;
		return this;
	}

	public String getbGenre() {
		return bGenre;
	}

	public BookList setbGenre(String bGenre) {
		this.bGenre = bGenre;
		return this;
	}

	public String getbIsbn() {
		return bIsbn;
	}

	public BookList setbIsbn(String bIsbn) {
		this.bIsbn = bIsbn;
		return this;
	}

	public int getbPublisherPrice() {
		return bPublisherPrice;
	}

	public BookList setbPublisherPrice(int bPublisherPrice) {
		this.bPublisherPrice = bPublisherPrice;
		return this;
	}

	public int getbContractNum() {
		return bContractNum;
	}

	public BookList setbContractNum(int bContractNum) {
		this.bContractNum = bContractNum;
		return this;
	}

	public String getbPublisherNum() {
		return bPublisherNum;
	}

	public BookList setbPublisherNum(String bPublisherNum) {
		this.bPublisherNum = bPublisherNum;
		return this;
	}

	public int getbHit() {
		return bHit;
	}

	public BookList setbHit(int bHit) {
		this.bHit = bHit;
		return this;
	}

	@Override
	public void DTOTEST() {
		// TODO Auto-generated method stub
		AutoLinePrint.println("도서 리스트 테이블 DTO","도서 번호 : " + bnum,
				"도서 이름 : " + bname,
				"도서 정가 : " + bprice,
				"도서 발간일 : " + bPublicationDate,
				"도서 페이지수 : " + bPageNum,
				"도서 소개 : " + bIntroduce,
				"도서 목차 : " + bToc,
				"도서 대여 금액 : " + bRentalPrice,
				"도서 이미지 이름 : " + bImgOriginName,
				"도서 저장 이미지 이름 : " + bImgStoreName,
				"도서 장르 : " + bGenre,
				"도서 isbn번호 : " + bIsbn,
				"도서 계약 금액 : " + bPublisherPrice,
				"도서 계약번호 : " + bContractNum,
				"도서 출판사 발행자 번호 : " + bPublisherNum,
				"도서 조회수 : " + bHit);
	}

}
