import java.util.LinkedHashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hashset {
    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1 = Stream.of("George", "Jim", "John", "Blake", "Kevin", "Michael").collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2 = Stream.of("George", "Katie", "Kevin", "Michelle", "Ryan").collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<String> unionSet = new LinkedHashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);

        LinkedHashSet<String> differenceSet = new LinkedHashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference: " + differenceSet);

        LinkedHashSet<String> intersectionSet = new LinkedHashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection: " + intersectionSet);
    }
}
