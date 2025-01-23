import java.util.ArrayList;
import java.util.List;

// 프로토타입 설정 어노테이션
@CreationType(type=ObjectType.Prototype)
public class Book {
    private int bookNo;
    private String name;
    private String author;
    private String type;

    public Book() {
        type = "Book";
    }

    public String getName() {
        return name;
    }

    public int getBookNo() {
        return bookNo;
    }

    public String getAuthor() {
        return author;
    }

    //ObjectType type() default ObjectType.Prototype;
}
