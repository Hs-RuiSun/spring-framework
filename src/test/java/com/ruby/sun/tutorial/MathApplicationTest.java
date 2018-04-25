package com.ruby.sun.tutorial;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.Assert;
import org.junit.Before;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.reset;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

//attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {
	private MathApplication mathApplication;
	private CalculatorService calculatorService;

	@Before
	public void setup() {
		mathApplication = new MathApplication();
		// calculatorService = mock(CalculatorService.class);
		calculatorService = spy(CalculatorService.class);
		mathApplication.setCalculatorService(calculatorService);
	}

	@Test
	public void testAdd() {
		given(calculatorService.add(20.0, 10.0)).willReturn(30.0);
		double result = calculatorService.add(20.0, 10.0);
		Assert.assertEquals(result,30.0,0);  
	}

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MathApplicationTest.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
