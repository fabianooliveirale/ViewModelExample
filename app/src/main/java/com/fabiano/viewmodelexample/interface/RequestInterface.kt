package com.fabiano.viewmodelexample.`interface`

interface RequestInterface {
    fun success()
    fun error(error: String)
    fun failure(error: String)
}