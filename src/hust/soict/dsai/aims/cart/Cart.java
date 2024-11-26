package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Cart{
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered >= MAX_NUMBERS_ORDERED){
            System.out.println("Your cart is full");
        }else{
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered += 1;
            System.out.println("The disc has been added.");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == 0){
            System.out.println("Your cart is empty.");
        }else{
            int index = 0;
            for(int i = 0; i < qtyOrdered; i++){
                if (disc.equals(itemsOrdered[i])){
                    itemsOrdered[i] = null;
                    index = i;
                    break;
                }
            }
            for(int j = index + 1; j < qtyOrdered; j++){
                itemsOrdered[j-1] = itemsOrdered[j];
            }
            qtyOrdered -= 1;
            System.out.println("The disc has been removed.");
        }
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
    	int len = dvdList.length;
    	for(int i = 0; i < len; i ++){
    		if (dvdList[i] == null){
    			continue;
    		}else{
    			this.addDigitalVideoDisc(dvdList[i]);
    		}
    	}
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
    	this.addDigitalVideoDisc(dvd1);
    	this.addDigitalVideoDisc(dvd2);
    }

    public float totalCost(){
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++){
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        for(int i = 0; i < qtyOrdered; i++) {
            System.out.println(i + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - "
                    + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " - " + itemsOrdered[i].getCost() + " $");}
        System.out.println("Total cost: "+ this.totalCost() + " $");
        System.out.println("***************************************************");
    }

    public void SID(int id) {
        for(int i = 0; i < qtyOrdered;i++){
            if (itemsOrdered[i].getID() == id){
                System.out.println("Yes, there is a match in the cart.(Via SID (String id))");
                return;
            }
        }
        System.out.println("No disc with this id found");
    }

    public void STT(String id){
        for(int i = 0; i < qtyOrdered;i++){
            if (itemsOrdered[i].getTitle().equals(id)){
                System.out.println("Yes, there is a match in the cart.(Via STT (String id))");
                return;
            }
        }
        System.out.println("No disc with this title found");
    }

    public void searchByTitle(String title) {
        if (itemsOrdered.length == 0) {
            System.out.println("The cart is empty.");
            return;
        }

        boolean matchFound = false;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd != null && dvd.isMatch(title)) {
                System.out.println("Yes, there is a match in the cart.(Via searchByTitle(String title))");
                matchFound = true;
            }
        }

        if (!matchFound) {
            System.out.println("No match found for the title: " + title);
        }
    }


}


