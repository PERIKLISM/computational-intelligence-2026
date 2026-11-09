/*
 * Άσκηση 2 - k-means και silhouette (Υπολογιστική Νοημοσύνη 2026-27)
 * Ομάδα: Περικλής Μπούρλης (5523), Βαγγέλης (5492), Πιστι (5336)
 */

/**
 * Σχεδίαση των παραδειγμάτων και των κέντρων στο ίδιο σχήμα. ΥΠΕΥΘΥΝΟΣ: Μέλος Γ.
 * Ερώτημα β της εκφώνησης: τα παραδείγματα π.χ. με "+" και οι θέσεις των κέντρων π.χ. με "*". Ένα σχήμα για κάθε M.
 *
 * Πρόταση: εικόνα PNG με java.awt.image.BufferedImage, Graphics2D και javax.imageio.ImageIO (μέσα στο JDK, χωρίς
 * εξωτερικές βιβλιοθήκες). Στην αρχή του προγράμματος: System.setProperty("java.awt.headless", "true"). Τα σύμβολα
 * "+" και "*" ζωγραφίζονται με γραμμές (drawLine), ώστε να μη χρειάζονται γραμματοσειρές. Άξονες x1, x2 περίπου στο [-1, 1]
 * (υπολογίστε τα όρια από τα δεδομένα). Τα κέντρα πρέπει να ξεχωρίζουν καθαρά (μεγαλύτερα, άλλο χρώμα).
 */
public class ScatterPlot {

    /**
     * TODO: γράφει στο αρχείο pngFile την εικόνα με τα παραδείγματα X (σύμβολο "+") και τα κέντρα (σύμβολο "*").
     *
     * @param X       παραδείγματα [N][2]
     * @param centers κέντρα [M][2]
     * @param title   τίτλος, π.χ. "M = 9, σφάλμα ομαδοποίησης = 20.25"
     * @param pngFile όνομα αρχείου εξόδου, π.χ. "results/clusters_M9.png"
     */
    public static void save(double[][] X, double[][] centers, String title, String pngFile) {
        throw new UnsupportedOperationException("TODO (Μέλος Γ): ScatterPlot.save");
    }
}
