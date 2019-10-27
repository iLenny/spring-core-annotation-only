package leibniz.springlearning.springcoreannotationonly;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	public static void main(String[] args) {

		// Load Spring Container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Get Bean
		Coach coach = context.getBean("pingPongCoach", Coach.class);
		Coach coach2 = context.getBean("swimCoach", Coach.class);
		
		// Use the Bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach2.getDailyWorkout());
		System.out.println(coach2.getDailyFortune());
		
		if(coach instanceof PingPongCoach) {
			System.out.println(((PingPongCoach)coach).getPaddleName());
		}
		
		// Close the Spring Container
		context.close();
	}
}
