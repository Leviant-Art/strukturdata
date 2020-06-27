package contohlinkedlist;

import java.util.*;

public class ContohLinkedList {

    public static void main(String[] args) {
        // Membuat objek yang bernama daftar pada class LinkedList
        LinkedList<String> daftar = new LinkedList<String>();
        
        // Menambahkan elemen pada linked list
        daftar.add("A");
        daftar.add("B");
        daftar.addLast("C");
        daftar.addFirst("D");
        daftar.add(3,"B");
        daftar.add("F");
        daftar.add("G");
            
        System.out.println("Linked list: " + daftar);
        
        // Menghapus elemen dari linked list
        daftar.remove("B");
        daftar.remove(3);
        daftar.removeFirst();
        daftar.removeLast();
        
        System.out.println("Linked list setelah dihapus: " + daftar);
        
        //menemukan elemen pada linked list
        boolean status = daftar.contains("E");
        
        if(status)
            System.out.println("Di List terdapat element 'E'");
        else
            System.out.println("Di List tidak terdapat elemen 'E'");
        
        // ukuran dari element pada linked list
        int size = daftar.size();
        
        System.out.println("Ukuran dari linked list = " + size);
        
        // Menunjukan dan memberi nilai elemen dari linked list
        Object element = daftar.get(2);
        
        System.out.println("elemen yang di tunjuk oleh get() : " +element);
        
        daftar.set(2, "Y");
        
        System.out.println("Linked list pasca perubahan: " + daftar);
    }
    
}
