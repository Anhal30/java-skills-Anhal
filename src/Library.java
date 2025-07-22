public class Library {
    //lib
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Textbook textbook1 = new Textbook("Physics 101", "John Smith", "Physics");

        System.out.println("Book Info:");
        book1.displayInfo();

        System.out.println("\nTextbook Info:");
        textbook1.displayInfo();
    }
}
