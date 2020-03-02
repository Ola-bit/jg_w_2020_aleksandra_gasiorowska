package Homework_5;

//Ok
public class BookTest {

    public static void main(String[] args) {

        Book b1 = new Book ("J. K. Rowling", "Harry Potter and the Sorcerers' Stone", 289);
        Book b2 = new Book ("J. K. Rowling", "Harry Potter and the Order of Phoenix", 589);
        Book b3 = new Book ("Snow", "Head First Java", 841);
        Book b4 = new Book ("J. K. Rowling" , "Harry Potter and the Sorcerers' Stone", 289);

        System.out.println("The library currently holds books by " + b1.getAuthor() + " and " + b3.getAuthor() + ".");

        System.out.println("is b1 same as b1? " + b1.equals(b1));
        System.out.println("is b2 same as b1? " + b2.equals(b1));
        System.out.println("is b3 same as b1? " + b3.equals(b1));
        System.out.println("is b4 same as b1? " + b4.equals(b1));
        System.out.println();


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);


    }
}
