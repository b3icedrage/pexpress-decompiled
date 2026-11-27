package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: aO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2707aO implements Parcelable {
    public static final Parcelable.Creator<C2707aO> CREATOR = new a();
    public final String d;
    public final AtomicLong e;

    /* JADX INFO: renamed from: aO$a */
    public class a implements Parcelable.Creator<C2707aO> {
        @Override // android.os.Parcelable.Creator
        public final C2707aO createFromParcel(Parcel parcel) {
            return new C2707aO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C2707aO[] newArray(int i) {
            return new C2707aO[i];
        }
    }

    public C2707aO(@NonNull String str) {
        this.d = str;
        this.e = new AtomicLong(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeLong(this.e.get());
    }

    public C2707aO(Parcel parcel) {
        this.d = parcel.readString();
        this.e = new AtomicLong(parcel.readLong());
    }
}
