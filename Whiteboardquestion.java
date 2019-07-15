public class Whiteboardquestion{
    public static void main(String[] args) {
        Whiteboardquestion newThing = new Whiteboardquestion();
        newThing.testFunction(87);
    }

    public void testFunction(int printNumber){
        for (int i = 0; i < printNumber; i++) {
            if ( i % 15 == 0 ){
                System.out.println(i + "Dog and Cat");
            } else if ( i % 10 == 0 ) {
                System.out.println(i + "cat");
            } else if ( i % 5 == 0 ){
                System.out.println(i + "Dog");
            }
        }
}
}

