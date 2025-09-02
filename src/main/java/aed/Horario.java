package aed;

public class Horario {

    private int _hora;
    private int _minutos;

    public Horario(int hora, int minutos) {
        this._hora = hora;
        this._minutos = minutos;
    }

    public int hora() {
        return this._hora;
    }

    public int minutos() {
        return this._minutos;
    }

    @Override
    public String toString() {
        return Integer.toString(this._hora)+":"+Integer.toString(_minutos);
    }

    @Override
    public boolean equals(Object otro) {    
        boolean otroNoEsNull = (otro != null);
        boolean esObjetoDeLaMismaClase = otroNoEsNull && otro.getClass() == this.getClass();

        if(!esObjetoDeLaMismaClase){
            return false;
        }

        Horario otroHorario = (Horario) otro;

        return otroHorario._hora == this._hora && otroHorario._minutos == this._minutos;
    }

}
