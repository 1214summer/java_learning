package homework.second;

class Book {
    // 书的属性
    private String title;
    private String author;
    private int year;

    // 构造方法
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // 显示书的信息的方法
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
    }
}
public class work1 {
    public static void main(String[] args) {
        // 创建 Book 对象
        Book javaBook = new Book("Java Programming", "John Smith", 2022);

        javaBook.displayInfo();
    }
}
