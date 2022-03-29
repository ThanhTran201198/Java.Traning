package vn.fis.traning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJpaApplicationTests {
	int add(int a,int b) {
		return a+b;
	}
	@Autowired
	@Test
	void testMethod() {
//		Assertions.assertTha
	}

}
