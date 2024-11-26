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

}


