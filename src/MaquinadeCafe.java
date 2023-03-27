public class MaquinadeCafe {
    int Agua;
    int Cafe;
    int Crema;
    int Vasos;

    public MaquinadeCafe(){
        Agua = 5000;
        Cafe= 1000;
        Crema= 1500;
        Vasos= 50;
    }
    public void ServirAmericano(){
        if (Agua >= 180 && Cafe >=15 && Vasos > 0){
            Agua -= 180;
            Cafe -=15;
            Vasos--;
            System.out.println("Servido el cafe americano");
        }  else {
            System.out.println("El cafe amaericano no se puede servir. Verifique los recursos.");
        }
    }
    public void ServirExpreso(){
        if (Agua >= 120&& Cafe>= 20&& Vasos >0){
            Agua-=120;
            Cafe-=20;
            Vasos--;
            System.out.println("Servido el cafe expreso");
        }else {
            System.out.println("El cafe experso no se puede servir. Verifique los recursos.");
        }
    }
    public void ServirCapuchino(){
        if(Agua >= 100 && Cafe >= 14 && Crema >= 70 && Vasos > 0) {
            Agua -= 100;
            Cafe -= 14;
            Crema-= 70;
            Vasos--;
            System.out.println("Servido el capuchino.");
        } else {
            System.out.println("El capuchino no se puede servir. Verifique los recursos.");
        }
    }

    public void EstadoRecursos() {
        System.out.println("Recursos actuales:");
        System.out.println("Agua: " + Agua + " ml");
        System.out.println("Café: " + Cafe + " g");
        System.out.println("Crema: " + Crema + " ml");
        System.out.println("Vasos: " + Vasos);
    }

}
