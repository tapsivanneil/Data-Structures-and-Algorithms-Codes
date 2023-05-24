package LinkedList;

public class LinkedList <E>{

    Node head;
    Node tail;
    int size;

    public LinkedList() { 
        this.head = new Node();//Head Node (Dummy Node)
        this.tail = head;
    }
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.insert(5); 
        list.insert(4); 
        list.insert(3);
        list.insert(2); 
        list.insert(1); 

        list.show();
        //list.clear();
        //list.show();
        System.out.println(list.size());

    }

    public class Node <E> { // basic node components
        E data;
        Node next;
    }

    public void insert (E data){
        Node node = new Node();
        node.data = data; 
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
            size++; // adding the size of the list
        }

    }

    public void insertAtStart(E data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
        size++;  // adding the size of the list
	}
	
	public void insertAt(int index,E data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		else{
		Node n = head;
		for(int i=0;i<index-1;i++)
		{
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
        size++;  // adding the size of the list
		}
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head = head.next;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			//System.out.println("n1 " + n1.data);
			n1 = null;
		}
	}
	
    public void show(){
        
        Node node = head;

        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public int size() {
        return size;
    }

    public void clear() {
        head.next = null;
        size = 0;
    }


}
