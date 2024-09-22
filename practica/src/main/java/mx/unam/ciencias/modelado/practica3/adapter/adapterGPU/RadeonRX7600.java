package mx.unam.ciencias.modelado.practica3.adapter.adapterGPU;
/**
 * GPU concreta de la marca AMD.
 */
public class RadeonRX7600{
    /** Nombre de la GPU */ 
    String name = "Radeon RX7600";
    /** Marca de la GPU */ 
    String brand = "AMD";
    /** Tipo de memoria */ 
    String memoryType = "GDDR6X";
    /** Costo */ 
    double cost = 8900;
    /**
     * Getter del nombre de la GPU.
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Getter del nombre del marca.
     * @return brand
     */
    public String getBrand() {
        return brand;
    }
    /**
     * Getter del tipo de memoria.
     * @return memoryType
     */
    public String getMemoryType() {
        return memoryType;
    }
    /**
     * Getter del costo de la GPU.
     * @return cost
     */
    public double getCost() {
        return cost;
    }
    /**
     * Getter de la descripcion de la GPU.
     * @return description
     */
    public String description() {
        return getName() + " de " + getBrand() + " con memoria " + getMemoryType() + ".";
    }
}


