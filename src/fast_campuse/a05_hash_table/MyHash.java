package fast_campuse.a05_hash_table;

public class MyHash {

    public Slot[] hashTable;

    public MyHash(Integer size){
        this.hashTable = new Slot[size];
    }

    public class Slot{
        String value;
        Slot(String value){
            this.value = value;
        }
    }

    public int hashFunc(String key){
        return (int)key.charAt(0) % this.hashTable.length;
    }

    public boolean saveData(String key, String value){
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null){
            this.hashTable[address].value = value;
        }else {
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key){
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null){
            return this.hashTable[address].value;
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        MyHash myHash = new MyHash(20);
        myHash.saveData("kim","01011112222");
        myHash.saveData("lee","01033334444");
        System.out.println(myHash.getData("lee"));
        myHash.getData("kim");
    }
}
