package mbd.fr.messageS.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messagerie);
    }
}
