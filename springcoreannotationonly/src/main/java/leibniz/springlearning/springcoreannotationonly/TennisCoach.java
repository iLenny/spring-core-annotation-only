package leibniz.springlearning.springcoreannotationonly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("gFortune")
	private Fortune dailyFortune;
	
	public TennisCoach() {
		
	}
	public TennisCoach(Fortune dailyFortune) {
		this.dailyFortune = dailyFortune;
	}
	
	public void setDailyFortune(Fortune dailyFortune) {
		this.dailyFortune = dailyFortune;
	}

	public String getDailyWorkout() {
		return "Do 100 Backhand volley";
	}

	public String getDailyFortune() {
		return dailyFortune.getFortune();
	}

}
