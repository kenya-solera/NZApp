package team.nz.NZApp.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "Team")
public class Team {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    private ArrayList<Activity> activities = new ArrayList<>();

    /*private static void createActivitiesArray(Activity activity, ArrayList<Activity> activityArray){
        activityArray.add(activity);
    }*/

}
