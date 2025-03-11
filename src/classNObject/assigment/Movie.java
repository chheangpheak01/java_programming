package classNObject.assigment;
import java.time.LocalTime;
import java.util.List;

public class Movie{
    private Integer id;
    private String uuid;
    private String title;
    private LocalTime time;
    private String description;
    private List<String> category;

    public void setMovieDetail(Integer id,String uuid,String title,LocalTime time,String description,List<String> category){
        this.id = id;
        this.uuid = uuid;
        this.title = title;
        this.time = time;
        this.description = description;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", title='" + title + '\'' +
                ", time=" + time +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
