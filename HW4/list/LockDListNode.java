package list;

public class LockDListNode extends DListNode{
	/*
	A locked node can never be removed from its list.
	LockDListNode are not locked when they are first created.
	*/
	private boolean isLocked = false;

	
	LockDListNode(Object i, DListNode p, DListNode n){
		super(i,p,n);
	}

	public void lockNode(){
		isLocked = true; 
	}
	public boolean isLocked(){
		return isLocked;
	}


}