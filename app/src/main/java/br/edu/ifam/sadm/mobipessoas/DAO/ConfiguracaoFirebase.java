package br.edu.ifam.sadm.mobipessoas.DAO;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Professor on 22/08/2017.
 */

public class ConfiguracaoFirebase {
    private static DatabaseReference refenciaFirebase;
    private static FirebaseAuth autenticacao;


    public static DatabaseReference getFirebase() {
        if (refenciaFirebase == null) {
            refenciaFirebase = FirebaseDatabase.getInstance().getReference();
        }
        return refenciaFirebase;
    }

    public static FirebaseAuth getFirebaseAutenticacao() {
        if (autenticacao == null) {
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;
    }
}
