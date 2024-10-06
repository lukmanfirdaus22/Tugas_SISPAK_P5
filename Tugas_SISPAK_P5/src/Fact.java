import java.util.HashSet;
import java.util.Set;

public class Fact {
    private String description;
    private Set<String> symptoms; // Gejala (G1, G2, etc.)

    public Fact(String description, String... symptoms) {
        this.description = description;
        this.symptoms = new HashSet<>();
        for (String symptom : symptoms) {
            this.symptoms.add(symptom);
        }
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getSymptoms() {
        return symptoms;
    }
}
