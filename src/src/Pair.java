import java.util.Objects;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(key, pair.key) && Objects.equals(value, pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "Pair{" + key + "=" + value + "}";
    }

    public static void main(String[] args) {
        Pair<String, Integer> nameAge = new Pair<>("Alice", 30);
        Pair<String, String> countryCapital = new Pair<>("France", "Paris");
        Pair<Integer, Double> productPrice = new Pair<>(101, 49.99);

        System.out.println(nameAge);
        System.out.println("Key: " + nameAge.getKey() + ", Value: " + nameAge.getValue());

        countryCapital.setValue("Lyon");
        System.out.println("Updated pair: " + countryCapital);

        java.util.ArrayList<Pair<String, Integer>> list = new java.util.ArrayList<>();
        list.add(new Pair<>("Bob", 25));
        list.add(nameAge);
        System.out.println("List of pairs: " + list);

        Pair<String, Integer> sameAsNameAge = new Pair<>("Alice", 30);
        System.out.println("nameAge equals sameAsNameAge? " + nameAge.equals(sameAsNameAge));
    }
}