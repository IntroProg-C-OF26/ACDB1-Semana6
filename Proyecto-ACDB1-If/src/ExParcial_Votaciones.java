import java.util.Scanner;
public class ExParcial_Votaciones {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombRecinto, nombJunta, resultadosElect;
        int numEmpadronados, votosSi, votosNo, votosBlanco, votosNulo, votosEmitidos;
        double porcParcipacion;
        System.out.print("Dame Recinto, Junta, Emp, #Si, #No, #Blancos y #Nulos: ");
        nombRecinto = tcl.next();   nombJunta = tcl.next();
        numEmpadronados = tcl.nextInt(); votosSi = tcl.nextInt(); 
        votosNo = tcl.nextInt(); votosBlanco = tcl.nextInt();
        votosNulo = tcl.nextInt();
        votosEmitidos = votosSi + votosNo + votosBlanco + votosNulo;
        porcParcipacion = ( (double) votosEmitidos / (double) numEmpadronados) * 100;
        if (votosSi > votosNo)
            resultadosElect = "GANA SI";
        else
            resultadosElect = "GANA NO";
        if (votosSi == votosNo)
            resultadosElect = "EMPATE";
        if (votosEmitidos > numEmpadronados)
            resultadosElect = "FRAUDE";
        System.out.println("RESULTADOS ELECTORALES: ");
        System.out.println("Empadronados: " + numEmpadronados);
        System.out.println("Emitidos: " + votosEmitidos);
        System.out.println("Participacion: " + porcParcipacion);
        System.out.println("*** RESULTADOS *** :  " + resultadosElect);
    }
}
