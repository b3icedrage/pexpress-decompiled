package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ld1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1433Ld1 extends LM1 {
    public static final Parcelable.Creator<C1433Ld1> CREATOR = new a();
    public final int d;
    public final int e;

    /* JADX INFO: renamed from: Ld1$a */
    public static class a implements Parcelable.Creator<C1433Ld1> {
        @Override // android.os.Parcelable.Creator
        public final C1433Ld1 createFromParcel(Parcel in) {
            Intrinsics.checkNotNullParameter(in, "in");
            return new C1433Ld1(in.readInt(), in.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final C1433Ld1[] newArray(int i) {
            return new C1433Ld1[i];
        }
    }

    public C1433Ld1(int i, int i2) {
        this.d = i;
        this.e = i2;
        if (!(i > 0 && i2 > 0)) {
            throw new IllegalArgumentException("width and height must be > 0.");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1433Ld1)) {
            return false;
        }
        C1433Ld1 c1433Ld1 = (C1433Ld1) obj;
        return this.d == c1433Ld1.d && this.e == c1433Ld1.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (Integer.hashCode(this.d) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PixelSize(width=");
        sb.append(this.d);
        sb.append(", height=");
        return SK.b(sb, this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
