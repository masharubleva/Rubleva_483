/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VULKAN
 */
import java.util.Scanner;

public class Lab_5 {
public static void main(String args[]){
System.out.print("Введите число от 0 до 9: ");
Scanner n = new Scanner(System.in);
int a = n.nextInt();
while (a<=9){
if (a==9) {
System.out.println("Девять");
}
else if (a==8) {
System.out.println("Восемь");
}
else if (a==7) {
System.out.println("Семь");
}
else if (a==6) {
System.out.println("Шесть");
}
else if (a==5) {
System.out.println("Пять");
}
else if (a==4) {
System.out.println("Четыре");
}
else if (a==3) {
System.out.println("Три");
}
else if (a==2) {
System.out.println("Два");
}
else if (a==1) {
System.out.println("Один");
}
else {
System.out.println("Ноль");
}
break;
}
}
}
