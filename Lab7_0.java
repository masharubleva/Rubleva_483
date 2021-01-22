/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VULKAN
 */
public class Lab7_0 {
  public int f1=111;
protected int f2=222;
int f3=333;
private int f4=444;
public int getF4(){
return this.f4;
}
public void method1(){
System.out.format("Переменные класса Lab7_0: %d, %d, %d, %d \n",this.f1,this.f2,this.f3,getF4());
}
public static void main(String[] args)
{
new Lab7_0 ().method1();
new class3().method1();
new class2().method1();
}
}
class class2 extends class3{
private int c=777;
protected int d=666;
public void method1(){
System.out.format("Переменные класса class2: %d, %d \n",this.c,this.d);
System.out.format("Наследуемые переменные из класса class3 классом class2: %d, %d \n",this.a,this.b);
System.out.format("Наследуемые переменные из класса Lab7_0 классом class2: %d, %d, %d, %d \n",this.f1,this.f2,this.f3,getF4());
}
}
class class3 extends Lab7_0  {
int a=0;
public int b=1;
public void method1(){
System.out.format("Переменные класса class3: %d, %d \n",this.a,this.b);
System.out.format("Наследуемые переменные из класса Lab7_0 классом class3: %d, %d, %d, %d \n",this.f1,this.f2,this.f3,getF4());
}
} 

  

