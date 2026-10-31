
import java.util.*;

class LRUCache {

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int capacity;
    HashMap<Integer, Node> map;

    Node head;
    Node tail;

    public LRUCache(int capacity) {

        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    // Remove node from current position
    private void remove(Node node) {

        Node p = node.prev;
        Node n = node.next;

        p.next = n;
        n.prev = p;
    }

    // Insert node before tail (most recently used)
    private void insert(Node node) {

        Node last = tail.prev;

        last.next = node;
        node.prev = last;

        node.next = tail;
        tail.prev = node;
    }

    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        remove(node);
        insert(node);

        return node.value;
    }

    public void put(int key, int value) {

        // Update existing key
        if (map.containsKey(key)) {

            Node node = map.get(key);

            node.value = value;

            remove(node);
            insert(node);

            return;
        }

        // Remove LRU node if cache is full
        if (map.size() == capacity) {

            Node lru = head.next;

            remove(lru);
            map.remove(lru.key);
        }

        // Insert new node
        Node node = new Node(key, value);

        insert(node);
        map.put(key, node);
    }
}
