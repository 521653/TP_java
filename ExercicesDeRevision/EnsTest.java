public class EnsTest {
    public static void main(String[] arg) {
        EnsA e1 = new EnsA(3);
        System.out.println(e1);
        System.out.println(e1.appartient(4));
        e1 = e1.union(new EnsA(3));
        System.out.println(e1);
        e1 = e1.union(new EnsA(4));
        System.out.println(e1.cardinal());
        System.out.println(e1.singleton());
        System.out.println(e1);
        EnsA e2 = new EnsA(8);
        EnsA e12 = e2.union(e1);
        System.out.println(e1.inclus(e12));
        System.out.println(e12);
        EnsA e3 = new EnsA(e12);
        System.out.println(e3.equals(e12));
        System.out.println(e3);
        e3 = e3.diff(new EnsA(5));
        System.out.println(e3);
        e3 = e3.diff(new EnsA(3));
        System.out.println(e3);
        e3 = e3.union(new EnsA(9));
        System.out.println(e3);
        EnsA e4 = e3.inter(e12);
        System.out.println(e4);
        EnsA e5 = e3.diff(e4);
        System.out.println(e5);
        e5 = e3.diff(e12);
        System.out.println(e5);
        System.out.println(e3);
        System.out.println(e3.equals(e5));
        e4.add(9);
        System.out.println(e4);
        System.out.println(e3);
        System.out.println(e3.equals(e4));
    }
}
