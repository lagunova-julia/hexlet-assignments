package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String str;
    private int length;

    @Override
    public String toString() {
        return str;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public char charAt(int index) {
        return str.charAt(index);
    }

    public ReversedSequence(String str) {
        this.str = new StringBuilder(str).reverse().toString();
        this.length = this.str.length();
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

        return ((start == 0) && (end == this.length)) ? this : new String(this.str.substring(start, end));
    }
}
// END
