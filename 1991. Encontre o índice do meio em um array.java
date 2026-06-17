class Solution {
    public int findMiddleIndex(int[] nums) {

        

        int contador = 0;
        int primeiraParte = 0;
        int segundaParte = 0;
        

        for(int i = 0; i < nums.length ; i++){

            while(contador < nums.length){

                if(contador < i){

                    primeiraParte += nums[contador];

                }else if(contador > i){

                    segundaParte += nums[contador];
                }


                contador++;
            }
            
            if(primeiraParte == segundaParte){

                return i;
            }

            System.out.printf("Valor : " + primeiraParte + " " );
            System.out.printf("Valor : " + segundaParte + " ");
            primeiraParte = 0;
            segundaParte = 0;
            contador = 0;
        }

        return -1;
        
    }
}