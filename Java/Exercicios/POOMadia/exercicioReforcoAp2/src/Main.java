public class Main {
    public static void main(String[] args) {
        public void diretoNoCodigo(){
            Cliente cliente1 = new Cliente("000","Maria Fernanda","000");
            Cliente cliente2 = new Cliente("111","João","111");
            Cliente cliente3 = new Cliente("222","Carlos","222");

            Decoracao vingadores = new Decoracao("Vingadores", "Decoração dos vingadores", "000", 350.0);
            Decoracao ben10 = new Decoracao("Ben 10", "Decoração do ben 10", "111", 350.0);
            Decoracao batman = new Decoracao("Batman", "Decoração do batma", "222", 350.0);

            EventoStandard evento1 = new EventoStandard("17/01/2023", "16:20", ben10, cliente2, "000");
            EventoPlus evento2 = new EventoPlus("11/09/2023", "10:24", batman, cliente1, "111", 3);
            EventoLuxo evento3 = new EventoLuxo("17/04/2023", "20:00", vingadores, cliente3, "222", 3, 5);

            if (evento1 instanceof EventoPlus){
                (EventoStandard)

            }


        }
    }
}