import java.util.Scanner;

class Controller {

    public static void main(String[] args) {

        String lenguage;
        String states;
        String initialState;
        // String wInput;
        int optionState;
        int[] arrayOptionStates = { 1, 2 }; // arreglo para validar opciones

        View instaciaView = new View();
        AutomataFinitoDeterministico AFD = new AutomataFinitoDeterministico();

        instaciaView.viewMesage("Digite los carateres del lenguaje separados por una coma y sin espacios");
        lenguage = instaciaView.getStringSimple();

        AFD.setArrayLenguage(lenguage.split(","));

        do {
            instaciaView.viewMesage("Si desea digitar cada uno de los nombres de los estados digite 1");
            instaciaView.viewMesage("Si desea digitar solo la cantidad de estados digite 2");
            optionState = instaciaView.getNumber();
        } while (!validationContent(optionState, arrayOptionStates));

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
            instaciaView.viewMesage("Los estados creados son los siguientes", AFD.getArrayState());
        }

        do {
            instaciaView.viewMesage("Digite el estado por el cual inica el automata");
            initialState = instaciaView.getStringSimple();
        } while (!validationContent(initialState, AFD.getArrayState(),
                "El estado no pertenece a los antes mencionados"));

    }

    // #region metodos de validacion

    static public boolean validationContent(String caracter, String[] arrayValidator) {
        View instaView = new View();
        for (int i = 0; i < arrayValidator.length; i++) {
            if (arrayValidator[i].equals(caracter))
                return true;
        }
        instaView.viewMesage("Candea NO valida");
        return false;
    }

    static public boolean validationContent(int caracter, int[] arrayValidator) {
        View instaView = new View();
        for (int i = 0; i < arrayValidator.length; i++) {
            if (caracter == arrayValidator[i])
                return true;
        }
        instaView.viewMesage("Valor NO valido");
        return false;
    }

    static public boolean validationContent(String caracter, String[] arrayValidator, String smsError) {
        View instaView = new View();
        for (int i = 0; i < arrayValidator.length; i++) {
            if (arrayValidator[i].equals(caracter))
                return true;
        }
        instaView.viewMesage(smsError);
        return false;
    }

    static public boolean validationContent(int caracter, int[] arrayValidator, String smsError) {
        View instaView = new View();
        for (int i = 0; i < arrayValidator.length; i++) {
            if (caracter == arrayValidator[i])
                return true;
        }
        instaView.viewMesage(smsError);
        return false;
    }

    // #endregion
}
