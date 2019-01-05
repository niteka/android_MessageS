package mbd.fr.messageS.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import mbd.fr.messageS.R;

//Messagerie(conversation avec une personne, champ texte et bouton pour envoyer)

//Auteur[|]Commande[|]Content
//Si Alice veut parler à Bob et qu’ils ne se sont jamais parlé :
//A->B // Commande PING, alice envoie sa clé publique à Bob Alice[|]PING[|]clef publique d’Alice

//B->A// Commande PONG en réponse à PING, bob chiffre une clef symétrique avec la clef publique d’Alice et lui envoie le résultat
/*
Bob[|]PONG[|]clefAESchiffréeAvecKpA
Ensuite ils peuvent communiquer en utilisant la clef fournit par Bob (AES)
A->B
Alice[|]MSG[|]fkznjfknzbjfkznefz //salut ...
 */

public class messagerieActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messagerie);

        button= (Button)findViewById(R.id.send);
        editText=(EditText)findViewById(R.id.user_message);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get intent, action and MIME type
                Intent intent = getIntent();
                String action = intent.getAction();
                String type = intent.getType();

                if (Intent.ACTION_SEND.equals(action) && type != null){
                    if ("text/plain".equals(type)) {
                        handleSendText(intent); // Handle text being sent
                    }


                }
        });

        /*Intent intent =getIntent();
        String message = intent.getStringExtra()*/


    }


}
