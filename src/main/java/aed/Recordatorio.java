package aed;

public class Recordatorio {
    private String _mensaje;
    private Fecha _fecha;
    private Horario _horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this._mensaje = mensaje;
        this._fecha = new Fecha(fecha.dia(), fecha.mes());
        this._horario = new Horario(horario.hora(), horario.minutos());
    }

    public Horario horario() {
        Horario nuevHorario = new Horario(this._horario.hora(), this._horario.minutos());
        return nuevHorario;
    }

    public Fecha fecha() {
        Fecha nuevFecha = new Fecha(this._fecha.dia(), this._fecha.mes());
        return nuevFecha;
    }

    public String mensaje() {
        return this._mensaje;
    }

    @Override
    public String toString() {
        return this._mensaje + " @ " + this._fecha.toString() + " " + this._horario.toString();
    }

    @Override
    public boolean equals(Object otro) {
        boolean otroNoEsNull = (otro != null);
        boolean esObjetoDeLamismaClase = otroNoEsNull && otro.getClass() == this.getClass();

        if (!esObjetoDeLamismaClase) {
            return false;
        }

        Recordatorio otroRecordatorio = (Recordatorio) otro;

        return otroRecordatorio._fecha == this._fecha && otroRecordatorio._horario == this._horario && otroRecordatorio._mensaje == this._mensaje;
    }

}
