package evolution;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import evolution.controller.AnyController;
import evolution.pojo.AnyPojo;
import evolution.service.AnyService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {
	@Autowired
	private AnyController anyController;
	
	@Test
	public void anyTest() {
		AnyService anyService = Mockito.mock(AnyService.class);
		ReflectionTestUtils.setField(anyController, "anyService", anyService);
		AnyPojo anyPojo = new AnyPojo();
		anyPojo.setName("Chen");
		anyPojo.setGender("M");
		Mockito.when(anyService.anyMethod(Mockito.anyObject())).thenReturn(anyPojo);// You are allowed to plug in anyObject().
		AnyPojo result = anyController.post(null);
		System.out.println(result);
	}
	
	@Test
	public void anotherTest() {
		AnyService anyService = Mockito.mock(AnyService.class);
		ReflectionTestUtils.setField(anyController, "anyService", anyService);
		Mockito.when(anyService.anotherMethod(Mockito.anyInt())).thenReturn(3);
		int result = anyController.get(6);
		System.out.println(result);
	}
}
