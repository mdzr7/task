public class Main {

    //    1. Parameterised method with return type
    int m1(int a, int b) {
        int aa = a;
        int bb = b;
        int c = aa + bb;
        m5(1, 3);
        //?
        return c;
    }

//    2. Non parameterised method with return type

    String m2() {
        String name = "i dont know what to type";
        System.out.println(name);
        return name;
    }

    //    3. Parameterised method without return type
    void m3(char a, char b) {
        System.out.println(a + b);
        //?
    }

    //4. Non parameterised method without return type

    void m4() {
        System.out.println("just want to print something");
    }

//    5. Dependent method/method chaining/A method calling another method

    void m5(int a, int b) {
        int a1 = a;
        int b1 = b;
        System.out.println(a + b + m1(a, b));
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.m1(1, 3);
        m.m2();
        m.m3('a', 's');
        m.m4();
        m.m5(1, 4);
    }
}

