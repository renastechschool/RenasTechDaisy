package code.day33Map_GC_StringBuffer;

public class C4StringBuffer {
    //String vs StringBuilder vs StringBuffer:
    //
    //		String: Immutable version char sequences
    //
    //		StringBuilder: mutable version char sequences, not synchronized
    //
    //		StringBuffer: mutable version char sequences, synchronized , thread-safe, slow

    public static void main(String[] args) {
        String str="Hello";
         str.concat("world");
        System.out.println(str); //hello

        //string is immutable and we didn't print str.concat("world") or we
        // didn't reassign str=str.concat("world");
        //that is why string object won't be modified it will stay as hello

        String str2=str.concat("world");
        System.out.println(str2);

       /* StringBuilder builder=new StringBuilder("Hello");
        System.out.println(builder);
        builder.append(" world");//StringBuilder: mutable
        System.out.println(builder);//Hello world*/

        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println(buffer);
        buffer.append(" world");//		StringBuffer: mutable
        System.out.println(buffer);

        //another way of to reverse string
        String word="java";
        StringBuilder builder2 = new StringBuilder(word);
        System.out.println("builder2.reverse() = " + builder2.reverse());

    }
}
