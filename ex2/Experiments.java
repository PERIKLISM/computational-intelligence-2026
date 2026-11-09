/*
 * Άσκηση 2 - k-means και silhouette (Υπολογιστική Νοημοσύνη 2026-27)
 * Ομάδα: Περικλής Μπούρλης (5523), Βαγγέλης Τζιάλλας (5492), Πιστι (5336)
 */
import java.util.Random;

/**
 * Τα πειράματα της Άσκησης 2. ΥΠΕΥΘΥΝΟΣ: Μέλος Γ.
 * Για κάθε M = 3, 5, 7, 9, 11, 13: 50 τρεξίματα του k-means με διαφορετικά τυχαία αρχικά κέντρα, εκτύπωση του σφάλματος
 * κάθε τρεξίματος, αποθήκευση της καλύτερης λύσης (μικρότερο σφάλμα), σχήμα με παραδείγματα και κέντρα, και silhouette
 * της καλύτερης λύσης. Στο τέλος τα δύο διαγράμματα (σφάλμα ως προς M, silhouette ως προς M) και ο πίνακας αποτελεσμάτων.
 *
 * Εκτέλεση:  java Experiments     (τα αποτελέσματα γράφονται στον φάκελο results/)
 * Όλο το πρόγραμμα τρέχει σε λίγα δευτερόλεπτα, δεν χρειάζεται να μοιραστεί σε υπολογιστές.
 */
public class Experiments {

    static final int[] MS = {3, 5, 7, 9, 11, 13};
    static final int RUNS = 50;
    static final long SEED = 2026L;                          // βάση seed: κάθε τρέξιμο παίρνει SEED + 1000*m + run
    static final String DATA_FILE = "../data/clustering_1100.txt";
    static final String OUT_DIR = "results";

    /**
     * TODO: τα βήματα είναι γραμμένα εδώ ως σχόλια.
     * <pre>
     * double[][] X = Points.load(DATA_FILE);
     * new java.io.File(OUT_DIR).mkdirs();
     * double[] errors = new double[MS.length], silhouettes = new double[MS.length], ms = new double[MS.length];
     * για κάθε m της MS (δείκτης q):
     *     KMeansResult best = null;
     *     για run = 0 .. RUNS-1:
     *         KMeansResult r = KMeans.run(X, m, new Random(SEED + 1000L * m + run));
     *         εκτύπωση "M = m  τρέξιμο = run  σφάλμα = r.error"
     *         αν best == null ή r.error < best.error:  best = r
     *     KMeans.saveCenters(OUT_DIR + "/best_M" + m + ".txt", best.centers, best.error);
     *     ScatterPlot.save(X, best.centers, "M = " + m + ", σφάλμα = " + best.error,
     *                      OUT_DIR + "/clusters_M" + m + ".png");
     *     silhouettes[q] = Silhouette.compute(X, best.labels, m);
     *     errors[q] = best.error;  ms[q] = m;
     * LinePlot.save(ms, errors, "Σφάλμα ομαδοποίησης ως προς M", "M", "σφάλμα", OUT_DIR + "/error_vs_M.png");
     * LinePlot.save(ms, silhouettes, "Silhouette ως προς M", "M", "silhouette", OUT_DIR + "/silhouette_vs_M.png");
     * εκτύπωση πίνακα "M | καλύτερο σφάλμα | silhouette" και του M με το μεγαλύτερο silhouette
     * το ίδιο και στο αρχείο OUT_DIR + "/summary.txt"  (για το report)
     * </pre>
     */
    public static void main(String[] args) {
        throw new UnsupportedOperationException("TODO (Μέλος Γ): Experiments.main");
    }
}
