package mx.unam.ciencias.modelado.practica3.adapter.adapterGPU;
/**
 * GPU concreta de la marca AMD.
 */
public class RadeonRX7600 implements AMDgpu{
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
    @Override public String getName() {
        return name;
    }
    /**
     * Getter del nombre del marca.
     * @return brand
     */
    @Override public String getBrand() {
        return brand;
    }
    /**
     * Getter del tipo de memoria.
     * @return memoryType
     */
    @Override public String getMemoryType() {
        return memoryType;
    }
    /**
     * Getter del costo de la GPU.
     * @return cost
     */
    @Override public double getCost() {
        return cost;
    }
    /**
     * Getter de la descripcion de la GPU.
     * @return description
     */
    @Override public String description() {
        return getName() + " de " + getBrand() + " con memoria " + getMemoryType() + "($" + getCost() +")";
    }
}


