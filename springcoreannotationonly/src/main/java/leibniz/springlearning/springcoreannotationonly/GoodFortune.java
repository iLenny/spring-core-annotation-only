package leibniz.springlearning.springcoreannotationonly;

import org.springframework.stereotype.Component;

@Component("gFortune")
public class GoodFortune implements Fortune {

	public String getFortune() {
		return "Today is your lucky day!";
	}

}
