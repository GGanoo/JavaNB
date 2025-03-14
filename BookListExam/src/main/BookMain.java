package main;

import java.util.ArrayList;
import java.util.Scanner;

import util.DateTimeUtil;

import vo.Book;

public class BookMain {
	
	private static final Book[] Booklist = null;

	public static void printBookList(ArrayList<Book> bookList) {
		for (  Book book  : bookList ) {
			String result = "";
//			result += "책의 고유 번호 : " + book.getBookId();
//			result += " 제목 : " + book.getBookName();
//			result += " 작가 : " + book.getAuthor();
//			result += " 가격 : " + book.getPrice();
//			result += " 생성일 : " + book.getCreateDate();
			
			StringBuilder str = new StringBuilder();
			str.append( "책의 고유 번호 : " + book.getBookId());
			str.append( " 제목 : " + book.getBookName());
			str.append( " 작가 : " + book.getAuthor());
			str.append( " 가격 : " + book.getPrice());
			str.append( " 생성일 : " + book.getCreateDate());
			
			System.out.println(result);
		
		}
	
		// enhanced for   
		// for (  Book book  :  //배열//BookList ) {
		// book.setBookName("태백산맥");
		// System.out.println(book.toString());
	}
	

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		Book book = new Book();
		book.setBookName("태백산맥");
		book.setAuthor("조정래");
		book.setPrice(12000);
		list.add(book);
		
		Book book2 = new Book("데미안", "헤르만 헤세", 13000);
		list.add(book2);
	//	list.add(new Book("콘스프", "배고파", 15000));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		// 1. 날짜 생성해서 createDate에 파라미터로 넣기
		// 2. 메시지를 띄운다. (1 : book 추가 생성, 2 : book 항목 삭제)
		
		// 추가 할건지 삭제 할건지메시지를 띄운다.
		// 1을 고르면 책을 추가하는 코드를 작성한다.
		// 2를 입력하면 책을 삭제한다. 삭제할때 책의 식별자는 bookId값으로 판단한다.
		// 3을 입력하면 책의 ID값을 입력받아서 해당 객체만 정보를 출력.
		// 4를 입력하면 책의 ID값을 입력받고, 입력받은 객체의 정보를 별도로 입력받아서 수정처리
		// 삭제할때 bookId를 입력받을 수 있게 scanner를 띄운다.
		// 값을 입력받으면 list를 순회하면서 동일한 bookId가 있으면 해당 책을 지운다.
		do {
		System.out.print("할 일을 골라라.");
		
		
		
//		bookId = Integer.parseInt(bookIdStr); // Integer.parseInt : String 형태의 숫자를 int 형태의 숫자로 바꿔준다. 많이 사용함
		
			
		//System.out.println(DateTimeUtil.getDateTime());
		
//		for(;true;) {
//		System.out.println("행동을 입력하세요 (1)을 입력하면 book을 생성,(2)를 입력하면 삭제");
		Scanner scanner= new Scanner(System.in);   // 입력 추가
		int workId = scanner.nextInt();
		
		//CRUD C: create R: read U:update D: delete
		
		if(workId==1) {
			System.out.println("추가할 ID를 입력하세요.");
			//추가
			//(1) 사용자에게 ID입력을받는다 힌트:scanner
			//(2)새 책 샘플을 만든다 힌트:new book()
			//(3)그 새 책의 ID를 (1)번에서 받은 입력으로 지정한다 힌트:setbookId,scanner
			//(4)새 책 샘플(2)를 list 에 추가한다 힌트:list.add()
			Book newBook = new Book();
			System.out.print("책 제목 : ");
			String bookName = scanner.next();
			newBook.setBookName(bookName);
			System.out.print("저자 입력 : ");
			String bookAuthor = scanner.next();
			newBook.setAuthor(bookAuthor);
			System.out.println("가격 입력 : ");
			int bookPrice = scanner.nextInt();
			newBook.setPrice(bookPrice);
			
			
			
			list.add(newBook);
			
			BookMain.printBookList(list);
			
		}
		else if(workId==2) {
			System.out.println("삭제할 ID를 입력하세요.");
			int bookId = scanner.nextInt();
			for (int i = 0; i < list.size(); i++) {
				if (bookId == list.get(i).getBookId()) {
					//bookId = 내가키보드로친거
					//내가 키보드로친숫자가 ==(같나요?)
					//list   .get(i)   .getbookId();
					
					//(1)list (책들을저장한 리스트목록에서
					//(2) .get(i) (i번째에 저장된 책을 확인하는데
					//(3) .getbookId() (그책의Id를 확인
					
					list.remove(i);
					BookMain.printBookList(list);
				}
			}
		}
		else if(workId==3) {
			System.out.print("조회할 ID를 입력하세요.");
			BookMain.printBookList(list);
			int bookId1 = scanner.nextInt();
			for (Book item : list) {
				if (item.getBookId() == bookId1) {
					System.out.println(item.toString());
				}
			}
		}
		else if(workId==4) {
			System.out.print("수정할 ID를 입력하세요.");
			BookMain.printBookList(list);
			int bookId1 = scanner.nextInt();
			
			for (Book item : list) {
				if (item.getBookId() == bookId1) {
					
					System.out.print(" 책 제목 : ");
					String bookName = scanner.next();
					System.out.println(" 책 작가 : ");
					String bookAuthor = scanner.next();
					System.out.println(" 책 가격 : ");
					int bookPrice = scanner.nextInt();
					
					System.out.print(" 책 제목 : " + bookName + "\n" + " 책 작가 : " + bookAuthor + "\n" + " 책 가격 : " + bookPrice + "\n" + " 이 내용이 맞습니까? (y/n) ");
					String yn = scanner.next();
					if (yn.equals("y")) {
						item.setBookId(bookId1);
						item.setBookName(bookName);
						item.setAuthor(bookAuthor);
						item.setPrice(bookPrice);
						BookMain.printBookList(list);
						break;
					}
					
				
		}
				}
		}
		else {
			// 1,2,3,4 이외의 다른 숫자는 프로그램을 종료한다.
			BookMain.printBookList(list);
			System.out.println(list.toString());
			System.out.println("프로그램 종료");
		}
		}while(true);
					
		}
		}
			
			
		
		


