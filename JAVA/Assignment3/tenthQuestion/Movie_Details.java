package tenthQuestion;

import ninethQuestion.SavingAccount;

public class Movie_Details implements Comparable<Movie_Details> {
	private String mov_name,lead_actor,lead_actress,genre;
	

	public Movie_Details(String mov_name, String lead_actor, String lead_actress, String genre) {
		super();
		this.mov_name = mov_name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}

	public String getMov_name() {
		return mov_name;
	}

	public void setMov_name(String mov_name) {
		this.mov_name = mov_name;
	}

	public String getLead_actor() {
		return lead_actor;
	}

	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}

	public String getLead_actress() {
		return lead_actress;
	}

	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie_Details [mov_name=" + mov_name + ", lead_actor=" + lead_actor + ", lead_actress=" + lead_actress
				+ ", genre=" + genre + "]";
	}

	@Override
	public int compareTo(Movie_Details o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
	
}
