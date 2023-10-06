import java.util.ArrayList;

public class Maxmin2 {
    private int Max;
    private int comparacoes = 0;
    private int Min;
    ArrayList<Integer> tipoVetor = new ArrayList<Integer>();

    public Maxmin2(ArrayList<Integer> tipoVetor){
        this.tipoVetor = tipoVetor;
        Max = tipoVetor.get(0);
        Min = tipoVetor.get(0);
        for (int i = 0; i < tipoVetor.size(); i++){
            if(tipoVetor.get(i) > Max){
                Max = tipoVetor.get(i);
                comparacoes ++;
            }
            else if (tipoVetor.get(i) < Min) {
                Min = tipoVetor.get(i);
                comparacoes ++;
            }

        }
    }

    public void printElements(){
        System.out.println("Máximo:" + Max);
        System.out.println("Mínimo:" + Min);
        System.out.println("Comparações:" + comparacoes);
    }
}
