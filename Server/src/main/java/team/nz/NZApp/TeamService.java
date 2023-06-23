package team.nz.NZApp;

import org.springframework.beans.factory.annotation.Autowired;
import team.nz.NZApp.entities.Team;

public class TeamService implements TeamServiceIfx{

    @Autowired
    TeamRepository repo;

    @Override
    public Team findByName(String name) {
        return repo.findByName(name);
    }
}
