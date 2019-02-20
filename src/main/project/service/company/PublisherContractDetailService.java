package service.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import command.BookContractMoneyCommand;
import command.PubListCommand;
import command.PublisherContractCommand;
import dao.BookListDao;
import dao.PublisherConstractDao;
import dao.PublisherDao;
import dto.ContractPublisher;
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
	@Autowired
	private BookListDao bookDao;
	public void setDao(BookListDao bookDao) {
		this.bookDao = bookDao;
	}

	public PubListCommand action(String pubNo) {
		// TODO Auto-generated method stub
		PubListCommand command = consDao.ContractPublisher(pubNo);
		command.CommandTest();
		return command;
	}

	public void UpdateProcess(PublisherContractCommand command, String name) {
		// TODO Auto-generated method stub
		Date today = new Date();
		String status;
		if(today.before(command.fullExpiredDate())){
			status = ContractPublisher.CONSTATUS[1];
		} else {
			status = ContractPublisher.CONSTATUS[2];
		}
		System.out.println("오늘의 날짜가 계약일로부터 : " + status);
		consDao.updateContract(command, name, status);
		List<BookContractMoneyCommand> reservedList = new ArrayList<BookContractMoneyCommand>();
		if(command.getBookName()!=null) {
			for(int i = 0; i<command.getBookName().length; i++) {
				reservedList.add(
				new BookContractMoneyCommand()
				.setBookName(command.getBookName()[i])
				.setBookMoney(command.getBookPrice()[i])
				.setBookContractMoney(command.getContractPrice()[i])
				);
			}
		}
		
		
		bookDao.insertReserved(reservedList, command);
	}

}
