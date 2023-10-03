import java.util.Scanner;

class Index {

    public static void main(String[] args) {
        
        String lenguage;
        String states;
        String initialState;
        String wInput;

        Scanner catchConsol = new Scanner(System.in);
        AutomataFinitoDeterministico AFD = new AutomataFinitoDeterministico();
        
        System.out.println("Digite los carateres del lenguaje separados por una coma y sin espacios");
        lenguage = catchConsol.next();
        
        AFD.setArrayLenguage(lenguage.split(","));

        System.out.println("Digite los estaodos separados por una coma y sin espacios");
        states = catchConsol.next();
        AFD.setArrayState(states.split(","));
        
        System.out.println("Digite el estado por el cual inica el automata");
        initialState = catchConsol.next();

    }

}
