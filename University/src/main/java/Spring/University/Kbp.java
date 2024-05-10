package Spring.University;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Kbp implements University1{

	private Placement placemenet;
	
	public Kbp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kbp(Placement placemnet) {
		super();
		this.placemenet = placemnet;
	}

	public Placement getPlacemnet() {
		return placemenet;
	}

	@Autowired
	@Qualifier("ibm")
	public void setPlacemnet(Placement placemnet) {
		this.placemenet = placemnet;
	}

	@Override
	public String toString() {
		return "Kbp [placemnet=" + placemenet.getpalcement() + "]";
	}

	@Override
	public String CollegeId() {
		return "121";
	}

	@Override
	public String CollegeName() {
		return "KBPCOES,Satara";
	}

	@Override
	public String getpalcement() {
		return placemenet.getpalcement();
	}

}
