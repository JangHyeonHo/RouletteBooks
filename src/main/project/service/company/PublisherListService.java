package service.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import command.PubListCommand;
import dao.BookListDao;
import dao.PublisherDao;

public class PublisherListService {
	
	@Autowired
	private PublisherDao dao;
	public void setDao(PublisherDao dao) {
		this.dao = dao;
	}
	@Autowired
	private BookListDao bldao;
	public void setBldao(BookListDao bldao) {
		this.bldao = bldao;
	}
	
	public List<PubListCommand> action() {
		// TODO Auto-generated method stub
		List<PubListCommand> list = dao.publisherList(bldao.getPubBookCount());
		return list;
	}
	
}
