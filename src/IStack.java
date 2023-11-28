public interface IStack {
	
	int getsize();
	boolean IsEmpty();
	boolean IsFull();
	void push(Object elm)throws Exception;
	Object top();
	Object pop();
}
