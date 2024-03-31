public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Horário inválido!!!");
        }
    }

    public int getMinuto(int minuto) {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo(int segundo) {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}
