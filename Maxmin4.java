import java.util.ArrayList;

public class Maxmin4 {
    private int max,min;
    private int max1,max2,min1,min2;
    private int meio;
    private int lsup,linf;
    private ArrayList<Integer> tipoVetor;

    public Maxmin4(int linf, int lsup, int max, int min, ArrayList<Integer> tipoVetor){
        this.linf = linf;
        this.lsup = lsup;
        this.max = max;
        this.min = min;
        this.tipoVetor = tipoVetor;

        maxmin4(linf, lsup, max, min, tipoVetor);
    }

    private void maxmin4(int linf, int lsup, int max, int min, ArrayList<Integer> tipoVetor){
        if(lsup - linf <= 1){
            if(tipoVetor.get(linf-1) < tipoVetor.get(lsup-1)){
                max = tipoVetor.get(lsup-1);
                min = tipoVetor.get(linf-1);
            }
            else{
                max = tipoVetor.get(linf-1);
                min = tipoVetor.get(lsup-1);
            }
            return;
        }

        meio = (linf+lsup)/2;
        maxmin4(linf,meio,max1, min1, tipoVetor);
        maxmin4(meio+1, lsup, max2, min2, tipoVetor);

        if(max1 > max2){
            this.max = max1;
        }
        else{
            this.max = max2;
        }

        if(min1<min2){
            this.min = min1;
        }
        else{
            this.min = min2;
        }
    }
}
