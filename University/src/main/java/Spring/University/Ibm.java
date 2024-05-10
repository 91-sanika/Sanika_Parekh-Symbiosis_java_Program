package Spring.University;

import org.springframework.stereotype.Component;

@Component
public class Ibm implements Placement{

	@Override
	public String getpalcement() {
		return "BackEndDevloper";
	}

}
