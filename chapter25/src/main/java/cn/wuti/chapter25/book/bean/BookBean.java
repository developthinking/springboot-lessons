package cn.wuti.chapter25.book.bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/11/8.
 */
@Entity
@Table(name = "book")
public class BookBean {

    @Id
    @Column(name = "b_id")
    @GeneratedValue
    private Long id;

    @Column(name = "b_name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
