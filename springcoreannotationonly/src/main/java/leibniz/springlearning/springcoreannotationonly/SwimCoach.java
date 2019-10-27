package leibniz.springlearning.springcoreannotationonly;

public class SwimCoach implements Coach {

	private Fortune fortune;
	
	public SwimCoach(Fortune fortune) {
		this.fortune = fortune;
	}
	
	public Fortune getFortune() {
		return fortune;
	}

	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	public String getDailyWorkout() {
		return "1000 meters as a warmup";
	}

	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
