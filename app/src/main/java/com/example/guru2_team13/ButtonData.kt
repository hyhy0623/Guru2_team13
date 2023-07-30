package com.example.guru2_team13

import android.os.Parcel
import android.os.Parcelable

data class ButtonData(
    val buttonId: Int,
    val buttonText: String?,
    val isChecked: Boolean
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(buttonId)
        parcel.writeString(buttonText)
        parcel.writeByte(if (isChecked) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ButtonData> {
        override fun createFromParcel(parcel: Parcel): ButtonData {
            return ButtonData(parcel)
        }

        override fun newArray(size: Int): Array<ButtonData?> {
            return arrayOfNulls(size)
        }
    }
}