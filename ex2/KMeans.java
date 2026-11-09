/*
 * Άσκηση 2 - k-means και silhouette (Υπολογιστική Νοημοσύνη 2026-27)
 * Ομάδα: Περικλής Μπούρλης (5523), Βαγγέλης Τζιάλλας (5492), Πιστι (5336)
 *
 * Μεταγλώττιση: javac -encoding UTF-8 --release 11 *.java
 * Εκτέλεση:     java KMeans        (ένα τρέξιμο με M ομάδες, αποθηκεύει τα κέντρα)
 *               java Experiments   (τα 6 x 50 τρεξίματα, plots, silhouette)
 */
import java.util.Random;

/**
 * Ο αλγόριθμος k-means. ΥΠΕΥΘΥΝΟΣ: Μέλος Γ.
 *
 * Η εκφώνηση ζητά το M να ορίζεται με #define: στη Java είναι η σταθερά {@link #M}. Το {@link #main} είναι το
 * "πρόγραμμα ομαδοποίησης" της εκφώνησης: φορτώνει τα παραδείγματα, τρέχει k-means με M κέντρα, τυπώνει το σφάλμα
 * ομαδοποίησης και αποθηκεύει τις συντεταγμένες των κέντρων. Οι 6 τιμές του M και τα 50 τρεξίματα γίνονται από το
 * Experiments, που καλεί την {@link #run}.
 */
public class KMeans {

    static final int M = 9;                       // αριθμός ομάδων για το απλό τρέξιμο (δοκιμάζουμε 3, 5, 7, 9, 11, 13)
    static final long SEED = 2026L;               // σταθερό seed ώστε τα αποτελέσματα να επαναλαμβάνονται
    static final int MAX_ITER = 1000;             // όριο ασφαλείας επαναλήψεων
    static final String DATA_FILE = "../data/clustering_1100.txt";
    static final String CENTERS_FILE = "centers_M" + M + ".txt";

    /**
     * TODO: ένα πλήρες τρέξιμο k-means με m κέντρα.
     * <pre>
     * 1. αρχικά κέντρα: m ΔΙΑΦΟΡΕΤΙΚΑ παραδείγματα που επιλέγονται τυχαία με το rnd (αντίγραφα των γραμμών του X)
     * 2. επανάληψη (το πολύ MAX_ITER φορές):
     *      ανάθεση:    κάθε παράδειγμα στο πλησιέστερο κέντρο (τετράγωνο απόστασης, ισοβαθμία: μικρότερος δείκτης)
     *      έλεγχος:    αν καμία ανάθεση δεν άλλαξε, τέλος
     *      ενημέρωση:  κάθε κέντρο = μέσος όρος των παραδειγμάτων της ομάδας του
     *                  (κενή ομάδα: το κέντρο γίνεται ένα τυχαίο παράδειγμα)
     * 3. error = clusteringError(X, centers, labels)
     * </pre>
     * Επιστρέφει το αποτέλεσμα ως KMeansResult. Δεν τυπώνει τίποτα (το τυπώνει όποιος την καλεί).
     *
     * @param X   παραδείγματα [N][2]
     * @param m   αριθμός ομάδων
     * @param rnd γεννήτρια τυχαίων αριθμών (ο καλών ορίζει το seed, ώστε κάθε τρέξιμο να είναι διαφορετικό και επαναλήψιμο)
     */
    public static KMeansResult run(double[][] X, int m, Random rnd) {
        throw new UnsupportedOperationException("TODO (Μέλος Γ): KMeans.run");
    }

    /**
     * TODO: σφάλμα ομαδοποίησης = άθροισμα για όλα τα παραδείγματα του ||xi - μk||^2, όπου μk το κέντρο της ομάδας
     * labels[i] του παραδείγματος i. Τετράγωνο της Ευκλείδειας απόστασης (όπως στην εκφώνηση), ΟΧΙ η απόσταση.
     */
    public static double clusteringError(double[][] X, double[][] centers, int[] labels) {
        throw new UnsupportedOperationException("TODO (Μέλος Γ): KMeans.clusteringError");
    }

    /**
     * TODO: αποθηκεύει τη λύση σε αρχείο κειμένου. Η πρώτη γραμμή έχει το σφάλμα ομαδοποίησης και ακολουθεί μία
     * γραμμή "x y" για κάθε κέντρο. Το καλεί και το Experiments για τη βέλτιστη λύση κάθε M.
     */
    public static void saveCenters(String file, double[][] centers, double error) {
        throw new UnsupportedOperationException("TODO (Μέλος Γ): KMeans.saveCenters");
    }

    /** TODO: το απλό πρόγραμμα: Points.load, run με M κέντρα, εκτύπωση σφάλματος, saveCenters(CENTERS_FILE, ...). */
    public static void main(String[] args) {
        // double[][] X = Points.load(DATA_FILE);
        // KMeansResult r = run(X, M, new Random(SEED));
        // System.out.println("M = " + M + "  σφάλμα ομαδοποίησης = " + r.error + "  επαναλήψεις = " + r.iterations);
        // saveCenters(CENTERS_FILE, r.centers, r.error);
        throw new UnsupportedOperationException("TODO (Μέλος Γ): KMeans.main");
    }
}
