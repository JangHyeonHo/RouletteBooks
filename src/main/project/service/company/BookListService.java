package service.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.BookListDao;
import dto.BookList;

public class BookListService {

	BookListDao dao;
	@Autowired
	public BookListService(BookListDao dao) {
		this.dao = dao;
	}
	
	
	public List<BookList> action(){
		
		List<BookList> list = dao.BookRegiList();
		
		
		return list;
	}
	
	
}
