package evolution.service;

import org.springframework.stereotype.Service;

import evolution.pojo.AnyPojo;

@Service
public class AnyService {
	public AnyPojo anyMethod(AnyPojo anyPojo) {
		return anyPojo;
	}
	
	public int anotherMethod(int code) {
		return code;
	}
	
	public void exceptionMethod() {
		int i = 1 / 0;
	}
}
