public class Boca {
    private boolean isAcessa;

    public Boca() {
        this.isAcessa = false;
    }



    public boolean isAcessa() {
        return isAcessa;
    }

    public void acender() {
        isAcessa = true;
    }
    public void apagar() {
        isAcessa = false;
    }

    @Override
    public String toString() {
        return "Boca{" +
                "isAcessa=" + isAcessa +
                '}';
    }
}
