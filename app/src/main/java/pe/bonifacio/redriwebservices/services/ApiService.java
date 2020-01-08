package pe.bonifacio.redriwebservices.services;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import pe.bonifacio.redriwebservices.models.Proyecto;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface ApiService {

    String API_BASE_URL = "http://10.0.2.2:8080";

    @GET("/proyectos")
    Call<List<Proyecto>> getProyectos();

    @FormUrlEncoded
    @POST("/proyectos")
    Call<Proyecto> createProyecto(@Field("nombre") String nombre);
    @Multipart
    @POST("/proyectos")
    Call<Proyecto> createProyecto(@Part("nombre") RequestBody nombre,
                                  @Part MultipartBody.Part imagen
    );
    @DELETE("/proyectos/{id}")
    Call<String> destroyProyecto(@Path("id") Long id);


}
