package me.dio.bankline.domain
import com.google.gson.annotations.SerializedName
data class Movimentacao(
    val id: Int,
    val dataHora: String,
    val descricao: String,
    val valor: Double,
    val tipo: TipoMovimentacao,
    //TODO Mapear "idConta _> idCorrentista"
    @SerializedName("idConta")
    val idCorrentista:Int
)
