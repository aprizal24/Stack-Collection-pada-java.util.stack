/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak3;

import java.util.Stack;

/**
 *
 * @author rian
 */
public class ExampleStack {
    
    public static void main(String[] args){
    Stack st = new Stack();
    
    st.push("Aku");
    st.push("Anak");
    st.push("Indonesia");
    
    System.out.print ("Next : " +st.peek());
    st.push("Raya");
    System.out.println(st.pop());
    st.push("!");
    
    int count = st.search("Aku");
    while(count != -1 && count > 1){
        st.pop();
        count--;
    }
        System.out.println(st.pop());
        System.out.println(st.empty());
    
}

}
