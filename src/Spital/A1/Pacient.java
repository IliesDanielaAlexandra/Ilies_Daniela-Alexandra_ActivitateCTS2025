package Spital.A1;

public class Pacient {
    private boolean extraPatRabatabil;
    private boolean cuMicDejunInclus;
    private boolean extraPapuciDeCamera;
    private boolean extraHalatInterior;

    public Pacient(boolean extraPatRabatabil, boolean cuMicDejunInclus, boolean extraPapuciDeCamera, boolean extraHalatInterior) {
        this.extraPatRabatabil = extraPatRabatabil;
        this.cuMicDejunInclus = cuMicDejunInclus;
        this.extraPapuciDeCamera = extraPapuciDeCamera;
        this.extraHalatInterior = extraHalatInterior;
    }

    public void setExtraPatRabatabil(boolean extraPatRabatabil) {
        this.extraPatRabatabil = extraPatRabatabil;
    }

    public void setCuMicDejunInclus(boolean cuMicDejunInclus) {
        this.cuMicDejunInclus = cuMicDejunInclus;
    }

    public void setExtraPapuciDeCamera(boolean extraPapuciDeCamera) {
        this.extraPapuciDeCamera = extraPapuciDeCamera;
    }

    public void setExtraHalatInterior(boolean extraHalatInterior) {
        this.extraHalatInterior = extraHalatInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "extraPatRabatabil=" + extraPatRabatabil +
                ", cuMicDejunInclus=" + cuMicDejunInclus +
                ", extraPapuciDeCamera=" + extraPapuciDeCamera +
                ", extraHalatInterior=" + extraHalatInterior +
                '}';
    }
}


