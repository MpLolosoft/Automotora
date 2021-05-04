package Automotora;

public class Auto {

    private int numeroSerie;
    private String marca;
    private String color;
    private int fabricacion;
    private boolean velociadadCrucero;


    public Auto() {
    }

    public Auto(int numeroSerie, String marca) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
    }

    public Auto(int numeroSerie, String marca, String color, int fabricacion, boolean velociadadCrucero) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.color = color;
        this.fabricacion = fabricacion;

    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;

    }

    public int getFabricacion() {
        return fabricacion;
    }

    public boolean getVelocidadCrucero(){
        return velociadadCrucero;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    public void setVelociadadCrucero(boolean velociadadCrucero) {
        this.velociadadCrucero = velociadadCrucero;
    }
    public double calcularPrecio(){
        double precioAuto = 0;
        switch (marca){
            case "Kia":
                precioAuto = fabricacion * 10;
                break;
            case "Citroen":
                precioAuto = fabricacion * 10;
                break;
            case "Volkswagen":
                precioAuto = fabricacion * 9;
                break;
            case "Hyundai":
                precioAuto = fabricacion * 8;
                break;
            case "Peugeot":
                precioAuto = fabricacion * 8;
                break;
            case "Fiat":
                precioAuto = fabricacion * 8;
                break;
            case "Suzuki":
                precioAuto = fabricacion * 8;
                break;
            case "Chevrolet":
                precioAuto = fabricacion * 8;
                break;
            case "Renault":
                precioAuto = fabricacion * 7;
                break;
            case "Chery":
                precioAuto = fabricacion * 7;
                break;
        }
         return precioAuto;



    }

}
