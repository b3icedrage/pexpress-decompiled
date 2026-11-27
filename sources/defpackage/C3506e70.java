package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: e70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3506e70 extends AbstractC8117zq implements Parcelable {
    public static final Parcelable.Creator<C3506e70> CREATOR = new a();
    public float h;

    /* JADX INFO: renamed from: e70$a */
    public static class a implements Parcelable.Creator<C3506e70> {
        @Override // android.os.Parcelable.Creator
        public final C3506e70 createFromParcel(Parcel parcel) {
            C3506e70 c3506e70 = new C3506e70();
            c3506e70.h = 0.0f;
            c3506e70.h = parcel.readFloat();
            c3506e70.d = parcel.readFloat();
            if (parcel.readInt() == 1) {
                c3506e70.e = parcel.readParcelable(Object.class.getClassLoader());
            }
            return c3506e70;
        }

        @Override // android.os.Parcelable.Creator
        public final C3506e70[] newArray(int i) {
            return new C3506e70[i];
        }
    }

    public C3506e70() {
        this.h = 0.0f;
    }

    public float b() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.h + " y: " + a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.h);
        parcel.writeFloat(a());
        if (this.e == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.e, i);
        }
    }

    public C3506e70(float f, float f2) {
        super(f2);
        this.h = f;
    }
}
