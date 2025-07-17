package intermediate_level.practicingMultipleInheritance.Interfaces;

public interface PrinterInterfaceInterface {

   void imprimir(String documento);

    default void verificarNivelTinta() {
        System.out.println("Nivel de tinta verificado.");
    }
}
