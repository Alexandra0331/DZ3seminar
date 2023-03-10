public class Main{
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(14);
        list.add(45);
        list.add(80);
        list.add(340);
        list.add(46);
        list.add(19);
        list.add(10);
        list.add(50);
        list.add(20);

        list.forEach(System.out::println);

        System.out.println("\n---------------\n");
        System.out.println(String.format("Size: %d", list.size()));
        System.out.println("\n---------------\n");
        System.out.println(list.getPreviousByIndex(5));
        System.out.println(list.getByIndex(5));
        System.out.println(list.getNextByIndex(5));
        list.replaceByIndex(5, 100500);
        System.out.println(list.getByIndex(5));
    }
}