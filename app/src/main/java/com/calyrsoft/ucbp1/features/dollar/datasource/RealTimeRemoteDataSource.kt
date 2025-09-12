//package com.calyrsoft.ucbp1.features.dollar.datasource
//
//import com.calyrsoft.ucbp1.features.dollar.domain.model.DollarModel
//import kotlinx.coroutines.flow.Flow
//import kotlinx.coroutines.flow.callbackFlow
//
//class RealTimeRemoteDataSource {
//
//    suspend fun getDollarUpdates(): Flow<DollarModel> = callbackFlow {
//        val callback = object : ValueEventListener {
//            override fun onCancelled(p0: DatabaseError) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//                close(p0.toException())
//            }
//            override fun onDataChange(p0: DataSnapshot) {
//                val value = p0.getValue(String::class.java)
//                if (value != null) {
//                    trySend(value)
//                }
//            }
//        }
//
//        // Write a message to the database
////        val database = Firebase.database
////        val myRef = database.getReference("app_dollar")
////        myRef.addValueEventListener(callback)
////
////        awaitClose {
////            myRef.removeEventListener(callback)
////        }
//    }
//}