public class AutomataFinitoDeterministico {

    // #region Atributos
    private String arrayLenguage[];
    private String arrayState[];
    private String initialState;
    private String arrayRules[][];
    private String arrayWord[];
    // #endregion

    // #region Getters and Setters
    public String[] getArrayLenguage() {
        return arrayLenguage;
    }

    public void setArrayLenguage(String[] arrayLenguage) {
        this.arrayLenguage = arrayLenguage;
    }

    public String[] getArrayState() {
        return arrayState;
    }

    public void setArrayState(String[] arrayState) {
        this.arrayState = arrayState;
    }

    public String getInitialState() {
        return initialState;
    }

    public void setInitialState(String initialState) {
        this.initialState = initialState;
    }

    public String[][] getArrayRules() {
        return arrayRules;
    }

    public void setArrayRules(String[][] arrayRules) {
        this.arrayRules = arrayRules;
    }

    public String[] getArrayWord() {
        return arrayWord;
    }

    public void setArrayWord(String[] arrayWord) {
        this.arrayWord = arrayWord;
    }
    // #endregion

    // #region Funciones
    public String analyzeWord() {
        String route = initialState;
        String actualState = initialState;
        int indexRow = 0;
        int indexColumn = 0;
        for (int i = 0; i < this.arrayWord.length; i++) {
            for (int j = 0; j < this.arrayLenguage.length; j++) {
                if (this.arrayLenguage[j].equals(this.arrayWord[i])) {
                    indexColumn = j;
                }
            }
            for (int k = 0; k < arrayState.length; k++) {
                if (actualState.equals(this.arrayState[k])) {
                    indexRow = k;
                }
            }
            actualState = this.arrayRules[indexRow][indexColumn];
            route = route + " -> " + actualState;

        }
        return route;
    }
    // #endregion
}
