
public class MyLinkedList {

    public Node first;
    private Node last;
    private static int size;

    public void addFirst(Object obj) {
        Node newNode=new Node();
        newNode.setValue(obj);
        if (first == null) {
           first=newNode;
            size = 1;
        }

    }

    public void changeValue(int index, Object obj){
        Node target=getNode(index);
        target.setValue(obj);
    }

    //default add to last
    public void add(Object obj) {
        if (size == 0) {
            addFirst(obj);
            last=first;
        } else {
            Node newNode = new Node();
            newNode.setValue(obj);
            Node preLast=last;
            newNode.setPred(preLast);
            last=newNode;
            preLast.setSucc(last);
            size++;
        }
    }

    public void insert(int index, Object obj) {
        Node target=getNode(index);
        Node newNode=new Node();
        Node oldPred;
        if (index==0){
            first.setValue(obj);
            first.setSucc(target);
            target.setPred(first);
            size++;
        }else if (index<size){
            oldPred=target.getPred();
            oldPred.setSucc(newNode);
            newNode.setValue(obj);
            newNode.setPred(oldPred);
            newNode.setSucc(target);
            target.setPred(newNode);
            size++;
        }else{
            System.out.println("Out of index");
        }
    }

    public void delete(Object obj){
        Node target=getNode(obj);
        Node oldPred;
        Node oldSucc;
        Node temp;
        if (target!=null){
            if (first.getValue().equals(obj)){
                temp=first;
                oldSucc=temp.getSucc();
                first=oldSucc;
                first.setPred(null);
                size--;
            }else if(last.getValue().equals(obj)){
                temp=last;
                oldPred=temp.getPred();
                last=oldPred;
                last.setSucc(null);
                size--;
            }else {
                oldPred=target.getPred();
                oldSucc=target.getSucc();
                oldPred.setSucc(null);
                oldSucc.setPred(null);
                size--;
            }
        }else {
            System.out.println("Cannot find "+obj);
        }


    }

    public Node getNode(int index) {
        if (size != 0) {
            Node target = first;
//            System.out.println(first.getValue().toString());
            for (int i = 0; i < index; i++) {
                target = target.getSucc();
            }
            return target;
        } else {
            System.out.println("List is empty");
        }
        return null;
    }

    public Node getNode(Object obj){
        if (size!=0){
            Node target=first;
            for (int i = 0; i < size; i++){
                if (target.getValue().equals(obj)){
                    return target;
                }else {
                    target=target.getSucc();
                }
            }
            return null;
        }
        return null;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.getValue();
    }

    public void print() {
        String listContent = "[";
        String c = "";
        Node next = first;
        for (int i = 0; i < size; i++) {
            listContent += c + next.getValue().toString();
            c=", ";
            next = next.getSucc();
        }
        System.out.println(listContent + "]");
    }

}
