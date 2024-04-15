package CWH_38_61_Oops_part1;

interface food {
    void burger();
    void noodles();
//    private void sweets() {   // Can be default or abstract, not private
//        System.out.println("Special dish :- Gulabjamun");
//    }
    default void juice() {
        System.out.println("JUICE :- It is required with every meal");
    }
}

interface water {
    String[] brand();

    void TypeOfBrands(String company);
}

class menu {
    void order(int number) {
        System.out.println("The person order something and the number assigned was :- " + number);
    }

    void ordercompleted() {
        System.out.println("Order done suceesfully ...... ");
    }
}

class person extends menu implements food, water {
    // since it is implementing so we need to print all the methods with body in this class
    @Override
    public void burger() {
        System.out.println("Burger ordered succesfully ! ");
    }

    @Override
    public void noodles() {
        System.out.println("Noodles ordered succesfully ! ");
    }

    @Override
    public String[] brand() {
        System.out.println("Brands available of water :- ");
        String[] str = {"Bisleri", "Aqua", "Sipheria"};
        return str;
    }

    @Override
    public void TypeOfBrands(String company) {
        System.out.println("The user choosses following brand of comapny :- " + company);
    }

    public void sampleGreets(){
        System.out.println("ThankYou");
    }
}

public class CWH_59_polymorphism_in_interface {
    public static void main(String[] args) {
//     food fr = new food() ; // interface does not have object
        food fr = new person();  //  reference is of food and object created is of person
//     fr.brand(); //  you cannot do this because as a person you asked only for food not for water brand
        fr.juice();
//     fr.sampleGreets; // you cannot do this as you have ref of only food

        person vasu = new person();
        String[] all = vasu.brand();
        for (String item : all) {
            System.out.println(item);
        }
        vasu.TypeOfBrands("Aqua");


        vasu.order(8);
        vasu.ordercompleted();
    }
}
