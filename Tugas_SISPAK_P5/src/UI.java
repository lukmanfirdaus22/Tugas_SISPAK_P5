import java.util.Scanner;

public class UI {
    private InferenceEngine engine;
    private String[] symptomsDescriptions = {
        "Daun berwarna klorotik (pucat)",        // G1
        "Mengalami pertumbuhan terhambat",      // G2
        "Permukaan atas dan bawah daun yang klorotik berwarna putih seperti tepung", // G3
        "Daun melengkung dan menggulung",       // G4
        "Pembentukan tongkol terganggu",        // G5
        "Daun yang terkena terlihat layu",      // G6
        "Beberapa bintik kecil bergabung membentuk bintik yang lebih besar", // G7
        "Bintik memanjang berwarna cokelat muda berbentuk seperti kumparan atau perahu", // G8
        "Bintik cokelat berbentuk elips",       // G9
        "Daun terlihat kering",                 // G10
        "Bintik kecil berwarna cokelat atau kuning di permukaan daun", // G11
        "Bintik merah pada tulang daun",        // G12
        "Ada benang berbentuk tidak beraturan yang awalnya berwarna putih lalu berubah menjadi cokelat", // G13
        "Menghasilkan serbuk seperti tepung cokelat kekuningan", // G14
        "Pembengkakan pada tongkol",            // G15
        "Muncul jamur berwarna putih hingga hitam pada biji",  // G16
        "Biji menjadi bengkak",                 // G17
        "Terbentuk kelenjar pada biji",         // G18
        "Kelobot terbuka dan muncul banyak jamur berwarna putih hingga hitam", // G19
        "Terdapat lubang kecil pada daun",      // G20
        "Terdapat celah pada batang",           // G21
        "Bunga jantan atau pangkal tongkol rusak",  // G22
        "Batang dan malai (bunga jantan) mudah patah",  // G23
        "Tumpukan malai yang patah",            // G24
        "Bunga jantan tidak terbentuk",         // G25
        "Terdapat tepung atau kotoran di sekitar angkutan", // G26
        "Daun sedikit menguning",               // G27
        "Terdapat lubang melintang pada daun di fase vegetatif", // G28
        "Rambut pada tongkol jagung terpotong, berkurang, atau kering", // G29
        "Ujung tongkol terdapat getaran atau kerusakan",  // G30
        "Sering ditemukan adanya larva"         // G31
    };

    public UI(InferenceEngine engine) {
        this.engine = engine;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        
        // Menanyakan setiap gejala satu per satu
        for (int i = 0; i < symptomsDescriptions.length; i++) {
            System.out.println((i + 1) + ". Apakah Anda memiliki \"" + symptomsDescriptions[i] + "\"?");
            System.out.println("0. Tidak    1. Ya");
            
            int response = scanner.nextInt();
            if (response == 1) {
                engine.addUserSymptom("G" + (i + 1)); // Tambahkan gejala yang relevan
            }
        }

        // Inferensikan berdasarkan gejala yang telah dipilih
        String diagnosis = engine.infer();
        System.out.println("Hasil diagnosa: " + diagnosis);
    }
}
