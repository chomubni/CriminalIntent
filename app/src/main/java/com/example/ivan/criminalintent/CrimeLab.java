package com.example.ivan.criminalintent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ivan.criminalintent.database.CrimeBaseHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by ivan on 8/19/17.
 */

public class CrimeLab {

    private Context mAppContext;

    private SQLiteDatabase mDatabase;

    private static CrimeLab sCrimeLab;
    public static CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context){
        mAppContext = context.getApplicationContext();
        mDatabase = new CrimeBaseHelper(mAppContext).getWritableDatabase();

    }

    public List<Crime> getCrimes(){
        return new ArrayList<>();
    }

    public Crime getCrime(UUID id){
        return null;
    }

    public void addCrime(Crime crime){

    }
}
