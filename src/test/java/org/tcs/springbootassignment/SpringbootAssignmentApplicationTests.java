package org.tcs.springbootassignment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.tcs.springbootassignment.models.Clone;
import org.tcs.springbootassignment.services.CloneService;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class SpringbootAssignmentApplicationTests {
	@Autowired
	private CloneService cloneService;
	@BeforeAll
	void setUp(){
		Clone clone=new Clone();
		clone.setCodeName("XT-DT 1001");
		clone.setPlatoon(117);
		cloneService.save(clone);
	}
	@Test
	void testFindById(){
		Clone clone=cloneService.findAll().get(0);
		Assertions.assertEquals(clone.getCodeName(),"XT-DT 1001");
	}
	@Test
	void contextLoads() {
	}


}
