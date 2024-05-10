package Spring.University;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Coap implements University1{

	private Placement placement;
	
	public Coap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coap(Placement placement) {
		super();
		this.placement = placement;
	}

	@Override
	public String toString() {
		return "Coap [placement=" + placement + "]";
	}

	public Placement getPlacement() {
		return placement;
	}

//	@Autowired
//	@Qualifier("tcs")
	public void setPlacement(Placement placement) {
		this.placement = placement;
	}

	@Override
	public String CollegeId() {
		return "131";
	}

	@Override
	public String CollegeName() {
		return "COAP,Pune";
	}

	@Override
	public String getpalcement() {
		return placement.getpalcement();
	}

}
