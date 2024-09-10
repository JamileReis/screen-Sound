package screen.screen.sound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import screen.screen.sound.principal.Principal;
import screen.screen.sound.repository.ArtistaRepository;

@SpringBootApplication
public class ScreenSoundApplication implements CommandLineRunner {
	@Autowired
	private ArtistaRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(ScreenSoundApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}
