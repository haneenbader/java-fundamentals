package inheritance;

//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

import java.util.ArrayList;
//(make name , stars ,reviews as public insted of private to able accsess the child class )
public abstract class LocationType {
    public String name ;
    public double stars;

    public LocationType(String name) {
        this.name =name ;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setStars(double stars) {
        this.stars = stars;
    }


//calculate stars and add reviews
    private float starsTotal=0;
    private int reviewsTotal=0;
    public ArrayList<Review> reviews= new ArrayList<Review>();

    public ArrayList<Review> getReviews() {
        return reviews;
    }
    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview( String author ,String body , float stars){
        // inherit from review class

        Review newReview = new Review(author , body,stars);
        this.starsTotal+= newReview.getStars();
        this.reviewsTotal+=1;
        this.stars = this.starsTotal/this.reviewsTotal;

        this.reviews.add(newReview);

    }


}
