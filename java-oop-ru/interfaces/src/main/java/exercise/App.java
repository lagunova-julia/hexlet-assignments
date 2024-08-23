package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int count) {
//        Метод сортирует объекты по площади по возрастанию, берет первые n элементов и возвращает
//        строковые представления этих объектов в виде списка List.

        List<Home> firstNHomes = homes.stream()
                .sorted((h1, h2) -> Double.compare(h1.getArea(), h2.getArea()))
                .limit(count)
                .collect(Collectors.toList());

        return firstNHomes.stream()
                .map(Home::toString)
                .collect(Collectors.toList());
    }
}
// END
