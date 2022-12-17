/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic1;

/**
 *
 * @author andre
 */
public class StringMethods {
    
    public void doWork() {
        doCharAt();
        doIndexOf();
        doWhitespacesRemoval();
        doIndentation();
        doStringFormatting();
        doStringBuilderMagic();
        doInsert();
        doReplace();
    }
    
    
    private void doCharAt() {
        String s = "humanistic";
        char c1 = s.charAt(0);
        char c2 = s.charAt(5);
        // char c3 = s.charAt(10); THROWS java.lang.StringIndexOutOfBoundsException
        
        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
        
    }
    
    private void doIndexOf() {
        String s = "superawesome";
        int i1 = s.indexOf('w'); // 6
        int i2 = s.indexOf("w"); // 6
        int i3 = s.indexOf('e', 5); // 7
        int i4 = s.indexOf("u", 5); // -1
        
        System.out.println("i1:" + i1);
        System.out.println("i2:" + i2);
        System.out.println("i3:" + i3);
        System.out.println("i4:" + i4);
        
    }
    
    private void doWhitespacesRemoval() {
        
        char whitespace = '\u2000';
        String s = " animal" + whitespace;
        int i1 = s.trim().length();
        int i2 = s.strip().length();
        
        System.out.println("i1_" + i1);
        System.out.println("i2_" + i2);
    }
    
    private void doIndentation() {
        
        var s = """
                o
                 m
                g""";
        System.out.println("s :" + s.length()); // 6
        
        String s2 = s.indent(1);
        System.out.println("s2 :" + s2.length()); // 10
        
    }
    
    private void doStringFormatting() {
        String template = "My name is %s %n I have %d jobs and earning %f EUR.";
        String s1 = String.format(template, "Max", 2, 4902.29);
        String s2 = template.formatted("Max", 2, 4902.29);
        
        System.out.println(s1);
        System.out.println(s2);
    }
    
    private void doStringBuilderMagic() {
        StringBuilder sb = new StringBuilder("begin ");
        sb.append("stop ");
        StringBuilder sb2 = sb.append("end");
        
        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb.equals(sb2));
    }
    
    private void doInsert() {
        StringBuilder sb = new StringBuilder("test");
        sb.insert(0, 99);
        sb.insert(2, "java");
        sb.insert(10, '!');
        System.out.println(sb);
    }
    
    private void doReplace() {
        StringBuilder sb = new StringBuilder("java-professional");
        sb.replace(5, 99, "17");
        System.out.println(sb);
    }
    
    
}
