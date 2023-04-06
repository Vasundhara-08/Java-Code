package Hashing.HasMap;

import Linked_List.Linked;
import sun.awt.SunHints;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class HashMap_Implementation {

          // just a general type of hashmap
         static class HashMap<K,V>  // generics is declared but here we don't know the type of k and v
         {

             // structure of node of linked list
             private class Node {
                 K key;  // in node of linked list k is key
                 V value; // in node of linked list v is key

                 public Node(K key, V value) // constructor is created
                 {
                     // assigning key and value in the node
                     this.key = key;
                     this.value = value;
                 }
             }

             private int n; // nodes
             private int N; // buckets

            //  private int arr[]; here we created array and type of array
             private LinkedList<Node> buckets[];  // this is hashmap or array of linked list where I store all the nodes and data

             //created a constructor
             public HashMap() {
                 this.N = 4; //length of buckets
                 this.buckets = new LinkedList[4];  //declaration of linked list
                 // here we traverse each array and initialize an empty linked list on each bucket
                 for (int i = 0; i < 4; i++) {
                     this.buckets[i] = new LinkedList<>();  // initializing of linked list
                 }

             }

             // ------------ various operations performed are shown below --------------//
             // 1. Put function
             private int hashFunction(K key)
             {
               int Bucket_index = key.hashCode();
               // if negative value come to convert to positive
                return  Math.abs(Bucket_index) %N;  // value btw 0 to N-1
             }

             private int searchInLL(K key,int Bucket_index)
             {
                 LinkedList<Node> ll =buckets[Bucket_index];
                 int data_index =0;
                 for(int i = 0;i<ll.size();i++)
                 {
                     if(ll.get(i).key == key)
                     {
                         return i;
                     }
                 }
                 return -1;
             }

             private void rehash(){
                 LinkedList<Node> oldBucket[] = buckets;
                 buckets =new LinkedList[N*2];

                 for(int i=0;i<N*2;i++)
                 {
                     buckets[i]= new LinkedList<>();
                 }

                 for(int i=0;i<oldBucket.length;i++)
                 {
                     LinkedList<Node> ll =oldBucket[i];
                     for( int j=0;j<ll.size();j++)
                     {
                         Node node =ll.get(j);
                         put(node.key , node.value);
                     }
                 }
             }

             public void put(K key, V value) {
                 int Bucket_index = hashFunction(key);// bi nikalenge to know that the key already exist or not
                 int data_index = searchInLL(key,Bucket_index); //di=-1 // us index pr stored ll mai key hai ya nhi

                 //if key does not exist then create new node
                 if(data_index == -1){
                     buckets[Bucket_index].add(new Node(key, value));
                     n++;
                 }
                 else{ // keyexist
                     Node data =buckets[Bucket_index].get(data_index);
                     data.value = value;
                 }

                 // chk if lamba is not greater
                 double lambda =(double)n/N;
                 if(lambda >2.0){
                     rehash();
                     //rehashing
                 }
             }

             // 2. Put contains
             public boolean contains(K key, V value) {
                 int Bucket_index = hashFunction(key);// bi nikalenge to know that the key already exist or not
                 int data_index = searchInLL(key,Bucket_index); //di=-1 // us index pr stored ll mai key hai ya nhi

                 //if key does not exist then create new node
                 if(data_index == -1){
                     return false;
                 }
                 else{ // keyexist
                     Node data =buckets[Bucket_index].get(data_index);
                     return true;
                 }

             }

             // 3. remove function
             public V remove(K key) {
                 int Bucket_index = hashFunction(key);// bi nikalenge to know that the key already exist or not
                 int data_index = searchInLL(key,Bucket_index); //di=-1 // us index pr stored ll mai key hai ya nhi

                 //if key does not exist then create new node
                 if(data_index == -1){
                     return null;
                 }
                 else{ // keyexist
                     Node data =buckets[Bucket_index].remove(data_index);
                     n--;
                     return data.value;
                 }
             }


             // 4. get function
             public V get(K key) {
                 int Bucket_index = hashFunction(key);// bi nikalenge to know that the key already exist or not
                 int data_index = searchInLL(key,Bucket_index); //di=-1 // us index pr stored ll mai key hai ya nhi

                 //if key does not exist then create new node
                 if(data_index == -1){
                 return null;
                 }
                 else{ // keyexist
                     Node data =buckets[Bucket_index].get(data_index);
                     return data.value;
                 }
             }

             public ArrayList<K> keyset() {
                 ArrayList<K> keys = new ArrayList<>();
                 for(int i=0;i< buckets.length;i++)
                 {
                     LinkedList<Node> ll = buckets[i];
                     for(int j=0;j<ll.size();j++)
                     {
                         Node node=ll.get(j);
                         keys.add(node.key);
                     }
                 }
                 return keys;
             }

             public boolean isEmpty() {
                 return n == 0;
             }
         }

             public static void main(String[] args) {
                 HashMap<String,Integer> map =new HashMap<>();
                 map.put("India",189);
                 map.put("Turkey",178);
                 map.put("Kerala",190);

                 ArrayList<String> keys =map.keyset();
                 for(int i=0;i< keys.size();i++)
                 {
                     System.out.println(keys.get(i) + " " +map.get(keys.get(i)));
                 }

                 map.remove("India");
                 System.out.println(map.get("India"));
         }

}
