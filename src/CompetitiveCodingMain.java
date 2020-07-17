import LinkedList.LinkedList;
import LinkedList.RemoveKthNodeFromEnd;



public class CompetitiveCodingMain {

    public static void main(String args[]) {
        RemoveKthNodeFromEnd removeKthNodeFromEnd = new RemoveKthNodeFromEnd();
        //preparing a linkedlist
        LinkedList LinkedList = new LinkedList(0);
        LinkedList.addNewNode(new LinkedList(1)).addNewNode(new LinkedList(1))
                .addNewNode(new LinkedList(3)).addNewNode(new LinkedList(4)).addNewNode(new LinkedList(5))
        .addNewNode(new LinkedList(6))
        .addNewNode(new LinkedList(7))
        .addNewNode(new LinkedList(8))
        .addNewNode(new LinkedList(9))
        ;

        removeKthNodeFromEnd.removeNodeFromEnd(LinkedList,10);


    }


}
