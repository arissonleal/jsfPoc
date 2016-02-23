package br.com.jsfpoc.mbean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String printHelloMsg(){
		if(message != null && !message.equals("")){
			return "Hello " + message;
		}
		
		return "";
	}
}
