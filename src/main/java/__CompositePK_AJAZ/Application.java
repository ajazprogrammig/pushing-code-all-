package __CompositePK_AJAZ;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import __CompositePK_AJAZ.Enity.Account1;
import __CompositePK_AJAZ.Enity.Accountpk;
import __CompositePK_AJAZ.Repository.AcconRepository;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		AcconRepository acconRepository2 = context.getBean(AcconRepository.class);
		
		  Accountpk apk = new Accountpk(); apk.setAccuntId(2);
		  apk.setAccontType("current"); apk.setAcunum(87092323);
		  
		  Account1 a = new Account1(); a.setAccuHolder("ajz"); a.setBranch("ameee");
		  a.setAccountpk(apk);
		  
		  acconRepository2.save(a);
		 
		
		
		
		Optional<Account1> id = acconRepository2.findById(apk);
	System.out.println(id.get());
	}

}
