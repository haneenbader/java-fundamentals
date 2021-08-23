package inheritance;

import java.util.ArrayList;
//delete name and getName and setName (we are inherit it from locationType class )
public class Shop extends LocationType  {
    private String description ;
    private String number="" ;


    public String getDescription() {
        return description;
    }
    public String getNumber() {
        return number;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setNumber(String number) {
        this.number = number;
    }


//shop constructor take name from locationType class
    public Shop(String name , String description , int number) {
        super(name);
        this.description=description;
        for (int i =0 ; i < number; i++){
            this.number+="$";
//            System.out.print(number);
//            System.out.print(this.number);
        }
    }

    @Override
    public String toString() {
        return " Shop{name: "+name+" description "+description+" number "+number+" reviews "+reviews +"}";
    }
}

