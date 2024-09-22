package mx.unam.ciencias.modelado.practica3.adapter.adapterCPU;

class AdaptadorCPU implements CPU {

    private Ryzen7 ryzen;

    public AdaptadorCPU(Ryzen7 ryzen) {
        this.ryzen = ryzen;
    }

    @Override
    public String getNombre() {
        return ryzen.getName();
    }

    @Override
    public String getMarca() {
        return ryzen.getBrand();
    }

    @Override
    public int getNumeroDeNucleos() {
        return ryzen.getCores();
    }

    @Override
    public double getCosto() {
        return ryzen.getCost();
    }

    @Override
    public String descripcion() {
        return ryzen.description();
    }
}