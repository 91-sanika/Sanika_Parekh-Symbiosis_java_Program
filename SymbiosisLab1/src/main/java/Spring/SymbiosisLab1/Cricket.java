package Spring.SymbiosisLab1;

public class Cricket implements Coach{

	private MatchTime matchtime;


	public Cricket() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cricket(MatchTime matchtime) {
		super();
		this.matchtime = matchtime;
	}
	

    public void setMatchtime(MatchTime matchtime) {
		this.matchtime = matchtime;
	}

    @Override
	public String toString() {
		return "Cricket [matchtime=" + matchtime + "]";
	}

	 
    @Override
	public String GetWorkOut() {
		return "batting";
	}

	@Override
	public String GetDiet() {
		return "healthy";
	}


	@Override
	public String getMatchtime() {
		// TODO Auto-generated method stub
		return matchtime.getMatchtime();
	}

	

}
