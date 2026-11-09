/**
 * Αλγόριθμος backpropagation (σημειώσεις Λύκα, K4). ΥΠΕΥΘΥΝΟΣ: Μέλος Β.
 *
 * compute(net, x, d, t, K) για ένα παράδειγμα (x, t), με σφάλμα En = 1/2 * sum_i (t_i - o_i)^2:
 *   1) net.forwardPass(x, d, tmp, K)  ώστε να γεμίσουν οι πίνακες net.y
 *   2) Έξοδος (h = H+1):   delta[h][i] = gPrime(h, y[h][i]) * (y[h][i] - t[i])
 *                          (για λογιστική: y(1-y)(y-t))
 *   3) Κρυμμένα, h = H ... 1 (προς τα πίσω):
 *                          delta[h][i] = gPrime(h, y[h][i]) * sum_j w[h+1][j][i] * delta[h+1][j]
 *   4) Παράγωγοι, για κάθε h = 1..H+1:
 *                          gw[h][i][j] += delta[h][i] * y[h-1][j]
 *                          gb[h][i]    += delta[h][i]
 * ΠΡΟΣΟΧΗ: "+=" και όχι "=": οι παράγωγοι αθροίζονται για όλα τα παραδείγματα του mini-batch.
 * Τους πίνακες gw, gb τους μηδενίζει το Mlp.updateWeights (Μέλος Β).
 */
public class Backprop {

    static void compute(Mlp net, float[] x, int d, float[] t, int K) {
        throw new UnsupportedOperationException("TODO (Μέλος Β): Backprop.compute");
    }
}
