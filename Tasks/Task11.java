package Tasks;

public class Task11 {

    public static class Book {
        String title;
        String author;
        int yearPublished;
        double price;

        public Book(String title, String author, int yearPublished, double price) {
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Title: \"" + title + "\""
                    + "\nAuthor: \"" + author + "\""
                    + "\nYear Published: " + yearPublished
                    + "\nPrice: $" + price;
        }

    }

    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 39.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 39.99);
        System.out.println("Book 1:");
        System.out.println(book1);

        System.out.println("\nBook 2:");
        System.out.println(book2);

        System.out.println("\nBook 3:");
        System.out.println(book3);
    }

}
