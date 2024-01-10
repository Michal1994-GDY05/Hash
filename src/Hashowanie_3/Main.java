package Hashowanie_3;

import Hashowanie_2.LinkedListHashTable_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        LinkedListHashTable_3 hashTable = new LinkedListHashTable_3(10);

        Random random = new Random();
        int numberOfElements = 10;

        for (int i = 0; i < numberOfElements; i++) {
            int randomElement = random.nextInt(100);
            hashTable.add(randomElement);
        }

        hashTable.itemsDisplayedAfterHashing();
    }
}
