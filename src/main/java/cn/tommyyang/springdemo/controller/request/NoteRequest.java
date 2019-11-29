package cn.tommyyang.springdemo.controller.request;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/10/23 2:51 PM
 * @Software: IntelliJ IDEA
 */
public class NoteRequest {

    private Integer id;

    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "NoteRequest{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
