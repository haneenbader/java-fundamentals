package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    //Implement a Restaurant constructor.(with parameters , getter ,setter )
    private String name ;
    private float price ;
    private double stars;
    public  Restaurant(String name , float price){
        this.name = name ;
        this.price = price ;

    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }


//-----------------------------------------------------------
    private float starsTotal=0;
    private int reviewsTotal=0;
    private ArrayList<Review> reviews= new ArrayList<Review>();

    public ArrayList<Review> getReviews() {
        return reviews;
    }
    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(String author , float stars){
        // inherit from review class
    Review newReview = new Review(author , stars);
    this.starsTotal+= newReview.getStars();
    this.reviewsTotal+=1;
    this.stars = this.starsTotal/this.reviewsTotal;

    this.reviews.add(newReview);

}
    @Override
    //feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes
    //By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code
    public String toString() {
            return "Restaurant Name:"+name+",stars:"+stars+", Price Category:"+price+"$"+", reviews="+reviews;
        }


}
