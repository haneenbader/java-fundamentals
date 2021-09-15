package inheritance;

public class Review {
    private String body;
    private String author;
    private float stars;
    private String movie;

    public Review( String author ,String body , float stars ){
        if (stars > 5){
            this.stars = 5;
        }else if (stars < 0){
            this.stars=0;
        }else{
            this.stars = stars;
        }

        this.author = author;
        this.body = body;

    }


    public Review(String author  ,String body , float stars ,String movie){
        if (stars > 5){
            this.stars = 5;
        }else if (stars < 0){
            this.stars=0;
        }else{
            this.stars = stars;
        }

        this.author = author;
        this.body = body;
        this.movie =movie;
    }

    public String getBody() {
        return body;
    }
    public String getAuthor() {
        return author;
    }
    public float getStars() {
        return stars;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setStars(float stars) {
        this.stars = stars;
    }

    @Override
    //By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code
    public String toString() {
        return author+" "+ "rate :" + stars +" stars " ;
    }
}
