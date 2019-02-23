package service.rental;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import command.RentalCommand;
import dao.RentalDao;

public class RentalListService {
	
	RentalDao dao;
	
	
		@Autowired
		public RentalListService(RentalDao dao) {
		this.dao = dao;
	}



		public List<RentalCommand> action() {
			List<RentalCommand> list = dao.rentalist();
			
			
			return list;
		}
}
