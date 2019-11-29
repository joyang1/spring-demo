package cn.tommyyang.springdemo.model;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/11/1 7:15 PM
 * @Software: IntelliJ IDEA
 */
public class Demo {

    private Integer Id;

    private String name;

    private String author;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
