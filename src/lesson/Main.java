package lesson;

public class Main {
    public static void main(String[] args) {
        Author authorBook1=new Author("Николай","Носов");
        Book book1=new Book("Незнайка на луне",2000);
        book1.setYear(2003);
        System.out.println("Книга: "+book1.getName()+", автор "+authorBook1.getFirstName()+" "+authorBook1.getLastName()
        +", год издания "+book1.getYear()+"г.");

        System.out.println();

        Author authorBook2=new Author("Николай","Гоголь");
        Book book2=new Book("Мертвые души",1965);
        System.out.println("Книга: "+book2.getName()+", автор "+authorBook2.getFirstName()+
                " "+authorBook2.getLastName()+", год издания "+book2.getYear()+"г.");
    }
}
