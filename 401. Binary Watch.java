class Solution {



    public List<String> readBinaryWatch(int turnedOn) {

        int contador = 0;
        int horas = 0;
        int minutos = 0;
        int result = 0;
        int bitshoras = 0;
        int bitsminutos = 0;

        List<String> teste = new ArrayList<>();

        if(turnedOn == 10 || turnedOn == 9 ){

            return  List.of();
        }
        

        while(contador <= 720 ){

            

            bitshoras = Integer.bitCount(horas);
            bitsminutos = Integer.bitCount(minutos);
            
            result = bitshoras + bitsminutos ;
            
            if(result == turnedOn){
                
                String horario = String.format("%d:%02d", horas ,minutos);
                teste.add(horario);
                
            }

            minutos++;

            if(minutos == 60){

                horas++;
                minutos = 0;
            }

            if(horas > 11){

                break;
            }

            contador++;

        }

        

        return teste;

    }
}

