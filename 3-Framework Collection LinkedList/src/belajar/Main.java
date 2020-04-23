package belajar;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<>();
        // menambah data
        data.add("Sammi Aldhiyaanto");
        // banyak data
        data.addAll(Arrays.asList("Dandi","Rauf","Abdul"));
        // tambah data di awal
        data.addFirst("SamDeb");
        // tambah data di akhir
        data.addLast("Otong");

        // set index
        data.set(0,"set index ke 0");

        // menampilkan data
        data.get(3);
        // output first data
        data.getFirst();
        data.peek();
        data.peekFirst();
        data.peekLast();
        // push data
        data.push("sam");

        // mengurutkan data
        Collections.sort(data);
        // tampilkan data pertama kemudian hapus/buang
        System.out.println(data.poll());
        // tampilkan data terakhir kemudian hapus
        System.out.println(data.pollLast());
        // Menampilkan data terakhir
        System.out.println(data.getLast());
        System.out.println(data.getFirst());

        // count data
        System.out.println(data.size());

        // foreach data
        data.forEach((show) -> {
            System.out.println(show);
        });

    }
}
