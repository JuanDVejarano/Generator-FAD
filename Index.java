import java.util.Scanner;

class Index {

    public static void main(String[] args) {

        String lenguage;
        String states;
        String initialState;
        String wInput;
        int optionState;

        Scanner catchConsol = new Scanner(System.in);
        AutomataFinitoDeterministico AFD = new AutomataFinitoDeterministico();

        System.out.println("Digite los carateres del lenguaje separados por una coma y sin espacios");
        lenguage = catchConsol.next();

        AFD.setArrayLenguage(lenguage.split(","));

        do {
            System.out.println("Si desea digitar cada uno de los nombres de los estados digite 1");
            System.out.println("Si desea digitar solo la cantidad de estados digite 2");
            optionState = catchConsol.nextInt();
        } while (optionState != 1 && optionState != 2);

        if (1 == optionState) {
            System.out.println("Digite los estados separados por una coma y sin espacios");
            states = catchConsol.next();
            AFD.setArrayState(states.split(","));
        } else if (2 == optionState) {
            System.out.println("Digite la cantidad de estados que desea");
            int amountStates = catchConsol.nextInt();
            String auxVector[] = new String[amountStates];
            for (int i = 0; i < amountStates; i++) {
                auxVector[i] = "E" + i;
            }
            AFD.setArrayState(auxVector);
        }

        System.out.println("Digite el estado por el cual inica el automata");
        initialState = catchConsol.next();

    }

}
