import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InferenceEngine {
    private Set<String> userSymptoms;
    private List<Rule> rules;

    public InferenceEngine(List<Rule> rules) {
        this.rules = rules;
        this.userSymptoms = new HashSet<>();
    }

    public void addUserSymptom(String symptom) {
        userSymptoms.add(symptom);
    }

    public String infer() {
        List<String> detectedDiseases = new ArrayList<>();

        // Cek setiap aturan dan tambahkan penyakit jika cocok dengan gejala user
        for (Rule rule : rules) {
            if (rule.isTriggered(userSymptoms)) {
                detectedDiseases.add(rule.getConclusion());
            }
        }

        // Jika tidak ada penyakit yang terdeteksi
        if (detectedDiseases.isEmpty()) {
            return "Tidak ada penyakit yang terdeteksi.";
        }

        // Gabungkan semua penyakit yang terdeteksi
        return "Penyakit yang terdeteksi: " + String.join(", ", detectedDiseases);
    }
}
