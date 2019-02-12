package validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import command.LoginCommand;

public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return LoginCommand.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub

	}

}
