import java.util.HashMap;
import java.util.Random;

/**
 * Name: sloanwoodberry
 * Lab Name: hashTable
 * Lab Purpose
 * Date: 10/2/18
 * Collaborators: None
 */
public class hashTable {
    public String[] arr;
    public hashTable(int cap){
        arr= new String[cap];
    }
    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value){
        int q=hashCode(key);
        if (!arr[q].equals(null)){
            System.out.println("no");
        }
        else{
            arr[q]=value;
            return true;
        }
        return false;
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){
        int q =hashCode(key);
        return arr[q];
    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key){
       return key.hashCode()%arr.length;
    }


    public static void main(String[] args) {
        //question1
        System.out.println("question 1: ");
        Random r=new Random();
        for(int i=0; i<12;i++){
            int q=r.nextInt(100)+1;
            System.out.println("mod 12: "+q%12);
            System.out.println("mod 13: "+q%13+"\n");
        }
        //if you have factors of the number you are modding by then you will have more
        // repeats then if you just do a prime number
        //when you generate random numbers and mod them by 12 vs 13 then the majority of the time there
        //will be more repeats in indices with 12 (the even number with factors) then with 13 (the prime odd number)

    //question 2
        System.out.println("\n question 2:");
        String a="abcde";
            int aNum= CharSum(a)%599;
        System.out.println(a+" "+aNum);

        String b="fghw";
            int bNum=CharSum(b)%599;
        System.out.println(b+" "+bNum);

        String c="huh";
            int cNum=CharSum(c)%599;
        System.out.println(c+" "+cNum);

        String d="er";
            int dNum=CharSum(d)%599;
        System.out.println(d+" "+dNum);
        //no because if you have words that are close to eachother in terms of letters used then there may be a repeat




    }
    public static int CharSum(String s){
        int q=0;
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            q+=c;
        }
        return q;
    }
}