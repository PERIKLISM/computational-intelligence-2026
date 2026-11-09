/**
 * Εκπαίδευση με gradient descent και mini-batches. ΥΠΕΥΘΥΝΟΣ: Μέλος Β.
 */
public class Trainer {

    /**
     * TODO (Β): συνολικό σφάλμα εκπαίδευσης  E = sum_n 1/2 * sum_i (T[n][i] - o_i(X[n]))^2
     * (ΑΘΡΟΙΣΜΑ πάνω σε όλα τα παραδείγματα, όπως ορίζεται στο K4, όχι μέσος όρος).
     */
    public static double totalError(Mlp net, float[][] X, float[][] T) {
        throw new UnsupportedOperationException("TODO (Μέλος Β): totalError");
    }

    /**
     * TODO (Β): εκπαίδευση. Επιστρέφει τον αριθμό των εποχών που έγιναν.
     *
     *   Eprev = totalError(...)
     *   για κάθε εποχή:
     *     για κάθε batch από L διαδοχικά παραδείγματα (το L διαιρεί το N, N/L = 40 batches για L = 100):
     *         για κάθε παράδειγμα του batch:  net.backprop(X[n], d, T[n], K)
     *         net.updateWeights(eta, L)
     *     E = totalError(net, X, T);  ΕΚΤΥΠΩΣΗ της εποχής και του E (υποχρεωτικό στο τέλος ΚΑΘΕ εποχής)
     *     αν (εποχή >= minEpochs) και |Eprev - E| < eps: τέλος
     *     Eprev = E
     *
     * Προαιρετικά: ανακάτεμα της σειράς των παραδειγμάτων σε κάθε εποχή, και όριο ασφαλείας στον αριθμό εποχών.
     */
    public static int train(Mlp net, float[][] X, float[][] T, int L, float eta, float eps, int minEpochs) {
        throw new UnsupportedOperationException("TODO (Μέλος Β): train");
    }
}
