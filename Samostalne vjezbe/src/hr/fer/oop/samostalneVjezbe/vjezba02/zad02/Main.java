package hr.fer.oop.samostalneVjezbe.vjezba02.zad02;

public class Main {
    public static void main(String[] args) {
        Blockchain sbc = new Blockchain(100);
        Block firstBlock = new Block(10);
        firstBlock.add("some transaction 1");
        firstBlock.add("some transaction 2");
        sbc.add(firstBlock);
        byte[] firstBlockHash = firstBlock.hash(new byte[]{0});
        System.out.println(sbc.isAltered(0, firstBlockHash)); //false

        Block secondBlock = new Block(10);
        secondBlock.add("some transaction 3");
        secondBlock.add("some transaction 4");
        sbc.add(secondBlock);
        byte[] secondBlockHash = secondBlock.hash(firstBlockHash);
        System.out.println(sbc.isAltered(1, secondBlockHash)); //false

        //check remove transaction in a previous block
        firstBlock.remove(1);
        System.out.println(sbc.isAltered(1, secondBlockHash)); //true
        firstBlock.add("some transaction 2"); //return removed transaction
        System.out.println(sbc.isAltered(1, secondBlockHash)); //false

        //check modification of the block with index blockIndex
        secondBlock.add("some transaction 5");
        System.out.println(sbc.isAltered(1, secondBlockHash)); //true
        secondBlock.remove(2);//remove added transaction
        System.out.println(sbc.isAltered(1, secondBlockHash)); //false

        //check add transaction in a previous block
        firstBlock.add("some additional transaction");
        System.out.println(sbc.isAltered(1, secondBlockHash)); //true

        //check prevHash modification
        byte[] alteredFirstBlockHash = firstBlock.hash(new byte[]{0});
        secondBlock.setPrevHash(alteredFirstBlockHash);
        System.out.println(sbc.isAltered(1, secondBlockHash)); //true


//        Block firstBlock = new Block(4);
//        firstBlock.add("some transaction 1");
//        firstBlock.add("some transaction 2");
//        firstBlock.add("some transaction 3");
//        firstBlock.remove(2);
//        System.out.println(firstBlock.size);
    }
}
