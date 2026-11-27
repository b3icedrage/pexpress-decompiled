package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: renamed from: b11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2855b11 implements Comparable<C2855b11>, Parcelable {
    public static final Parcelable.Creator<C2855b11> CREATOR = new a();

    @NonNull
    public final Calendar d;
    public final int e;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public String k;

    /* JADX INFO: renamed from: b11$a */
    public class a implements Parcelable.Creator<C2855b11> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C2855b11 createFromParcel(@NonNull Parcel parcel) {
            return C2855b11.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C2855b11[] newArray(int i) {
            return new C2855b11[i];
        }
    }

    public C2855b11(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = Qb2.c(calendar);
        this.d = calendarC;
        this.e = calendarC.get(2);
        this.g = calendarC.get(1);
        this.h = calendarC.getMaximum(7);
        this.i = calendarC.getActualMaximum(5);
        this.j = calendarC.getTimeInMillis();
    }

    @NonNull
    public static C2855b11 b(int i, int i2) {
        Calendar calendarE = Qb2.e(null);
        calendarE.set(1, i);
        calendarE.set(2, i2);
        return new C2855b11(calendarE);
    }

    @NonNull
    public static C2855b11 e(long j) {
        Calendar calendarE = Qb2.e(null);
        calendarE.setTimeInMillis(j);
        return new C2855b11(calendarE);
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull C2855b11 c2855b11) {
        return this.d.compareTo(c2855b11.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2855b11)) {
            return false;
        }
        C2855b11 c2855b11 = (C2855b11) obj;
        return this.e == c2855b11.e && this.g == c2855b11.g;
    }

    @NonNull
    public final String f() {
        if (this.k == null) {
            this.k = Qb2.b("yMMMM", Locale.getDefault()).format(new Date(this.d.getTimeInMillis()));
        }
        return this.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.g)});
    }

    public final int i(@NonNull C2855b11 c2855b11) {
        if (!(this.d instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c2855b11.e - this.e) + ((c2855b11.g - this.g) * 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.g);
        parcel.writeInt(this.e);
    }
}
