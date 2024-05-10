package Spring.University;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
//      University1 un = (University1) context.getBean("kbp",University1.class);
//      System.out.println(un.CollegeId());
//      System.out.println(un.CollegeName());
//      System.out.println(un.getpalcement());
    	
    	
//    	  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
//          University1 un = (University1) context.getBean("coap",University1.class);
//          System.out.println(un.CollegeId());
//          System.out.println(un.CollegeName());
//          System.out.println(un.getpalcement());
      
      University1 un1 = (University1) context.getBean("kbp",University1.class);
      System.out.println(un1);
    }
}
