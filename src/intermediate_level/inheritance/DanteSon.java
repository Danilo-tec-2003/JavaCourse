// Arquivo: DanteSon.java
package intermediate_level.inheritance;

import intermediate_level.characteristicCouple;

public class DanteSon extends User implements characteristicCouple {


    public void LightEyes(){
        System.out.println(name + " tem olhos claros.");
    }


    public void SkinColor() {
        System.out.println(name + " tem a pele negra de tom claro.");
    }
}