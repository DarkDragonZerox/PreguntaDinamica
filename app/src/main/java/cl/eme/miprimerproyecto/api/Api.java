package cl.eme.miprimerproyecto.api;

import cl.eme.miprimerproyecto.pojos.PreguntasLista;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("api.php?amount=20&category=15&difficulty=easy")
    Call<PreguntasLista> getAllQuestions();
}
