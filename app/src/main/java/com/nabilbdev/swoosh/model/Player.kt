package com.nabilbdev.swoosh.model

import android.os.Parcel
import android.os.Parcelable

class Player(var league: String, var skill: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(league)
        parcel.writeString(skill)
    }

    override fun describeContents() = 0 // not really matter

    // this is required by parcelable class
    companion object CREATOR : Parcelable.Creator<Player> {
        override fun createFromParcel(parcel: Parcel): Player {
            return Player(parcel)
        }

        override fun newArray(size: Int): Array<Player?> {
            return arrayOfNulls(size)
        }
    }

}