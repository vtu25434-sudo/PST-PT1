import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class Event {
    String name;
    LocalDate date;

    Event(String name, String date) {
        this.name = name;
        this.date = LocalDate.parse(date);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}

public class EventProcessorTask9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String date = sc.next();
            events.add(new Event(name, date));
        }

        int month = sc.nextInt();

       
        List<Event> sortedEvents = events.stream()
                .sorted(Comparator.comparing(Event::getDate))
                .collect(Collectors.toList());

        sortedEvents.forEach(e -> System.out.print(e.getName() + " "));
        System.out.println();

        
        Event earliest = sortedEvents.get(0);
        System.out.println(earliest.getName());

       
        Event latest = sortedEvents.get(sortedEvents.size() - 1);
        System.out.println(latest.getName());

        
        sortedEvents.stream()
                .filter(e -> e.getDate().getMonthValue() == month)
                .forEach(e -> System.out.print(e.getName() + " "));
    }
}
