package epolicy.ajsmsig.co.id.epolicy.remote

import epolicy.ajsmsig.co.id.epolicy.model.ResObj
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * Created by Ahmad_R on 10/04/2018.
 */
interface  UserService  {
        @GET("bb/login/{u}/{p}")
        fun login(@Path("u") u: String,
                  @Path("p") p: String) :Call<ResObj>



}