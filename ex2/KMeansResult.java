/*
 * Άσκηση 2 - k-means και silhouette (Υπολογιστική Νοημοσύνη 2026-27)
 * Ομάδα: Περικλής Μπούρλης (5523), Βαγγέλης (5492), Πιστι (5336)
 */

/**
 * Αποτέλεσμα ενός τρεξίματος του k-means. ΕΤΟΙΜΟ: δεν χρειάζεται να αλλάξει κανείς.
 * Είναι ο κοινός τρόπος με τον οποίο το KMeans δίνει τη λύση στο Silhouette και στο Experiments.
 */
public final class KMeansResult {

    /** Τα κέντρα των ομάδων, πίνακας [M][2]. */
    public final double[][] centers;

    /** Η ομάδα κάθε παραδείγματος, πίνακας [N] με τιμές 0..M-1. */
    public final int[] labels;

    /** Σφάλμα ομαδοποίησης: άθροισμα των τετραγώνων των Ευκλείδειων αποστάσεων ||xi - μk||^2. */
    public final double error;

    /** Πόσες επαναλήψεις (ανάθεση + ενημέρωση) χρειάστηκαν μέχρι να σταθεροποιηθεί η λύση. */
    public final int iterations;

    public KMeansResult(double[][] centers, int[] labels, double error, int iterations) {
        this.centers = centers;
        this.labels = labels;
        this.error = error;
        this.iterations = iterations;
    }
}
