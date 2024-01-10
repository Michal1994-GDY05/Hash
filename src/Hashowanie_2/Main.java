package Hashowanie_2;

import Hashowanie_1.LinkedListHashTable;

import java.util.Random;

    public class Main {
        public static void main(String[] args) {

            LinkedListHashTable_2 hashTable = new LinkedListHashTable_2(10);

            Random random = new Random();
            int numberOfElements = 10;

            for (int i = 0; i < numberOfElements; i++) {
                int randomElement = random.nextInt(100);
                hashTable.add(randomElement);
            }

            hashTable.itemsDisplayedAfterHashing();
        }
    }
