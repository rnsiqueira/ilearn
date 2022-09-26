package hackerrank.java;

import java.util.Scanner;

public class JavaAbstractClass {

    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();

    }
}

abstract class Book{
   protected String title;
   abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book {

    public MyBook (){
        super();
    }



    void setTitle(String s) {
        super.title = s;
    }
}



