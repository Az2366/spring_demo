package sg.edu.ntu.spring_demo;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {
	// private static final Logger logger = LoggerFactory.getLogger(SpringDemoApplication.class);

	public static void main(String[] args) {
		// logger.info("🟢 Starting SpringDemoApplication");
		// logger.warn("🟠 Test Warning");
		// logger.error("🔴 Test Error");

		SpringApplication.run(SpringDemoApplication.class, args);
		System.out.println("👋👋👋 My first Spring Boot Application! ✅");
	}

}
