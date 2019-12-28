public class Node {
    private Object value;
    private Node succ;
    private Node pred;



    public void setValue(Object obj){
        value=obj;

    }

    public void setSucc(Node node){
        succ=node;
    }

    public void setPred(Node node){
        pred=node;
    }

    public Object getValue(){
        return value;
    }

    public Node getSucc(){
        return  succ;
    }

    public Node getPred(){
        return pred;
    }
}
