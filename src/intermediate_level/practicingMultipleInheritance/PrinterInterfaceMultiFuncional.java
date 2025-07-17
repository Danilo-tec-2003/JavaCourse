package intermediate_level.practicingMultipleInheritance;

import intermediate_level.practicingMultipleInheritance.Interfaces.Device;
import intermediate_level.practicingMultipleInheritance.Interfaces.PrinterInterfaceInterface;
import intermediate_level.practicingMultipleInheritance.Interfaces.FaxInterface;
import intermediate_level.practicingMultipleInheritance.Interfaces.ScannerInterface;

public class PrinterInterfaceMultiFuncional implements PrinterInterfaceInterface, ScannerInterface, FaxInterface, Device {

    @Override
    public void imprimir(String documento) {
        System.out.println(" Imprimindo " + documento);
    }

    @Override
    public String escanear(){
        System.out.println("Escaneando documento...");
        return "Documento escaneado.";
    }

    @Override
    public void enviarFax(String documento, String numeroDestino) {
        System.out.println("Enviando fax para o número " + numeroDestino + ", Documento: " + documento);
    }

    @Override
    public void ligar() {
        Device.super.ligar();
        System.out.println("Impressora multifuncional  ligada.");
    }
}
