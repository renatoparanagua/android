package com.projeto.danilosetubal.votantemaioridade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.NumberPicker;


public class MainActivity extends AppCompatActivity {

    // onCreate() - É a primeira função a ser executada em uma Activity. Geralmente é a responsável
    // por carregar os layouts XML e outras operações de inicialização. É executada apenas uma vez.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Passou pelo onCreate()", Toast.LENGTH_SHORT).show();
    }

    // onStart() - É chamada imediatamente após a onCreate() – e também quando uma Activity que
    // estava em background volta a ter foco.
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Passou pelo onStart()", Toast.LENGTH_SHORT).show();
        preencheNumberPicker();
    }

    // onRestart() - Chamada imediatamente antes da onStart(), quando uma Activity volta a ter o
    // foco depois de estar em background.
    @Override
    protected void onRestart() {
        super.onRestart();
    }

    // onResume() - Assim como a onStart(), é chamada na inicialização da Activity e também quando
    // uma Activity volta a ter foco. Qual a diferença entre as duas? A onStart() só é chamada
    // quando a Activity não estava mais visível e volta a ter o foco, a onResume() é chamada nas
    // “retomadas de foco”.
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Passou pelo onResume()", Toast.LENGTH_SHORT).show();
    }

    // É a primeira função a ser invocada quando a Activity perde o foco (isso ocorre quando uma
    // nova Activity é iniciada).
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Passou pelo onPause()", Toast.LENGTH_SHORT).show();
    }

    // onStop() - Só é chamada quando a Activity fica completamente encoberta por outra Activity.
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Passou pelo onStop()", Toast.LENGTH_SHORT).show();
    }

    // onDestroy() - A última função a ser executada. Depois dela, a Activity é considerada
    // “morta” – ou seja, nao pode mais ser relançada. Se o usuário voltar a requisitar essa
    // Activity, um novo objeto será contruído.
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Passou pelo onDestroy()", Toast.LENGTH_SHORT).show();
    }

    public void preencheNumberPicker() {
        NumberPicker np = (NumberPicker) findViewById(R.id.np);
        String[] nums = new String[150];
        for(int i=0; i<nums.length; i++)
            nums[i] = Integer.toString(i);

        np.setMinValue(1);
        np.setMaxValue(150);
        np.setWrapSelectorWheel(false);
        np.setDisplayedValues(nums);
        np.setValue(1);
    }
}
