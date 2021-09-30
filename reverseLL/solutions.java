public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        if(head.next == null) return head;
        ListNode temp = head.next;
        head.next=temp.next;
        temp.next = head;
        return listReverse(temp,temp.next,temp.next.next);
    }
    
    static ListNode listReverse(ListNode lh, ListNode lt, ListNode r){
        if(r==null){
            return lh;
        }
        lt.next = r.next;
        r.next = lh;
        return listReverse(r,lt,lt.next);
    }
