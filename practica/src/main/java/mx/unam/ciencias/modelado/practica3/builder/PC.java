package mx.unam.ciencias.modelado.practica3.builder;

import mx.unam.ciencias.modelado.practica3.factory.componentes.cpu.CPU;
import mx.unam.ciencias.modelado.practica3.factory.componentes.gpu.GPU;
import mx.unam.ciencias.modelado.practica3.factory.componentes.ram.RAM;
import mx.unam.ciencias.modelado.practica3.factory.componentes.discoDuro.DiscoDuro;
import mx.unam.ciencias.modelado.practica3.factory.componentes.motherboard.Motherboard;
import mx.unam.ciencias.modelado.practica3.factory.componentes.fuenteDePoder.FuenteDePoder;

/**
 * Clase para la PC con sus componentes.
 */
public class PC {
    /**Procesador. */
    private CPU cpu;
    /**Tarjeta gráfica. */
    private GPU gpu;
    /**Memoria ram. */
    private RAM ram;
    /**Disco duro. */
    private DiscoDuro discoDuro;
    /**Tarjeta madre. */
    private Motherboard motherboard;
    /**Fuente de poder. */
    private FuenteDePoder fuenteDePoder;

    /**
     * Setter del CPU de la PC.
     * @param cpu El CPU a asignar.
     */
    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    /**
     * Getter de el CPU de la PC.
     * @return El CPU de la PC.
     */
    public CPU getCPU() {
        return cpu;
    }

    /**
     * Setter de la tarjeta gráfica de la PC.
     * @param gpu La GPU a asignar.
     */
    public void setGPU(GPU gpu) {
        this.gpu = gpu;
    }

    /**
     * Getter de la tarjeta gráfica de la PC.
     * @return La GPU de la PC.
     */
    public GPU getGPU() {
        return gpu;
    }

    /**
     * Setter de la memoria RAM de la PC.
     * @param ram La RAM a asignar.
     */
    public void setRAM(RAM ram) {
        this.ram = ram;
    }

    /**
     * Getter de la memoria RAM de la PC.
     * @return La RAM de la PC.
     */
    public RAM getRAM() {
        return ram;
    }

    /**
     * Setter del disco duro de la PC.
     * @param discoDuro El disco duro a asignar.
     */
    public void setDiscoDuro(DiscoDuro discoDuro) {
        this.discoDuro = discoDuro;
    }

    /**
     * Getter de el disco duro de la PC.
     * @return El disco duro de la PC.
     */
    public DiscoDuro getDiscoDuro() {
        return discoDuro;
    }

    /**
     * Setter de la tarjeta madre de la PC.
     * @param motherboard La tarjeta madre a asignar.
     */
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    /**
     * Getter de la tarjeta madre de la PC.
     * @return La tarjeta madre de la PC.
     */
    public Motherboard getMotherboard() {
        return motherboard;
    }

    /**
     * Setter de la fuente de poder de la PC.
     * @param fuenteDePoder La fuente de poder a asignar.
     */
    public void setFuenteDePoder(FuenteDePoder fuenteDePoder) {
        this.fuenteDePoder = fuenteDePoder;
    }

    /**
     * Getter de la fuente de poder de la PC.
     * @return La fuente de poder de la PC.
     */
    public FuenteDePoder getFuenteDePoder() {
        return fuenteDePoder;
    }

    /**
     * Método para calcular el coste total de la pc.
     * @return la suma de todos los valores del método getCosto() de los atributos.
     */
    public double costoTotal(){
        return cpu.getCosto() + gpu.getCosto() + ram.getCosto() + discoDuro.getCosto() + 
                motherboard.getCosto() + fuenteDePoder.getCosto();
    }

    /**
     * Genera una representación en cadena de las especificaciones de la PC.
     * @return Una cadena con la descripción de los componentes y el costo total.
     */
    public String ticket() {
        double costoTotal = costoTotal();

        StringBuilder sb = new StringBuilder();
        sb.append("Ticket de compra:\n");
        sb.append("CPU: " + cpu.descripcion() + "\n");
        sb.append("GPU: " + gpu.descripcion() + "\n");
        sb.append("RAM: " + ram.descripcion() + "\n");
        sb.append("Disco Duro: " + discoDuro.descripcion() + "\n");
        sb.append("Motherboard: " + motherboard.descripcion() + "\n");
        sb.append("Fuente de Poder: " + fuenteDePoder.descripcion() + "\n");
        sb.append(String.format("Costo Total: $%.2f", costoTotal));

        return sb.toString();
    }
}