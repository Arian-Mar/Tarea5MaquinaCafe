import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaquinadeCafe maquina = new MaquinadeCafe();
        maquina.EstadoRecursos(); // Muestra el estado actual de los recursos

        boolean detener = false;
        while (!detener && maquina.Vasos > 0 && (maquina.Agua >= 180 || maquina.Cafe >= 20 || maquina.Crema >= 70)) {
            System.out.println("Seleccione el tipo de café que desea servir:");
            System.out.println("1. Café americano");
            System.out.println("2. Café expreso");
            System.out.println("3. Capuchino");
            System.out.println("4. Detener la máquina");

            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    maquina.ServirAmericano();
                    break;
                case 2:
                    maquina.ServirExpreso();
                    break;
                case 3:
                    maquina.ServirCapuchino();
                    break;
                case 4:
                    detener = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor seleccione una opción válida.");
                    break;
            }

            if (!detener) {
                maquina.EstadoRecursos(); // Muestra el estado actual de los recursos después de servir el café
                if (maquina.Vasos == 0 || (maquina.Agua < 180 && maquina.Cafe < 20 && maquina.Crema < 70)) {
                    System.out.println("No hay suficientes recursos para servir más café.");
                    detener = true;
                }
            }
        }
    }
}