package Array;


public class NoteCalculatorBasedOnAmount {
    public static void main(String ar[]) {
        int rs[] = {1000, 500, 100, 50, 20, 10, 5, 1};
        int amount = 5015;
        int totalNotes = 0;
        int count = 0;
        for (int i = 0; i < rs.length; i++) {
            count = amount / rs[i];
            System.out.println(rs[i] + "*" + count);
            totalNotes = totalNotes + count;
            amount = amount % rs[i];
        }

    }
}
