package mx.unam.ciencias.modelado.practica3.adapter.adapterCPU;

class Ryzen7 {
    public String getName() {
        return "Ryzen 7";
    }

    public String getBrand() {
        return "AMD";
    }

    public int getCores() {
        return 8;
    }

    public double getCost() {
        return 3700;
    }

    public String description() {
        return getName() + " de " + getBrand() + " con " + getCores() + " cores.";
    }
}
