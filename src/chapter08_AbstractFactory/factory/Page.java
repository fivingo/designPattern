package chapter08_AbstractFactory.factory;

import java.io.*;
import java.util.ArrayList;

/** 추상적인 제품: HTML의 Page를 나타내는 클래스 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = "src/chapter08_AbstractFactory/" + title + ".html";
            Writer writer = new FileWriter(filename);

            writer.write(this.makeHTML());
            writer.close();

            System.out.println(filename + " 을 작성했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
