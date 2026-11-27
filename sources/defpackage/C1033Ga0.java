package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Ga0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1033Ga0 extends AbstractC7727y {
    public static final Parcelable.Creator<C1033Ga0> CREATOR = new a();

    @NonNull
    public final C2703aM1<String, Bundle> g;

    /* JADX INFO: renamed from: Ga0$a */
    public class a implements Parcelable.ClassLoaderCreator<C1033Ga0> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public final C1033Ga0 createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new C1033Ga0(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Object[] newArray(int i) {
            return new C1033Ga0[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(@NonNull Parcel parcel) {
            return new C1033Ga0(parcel, null);
        }
    }

    public C1033Ga0(Parcelable parcelable) {
        super(parcelable);
        this.g = new C2703aM1<>();
    }

    @NonNull
    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.g + "}";
    }

    @Override // defpackage.AbstractC7727y, android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C2703aM1<String, Bundle> c2703aM1 = this.g;
        int i2 = c2703aM1.g;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = c2703aM1.i(i3);
            bundleArr[i3] = c2703aM1.m(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C1033Ga0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.g = new C2703aM1<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.g.put(strArr[i2], bundleArr[i2]);
        }
    }
}
