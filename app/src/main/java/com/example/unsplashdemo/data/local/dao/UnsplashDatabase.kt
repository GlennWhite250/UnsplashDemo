package com.example.unsplashdemo.data.local.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.unsplashdemo.model.UnsplashImage
import com.example.unsplashdemo.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase: RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}