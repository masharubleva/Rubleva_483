/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VULKAN
 */
public class Lab3_1 {
    static int b=2;

static void stepen (int n) {

int result =1;

for (int i=0; i<n; i++) {

result*=b;

}

System.out.println(result);

}

public static void main (String[] args) {

stepen (5);
}
}