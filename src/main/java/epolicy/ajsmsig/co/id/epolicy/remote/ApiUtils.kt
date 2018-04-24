package epolicy.ajsmsig.co.id.epolicy.remote

/**
 * Created by Ahmad_R on 10/04/2018.
 */
open class ApiUtils {
    val BASE_URL = "https://epolicy.sinarmasmsiglife.co.id/"

    fun getUserService(): UserService {

        return RetrofitClient().getClient(BASE_URL)!!.create(UserService::class.java)


    }

}