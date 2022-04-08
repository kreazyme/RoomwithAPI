package com.example.dogapp.model;

import android.content.ClipData;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ItemDAO {

    @Insert
    public void Insert(DogBreed...dogBreeds);

    @Update
    public void Update(DogBreed...dogBreeds);

    @Delete
    public void Delete(DogBreed...dogBreeds);

    @Query("SELECT * FROM dog_bred")
    public List<DogBreed> getDogs();
}
