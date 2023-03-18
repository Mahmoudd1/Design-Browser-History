class BrowserHistory {
	ListNode temp;
    public BrowserHistory(String homepage) {
        temp=new ListNode(homepage);
    }
    
    public void visit(String url) {
        temp.next=new ListNode(url,temp);
        temp=temp.next;
    }
    
    public String back(int steps) {
    	while (temp.prev!=null&&steps>0)
    	{
    		steps--;
    		temp=temp.prev;
    	}
    	return temp.value; 
    }
    
    public String forward(int steps) {
    	while (temp.next!=null&&steps>0)
    	{
    		steps--;
    		temp=temp.next;
    	}
    	return temp.value;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */