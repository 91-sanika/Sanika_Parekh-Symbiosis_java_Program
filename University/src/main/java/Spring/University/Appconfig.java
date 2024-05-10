package Spring.University;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
//@ComponentScan("Spring.University")
@Configuration
public class Appconfig {

//	@Bean
//	public Placement tcs () {
//		return new Tcs();
//	}
//	
//	@Bean
//   public University1 coap() {
//		Coap c = new Coap();
//		c.setPlacement(tcs());
//		return c;
//		
//	}
	@Bean
	public Placement ibm() {
		return new Ibm();
	}
	
	@Bean
	public University1 kbp() {
		Kbp k = new Kbp();
		k.setPlacemnet(ibm());
		return k;
	
	
	}
}
