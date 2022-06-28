package org.johnwick182.hashtable.challenges;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    Creating and searching contact list with hashmap
    https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 */
public class CreateContactList {

    public static void main(String []argh){
        Map<String, Integer> contactList = new HashMap<>();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            contactList.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();

            if (contactList.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s+"="+contactList.get(s));
            }
            // Write code here
        }
        in.close();
    }

}
