package ex3;

import org.junit.jupiter.api.Assertions;

public class HashTableTest {

    @org.junit.jupiter.api.Test
    void size() {
        HashTable hashTable = new HashTable();

        Assertions.assertEquals(16,hashTable.size());


    }
    @org.junit.jupiter.api.Test
    void count() {
        HashTable hashTable = new HashTable();
        Assertions.assertEquals(0,hashTable.count());

        hashTable.put("5","10");
        hashTable.put("16","1");

        hashTable.drop("5");
        hashTable.drop("16");

        Assertions.assertEquals(2,hashTable.count());



    }

    @org.junit.jupiter.api.Test
    void put() {
        HashTable hashTable = new HashTable();
        hashTable.put("5","10");
        hashTable.put("16","1");

        hashTable.put("27","5");
        //hashTable.put("27","3"); // Tercera posición bucket 5

        hashTable.put("6","12");
        //hashTable.put("6","10"); // única key de una tabla vacia
        //hashTable.put("16","2"); // segunda posicion bucket 5



        Assertions.assertEquals("\n" +
                " bucket[5] = [5, 10] -> [16, 1] -> [27, 5]\n" +
                " bucket[6] = [6, 12]",hashTable.toString());
    }


    @org.junit.jupiter.api.Test
    void get() {
        HashTable hashTable = new HashTable();

        hashTable.put("0","0");
        hashTable.put("7","19");
        hashTable.put("18","12");
        hashTable.put("29","85");

        /*bucket[0] = [0, 0]
        bucket[7] = [7, 19] -> [18, 12] -> [29, 85]*/

        // elemento sin colision tabla vacia
        //Assertions.assertEquals("0",hashTable.get("0"));
        // elemento de primera posicion que colisiona dentro de una tabla
        //Assertions.assertEquals("19",hashTable.get("7"));
        // elemento de segunda posicion que colisiona dentro de una tabla
        //Assertions.assertEquals("12",hashTable.get("18"));
        // elemento de primera posicion que colisiona dentro de una tabla
        //Assertions.assertEquals("85",hashTable.get("29"));
        // elemento que no existe
        //Assertions.assertEquals("100",hashTable.get("111"));
    }

    @org.junit.jupiter.api.Test
    void drop() {
        HashTable hashTable = new HashTable();

        hashTable.put("33", "330");
        hashTable.put("90","79");
        hashTable.put("18","112");
        hashTable.put("29","85");

        // sin colision
        // hashTable.drop("33");
        // primera posicion
        //hashTable.drop("90");
        //segunda posicion
        //hashTable.drop("18");
        //tercera posicion
        //hashTable.drop("29");


        /*Assertions.assertEquals("\n" +
                " bucket[0] = [33, 330]\n" +
                " bucket[7] = [90, 79] -> [18, 112] -> [29, 85]",hashTable.toString());*/
    }
}