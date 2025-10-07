package book;

public class app {
    public static void main(String[] args) {
        Book book1 = new Book("Гарри Поттер и философский камень","Джон Роулинг",1997,"978-1-4088-4565-2");
        Book book2 = new Book("Мастер и Маргарита","Михаил Булгаков",1967,"978-5-9949-0019-8");
        System.out.println(book1+"\n"+book2);
    }
}
