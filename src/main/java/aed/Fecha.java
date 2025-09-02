package aed;

public class Fecha {
    private int _dia; 
    private int _mes; 

    public Fecha(int dia, int mes) {
        this._dia = dia;
        this._mes = mes;
    }

    public Fecha(Fecha fecha) {
        this._dia = fecha._dia;
        this._mes = fecha._mes;
    }

    public Integer dia() {
        return this._dia;
    }

    public Integer mes() {
        return this._mes;
    }

    public String toString() {
        return Integer.toString(_dia)+"/"+Integer.toString(_mes);
    }

    @Override
    public boolean equals(Object otra) {
        
        boolean otraNoEsNull = (otra != null);
        boolean esObjetoDeLamismaClase = otraNoEsNull && otra.getClass() == this.getClass();

        if (!esObjetoDeLamismaClase) {
            return false;
        }

        Fecha otraFecha = (Fecha) otra;

        return otraFecha._dia == this._dia && otraFecha._mes == this._mes;
    }

    public void incrementarDia() {
        if(_dia != diasEnMes(_mes)){
            _dia += 1;
        }else
        {
            if(_mes == 12){
                _mes = 1;
            }else{
                _mes += 1;
            }
            _dia = 1;
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
