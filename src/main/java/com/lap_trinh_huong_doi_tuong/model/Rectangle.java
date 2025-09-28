package com.lap_trinh_huong_doi_tuong.model;

import java.util.Scanner;

public class Rectangle {
    public float width;
    public float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle() {}

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public float getArea() {
        return width * height;
    }
    public float getPerimeter() {
        return (width + height) * 2;
    }

    public static Rectangle NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.print("👉 Nhập chiều dài: ");
        rect.setWidth(sc.nextFloat());

        System.out.print("👉 Nhập chiều rộng: ");
        rect.setHeight(sc.nextFloat());

        return rect;
    }
    public void XuatThongTin() {
        System.out.println("Chiều dài: " + width);
        System.out.println("Chiều rộng: " + height);
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("Diện tích: " + getArea());
    }
}
