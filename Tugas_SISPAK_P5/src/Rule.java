import java.util.Set;

public class Rule {
    private Set<String> symptoms; // Gejala yang harus dipenuhi
    private String conclusion;    // Penyakit yang dihasilkan

    public Rule(Set<String> symptoms, String conclusion) {
        this.symptoms = symptoms;
        this.conclusion = conclusion;
    }

    public boolean isTriggered(Set<String> currentSymptoms) {
        return currentSymptoms.containsAll(symptoms);
    }

    public String getConclusion() {
        return conclusion;
    }
}
