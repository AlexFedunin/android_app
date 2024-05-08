package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainPageActivity extends AppCompatActivity {
    @SuppressLint("StaticFieldLeak")
    public static MenuBuilder notes;
    private Button addNoteButton;
    private Button exportButton;
//    private ListView notesListView;
    private Button personalCabinetButton;
//    private final List<Note> note = new ArrayList<Note>();

    @SuppressLint({"MissingInflatedId", "RestrictedApi"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        addNoteButton = findViewById(R.id.addNoteButton);
        exportButton = findViewById(R.id.exportButton);
//        notesListView = findViewById(R.id.notesListView);
        personalCabinetButton = findViewById(R.id.personalCabinetButton);

//        notes.add((CharSequence) new Note("2023-03-08", "первый день практики", "поставить капельницы"));
//        notes.add((CharSequence) new Note("2023-03-10", "второй день практики", "взять кровь"));
//        notes.add((CharSequence) new Note("2023-03-12", "третий день практики", "Встреча с врачем в 10:00"));
//
//        NotesAdapter adapter = new NotesAdapter(this, note);
//        notesListView.setAdapter((ListAdapter) adapter);
//        addNoteButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainPageActivity.this, NoteDetailActivity.class);
//                startActivity(intent);
//            }
//        });
        exportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPageActivity.this, "Заметки экспортированы", Toast.LENGTH_SHORT).show();
            }
        });
        personalCabinetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainPageActivity.this, PersonalCabinetActivity.class);
//                startActivity(intent);
            }
        });
    }
}