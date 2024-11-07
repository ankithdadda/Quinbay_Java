import java.util.*;

public class bitSet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bitLen = scan.nextInt();
        int operation_count = scan.nextInt();

        BitSet set1 = new BitSet(bitLen);
        BitSet set2 = new BitSet(bitLen);

        for (int i = 0; i < operation_count; i++) {
            scan.nextLine();
            String opreation = scan.next().trim();
            int opr1 = scan.nextInt();
            int opr2 = scan.nextInt();

            switch (opreation) {
            case "AND":
                if (opr1 == 1)
                    set1.and(set2);
                else
                    set2.and(set1);
                break;
            case "OR":
                if (opr1 == 1)
                    set1.or(set2);
                else
                    set2.or(set1);
                break;
            case "XOR":
                if (opr1 == 1)
                    set1.xor(set2);
                else
                    set2.xor(set1);
                break;
            case "FLIP":
                if (opr1 == 1)
                    set1.flip(opr2);
                else
                    set2.flip(opr2);
                break;
            case "SET":
                if (opr1 == 1)
                    set1.set(opr2);
                else
                    set2.set(opr2);
                break;
            }
            System.out.println(set1.cardinality() + " " + set2.cardinality());
        }
        scan.close();
    }
}
