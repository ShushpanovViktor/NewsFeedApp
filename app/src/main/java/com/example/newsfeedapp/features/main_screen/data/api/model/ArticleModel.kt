package com.example.newsfeedapp.features.main_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class  ArticleModel(
    @SerializedName("source") val source: List<SourceModel>,
    @SerializedName("author") val author: String,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("url") val url: String,
    @SerializedName("urlToImage") val urlToImage: String,
    @SerializedName("publishedAt") val publishedAt: String,
    @SerializedName("content") val content: String
)

// {
//
// -
// "source": {
// "id": null,
// "name": "CNBC"
// },
// "author": "Robert Towey",
// "title": "Covid vaccine boosters are now available. Here's who's eligible for Pfizer, Moderna and J&J's shots - CNBC",
// "description": null,
// "url": "https://www.cnbc.com/2021/10/23/covid-vaccine-boosters-are-now-available-heres-whos-eligible-for-pfizer-moderna-and-jjs-shots-.html",
// "urlToImage": "https://image.cnbcfm.com/api/v1/image/106949721-16329435732021-09-29t191455z_1227954114_rc2szp9xghnr_rtrmadp_0_health-coronavirus-usa-vaccines.jpeg?v=1632943627",
// "publishedAt": "2021-10-23T12:00:01Z",
// "content": "Nearly 100 million people nationwide are immediately eligible to receive Covid booster shots after the Centers for Disease Control and Prevention authorized extra doses of Moderna and Johnson &amp; J… [+639 chars]"
//
// },