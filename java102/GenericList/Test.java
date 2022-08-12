package GenericList;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> m = new MyList<>();

        for (int i = 0; i < Math.random() * 500; i++)
            m.add((int) (Math.random() * 200));

        System.out.println(m.size());
        System.out.println(m.toString());
        System.out.println(m.getCapacity());
        System.out.println(m.isEmpty());
        System.out.println(m.subList(4, 8).toString());
        m.set(3, 3);
        System.out.println(m.contains(3));
        System.out.println(m.indexOf(44));
        m.clear();
        System.out.println(m.getCapacity());
        System.out.println(m.isEmpty());

    }
}
