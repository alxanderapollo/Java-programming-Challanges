
public abstract class BoxList {
		
	private BoxList first;
	private BoxList last;
	private int length;
	Box data;

	public BoxList() {
		BoxNode n = new BoxNode(null);
		this.first = null;
		this.last = null;
		this.length = 0;
	}
	public void append(Box data) {
		BoxNode n = new BoxNode(data);		
		n.next =n;
		length++;
	}

}
