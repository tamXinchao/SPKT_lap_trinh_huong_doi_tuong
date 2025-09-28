package com.lap_trinh_huong_doi_tuong.model;

public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor mặc định
    public Book() {
        this.title = "Chưa có tên";
        this.author = "Chưa rõ tác giả";
        this.price = 0.0;
    }

    // Constructor có tham số
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter & Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // In thông tin sách
    public void XuatThongTin() {
        System.out.println("📖 Tiêu đề: " + title);
        System.out.println("✍️ Tác giả: " + author);
        System.out.println("💲 Giá: " + price + " VND");
        System.out.println("-------------------------");
    }
}
