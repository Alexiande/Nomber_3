public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println("по умолчанию:\n");
        System.out.println(b1);
        Book b2 = new Book("Жить не жить", "Кто-то");
        System.out.println("Книга, созданная конструктором с частичной инициализацией:");
        System.out.println(b2);
        Book b3 = new Book("Длинное название", "Известный Автор", "Большое издательство", 15000, 1865);
        System.out.println("Книга, созданная консруктором со всеми полями:");
        System.out.println(b3);
        try{
            System.out.println(" изменить количество экземпляров на отрицательное число:");
            b3.setEdition(-12);
        }catch (IllegalArgumentException e){
            System.out.println(e.toString());
        }
        System.out.println(" экземпляры на 0:");
        b3.setEdition(0);
        System.out.println(b3);
        System.out.println("Publisher = " + b3.get_pub());
        System.out.println("Publish Year = " + b3.get_year());
        System.out.println("экземпляры на 100:");
        b3.setEdition(100);
        System.out.println(b3);
        System.out.println("Publisher = " + b3.get_pub());
        System.out.println("Publish Year = " + b3.get_year());
    }
}