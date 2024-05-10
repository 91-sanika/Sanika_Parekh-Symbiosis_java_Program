package Spring.FieldInejection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class Appconfig {

	@Bean
	public Functionality cost() {
		return new Cost();
	}
		

//	@Bean
//	public Vehicle twowheeler() {
//		Twowheeler t = new Twowheeler();
//		t.setFunctionality(cost());
//		return t;
//	}
	
	@Bean
	public Vehicle fourwheeler() {
		FourWheeler f = new FourWheeler();
		f.setFunctionality(cost());
		return f;
		
	}
	}

