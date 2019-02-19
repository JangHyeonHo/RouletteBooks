package service.company;

import org.springframework.beans.factory.annotation.Autowired;

import command.PublisherRegistCommand;
import dao.PublisherConstractDao;
import dao.PublisherDao;
import dto.Publisher;

public class PublisherRegisterService {
	
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


	public boolean action(PublisherRegistCommand command) {
		// TODO Auto-generated method stub
		dto.CommandChange(command);
		dto.DTOTEST();
		if(dao.publisherRegister(dto)!=null) {
			if(consDao.consOnRegister(dto)!=null) {
				return true;
			}
		}
		return false;
	}
	
}
