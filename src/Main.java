//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    int[] zahl1 = {7, 0, 1, 0};
    int[] zahl2 = {7, 4, 2, 0};

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
    boolean isbigger = true;
    for(int i = 0; i < zahl1.length; i++){
        if(isbigger = true && zahl1[i] != zahl2[i] && zahl1[i] < zahl2[i]){
            isbigger = false;
            break;
        }
    }
    if(isbigger == false){
        for(int i = 0; i < zahl1.length; i++) {
            int a = zahl1[i];
            zahl1[i] = zahl2[i];
            zahl2[i] = a;
        }
    }

    int[] result2 = new int[zahl1.length];
    for(int i = zahl1.length - 1; i > 0; i--){
        if(zahl1[i] < zahl2[i]){
            result2[i] = zahl1[i] + 10 - zahl2[i];
            zahl1[i - 1]--;
            if(zahl1[i - 1] == -1)
                zahl1[i] = 9;
        }
        else result2[i] = zahl1[i] - zahl2[i];
    }
    while(result2[0] == 0){
        int[] newresult = new int[result2.length - 1];
        for(int i=0; i < newresult.length; i++)
            newresult[i] = result2[i+1];
        result2 = newresult;
    }
    System.out.println(Arrays.toString(result2));














}

