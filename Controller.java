import java.util.Scanner;

class Controller {

    public static void main(String[] args) {

        String lenguage;
        String states;
        String initialState;
        // String wInput;
        int optionState;

        View instaciaView = new View();
        AutomataFinitoDeterministico AFD = new AutomataFinitoDeterministico();

        instaciaView.viewMesage("Digite los carateres del lenguaje separados por una coma y sin espacios");
        lenguage = instaciaView.getStringSimple();

        AFD.setArrayLenguage(lenguage.split(","));

        do {
            instaciaView.viewMesage("Si desea digitar cada uno de los nombres de los estados digite 1");
            instaciaView.viewMesage("Si desea digitar solo la cantidad de estados digite 2");
            optionState = instaciaView.getNumber();
        } while (optionState != 1 && optionState != 2);

        if (1 == optionState) {
            instaciaView.viewMesage("Digite los estados separados por una coma y sin espacios");
            states = instaciaView.getStringSimple();
            AFD.setArrayState(states.split(","));
        } else if (2 == optionState) {
            instaciaView.viewMesage("Digite la cantidad de estados que desea");
            int amountStates = instaciaView.getNumber();
            String auxVector[] = new String[amountStates];
            for (int i = 0; i < amountStates; i++) {
                auxVector[i] = "E" + i;
            }
            AFD.setArrayState(auxVector);
        }

        instaciaView.viewMesage("Digite el estado por el cual inica el automata");
        initialState = instaciaView.getStringSimple();

    }

}
