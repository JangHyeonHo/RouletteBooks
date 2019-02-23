package command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class BookModifyCommand {
	private int num;
	private MultipartFile[] image;
	private String bname;
	private String bookwriter;
	private String genre;
	private String price;
	private int page;
	private String isbn;
	private String pname;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bpublicationdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date writedata;
	private String rentalprice;
	private String booktoc;
	private String intro;
	private String BookOriImgName;
	private String BookStoreImgName;
	private Date cdate;

	
	
	


	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getBookwriter() {
		return bookwriter;
	}
	public void setBookwriter(String bookwriter) {
		this.bookwriter = bookwriter;
	}

	public Date getBpublicationdate() {
		return bpublicationdate;
	}
	public void setBpublicationdate(Date bpublicationdate) {
		this.bpublicationdate = bpublicationdate;
	}
	public String getBookOriImgName() {
		return BookOriImgName;
	}
	public void setBookOriImgName(String bookOriImgName) {
		BookOriImgName = bookOriImgName;
	}
	public String getBookStoreImgName() {
		return BookStoreImgName;
	}
	public void setBookStoreImgName(String bookStoreImgName) {
		BookStoreImgName = bookStoreImgName;
	}
	public String getBooktoc() {
		return booktoc;
	}
	public void setBooktoc(String booktoc) {
		this.booktoc = booktoc;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}


	public Date getWritedata() {
		return writedata;
	}
	public void setWritedata(Date writedata) {
		this.writedata = writedata;
	}
	public String getRentalprice() {
		return rentalprice;
	}
	public void setRentalprice(String rentalprice) {
		this.rentalprice = rentalprice;
	}

	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public MultipartFile[] getImage() {
		return image;
	}
	public void setImage(MultipartFile[] image) {
		this.image = image;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	
}