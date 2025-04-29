
public class Kelvin extends Temperatura {
    
    public Kelvin(double valorGraus) {
        super(valorGraus);
    }
    //KELVIN PARA CELSIUS
    public double paraCelsius(){
       return getGraus() -273;
    }
    //KELVIN PARA FAHRENHEIT
   public double paraFahrenheit(){
      return (paraCelsius()*9/5)+32;
   }
}
