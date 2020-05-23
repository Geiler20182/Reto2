package Alimentos

import Servicios.GeneradorReferencia
import Adicionales._

class Papas extends Alimento with Queso
{
    /*Atributos*/
    override var _tamano : TipoTamano = _
    override var _descripcion : String = _
    override var _referencia : String = GeneradorReferencia.crearReferencia()
    override var _costo : Double = _
    private var _conQueso : Boolean = false

    /*Cosntructores Auxiliares*/
    def this(t: TipoTamano, d : String, c : Double, queso : Boolean)
    {
        this()
        _tamano = t
        _descripcion = d
        _costo = c
        _conQueso = queso
    }

    /*Getter*/
    def conQueso = _conQueso

    /*Setter*/
    def conQueso_= (decisionUsuario : Boolean) = _conQueso = decisionUsuario

    /*Métodos*/
    def calcularCosto() : Double = 
    {
        if(_conQueso)
        {
            _costo = _costo + (_costo * 0.12)
        }
        return _costo   
    }
}