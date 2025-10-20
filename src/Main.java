//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    int[] zahl1 = {3, 3, 0, 0, 0, 0, 0, 0, 0};
    int[] zahl2 = {7, 7, 0, 0, 0, 0, 0, 0, 0};

//    Aufgabe 1: Summe:
    int c = 0;
    int[] result = new int[zahl1.length];
    for(int i = zahl1.length - 1; i >= 0; i--){
        result[i] = (zahl1[i] + zahl2[i] + c) % 10;
        c = (zahl1[i] + zahl2[i] + c) / 10;
    }
    if (c > 0){
        int[] newresult = new int[result.length + 1];
        for(int j = newresult.length - 2; j >= 0; j--)
            newresult[j + 1] = result[j];
        newresult[0] = c;
        result = newresult;
    }
    System.out.println(Arrays.toString(result));

//    Aufgabe 2: Differenz:














}

