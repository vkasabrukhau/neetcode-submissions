class BrowserNode {
    String val;
    BrowserNode next, prev;
    public BrowserNode(String val){
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class BrowserHistory {
    private BrowserNode current;

    public BrowserHistory(String homepage){
        current = new BrowserNode(homepage);
    }
    
    public void visit(String url) {
        BrowserNode newSite = new BrowserNode(url);
        newSite.prev = current;
        current.next = newSite;
        current = newSite;
    }
    
    public String back(int steps) {
        while(current.prev != null && steps > 0){
            current = current.prev;
            steps--;
        }
        return current.val;
    }
    
    public String forward(int steps) {
        while(current.next != null && steps > 0){
            current = current.next;
            steps--;
        }
        return current.val;
    }
}