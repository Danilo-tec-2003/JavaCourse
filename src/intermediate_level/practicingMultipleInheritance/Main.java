package intermediate_level.practicingMultipleInheritance;

public class Main {
    public static void main(String[] args) {

        PrinterInterfaceMultiFuncional minhaImpressora = new PrinterInterfaceMultiFuncional();

        minhaImpressora.ligar();
        System.out.println("_________________________________________");
        String resultadoEscaneado = minhaImpressora.escanear();
        System.out.println(resultadoEscaneado);

        System.out.println("_________________________________________");
        minhaImpressora.imprimir("Documento para impressão.");

        System.out.println("_________________________________________");

        minhaImpressora.enviarFax("Contrato", "40028922");
        System.out.println("_________________________________________");

        minhaImpressora.verificarNivelTinta();
        System.out.println("_________________________________________");


    }
}
