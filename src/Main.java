public class Main {
    public static void main(String[] args) {
        // Test
        DataStructure ds = new DataStructure();
        ds.append(20);
        ds.append(30);
        ds.append(40);
        ds.prepend(10);
        System.out.println("DataStructure size: " + ds.size());
        System.out.println("DataStructure head: " + ds.head());
        System.out.println("DataStructure tail: " + ds.tail());
        System.out.println("DataStructure at index 2: " + ds.at(2));
        System.out.println("DataStructure contains 20: " + ds.contains(30));
        System.out.println("DataStructure find 20: " + ds.find(20));
        System.out.println("DataStructure pop: " + ds.pop());
    }
}