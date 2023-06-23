package team.nz.NZApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NzAppApplication {

	public static void main(String[] args) {SpringApplication.run(NzAppApplication.class, args);

		TeamService teamService = new TeamService();

		System.out.println(teamService.findByName("NZ team"));
	}

}
