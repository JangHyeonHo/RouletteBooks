package service.company;

import org.springframework.beans.factory.annotation.Autowired;

import dao.BookListDao;

public class BookRegisterService {

	
	BookListDao dao;
	
	@Autowired
	public BookRegisterService(BookListDao dao) {
	this.dao = dao;
	}





		public void action(int number) {
			
			dao.register(number);
			
			
		}
}
