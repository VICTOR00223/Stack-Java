public class Stack
{
    private Node head = null;

    public void insert(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    public void remove()
    {
        if(head != null)
        {
            head = head.next;
        }
        else
        {
            System.out.println("Stack is empty.");
        }
    }

    public void print()
    {
        Node n = head;
        if(n == null)
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            while (n != null)
            {
                System.out.println(n.key+" ");
                n = n.next;
            }
        }
    }

    public boolean exist(int data)
    {
        if(head == null)
        {
            return false;
        }
        else
        {
            Node n = head;
            if(n.key == data)
            {
                return true;
            }
            else
            {
                while(n.next != null && n.next.key != data)
                {
                    n = n.next;
                }
                if(n.next == null)
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
        }
    }
}
