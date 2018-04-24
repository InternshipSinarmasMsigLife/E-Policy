package epolicy.ajsmsig.co.id.epolicy.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Ahmad_R on 10/04/2018.
 */
class RetrofitClient {

    private var retrofit: Retrofit? = null

    fun getClient(url: String): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
        return retrofit
    }
}