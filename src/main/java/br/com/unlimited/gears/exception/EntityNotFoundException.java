package br.com.unlimited.gears.exception;

public class EntityNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {	
		return "The entity sent to search cannot be found";
	}

}
