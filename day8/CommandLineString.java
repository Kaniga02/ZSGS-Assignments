/*Get some strings through the command-line prompt and use an array to store and display them.*/
package day8;

public class CommandLineString {
    public static void main(String[] args){
        for(int i=0;i<args.length;i++) {
            System.out.println(args[i]);
        }
    }
}