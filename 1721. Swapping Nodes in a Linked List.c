/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

int tamanho(struct ListNode* head){

    int cont = 0;
    struct ListNode *atual = head;

    while(atual != NULL){
        cont++;
        atual = atual->next;
    }

    return cont;

}


void intSwap (int *pa, int *pb){
    int temp = *pa;
    *pa = *pb;
    *pb = temp;
}

struct ListNode* swapNodes(struct ListNode* head, int k) {

    int tam = tamanho(head);
    int pos = (tam - k);


    if(tam == 1){
        return head;
    }

    struct ListNode *primeiro = head;

    for(int i = 1; i < k ; i++){

        primeiro = primeiro->next;
    }

    struct ListNode *aux1 = primeiro;
    //printf("%d", aux1->val);
    primeiro = head;

    for(int y = 1; y <= pos; y++){

        primeiro = primeiro->next;

    }

    struct ListNode *aux2 = primeiro;
    //printf("%d", aux2->val);

    intSwap(&aux1->val, &aux2->val);


    return head;

    
}