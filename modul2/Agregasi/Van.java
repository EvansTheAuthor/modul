package modul.modul2.Agregasi;

class Van extends Vehicle{
    private Speed speed;

    public Speed getSpeed(){
        return speed;
    }

    public void setSpeed(Speed speed){
        this.speed=speed;
    }

    public void print(){
        System.out.println("Vin: "+this.getVin()+", Max Speed: "+speed.getMax());
    }
}
