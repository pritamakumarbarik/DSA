package com.dsap.sys;

import java.util.BitSet;

//START
public class BloomFilter {

    private final BitSet bitSet;
    private final int bitSetSize;
    private final int numHashFunctions;

    public BloomFilter(int size, int numHashFunctions) {
        this.bitSetSize = size;
        this.numHashFunctions = numHashFunctions;
        this.bitSet = new BitSet(size);
    }

    /**
     * Simulates multiple hash functions using the Double Hashing technique.
     * Formula: (hash1 + i * hash2) % size
     */
    private int[] getHashIndices(String item) {
        int[] indices = new int[numHashFunctions];

        // Base hash 1: Standard Java hashCodee
        int hash1 = item.hashCode();

        // Base hash 2: A secondary hash (e.g., hash of reversed` string or a subset)
        // In production, you'd use MurmurHash3, but this works for pure Java demonstration.
        int hash2 = (item + "_salt").hashCode();

        for (int i = 0; i < numHashFunctions; i++) {
            // Calculate the combined hash and ensure it is positive....
            int combinedHash = Math.abs((hash1 + (i * hash2)) % bitSetSize);
            indices[i] = combinedHash;
        }
        return indices;
    }

    public void add(String item) {
        int[] indices = getHashIndices(item);
        for (int index : indices) {
            bitSet.set(index);
        }
    }

    public boolean mightContain(String item) {
        int[] indices = getHashIndices(item);
        for (int index : indices) {
            // If even a single bit is false, the item was DEFINITELY NEVER added.
            if (!bitSet.get(index)) {
                return false;
            }
        }
        // If all bits are true, it is PROBABLY there (could be a false positive).
        return true;
    }

    public static void main(String[] args) {
        // Create a Bloom filter with a size of 1000 bits and 3 hash functions
        BloomFilter filter = new BloomFilter(1000, 3);

        filter.add("java");
        filter.add("spring");
        filter.add("react");

        System.out.println("Contains 'java'? " + filter.mightContain("java"));       // true
        System.out.println("Contains 'spring'? " + filter.mightContain("spring"));   // true

        System.out.println("Contains 'python'? " + filter.mightContain("python"));   // false (definitely not)
        System.out.println("Contains 'angular'? " + filter.mightContain("angular")); // false (definitely not)
    }
}
//END