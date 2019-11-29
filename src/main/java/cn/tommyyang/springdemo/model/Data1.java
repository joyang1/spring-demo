package cn.tommyyang.springdemo.model;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/11/21 7:10 PM
 * @Software: IntelliJ IDEA
 */
public class Data1 {

    private int id;

    private int rid;

    private String name;

    private String type;

    public Data1(int rid, String name, String type) {
        this.rid = rid;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
