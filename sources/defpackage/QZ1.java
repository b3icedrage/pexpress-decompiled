package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class QZ1 implements Parcelable {
    public static final Parcelable.Creator<QZ1> CREATOR = new a();
    public long d;
    public long e;

    public class a implements Parcelable.Creator<QZ1> {
        @Override // android.os.Parcelable.Creator
        public final QZ1 createFromParcel(Parcel parcel) {
            return new QZ1(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final QZ1[] newArray(int i) {
            return new QZ1[i];
        }
    }

    public QZ1() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }

    public final long a() {
        return new QZ1().e - this.e;
    }

    public final long b(@NonNull QZ1 qz1) {
        return qz1.e - this.e;
    }

    public final void c() {
        this.d = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.e = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
    }

    @VisibleForTesting
    public QZ1(long j, long j2) {
        this.d = j;
        this.e = j2;
    }
}
