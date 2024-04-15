package Linked_List;

public class Structure {
   int value;
   Structure next;
   Structure()
   {

   }
   Structure(int val){
       this.value=val;
   }
   Structure(int value,Structure next){
       this.value = value;
       this.next = next;
   }


}
