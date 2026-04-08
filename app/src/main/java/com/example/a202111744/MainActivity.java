package com.example.a202111744;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableLayout table;
        table = (TableLayout) findViewById(R.id.tableLayout);

        TableRow.LayoutParams layoutParams =
                new TableRow.LayoutParams(
                        TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT,1.0f);
        BlockButton[][] buttons = new BlockButton[9][9];
        for(int i = 0; i < 9; i++) {
            TableRow tableRow = new TableRow(this);
            for (int j = 0; j < 9; j++) {
                buttons[i][j] = new BlockButton(this, i , j);
                buttons[i][j].setLayoutParams(layoutParams);
                tableRow.addView(buttons[i][j]);

                buttons[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ((BlockButton)view).toggleFlag();

                    }
                });
            }
            table.addView(tableRow);
        }



    }
}

public class BlockButton extends AppCompatButton {
    boolean mine, flag;
    int neighborMines;
    static int flags = 10;
    static int blocks;

    public BlockButton(Context context, int x, int y) {
        super(context);
    }


    public void toggleFlag() {
        public void OnClickListener

    }
}