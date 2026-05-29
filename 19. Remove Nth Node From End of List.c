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


struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    
    int tam = tamanho(head);
    //printf("%i", tam);

    int pos = (tam - n);

    if (pos == 0) {
        struct ListNode *aux = head;
        head = head->next;
        free(aux);
        return head;
    }

    struct ListNode *atual = head; 
    for(int i = 1; i < pos; i++){
        //printf("INTERACAO : %i valor: %i\n", i , head->val);
        atual = atual->next;
        //printf("valor: %i\n", head->val);
        

    }

    //int valor = head->next->val;
    struct ListNode *aux = atual->next;
    //printf("%i\n", aux->val);

    atual->next = aux->next;
    return head;



}