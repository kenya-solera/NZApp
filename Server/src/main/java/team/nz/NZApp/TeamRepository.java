package team.nz.NZApp;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import team.nz.NZApp.entities.Team;

@RepositoryRestResource //mirar argumento collectionResourceRel
public interface TeamRepository extends MongoRepository<Team, String> {
    Team findByName(@Param("name") String name);
}
