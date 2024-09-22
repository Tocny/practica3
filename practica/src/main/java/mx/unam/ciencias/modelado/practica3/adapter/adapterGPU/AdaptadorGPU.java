package mx.unam.ciencias.modelado.practica3.adapter.adapterGPU;

class AdaptadorCPU implements GPU {

    private RadeonRX7600 radeon;

    public AdaptadorCPU(RadeonRX7600 radeon) {
        this.radeon = radeon;
    }

    @Override
    public String getNombre() {
        return radeon.getName();
    }

    @Override
    public String getMarca() {
        return radeon.getBrand();
    }

    @Override
    public String getTipoDeMemoria() {
        return radeon.getMemoryType();
    }

    @Override
    public double getCosto() {
        return radeon.getCost();
    }

    @Override
    public String descripcion() {
        return radeon.description();
    }
}