import java.util.TreeMap;

class MyCalendar {
    private TreeMap<Integer, Integer> calendar;

    public MyCalendar() {
        calendar = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        // Find the event that starts at or right before our new start time
        Integer prev = calendar.floorKey(start);
        // Find the event that starts at or right after our new start time
        Integer next = calendar.ceilingKey(start);
        
        // Check if the previous event overlaps with our new event
        // (i.e., does the previous event end *after* our start time?)
        if (prev != null && calendar.get(prev) > start) {
            return false;
        }
        
        // Check if the next event overlaps with our new event
        // (i.e., does our new event end *after* the next event's start time?)
        if (next != null && next < end) {
            return false;
        }
        
        // No conflicts found! Book the event.
        calendar.put(start, end);
        return true;
    }
}