package leibniz.springlearning.springcoreannotationonly;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("leibniz.springlearning")
@PropertySource("file:data.properties")
public class SportConfig {
	
}
