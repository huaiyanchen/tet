
public class Add1 {
    int add(int a, int b) {
        if (0 == b) {
            return a;
        }
        int sum = a ^ b;//^异或相同为零，不同为同一；
        int carry = (a & b) << 1;//&与运算 都是一为一，否则为0；
        return add(sum, carry);
    }

    public static void main(String[] args) {
        Add1 a = new Add1();
       // a.add(1, 3);
        System.out.println(a.add(1, 3));
    }
}
