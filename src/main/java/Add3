package Java;

public class Add3 {
    public int numJewelsInStones(String J, String S) {
        if (J == null || S == null){
            return 0;
        }

        boolean[] b = new boolean[52];
        for (char ch : J.toCharArray()){
            if (ch >= 'a' && ch <= 'z'){
                b[ch - 'a'] = true;
                //b[ch - 'a'] 就是相当于一个游标，寻找后面相同的数！！！
               //System.out.println(b[1]+"zhen");
                //System.out.println(ch);
            }else {
                b[ch -'A' + 26] = true;
                System.out.println(b[1]+"jia");
            }
        }

        int length = 0;
        for (char ch : S.toCharArray()){

            if (ch >= 'a' && ch <= 'z'){
                if (b[ch - 'a']){
                    length++;
                }
            }else {
                if (b[ch -'A' + 26]){
                    length++;
                }
            }

        }
        return length;
    }

    public static void main(String[] args) {
        Add3 a = new Add3();
        System.out.println(a.numJewelsInStones("zZ", "sdzZZDFG"));
    }
}


