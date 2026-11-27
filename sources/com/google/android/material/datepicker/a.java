package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import defpackage.C2855b11;
import defpackage.Qb2;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0310a();

    @NonNull
    public final C2855b11 d;

    @NonNull
    public final C2855b11 e;

    @NonNull
    public final c g;
    public final C2855b11 h;
    public final int i;
    public final int j;
    public final int k;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    public class C0310a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final a createFromParcel(@NonNull Parcel parcel) {
            return new a((C2855b11) parcel.readParcelable(C2855b11.class.getClassLoader()), (C2855b11) parcel.readParcelable(C2855b11.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (C2855b11) parcel.readParcelable(C2855b11.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public static final class b {
        public static final /* synthetic */ int c = 0;
        public Long a;
        public c b;

        static {
            Qb2.a(C2855b11.b(1900, 0).j);
            Qb2.a(C2855b11.b(2100, 11).j);
        }
    }

    public interface c extends Parcelable {
        boolean M0(long j);
    }

    public a(C2855b11 c2855b11, C2855b11 c2855b12, c cVar, C2855b11 c2855b13, int i) {
        Objects.requireNonNull(c2855b11, "start cannot be null");
        Objects.requireNonNull(c2855b12, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.d = c2855b11;
        this.e = c2855b12;
        this.h = c2855b13;
        this.i = i;
        this.g = cVar;
        if (c2855b13 != null && c2855b11.d.compareTo(c2855b13.d) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c2855b13 != null && c2855b13.d.compareTo(c2855b12.d) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > Qb2.e(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.k = c2855b11.i(c2855b12) + 1;
        this.j = (c2855b12.g - c2855b11.g) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.d.equals(aVar.d) && this.e.equals(aVar.e) && Objects.equals(this.h, aVar.h) && this.i == aVar.i && this.g.equals(aVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.h, Integer.valueOf(this.i), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.h, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeInt(this.i);
    }
}
