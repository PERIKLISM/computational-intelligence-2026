/*
 * Άσκηση 2 - k-means και silhouette (Υπολογιστική Νοημοσύνη 2026-27)
 * Ομάδα: Περικλής Μπούρλης (5523), Βαγγέλης (5492), Πιστι (5336)
 *
 * Μεταγλώττιση: javac -encoding UTF-8 --release 11 *.java
 * Εκτέλεση:     java KMeans
 */
public class KMeans {

    static final int M = 9;          // αριθμός ομάδων (δοκιμάζουμε 3, 5, 7, 9, 11, 13)
    static final int RUNS = 50;      // τρεξίματα ανά τιμή του M
    static final String DATA_FILE = "../data/clustering_1100.txt";

    // TODO: φόρτωση των 1100 σημείων
    // TODO: k-means (αρχικά κέντρα = τυχαία παραδείγματα)
    // TODO: σφάλμα ομαδοποίησης = άθροισμα Ευκλείδειων αποστάσεων ||xi - μk||
    // TODO: 50 τρεξίματα, εκτύπωση σφάλματος καθενός, αποθήκευση καλύτερης λύσης (κέντρα + σφάλμα)
    // TODO: συνάρτηση silhouette(σύνολο δεδομένων, λύση k-means) με ευκλείδεια απόσταση
    // TODO: αρχεία αποτελεσμάτων για τα plots (σημεία + κέντρα, σφάλμα ως προς M, silhouette ως προς M)

    public static void main(String[] args) {
        // TODO
    }
}
