package com.nattakarn.Hotel_Diploma.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "page")

public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "slug")
    private String slug;
    @Column(name = "content")
    private String content;
    @Column(name = "sorting")
    private int sorting;

//    public Page(){
//
//    }
//
//    public Page(int id, String title, String slug, String content, int sorting) {
//        this.id = id;
//        this.title = title;
//        this.slug = slug;
//        this.content = content;
//        this.sorting = sorting;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getSlug() {
//        return slug;
//    }
//
//    public void setSlug(String slug) {
//        this.slug = slug;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public int getSorting() {
//        return sorting;
//    }
//
//    public void setSorting(int sorting) {
//        this.sorting = sorting;
//    }
//
//    @Override
//    public String toString() {
//        return "Page{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", slug='" + slug + '\'' +
//                ", content='" + content + '\'' +
//                ", sorting=" + sorting +
//                '}';
//    }
}
