package in.nit.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("Testing Class Method")
public class TestEmployee {


	@Test
    @Tag("dev")
	public void testSave(TestInfo info) {
		System.out.println("Hi: ");

	}


	@Test
	@Tag("prod")
	public void testUpdate() {
		System.out.println("Update");

	}


}
