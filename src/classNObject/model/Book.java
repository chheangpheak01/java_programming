package classNObject.model;
import java.util.Date;
import java.util.Set;

public class Book {
    private Integer id;
    private String uuid;
    private String title;
    private String description;
    private Date publishedDate;
    private Set<String> authors;
    public void setBookInfo(Integer id, String bUuid, String bTitle,
                            String bDescription, Date bPublishedDate,
                            Set<String> bAuthors) {
        this.id = id; // using this keyword to identify, it's the class's
        this.uuid = bUuid;
        this.title = bTitle;
        this.description = bDescription;
        this.publishedDate = bPublishedDate;
        this.authors = bAuthors;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", publishedDate=" + publishedDate +
                ", authors=" + authors +
                '}';
    }
}
