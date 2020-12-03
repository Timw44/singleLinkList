public class SLLDriver
{
    public static void main(String[] args)
    {
        SLL mySLL = new SLL();
        mySLL.addNodeToStart(25);
        mySLL.addNodeToStart(44);
        mySLL.addNodeToStart(18);
        mySLL.addNodeToStart(86);

        mySLL.deleteNodeFromStart();
        mySLL.setData(18, 23);

        mySLL.showList();
        System.out.println("The list length is: " + mySLL.length());
    }
}
