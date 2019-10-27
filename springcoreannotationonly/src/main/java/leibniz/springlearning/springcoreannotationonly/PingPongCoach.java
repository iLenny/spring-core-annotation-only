package leibniz.springlearning.springcoreannotationonly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	
	@Value("${paddleName}")
	private String paddleName;
	
	private Fortune dailyFortune;
	
	public PingPongCoach () {}
	
	@Autowired
	public PingPongCoach(@Qualifier("bFortune") Fortune dailyFortune) {
		this.dailyFortune = dailyFortune;
	}
	
	public void myInit() {
		System.out.println("Inside init method");
	}
	
	public void myDestroy() {
		System.out.println("Inside my destroy method");
	}
	
	public void setDailyFortune(Fortune dailyFortune) {
		this.dailyFortune = dailyFortune;
	}

	public String getDailyWorkout() {
		return "Do 100 forehand topspins";
	}

	public String getDailyFortune() {
		return dailyFortune.getFortune();
	}

	public String getPaddleName() {
		return paddleName;
	}

	public void setPaddleName(String paddleName) {
		this.paddleName = paddleName;
	}
	
	

}
