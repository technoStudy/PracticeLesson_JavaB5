package practiseLessons.arrayLists2D;

import java.util.ArrayList;

public class Java_2D_ArrayList_Kullanim_Ornekleri {
    public static void main(String[] args) {
        // 2D ArrayList oluşturma
        ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<>();

        // Satır ekleme
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        twoDArrayList.add(row1);

        // Satır ekleme
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        twoDArrayList.add(row2);

        // Satır ekleme
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);
        twoDArrayList.add(row3);

        // Eleman okuma
        int element = twoDArrayList.get(1).get(2);
        System.out.println("Element at (1, 2): " + element);

        // Eleman güncelleme
        twoDArrayList.get(0).set(1, 10);

        // Satır ekleme
        ArrayList<Integer> newRow = new ArrayList<>();
        newRow.add(11);
        newRow.add(12);
        newRow.add(13);
        twoDArrayList.add(newRow);

        // Sütun ekleme
        for (ArrayList<Integer> row : twoDArrayList) {
            row.add(14);
        }

        // Satır silme
        twoDArrayList.remove(2);

        // Sütun silme
        for (ArrayList<Integer> row : twoDArrayList) {
            row.remove(1);
        }

        // 2D ArrayList'i yazdırma
        System.out.println("2D ArrayList:");
        for (ArrayList<Integer> row : twoDArrayList) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}