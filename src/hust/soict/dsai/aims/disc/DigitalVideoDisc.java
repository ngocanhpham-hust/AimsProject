package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public String getTitle() {return title;}
    public String setTitle(String title) {return this.title = title;}
    public String getCategory() {return category;}
    public String setCategory(String category) {return this.category = category;}
    public String getDirector() {return director;}
    public String setDirector(String director) {return this.director = director;}
    public int getLength() {return length;}
    public int setLength(int length) {return this.length = length;}
    public float getCost() {return cost;}
    public float setCost(float cost) {return this.cost = cost;}
    public int getID() {return id;}
    public int setID(int id) {return this.id = id;}


    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        nbDigitalVideoDiscs++;
        this.setID(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.setID(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.setID(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category,
                            String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.setID(nbDigitalVideoDiscs);
    }
    
    public boolean isMatch(String keyword) {
        return this.title.toLowerCase().contains(keyword.toLowerCase());
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DigitalVideoDisc)) {
            return false;
        }
        DigitalVideoDisc emp;
        emp = (DigitalVideoDisc) obj;
        return (this.title == emp.title);
    }
}



