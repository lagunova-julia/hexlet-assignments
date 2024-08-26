package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String str;

    public int getStr() {
        return str;
    }

    public ReversedSequence(String str) {
        this.str = new StringBuilder(str).reverse().toString();
    }
}
// END
