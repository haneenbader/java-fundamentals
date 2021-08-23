package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends LocationType {
    //Implement a Restaurant constructor.(with parameters , getter ,setter )
    private float price ;
    public  Restaurant(String name , float price){
        super(name);
        this.price = price ;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    //feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes
    //By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code
    public String toString() {
            return "Restaurant Name:"+name+",stars:"+stars+", Price Category:"+price+"$"+", reviews="+reviews;
        }

}
