
class ListNode {
	String value;
	ListNode next;
	ListNode prev;
	ListNode(String value) {
		this.value=value;
	}
	ListNode(String value,ListNode next,ListNode prev) {
		this.value=value;
		this.next=next;
		this.prev=prev;
	}
	ListNode(String value,ListNode prev) {
		this.value=value;
		this.next=null;
		this.prev=prev;
	}
}
