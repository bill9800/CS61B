package list;

public class LockDList extends DList{
	LockDList(){
		super();
	}

	public void lockNode(DListNode node){
		LockDListNode newNode = (LockDListNode) node;
		newNode.lockNode();
		node = newNode;
	}
	@Override
	protected DListNode newNode(Object item, DListNode prev, DListNode next) {
    	return new LockDListNode(item, prev, next);
  	}
  	@Override
	public void remove(DListNode node){
		if(((LockDListNode) node).isLocked()){
			return;
		}
		super.remove(node);
		size--;
	}
}