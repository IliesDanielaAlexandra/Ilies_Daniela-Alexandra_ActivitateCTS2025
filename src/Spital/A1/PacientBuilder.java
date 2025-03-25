package Spital.A1;

public class PacientBuilder implements IPacient {
        private Pacient pacient= new Pacient(false, false,false,false);

        public PacientBuilder(){}

        public PacientBuilder setExtraPatRabatabil(boolean extraPatRabatabil) {
            this.pacient.setExtraPatRabatabil(extraPatRabatabil);
            return this;
        }

        public PacientBuilder setCuMicDejunInclus(boolean cuMicDejunInclus) {
            this.pacient.setCuMicDejunInclus(cuMicDejunInclus);
            return this;
        }

        public PacientBuilder setExtraPapuciDeCamera(boolean extraPapuciDeCamera) {
            this.pacient.setExtraPapuciDeCamera(extraPapuciDeCamera);
            return this;
        }

        public PacientBuilder setExtraHalatInterior(boolean extraHalatInterior) {
            this.pacient.setExtraHalatInterior(extraHalatInterior);
            return this;
        }

        @Override
        public Pacient build() {
            return  pacient;
        }

        @Override
        public String toString() {
            return "PacientBuilder{" +
                    "pacient=" + pacient +
                    '}';
        }
    }

