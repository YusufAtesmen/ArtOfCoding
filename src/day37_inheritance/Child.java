package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    // bir class'i child class yaptigimizda
    //parent class'daki constructor'aulasmasi gerekir
    // bu durumda parent class'taki constructor'in
    // access modifier'i uygun bir modifier yapilmalidir

    Child(){
        super();
        System.out.println("child class parametresiz cons");
    }
    Child(int sayi){

        System.out.println("child class parametreli cons");
    }
    Child(int sayi1,int sayi2){
super(sayi1,sayi2);
        System.out.println("child class 2 parametreli cons");
    }


    public static void main(String[] args) {
        Child child = new Child(5,8);
    }

}
