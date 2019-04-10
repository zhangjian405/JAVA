package com.company;
class Base {
    public void f() {
        System.out.println("Base:f()");
    }
}
class Sub extends Base{
        public void f(){
            System.out.println("sub:f()");
        }
        public void subf(){
            f();
        }
        public void basef(){
            super.f();
        }
}


public class superDemo {

    public static void main(String[] args) {
	// write your code here
        Sub s=new Sub();

        s.subf();
        s.basef();
    }
}
