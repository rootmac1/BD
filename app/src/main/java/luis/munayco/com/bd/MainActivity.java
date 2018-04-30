package luis.munayco.com.bd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import luis.munayco.com.bd.Objetos.FirebaseReferences;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(FirebaseReferences.TUTORIAL_REFERENCE);
        
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) { // actualiza en tiempo real
               // int valor = dataSnapshot.getValue(Integer.class);
               // Log.i("DATOS",valor+"");

            }

            @Override
            public void onCancelled(DatabaseError databaseError) { // Cuando hay un error
                Log.e("ERROR",databaseError.getMessage());

            }
        });




    }

    private FirebaseAuth mAuth;
}
