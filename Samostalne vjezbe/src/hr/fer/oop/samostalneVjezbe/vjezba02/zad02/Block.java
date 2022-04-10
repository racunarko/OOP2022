package hr.fer.oop.samostalneVjezbe.vjezba02.zad02;

class Block {
    private byte[] prevHash;
    private String[] transactions;
    int size;
    Hasher hasher;

    public Block(int maxTransactions) {
        this(maxTransactions, new SHAHasher());
    }

    public Block(int maxTransactions, Hasher hasher) {
        this.size = 0;
        this.transactions = new String[maxTransactions];
        this.hasher = hasher;
    }

    public int add(String transaction) {
        transactions[size] = transaction;
        size++;
        return size - 1;
    }

    // remove a transaction
    public void remove(int index) {
        for(int i = index ; i < size; i++){
            if(i + 1 == size) {
                transactions[i] = null;
            }else {
                transactions[i] = transactions[i + 1];
            }
        }
        size--;
    }

    public byte[] getPrevHash() {
        return prevHash;
    }

    public void setPrevHash(byte[] prevHash) {
        this.prevHash = prevHash;
    }

    public byte[] hash(byte[] prevHash) {
        return hasher.hash(prevHash, this.transactions);
    }
}
