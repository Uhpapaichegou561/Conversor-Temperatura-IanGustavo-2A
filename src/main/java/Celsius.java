//CLASSE FILHA
public class Celsius extends Temperatura {
    public Celsius(double valorGraus){
       super(valorGraus);
    }
    //CRIANDO OS MÉTODOS PARA CONVERTER
    public double paraFahrenheit(){
       return (getGraus()*9/5)+32;
    }
    //CRIANDO O MÉTODO DE CELSIUS PARA KELVIN
    public double paraKelvin(){
       return getGraus()+273;
    }
}
