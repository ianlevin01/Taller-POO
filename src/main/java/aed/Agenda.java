package aed;

public class Agenda {
    private Fecha _fecha;
    private ArregloRedimensionableDeRecordatorios _recordatorios;

    public Agenda(Fecha fechaActual) {
        this._fecha = fechaActual;
        this._recordatorios = new ArregloRedimensionableDeRecordatorios();
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        this._recordatorios.agregarAtras(recordatorio);
    }

    @Override
    public String toString() { 
        String agendaString = "";
        agendaString += _fecha.toString() + "\n" + "=====\n";
        for(int i = 0; i<this._recordatorios.longitud(); i++){
            if(this._recordatorios.obtener(i).fecha().equals(this._fecha)){
                agendaString += this._recordatorios.obtener(i).toString() + "\n";
            }
        }
        return agendaString;
    }

    public void incrementarDia() {
        this._fecha.incrementarDia();
    }

    public Fecha fechaActual() {
        Fecha nuevFecha = new Fecha(this._fecha);
        return nuevFecha;
    }

}
