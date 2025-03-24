package vo;

import util.DateTimeUtil;

public class Book {

	// 고유번호
	private static int id = 1000;
	private int bookId;
	// 책이름
	private String bookName;
	// 작가
	private String author;
	// 가격
	private int price;
	// 생성일
	private String createDate;
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getId() {
		return id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(String bookName, String author, int price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.generateId();
		this.createDate = DateTimeUtil.getDateTime();
	}
	public Book() {
		generateId();
	}
	private void generateId() {
		id++;
		this.bookId = id;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "] createdDate:"+DateTimeUtil.getDateTime();
	}
	
	
	
}
