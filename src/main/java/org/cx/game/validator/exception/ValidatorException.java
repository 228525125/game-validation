package org.cx.game.validator.exception;

import org.cx.game.validator.tools.I18n;

public class ValidatorException extends RuntimeException {

	public ValidatorException(String playNo) {
		// TODO Auto-generated constructor stub
		super(I18n.getMessage("org.cx.game.validator.exception.ValidatorException"));
	}
	
	public ValidatorException(String playNo, String description) {
		// TODO Auto-generated constructor stub
		super(I18n.getMessage(description));
	}
}
