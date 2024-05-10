package Spring.SymbiosisLab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
//    	Cricket ch = (Cricket) context.getBean("cricket");
//    	System.out.println(ch.GetDiet());
//    	System.out.println(ch.GetWorkOut());
//    	System.out.println(ch.getMatchtime());
    	
    	/*System.out.println("**********************************");
    	Football ch1 = (Football)context.getBean("football");
    	System.out.println(ch1.GetWorkOut());
    	System.out.println(ch1.GetDiet());
    	System.out.println(ch1.getMatchTime());*/
    	
    	Cricket ch1 = (Cricket) context.getBean("cricket");
         System.out.println(ch1);
    }
}
