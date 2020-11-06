package com.example.listview

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CompanyCurrency (
    @Expose
    @SerializedName("market_cap_rank")
    var market_cap_rank: Int = 0,

    @Expose
    @SerializedName("name")
    var name: String? = null,

    @Expose
    @SerializedName("symbol")
    var symbol: String? = null,

    @Expose
    @SerializedName("aliases")
    var aliases: String? = null,

    @Expose
    @SerializedName("shortname")
    var shortname: String? = null,

    @Expose
    @SerializedName("display_symbol")
    var display_symbol: String? = null,

    @Expose
    @SerializedName("last_price_usd")
    var last_price_usd: Int = 0,

    @Expose
    @SerializedName("last_pmarket_cap_rankrice_usd")
    var last_pmarket_cap_rankrice_usd: Int = 0,

    @Expose
    @SerializedName("volume_rank")
    var volume_rank: Int = 0,

    @Expose
    @SerializedName("price_change_1H_percent")
    var price_change_1H_percent: Int = 0,

    @Expose
    @SerializedName("price_change_1D_percent")
    var price_change_1D_percent: Int = 0,

    @Expose
    @SerializedName("price_change_7D_percent")
    var price_change_7D_percent: Int = 0,

    @Expose
    @SerializedName("price_change_30D_percent")
    var price_change_30D_percent: Int = 0,

    @Expose
    @SerializedName("price_change_180D_percent")
    var price_change_180D_percent: Int = 0,

    @Expose
    @SerializedName("price_change_365D_percent")
    var price_change_365D_percent: Int = 0,

    @Expose
    @SerializedName("price_change_YTD_percent")
    var price_change_YTD_percent: Int = 0,

    @Expose
    @SerializedName("volume_24_usd")
    var volume_24_usd: Int = 0,

    @Expose
    @SerializedName("price_change_90D_percent")
    var price_change_90D_percent: Int = 0,

    @Expose
    @SerializedName("display")
    var display: String? = null,
    @Expose
    @SerializedName("trading_since")
    var trading_since: String? = null,
    @Expose
    @SerializedName("supply")
    var supply: String? = null,
    @Expose
    @SerializedName("last_update")
    var last_update: String? = null,

    @Expose
    @SerializedName("ico_end")
    var ico_end: String? = null,

    @Expose
    @SerializedName("include_supply")
    var include_supply: String? = null,

    @Expose
    @SerializedName("market_cap_usd")
    var market_cap_usd: Int = 0

)