class Solution {

    public boolean judgeCircle(String moves) {

        int coord[] = new int[2];

        coord[0] = 0;
        coord[1] = 0;
        
        for(int i = 0; i < moves.length() ; i++){

            char c = moves.charAt(i);
            System.out.println(c);

            switch(c){

                case 'R':
                    coord[0]++; 
                    break; 
                case 'L':
                    coord[0]--; 
                    break;
                case 'U':
                    coord[1]++; 
                    break;
                case 'D':
                    coord[1]--; 
                    break;
                default:
                    break;

            }

        }

        System.out.println("X = " + coord[0] + " y = " + coord[1]);

        if(coord[0] == 0 && coord[1] == 0){
            return true;
        }

        
        return false;
    }
}