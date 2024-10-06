import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Rule> rules = new ArrayList<>();

        // Rule for Bulai
        Set<String> bulaiSymptoms = new HashSet<>();
        bulaiSymptoms.add("G1");
        bulaiSymptoms.add("G2");
        bulaiSymptoms.add("G3");
        bulaiSymptoms.add("G4");
        bulaiSymptoms.add("G5");
        rules.add(new Rule(bulaiSymptoms, "Bulai"));

        // Rule for Blight
        Set<String> blightSymptoms = new HashSet<>();
        blightSymptoms.add("G5");
        blightSymptoms.add("G6");
        blightSymptoms.add("G7");
        blightSymptoms.add("G8");
        blightSymptoms.add("G9");
        blightSymptoms.add("G10");
        rules.add(new Rule(blightSymptoms, "Blight"));

        // Rule for Leaf Rust
        Set<String> leafRustSymptoms = new HashSet<>();
        leafRustSymptoms.add("G10");
        leafRustSymptoms.add("G11");
        leafRustSymptoms.add("G12");
        leafRustSymptoms.add("G13");
        leafRustSymptoms.add("G14");
        rules.add(new Rule(leafRustSymptoms, "Leaf Rust"));

        // Rule for Burn
        Set<String> burnSymptoms = new HashSet<>();
        burnSymptoms.add("G15");
        burnSymptoms.add("G16");
        burnSymptoms.add("G17");
        burnSymptoms.add("G18");
        burnSymptoms.add("G19");
        rules.add(new Rule(burnSymptoms, "Burn"));

        // Rule for Stem Borer
        Set<String> stemBorerSymptoms = new HashSet<>();
        stemBorerSymptoms.add("G20");
        stemBorerSymptoms.add("G21");
        stemBorerSymptoms.add("G22");
        stemBorerSymptoms.add("G23");
        stemBorerSymptoms.add("G24");
        stemBorerSymptoms.add("G25");
        stemBorerSymptoms.add("G26");
        stemBorerSymptoms.add("G27");
        rules.add(new Rule(stemBorerSymptoms, "Stem Borer"));

        // Rule for Cob Borer
        Set<String> cobBorerSymptoms = new HashSet<>();
        cobBorerSymptoms.add("G28");
        cobBorerSymptoms.add("G29");
        cobBorerSymptoms.add("G30");
        cobBorerSymptoms.add("G31");
        rules.add(new Rule(cobBorerSymptoms, "Cob Borer"));

        // Inference Engine
        InferenceEngine engine = new InferenceEngine(rules);

        // UI Interaction
        UI ui = new UI(engine);
        ui.start();
    }
}
