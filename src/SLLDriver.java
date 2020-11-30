public class SLLDriver
{
    public static void main(String[] args)
    {
        SLL mySLL = new SLL();
        mySLL.addNodeToStart(25);
        mySLL.addNodeToStart(44);
        mySLL.addNodeToStart(18);

        mySLL.deleteNodeFromStart();

        mySLL.showList();
        System.out.println("The list length is: " + mySLL.length());
    }
}
