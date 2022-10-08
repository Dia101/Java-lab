package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Lee Dong Wook", "Lee Dong Wook@.com", 'm');
        Author a2 = new Author("Lee Seung-gi", "Lee Seung-gi@df.com", 'm');
        Author a3 = new Author("Kim Go-eun", "kadj@lam.com", 'w');
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        a3.setEmail("Kim Go-eun@lp.com");
        System.out.println(a3);

    }
}
