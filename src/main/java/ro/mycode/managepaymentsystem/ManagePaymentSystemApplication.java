package ro.mycode.managepaymentsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.mycode.managepaymentsystem.service.PaymentService;

@SpringBootApplication
public class ManagePaymentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagePaymentSystemApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(PaymentService paymentService){
		return  args->{



			paymentService.getAllPayments().forEach(System.out::println);

		};

	}
}
