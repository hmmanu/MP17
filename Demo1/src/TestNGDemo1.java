import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGDemo1 {
	@Test
	public void test1()
	{
		Reporter.log("QSpiders");
		Reporter.log("JSpiders", true);
		Reporter.log("TSpiders", false);
	}
}
