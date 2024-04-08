package br.com.exemplo.demonstracao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class OlaMundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlaMundoApplication.class, args);
	}

		@GetMapping("/ola")
		public String ola(){
			return "Olá mundo!";
		}
}
