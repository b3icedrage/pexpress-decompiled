package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: dc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3396dc1 extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<C3396dc1> CREATOR = new a();

    /* JADX INFO: renamed from: dc1$a */
    public class a implements Parcelable.ClassLoaderCreator<C3396dc1> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public final C3396dc1 createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new C3396dc1(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Object[] newArray(int i) {
            return new C3396dc1[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(@NonNull Parcel parcel) {
            return new C3396dc1(parcel, null);
        }
    }

    public C3396dc1() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    public C3396dc1(@NonNull Parcel parcel, ClassLoader classLoader) {
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i2 = 0; i2 < i; i2++) {
            put(iArr[i2], parcelableArray[i2]);
        }
    }
}
