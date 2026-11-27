package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: oa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5748oa1 extends LM1 {

    @NotNull
    public static final C5748oa1 d = new C5748oa1();
    public static final Parcelable.Creator<C5748oa1> CREATOR = new a();

    /* JADX INFO: renamed from: oa1$a */
    public static class a implements Parcelable.Creator<C5748oa1> {
        @Override // android.os.Parcelable.Creator
        public final C5748oa1 createFromParcel(Parcel in) {
            Intrinsics.checkNotNullParameter(in, "in");
            if (in.readInt() != 0) {
                return C5748oa1.d;
            }
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final C5748oa1[] newArray(int i) {
            return new C5748oa1[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String toString() {
        return "coil.size.OriginalSize";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(1);
    }
}
