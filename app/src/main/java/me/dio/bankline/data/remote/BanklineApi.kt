package me.dio.bankline.data.remote

import me.dio.bankline.domain.Movimentacao
import retrofit2.http.GET
import retrofit2.http.Path

interface BanklineApi {

    @GET("movimentacoes/{id}")
    suspend fun findBaklineStatement(@Path("id") accountHolderId: Int): List<Movimentacao>

}