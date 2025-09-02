package aed;

class ArregloRedimensionableDeRecordatorios {
    private Recordatorio[] _arregloRecordatorios;

    public ArregloRedimensionableDeRecordatorios() {
        this._arregloRecordatorios = new Recordatorio[0];
    }

    public int longitud() {
        return this._arregloRecordatorios.length;
    }

    public void agregarAtras(Recordatorio i) {
        Recordatorio[] nuevoArreglo = new Recordatorio[this._arregloRecordatorios.length + 1];
        for(int j = 0; j<this._arregloRecordatorios.length; j++){
            nuevoArreglo[j] = this._arregloRecordatorios[j];
        }
        nuevoArreglo[nuevoArreglo.length-1] = i;
        _arregloRecordatorios = nuevoArreglo;
    }

    public Recordatorio obtener(int i) {
        return this._arregloRecordatorios[i];
    }

    public void quitarAtras() {
        Recordatorio[] nuevoArreglo = new Recordatorio[this._arregloRecordatorios.length - 1];
        for(int j = 0; j<this._arregloRecordatorios.length-1; j++){
            nuevoArreglo[j] = this._arregloRecordatorios[j];
        }
        _arregloRecordatorios = nuevoArreglo;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        this._arregloRecordatorios[indice] = valor;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        this._arregloRecordatorios = vector._arregloRecordatorios.clone();
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios nuevoArreglo = new ArregloRedimensionableDeRecordatorios();
        for(int i = 0; i<this._arregloRecordatorios.length; i++){
            nuevoArreglo.agregarAtras(_arregloRecordatorios[i]);
        }
        return new ArregloRedimensionableDeRecordatorios(nuevoArreglo);
    }
}
