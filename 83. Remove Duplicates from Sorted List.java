/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {


        //ja esta ordenado 
        
            if(head == null || head.next == null ){  
                    return head;   
            }

            ListNode actual = head; 
            ListNode prox = head.next;
               
            
            while(prox != null){
                
                
                    
                if(actual.val == prox.val ){
                    
                    actual.next = prox.next;

                    prox = actual.next;

                }else{

                    actual = prox;
                    prox = actual.next;
                }

            }

            
        
        

        return head;
    }
}