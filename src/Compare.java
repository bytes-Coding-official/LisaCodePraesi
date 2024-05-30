import java.util.Objects;

public class Compare implements Comparable<Compare> {

    private String valueA;
    private String valueB;

    public Compare(String valueA, String valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public static void main(String[] args) {

        Compare compare1 = new Compare("a", "b");

        System.out.println(compare1);


        Compare compare2 = new Compare("a", "d");
        compare2.setValueA("a");
        compare2.setValueB("c");
        System.out.println(compare2);

        System.out.println(compare1 == compare2);
        System.out.println(compare2.equals(compare1));
        System.out.println(compare1.compareTo(compare2));
        System.out.println(compare1.hashCode() == compare2.hashCode());
    }

    public String getValueA() {
        return valueA;
    }

    public void setValueA(String valueA) {
        this.valueA = valueA;
    }

    public String getValueB() {
        return valueB;
    }

    public void setValueB(String valueB) {
        this.valueB = valueB;
    }

    @Override
    public int compareTo(Compare o) {
        if (this.valueA.compareTo(o.valueA) > 0) {
            return 1;
        } else if (this.valueA.compareTo(o.valueA) < 0) {
            return -1;
        } else return Integer.compare(this.valueB.compareTo(o.valueB), 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Compare compare = (Compare) o;
        return Objects.equals(valueA, compare.valueA) && Objects.equals(valueB, compare.valueB);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(valueA);
        result = 31 * result + Objects.hashCode(valueB);
        return result;
    }
}
