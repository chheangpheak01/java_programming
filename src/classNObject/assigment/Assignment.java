package classNObject.assigment;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Assignment{
    public static void main(String[] args) {
        List<Movie> movies_list = new ArrayList<>();
        Movie mv1 = new Movie();
        mv1.setMovieDetail(202111, UUID.randomUUID().toString(),"Kbone Chive",LocalTime.now(),"(1962)...Madam Dy Saveth 1st film",new ArrayList<>(List.of("First movies")));
        Movie mv2 = new Movie();
        mv2.setMovieDetail(202112, UUID.randomUUID().toString(),"Chet Madai",LocalTime.now(),"(1963) oldest existing Khmer film discovered as of 2009",new ArrayList<>(List.of("Second movies")));
        Movie mv3 = new Movie();
        mv3.setMovieDetail(202113, UUID.randomUUID().toString(),"Apsara",LocalTime.now(),"King Sihanouk's 1st film",new ArrayList<>(List.of("third movies")));
        Movie mv4 = new Movie();
        mv4.setMovieDetail(202114, UUID.randomUUID().toString(),"Sovann Pancha",LocalTime.now(),"(1970)...known as Vann Vannak's only surviving film",new ArrayList<>(List.of("fourth movies")));
        Movie mv5 = new Movie();
        mv5.setMovieDetail(202115, UUID.randomUUID().toString(),"Jeat Satrey",LocalTime.now(),"(1997)...Cambodia's 1st acknowledged TV series and Pich Soporn's last film",new ArrayList<>(List.of("fifth movies")));
        movies_list.add(mv1);
        movies_list.add(mv2);
        movies_list.add(mv3);
        movies_list.add(mv4);
        movies_list.add(mv5);
        for(Movie result : movies_list){
            System.out.println("-> " + result);
        }
    }
}
