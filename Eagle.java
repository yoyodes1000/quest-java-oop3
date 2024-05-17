public class Eagle extends Bird implements Fly{

    private boolean flying;

    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return this.altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        this.flying = true;
        System.out.println(this.getName() + " déploie ses ailes et s'envole dans le soleil couchant");
    }

    @Override
    public void ascend(int meters) {
        this.setAltitude(this.getAltitude() + meters);
        System.out.println("D'un battement d'ailes gracieux, " + this.getName() + " monte de " + meters + " mètres.");
    }

    @Override
    public void descend(int meters) {
        this.setAltitude(this.getAltitude() - meters);
        System.out.println("Lentement " + this.getName() + " descend de " + meters + " mètres.");
    }

    @Override
    public void glide() {
        System.out.println(this.getName() + " plane en regardant au loin");
    }

    @Override
    public void land() {
        if (this.getAltitude()<=2) {
            System.out.println("Avec grâce et élégance l'aigle se pose sur la terre");
        } else {
            System.out.println("L'aigle redresse ses aile et s'apprête à atterrir");
        }
    }
}
