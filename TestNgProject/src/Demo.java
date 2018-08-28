import org.testng.annotations.Test;

public class Demo {

		@Test(priority =1)
		public void e_method()
		{
			System.out.println("Inside e_method");
		}
		@Test(priority =29)
		public void a_method()
		{
			System.out.println("Inside a_method");
		}
		@Test(priority =1)
		public void c_method()
		{
			System.out.println("Inside c_method");
		}
		@Test(priority =99)
		public void b_method()
		{
			System.out.println("Inside b_method");
		}
		@Test(priority =99)
		public void d_method()
		{
			System.out.println("Inside d_method");
		}
	

	}
