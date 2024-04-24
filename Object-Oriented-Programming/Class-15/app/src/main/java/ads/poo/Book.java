package ads.poo;

import java.util.ArrayList;

public class Book {
    private String isbn;
    private String title;
    private Double price;
    private ArrayList<Author> authors;

    public Book(String isbnn, String titulo, Double preco, ArrayList<Author> autores) {
        this.isbn = isbn;
        this.title = titulo;
        this.price = preco;
        this.authors = autores;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean addAuthor(Author author) {
        return this.authors.add(author);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Author author : this.authors) {
            sb.append(author);
        }

        return String.format("ISBN: %s, Título: %s, Preço: %d, autores:n%s", isbn, title, price, authors, sb);
    }
}
