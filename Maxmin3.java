import java.util.ArrayList;

public class Maxmin3 {
    private int Max;
    private int comparacoes = 0;
    private int Min;
    ArrayList<Integer> tipoVetor = new ArrayList<Integer>();

    public Maxmin3(ArrayList<Integer> tipoVetor){
        this.tipoVetor = tipoVetor;
        Min = tipoVetor.get(0);
        Max = tipoVetor.get(0);

        if(tipoVetor.size()%2 > 0){
            tipoVetor.add(tipoVetor.get(tipoVetor.size() - 1));
        }
        for (int i = 0; i < tipoVetor.size(); i = i + 2) {
            if(tipoVetor.get(i) > tipoVetor.get(i+1)){
                if(tipoVetor.get(i) > Max){
                    Max = tipoVetor.get(i);
                }
                if(tipoVetor.get(i+1) < Min){
                    Min = tipoVetor.get(i+1);
                }
                comparacoes++;
            }
            else if(tipoVetor.get(i) < tipoVetor.get(i+1)){
                if(tipoVetor.get(i+1) > Max){
                    Max = tipoVetor.get(i+1);
                }
                if(tipoVetor.get(i) < Min){
                    Min = tipoVetor.get(i);
                }
                comparacoes++;
            }
            else{
                if(tipoVetor.get(i+1) > Max){
                    Max = tipoVetor.get(i+1);
                }
                else if(tipoVetor.get(i+1)<Min){
                    Min = tipoVetor.get(i+1);
                }
                else if(tipoVetor.get(i) > Max){
                    Max = tipoVetor.get(i);
                }
                else if(tipoVetor.get(i) < Min){
                    Min = tipoVetor.get(i);
                }
                comparacoes++;
            }
        }

    }

    public void printElements(){
        System.out.println("Máximo:" + Max);
        System.out.println("Mínimo:" + Min);
        System.out.println("Repetições:" + comparacoes);
    }

}
