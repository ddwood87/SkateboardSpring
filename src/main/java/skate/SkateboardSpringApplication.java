package skate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import skate.beans.Skateboard;
import skate.controller.BeanConfiguration;
import skate.repository.SkateRepository;

@SpringBootApplication
public class SkateboardSpringApplication implements CommandLineRunner{
	@Autowired
	SkateRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(SkateboardSpringApplication.class, args);
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Skateboard s = appContext.getBean("skateboard", Skateboard.class);
		System.out.println(s.toString());
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Skateboard s = appContext.getBean("skateboard", Skateboard.class);
		s.setBrand("Baker");
		s.setWidth(8.5);
		repo.save(s);
		
		Skateboard b = new Skateboard("Real", 8.0, 56);
		repo.save(b);
		List<Skateboard> allSkates = repo.findAll();
		for(Skateboard sb : allSkates) {
			System.out.println(sb.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
}
