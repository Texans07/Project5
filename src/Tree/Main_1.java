/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;



import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Main_1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Tree234 tree = new Tree234();
        
        
        //////////////////////////////////////////////////////////////////////
        
 
   
        // TODO code application logic here
        String FileName = "data.txt";
        
        java.io.File file = new java.io.File(FileName);
        Scanner input=new Scanner(file);
        input.useDelimiter(" +"); //delimitor is one or more spaces
System.out.println(" Here is the Data before being entered into nodes!");
System.out.println();
System.out.println();
while(input.hasNext()){
   //test to see what each word looks like before input into tree 
System.out.println(Arrays.toString(input.next().toLowerCase().trim().split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+")));

    
  //
tree.insert(Arrays.toString(input.next().toLowerCase().trim().replace("-", "").replace("\"", "").replace("'' ", "").replace(".", "").replace(",", "").replace("?", "").replace("] ", "").replace("!","").replace(" ", "").replace("'", "").split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+")));
}

System.out.println();
System.out.println(" Here Are Your Nodes In-Order");
System.out.println();

        tree.displayTree();
        
        
    } 
    
   

   

}
