package leibniz.springlearning.springcoreannotationonly;

import org.springframework.stereotype.Component;

@Component("bFortune")
public class BadFortune implements Fortune {

	public String getFortune() {
		return "Today is your unlucky day :(";
	}

}
