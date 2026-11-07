/**
 * Πυρήνας του MLP: δομή δικτύου, αρχικοποίηση, forward pass, ενημέρωση βαρών.
 * ΥΠΕΥΘΥΝΟΣ: Μέλος Α.   Λεπτομέρειες στο docs/ex1-roles.md
 *
 * Αρίθμηση επιπέδων: h = 0 είσοδος, h = 1..H κρυμμένα, h = H+1 έξοδος.
 * Ενεργοποίηση κρυμμένων: tanh ή ReLU (ίδια για όλα). Ενεργοποίηση εξόδου: ΠΑΝΤΑ λογιστική.
 *
 * Οι πίνακες παρακάτω είναι το "συμβόλαιο" με τον Backprop (Μέλος Β).
 * Η δέσμευση μνήμης στον constructor είναι ΕΤΟΙΜΗ: μην αλλάξετε ονόματα ή διαστάσεις χωρίς συνεννόηση.
 */
public class Mlp {

    public static final int TANH = 0;
    public static final int RELU = 1;

    public final int[] n;        // n[h]: αριθμός νευρώνων επιπέδου h (n[0] = d, n[H+1] = K)
    public final int H;          // αριθμός κρυμμένων επιπέδων (1, 2 ή 3)
    public final int hiddenAct;  // TANH ή RELU

    public float[][][] w;        // w[h][i][j]: βάρος από τον νευρώνα j του επιπέδου h-1 στον νευρώνα i του επιπέδου h (h = 1..H+1)
    public float[][] b;          // b[h][i]: πόλωση του νευρώνα i του επιπέδου h
    public float[][] y;          // y[h][i]: έξοδος νευρώνα. Το y[0] είναι η είσοδος x. Γράφεται από το forwardPass.
    public float[][] delta;      // delta[h][i]: σφάλμα νευρώνα. Γράφεται από τον Backprop.
    public float[][][] gw;       // gw[h][i][j]: άθροισμα παραγώγων dE/dw. Το προσθέτει ο Backprop, το μηδενίζει το updateWeights.
    public float[][] gb;         // gb[h][i]: άθροισμα παραγώγων dE/db (όμοια)

    /** ΕΤΟΙΜΟ: δεσμεύει τους πίνακες. Τα βάρη ΔΕΝ έχουν αρχικοποιηθεί: καλέστε μετά το initWeights. */
    public Mlp(int d, int[] hidden, int K, int hiddenAct) {
        this.H = hidden.length;
        this.hiddenAct = hiddenAct;
        this.n = new int[H + 2];
        n[0] = d;
        for (int h = 1; h <= H; h++) n[h] = hidden[h - 1];
        n[H + 1] = K;

        w = new float[H + 2][][];
        gw = new float[H + 2][][];
        b = new float[H + 2][];
        gb = new float[H + 2][];
        y = new float[H + 2][];
        delta = new float[H + 2][];
        y[0] = new float[d];
        for (int h = 1; h <= H + 1; h++) {
            w[h] = new float[n[h]][n[h - 1]];
            gw[h] = new float[n[h]][n[h - 1]];
            b[h] = new float[n[h]];
            gb[h] = new float[n[h]];
            y[h] = new float[n[h]];
            delta[h] = new float[n[h]];
        }
    }

    /** TODO (Α): τυχαία αρχικοποίηση όλων των βαρών w και πολώσεων b στο διάστημα (-1, 1). */
    public void initWeights(long seed) {
        throw new UnsupportedOperationException("TODO (Μέλος Α): initWeights");
    }

    /**
     * TODO (Α): συνάρτηση ενεργοποίησης του επιπέδου h για συνολική είσοδο u.
     * h <= H (κρυμμένα): TANH -> tanh(u), RELU -> max(0, u).   h = H+1 (έξοδος): λογιστική 1/(1+exp(-u)).
     */
    public float g(int h, float u) {
        throw new UnsupportedOperationException("TODO (Μέλος Α): g");
    }

    /**
     * TODO (Α): παράγωγος g'(u) του επιπέδου h, δοσμένης της ΕΞΟΔΟΥ yv = g(u) (όχι του u).
     * TANH: 1 - yv*yv.   RELU: yv > 0 ? 1 : 0.   Έξοδος (λογιστική): yv * (1 - yv).
     * Τη χρησιμοποιεί ο Backprop του Μέλους Β.
     */
    public float gPrime(int h, float yv) {
        throw new UnsupportedOperationException("TODO (Μέλος Α): gPrime");
    }

    /**
     * TODO (Α): ευθύ πέρασμα. Βάζει y[0] = x, υπολογίζει y[1..H+1] και αντιγράφει το y[H+1] στο yOut (k = K στοιχεία).
     * ΠΡΕΠΕΙ να αφήνει γεμάτους τους πίνακες y[h], γιατί τους διαβάζει ο Backprop.
     * u = b[h][i] + sum_j w[h][i][j] * y[h-1][j],   y[h][i] = g(h, u).
     */
    public void forwardPass(float[] x, int d, float[] yOut, int k) {
        throw new UnsupportedOperationException("TODO (Μέλος Α): forwardPass");
    }

    /**
     * TODO (Α): ενημέρωση βαρών μετά από ένα mini-batch και μηδενισμός των παραγώγων:
     *   w[h][i][j] -= eta * gw[h][i][j] / batchSize ;  gw[h][i][j] = 0   (όμοια b και gb)
     * Η διαίρεση με batchSize σημαίνει ΜΕΣΟ ΟΡΟ ανά batch (προεπιλογή της ομάδας).
     */
    public void updateWeights(float eta, int batchSize) {
        throw new UnsupportedOperationException("TODO (Μέλος Α): updateWeights");
    }

    /** ΕΤΟΙΜΟ: το backprop(x, d, t, K) της εκφώνησης. Η υλοποίηση είναι στο Backprop.java (Μέλος Β). */
    public void backprop(float[] x, int d, float[] t, int k) {
        Backprop.compute(this, x, d, t, k);
    }
}
