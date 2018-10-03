package us.scintillating.amazonitems

import build.com.ECS.client.jax.*
import src.com.ECS.client.jax.*


private val amazonPrivateKey = ""

//TODO -> Please implement getInfoFromAmazon completely after getting private key.
fun getInfoFromAmazon(item: String, category: String) {
// Set the service:
    val service = com.ECS.client.jax.AWSECommerceService()

//Set the service port:
    val port = service.getAWSECommerceServicePort()

//Get the operation object:
    val itemRequest = com.ECS.client.jax.ItemSearchRequest()

//Fill in the request object:

    //The category of the search:
    itemRequest.setSearchIndex(item)

    //The keyword that is searched:
    itemRequest.setKeywords(category)

    //During which time period:
    itemRequest.setVersion("2013-08-01")

    val itemElement = com.ECS.client.jax.ItemSearch()
    itemElement.setAWSAccessKeyId(amazonPrivateKey)
    itemElement.getRequest().add(itemRequest)

//Call the Web service operation and store the response
//in the response object:
    val response = port.itemSearch(ItemElement)
}