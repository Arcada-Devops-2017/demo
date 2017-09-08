package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void helloWorld() throws Exception {
	    String testString = "Hello Unit";
	    DemoApplication app = new DemoApplication(new TextGetterUnitImpl(testString));
	    TextObject obj = app.helloWorld();

        Assert.isTrue(testString.equals(obj.getValue()), "The value was not correct");

    }

}
