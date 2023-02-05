public class SomeClass2 {
    public int i;
    int j;

    @Override
    public boolean equals(Object arg0) {
        if (this.i == ((SomeClass1) arg0).i) return true;
        return false;
    }

    public static void main(String argv[]) {
        SomeClass1 sc = new SomeClass1();
        sc.i = 1;
        SomeClass1 sc1s = new SomeClass1();
        sc1s.i = 1;


        if (sc.equals(sc1s)) System.out.println("t");
        else System.out.println("f");
        sc.i = 5;
        int j = sc.i;
//		String str1 = "abc";
        String str1 = new String("abc");
        String str2 = new String("abc");
        str1.hashCode();
        if (str1 == str2) System.out.println("a");
        else System.out.println("b");

        String str11 = "abcq";
        String str12 = "abc";
        String string = new String();
        string = "abc";

        if (str11 == str12) System.out.println("T");


        long ssn = 111_22_3333L;
        System.out.println(ssn);


    }
}