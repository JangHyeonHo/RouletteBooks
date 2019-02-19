package service.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import command.PubListCommand;
import dao.PublisherDao;

public class PublisherListService {
	
	@Autowired
	private PublisherDao dao;
	public void setDao(PublisherDao dao) {
		this.dao = dao;
	}
	public List<PubListCommand> action() {
		// TODO Auto-generated method stub
		List<PubListCommand> list = dao.publisherList();
		return list;
	}
	
}
