package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String str;

    public String getStr() {
        return str;
    }

    public ReversedSequence(String str) {
        this.str = new StringBuilder(str).reverse().toString();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new IndexOutOfBoundsException("Start index cannot be negative");
        }
        if (end > this.length) {
            throw new IndexOutOfBoundsException("End index cannot be greater than the length of the string");
        }
        if (start > end) {
            throw new IndexOutOfBoundsException("Start index cannot be greater than end index");
        }

        int subLen = end - start;
        return ((start == 0) && (end == this.length)) ? this : new String(this.substring(start, subLen));
    }
}
// END
