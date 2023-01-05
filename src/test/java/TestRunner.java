
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

public static void main(String[] args) {
		
	
	Result result = JUnitCore.runClasses(TestJUnit.class);
	for (Failure failure : result.getFailures()) {
	System.out.println(failure.toString());
	}System.out.println(result.wasSuccessful());	
	
	
	
	 result = JUnitCore.runClasses(TestPartitionManzanas.class);
	for (Failure failure : result.getFailures()) {
	System.out.println(failure.toString());
	}System.out.println(result.wasSuccessful());	
		
	
	 result = JUnitCore.runClasses(TestPartitionCantidad.class);
	for (Failure failure : result.getFailures()) {
	System.out.println(failure.toString());
	}System.out.println(result.wasSuccessful());	
		
	
	 result = JUnitCore.runClasses(TestPartitionPrecio.class);
	for (Failure failure : result.getFailures()) {
	System.out.println(failure.toString());
	}System.out.println(result.wasSuccessful());	
		
	
	}
}
