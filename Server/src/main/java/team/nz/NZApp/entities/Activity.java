package team.nz.NZApp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Activity {
    private String name;

    private int points;

    public Activity(String name) {
        this.name = name;
    }
}
