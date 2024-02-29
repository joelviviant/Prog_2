package Tp7.ejercicio5;
    public class ComparadorPorSol extends ComparadorFichas {
        private final boolean ascendente;

        public ComparadorPorSol(boolean ascendente) {
            this.ascendente = ascendente;
        }

        public ComparadorPorSol(ComparadorFichas siguiente, boolean ascendente) {
            super(siguiente);
            this.ascendente = ascendente;
        }

        public int comparar(FichaPlanta ficha1, FichaPlanta ficha2) {
            int comparacion = ascendente ? ficha1.getSol() - ficha2.getSol() : ficha2.getSol() - ficha1.getSol();
            return comparacion;
        }
    }
