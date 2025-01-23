// 프로토타입 설정 어노테이션
@CreationType(type=ObjectType.Prototype)
public class Book {
    private int bookNo;
    private String name;
    private String author;


    public String getName() {
        return name;
    }

    public int getBookNo() {
        return bookNo;
    }

    public String getAuthor() {
        return author;
    }
}
