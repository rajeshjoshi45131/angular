
class node {
    int val;
    node next;

    node(int val){
        this.val = val;
    }
}





class test {
    public static void main(String[] args) {
        

 // here I added the values to the linked list 
        node head = new node(1);
        head.next = new node(24);
        head.next.next = new node(37);
        head.next.next.next= new node(45);
        head.next.next.next.next= new node(55);
        head.next.next.next.next.next= new node(64);
        head.next.next.next.next.next.next= new node(74);
        head.next.next.next.next.next.next.next= new node(85);

 
        node prev= null;
        node nex=head.next;
        node curNode=head;

        while (nex!=null) {
            curNode.next=prev;
            prev=curNode;
            curNode=nex;
            nex=nex.next;
        }
            head=curNode;


//  this used to print the linked list 
        node rev = head;
        while (rev!=null) {
            System.out.println(rev.val);
            rev = rev.next;

        }



    }
}