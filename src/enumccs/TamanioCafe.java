package enumccs;

public enum TamanioCafe {

    CHICO(5){
        public String getTipoTapa(){
            return "C";
        }
    },
    MEDIANO(7){
        public String getTipoTapa(){
            return "M";
        }
    },
    GRANDE(10){
        public String getTipoTapa(){
            return "G";
        }
    },
    MAMALON(15){
        public String getTipoTapa(){
            return "MA";
        }
    };

    private int onzas;

    TamanioCafe(int onzas) {
        this.onzas = onzas;
    }

    public int getOnzas() {
        return onzas;
    }

    public String getTipoTapa(){
        return "";
    }
}
