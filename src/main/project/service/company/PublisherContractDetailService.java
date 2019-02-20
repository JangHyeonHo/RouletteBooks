package service.company;

import org.springframework.beans.factory.annotation.Autowired;

import command.PubListCommand;
import dao.PublisherConstractDao;
import dao.PublisherDao;
import dto.Publisher;

public class PublisherContractDetailService {
	
	@Autowired
	private PublisherDao dao;
	public void setDao(PublisherDao dao) {
		this.dao = dao;
	}
	@Autowired
	private Publisher dto;
	public void setDto(Publisher dto) {
		this.dto = dto;
	}
	@Autowired
	private PublisherConstractDao consDao;
	public void setDao(PublisherConstractDao consDao) {
		this.consDao = consDao;
	}

	public PubListCommand action(String pubNo) {
		// TODO Auto-generated method stub
		PubListCommand command = consDao.ContractPublisher(pubNo);
		command.CommandTest();
		return command;
	}

}
