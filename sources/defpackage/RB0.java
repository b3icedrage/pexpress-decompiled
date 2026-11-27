package defpackage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RB0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RB0> CREATOR = new a();

    @NotNull
    public final IntentSender d;

    @Nullable
    public final Intent e;
    public final int g;
    public final int h;

    public static final class a implements Parcelable.Creator<RB0> {
        @Override // android.os.Parcelable.Creator
        public final RB0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "inParcel");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
            Intrinsics.checkNotNull(parcelable);
            return new RB0((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RB0[] newArray(int i) {
            return new RB0[i];
        }
    }

    public RB0(@NotNull IntentSender intentSender, @Nullable Intent intent, int i, int i2) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.d = intentSender;
        this.e = intent;
        this.g = i;
        this.h = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.g);
        dest.writeInt(this.h);
    }
}
