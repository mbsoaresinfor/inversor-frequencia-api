package mbs.inversor.frequencia.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class ControllerAdvice {

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	String illegalArgumentExceptionHandler(IllegalArgumentException ex) {
		System.out.println("Erro ao escrever: " + ex.getMessage());
		return ex.getMessage();
	}
	
	
	
	
}
