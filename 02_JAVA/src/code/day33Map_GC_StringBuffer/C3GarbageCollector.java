package code.day33Map_GC_StringBuffer;

public class C3GarbageCollector {

    @Override
    public void finalize(){
        System.out.println("Object is about to be removed!!");
    }

    public static void main(String[] args) {

        TV myTV =  new TV() ;

        myTV = null ;//de-referencing an object

        new TV() ; //anonymous object is eligible for Garbage collection

        for(int i=0; i<1000 ; i++){
            System.gc();
            System.out.println(i);
        }



        /*
        Unreachable objects become unusable. They can be thought of as garbage.
        An unreachable object should be removed from the heap area.
        The process of removing an unreachable( hence unusable) object from the
        heap memory is called Garbage Collection.
        Garbage Collection is done by the Garbage Collector(GC) which is a program
        which runs in the JVM in the background.

        In Java, there is Automatic Garbage Collection.


        finalization in Java
        --------------------
        Whenever, the GC is about to delete an object from the heap,
        it runs the finalize method. finalize() is inherited from the
        Object class.
        finalize method behaves unpredictably and practically should
        not be used.

        A programmer cannot explicitly force the GC to remove an object.
        But, programmer can hit or request the GC to run,using the below method
        System.gc();
         */

    }
}


class TV{}