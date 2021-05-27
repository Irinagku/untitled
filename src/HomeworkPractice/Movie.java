package HomeworkPractice;

public class Movie {
    public static void main(String[] args){
        String movieName = "HOME ALONE";
        String genre = "comedy";
        String duration = "1h 43m";
        String releaseDate = "November16, 1990" ;
        char rating = 'G';
        boolean sequel = true;
        byte rottenTomatoesRating = 67;
        boolean isOnDVD = true;
         System.out.println("Tonight we are streaming " + movieName + ", witch was released on "+ releaseDate + ".");
         System.out.println("This " + genre + " movie got " + rottenTomatoesRating + " rating on Rotten Tomatoes.");
         System.out.println("The rating is \t\t\t : " + rating);
         System.out.println("Movie duration \t\t \t " + duration );
         System.out.println("Is HOME ALONE sequel?\t :" + sequel);
         System.out.println("Is HOME ALONE on DVD? \t :" + isOnDVD );






    }
}
