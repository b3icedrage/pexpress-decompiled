package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements com.google.android.material.datepicker.a.c {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final long d;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final b createFromParcel(@NonNull Parcel parcel) {
            return new b(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(long j) {
        this.d = j;
    }

    @Override // com.google.android.material.datepicker.a.c
    public final boolean M0(long j) {
        return j >= this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.d == ((b) obj).d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeLong(this.d);
    }
}
