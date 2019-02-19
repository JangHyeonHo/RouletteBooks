package service.company;

import org.springframework.beans.factory.annotation.Autowired;

import command.PublisherRegistCommand;
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


	public boolean action(PublisherRegistCommand command) {
		// TODO Auto-generated method stub
		dto.CommandChange(command);
		dto.DTOTEST();
		return (dao.publisherRegister(dto)!=null);
	}
	
}
