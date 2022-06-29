package kr.re.kitri.minisns.model;


public class Article {
    private long id;
    private String title;
    private long author;
    private String body;

    public Article() {}

    public Article(long id, String title, long author, String body) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getAuthor() {
        return author;
    }

    public void setAuthor(long author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", body='" + body + '\'' +
                '}';
    }
}
