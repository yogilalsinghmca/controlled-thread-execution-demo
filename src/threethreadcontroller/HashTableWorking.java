package threethreadcontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


public class HashTableWorking {

    public static void main(String[] args) {

        ConcurrentHashMap<MyClass, String> ht = new ConcurrentHashMap<MyClass, String>(16);
        MyClass m1 = new MyClass("yogi1", 1);
        MyClass m2 = new MyClass("yogi2", 2);
        MyClass m3 = new MyClass("yogi3", 3);
        MyClass m4 = new MyClass("yogi4", 4);
        MyClass m5 = new MyClass("yogi5", 5);
        MyClass m6 = new MyClass("yogi6", 6);
        MyClass m7 = new MyClass("yogi7", 7);
        MyClass m8 = new MyClass("yogi8", 8);
        MyClass m9 = new MyClass("yogi9", 9);
        MyClass m10 = new MyClass("yogi10", 10);
        MyClass m11 = new MyClass("yogi11", 11);
        MyClass m12 = new MyClass("yogi12", 12);
        MyClass m13 = new MyClass("yogi13", 13);
        MyClass m14 = new MyClass("yogi14", 14);
        MyClass m15 = new MyClass("yogi15", 15);
        MyClass m16 = new MyClass("yogi16", 16);
        MyClass m17 = new MyClass("yogi17", 17);
        MyClass m18 = new MyClass("yogi18", 18);
        MyClass m19 = new MyClass("yogi19", 19);
        MyClass m20 = new MyClass("yogi20", 20);
        MyClass m21 = new MyClass("yogi21", 21);
        MyClass m22 = new MyClass("yogi22", 22);
        MyClass m23 = new MyClass("yogi23", 23);
        MyClass m24 = new MyClass("yogi24", 24);
        MyClass m25 = new MyClass("yogi25", 25);
        MyClass m26 = new MyClass("yogi26", 26);
        MyClass m27 = new MyClass("yogi27", 27);
        MyClass m28 = new MyClass("yogi28", 28);
        MyClass m29 = new MyClass("yogi29", 29);
        MyClass m30 = new MyClass("yogi30", 30);
        MyClass m31 = new MyClass("yogi31", 31);
        MyClass m32 = new MyClass("yogi32", 32);
        MyClass m33 = new MyClass("yogi33", 33);
        MyClass m34 = new MyClass("yogi34", 34);
        MyClass m35 = new MyClass("yogi35", 35);
        MyClass m36 = new MyClass("yogi36", 36);
        MyClass m37 = new MyClass("yogi37", 37);
        MyClass m38 = new MyClass("yogi38", 38);
        MyClass m39 = new MyClass("yogi39", 39);
        MyClass m40 = new MyClass("yogi40", 40);
        MyClass m41 = new MyClass("yogi41", 412342);
        System.out.println(1 << 16);
        ht.put(m1, "yogi1");
        ht.put(m2, "yogi2");
        ht.put(m3, "yogi3");
        ht.put(m4, "yogi4");
        ht.put(m5, "yogi5");
        ht.put(m6, "yogi6");
        ht.put(m7, "yogi7");
        ht.put(m8, "yogi8");
        ht.put(m9, "yogi9");
        ht.put(m10, "yogi10");
        ht.put(m11, "yogi11");
        ht.put(m12, "yogi12");
        ht.put(m13, "yogi13");
        ht.put(m14, "yogi14");
        ht.put(m15, "yogi15");
        ht.put(m16, "yogi16");
        ht.put(m17, "yogi17");
        ht.put(m18, "yogi18");
        ht.put(m19, "yogi19");
        ht.put(m20, "yogi20");
        ht.put(m21, "yogi21");
        ht.put(m22, "yogi22");
        ht.put(m23, "yogi23");
        ht.put(m24, "yogi24");
        ht.put(m25, "yogi25");
        ht.put(m26, "yogi26");
        ht.put(m27, "yogi27");
        ht.put(m28, "yogi28");
        ht.put(m29, "yogi29");
        ht.put(m30, "yogi30");
        ht.put(m31, "yogi31");
        ht.put(m32, "yogi32");
        ht.put(m33, "yogi33");
        ht.put(m34, "yogi34");
        ht.put(m35, "yogi35");
        ht.put(m36, "yogi36");
        ht.put(m37, "yogi37");
        ht.put(m38, "yogi38");
        ht.put(m39, "yogi39");
        ht.put(m40, "yogi40");
        ht.put(m41, "yogi41");

        List ls = new ArrayList();
        ls.iterator();
        ht.elements();

    }

}

class MyClass {
    String name;
    private int rollno;
    static int counter;

    MyClass(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
        counter++;
    }

    @Override
    public int hashCode() {
        return this.rollno;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyClass other = (MyClass) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (rollno != other.rollno)
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }


}