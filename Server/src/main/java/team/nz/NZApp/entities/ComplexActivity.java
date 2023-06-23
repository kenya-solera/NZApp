package team.nz.NZApp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ComplexActivity extends Activity {

    ArrayList<Activity> exercises = new ArrayList<Activity>();

    public static int addExercisePoints(ArrayList<Activity> exercises){
        int result = 0;

        for (Activity exercise:exercises
             ) {
            result += exercise.getPoints();
        }
        return result;
    }

    private int points = addExercisePoints(exercises);

    public ComplexActivity(String name, ArrayList<Activity> exercises) {
        super(name);
        this.exercises = exercises;
    }
}
