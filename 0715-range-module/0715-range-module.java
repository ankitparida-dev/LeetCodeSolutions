import java.util.TreeMap;

class RangeModule {
    private TreeMap<Integer, Integer> ranges;

    public RangeModule() {
        ranges = new TreeMap<>();
    }
    
    public void addRange(int left, int right) {
        // Find intervals that might overlap or touch the new range on the left and right
        Integer l = ranges.floorKey(left);
        Integer r = ranges.floorKey(right);
        
        // Expand bounds if existing intervals overlap/merge
        if (l != null && ranges.get(l) >= left) {
            left = l;
        }
        if (r != null && ranges.get(r) > right) {
            right = ranges.get(r);
        }
        
        // Remove all old overlapping intervals in this span
        ranges.subMap(left, true, right, true).clear(); // Note: standard subMap clears correctly when using floor keys
        ranges.subMap(left, right).clear();
        
        // Insert the newly merged interval
        ranges.put(left, right);
    }
    
    public boolean queryRange(int left, int right) {
        // Find the interval that starts at or before 'left'
        Integer l = ranges.floorKey(left);
        
        // Check if such an interval exists and its end covers at least 'right'
        return l != null && ranges.get(l) >= right;
    }
    
    public void removeRange(int left, int right) {
        Integer l = ranges.floorKey(left);
        Integer r = ranges.floorKey(right);
        
        // If an existing interval extends past the right cut point, save the remainder
        if (r != null && ranges.get(r) > right) {
            ranges.put(right, ranges.get(r));
        }
        // If an existing interval covers the left cut point, truncate it
        if (l != null && ranges.get(l) > left) {
            ranges.put(l, left);
        }
        
        // Clear all fully contained intervals within [left, right)
        ranges.subMap(left, right).clear();
    }
}