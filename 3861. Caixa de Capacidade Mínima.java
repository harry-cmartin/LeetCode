class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {

        int minimo = -1;
        int capacidadeMax = 999;

        for(int i = 0 ; i < capacity.length  ; i++){

            if(capacity[i] >= itemSize){
            
                if(capacity[i] < capacidadeMax){
                    capacidadeMax = capacity[i];
                   minimo = i;    
                }
            }

        }

        return minimo;
    }
}
