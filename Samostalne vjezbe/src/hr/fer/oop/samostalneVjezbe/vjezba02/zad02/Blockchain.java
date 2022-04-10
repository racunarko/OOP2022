package hr.fer.oop.samostalneVjezbe.vjezba02.zad02;

import java.util.Arrays;

class Blockchain {
    private Block[] blocks;     // block array
    private int size;           // size of the array

    // create a blockhain object of size maxBlocks
    public Blockchain(int maxBlocks) {
        this.blocks = new Block[maxBlocks];
        this.size = 0;
    }

    // add a block to the chain
    public int add(Block newBlock) {
        blocks[size] = newBlock;
        if (size == 0) {
            blocks[size].setPrevHash(new byte[]{0});
        } else {
            blocks[size].setPrevHash(blocks[size - 1].hash(blocks[size - 1].getPrevHash()));
        }
        size++;
        return size - 1; // return index value
    }

    // get a block from a given index
    public Block get(int index) {
        return blocks[index];
    }

    public boolean isAltered(int blockIndex, byte[] expectedHash) {
        byte[] hash = get(0).getPrevHash();
        for (int i = 0; i <= blockIndex; i++) {
            hash = get(i).hash(hash);
        }
        return !Arrays.equals(hash, expectedHash);
    }

}
