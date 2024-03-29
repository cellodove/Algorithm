package fast_campuse.a05_hash_table;

public class MyHashChaining {

    public Slot[] hashTable;

    public MyHashChaining(Integer size){
        this.hashTable = new Slot[size];
    }

    public class Slot{
        String key;
        Slot next;
        String value;
        Slot(String key, String value){
            this.key = key;
            this.next = null;
            this.value = value;
        }
    }

    public int hashFunc(String key){
        return (int)key.charAt(0) % this.hashTable.length;
    }

    public boolean saveData(String key, String value){
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null){
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];
            while (findSlot != null){
                if (findSlot.key == key){
                    findSlot.value = value;
                    return true;
                }else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        }else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key){
        Integer address = this.hashFunc(key);
        if (this.hashTable[address]!= null){
            Slot findSlot = this.hashTable[address];
            while (findSlot != null){
                if (findSlot.key == key){
                    return findSlot.value;
                }else {
                    findSlot = findSlot.next;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashChaining myHash = new MyHashChaining(20);
        myHash.saveData("kim","01011112222");
        myHash.saveData("kimm","01055556666");
        myHash.saveData("lee","01033334444");
        System.out.println(myHash.getData("kimm"));
    }
}
