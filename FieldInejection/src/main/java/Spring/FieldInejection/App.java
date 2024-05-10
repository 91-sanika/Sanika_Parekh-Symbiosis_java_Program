package Spring.FieldInejection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
//        Vehicle vehicle = context.getBean("twowheeler",Twowheeler.class);
//        System.out.println(vehicle.Brand());
//        System.out.println(vehicle.Color());
//        System.out.println(vehicle.getfunctionality());
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Vehicle vehicle = context.getBean("fourwheeler",FourWheeler.class);
        System.out.println(vehicle.Brand());
        System.out.println(vehicle.Color());
        System.out.println(vehicle.getfunctionality());
    }
}
