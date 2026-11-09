/*
 * Άσκηση 2 - k-means και silhouette (Υπολογιστική Νοημοσύνη 2026-27)
 * Ομάδα: Περικλής Μπούρλης (5523), Βαγγέλης (5492), Πιστι (5336)
 */

/**
 * Διαγράμματα με γραμμή και σημεία. ΥΠΕΥΘΥΝΟΣ: Μέλος Γ.
 * Χρησιμοποιείται για τα δύο διαγράμματα της εκφώνησης: σφάλμα ομαδοποίησης ως προς M (ερώτημα γ) και silhouette
 * ως προς M (ερώτημα δ). Το καλεί το Experiments.
 *
 * Πρόταση: εικόνα PNG με java.awt.image.BufferedImage, Graphics2D και javax.imageio.ImageIO (μέσα στο JDK, χωρίς
 * εξωτερικές βιβλιοθήκες). Στην αρχή του προγράμματος: System.setProperty("java.awt.headless", "true"), ώστε να τρέχει
 * και χωρίς οθόνη. Άξονες με ονόματα και τιμές, σημεία με σύμβολο, γραμμή που τα ενώνει, τίτλος.
 */
public class LinePlot {

    /**
     * TODO: γράφει στο αρχείο pngFile διάγραμμα με τα σημεία (xs[i], ys[i]) ενωμένα με γραμμή.
     *
     * @param xs     οι τιμές του M (3, 5, 7, 9, 11, 13)
     * @param ys     η αντίστοιχη τιμή (σφάλμα ή silhouette)
     * @param title  τίτλος του διαγράμματος
     * @param xLabel όνομα του άξονα x
     * @param yLabel όνομα του άξονα y
     * @param pngFile όνομα αρχείου εξόδου, π.χ. "results/error_vs_M.png"
     */
    public static void save(double[] xs, double[] ys, String title, String xLabel, String yLabel, String pngFile) {
        throw new UnsupportedOperationException("TODO (Μέλος Γ): LinePlot.save");
    }
}
