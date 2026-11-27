package defpackage;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.fragment.app.b;
import java.util.ArrayList;

/* JADX INFO: renamed from: kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C4961kp implements Parcelable {
    public static final Parcelable.Creator<C4961kp> CREATOR = new a();
    public final ArrayList d;
    public final ArrayList e;

    /* JADX INFO: renamed from: kp$a */
    public class a implements Parcelable.Creator<C4961kp> {
        @Override // android.os.Parcelable.Creator
        public final C4961kp createFromParcel(Parcel parcel) {
            return new C4961kp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C4961kp[] newArray(int i) {
            return new C4961kp[i];
        }
    }

    public C4961kp(@NonNull Parcel parcel) {
        this.d = parcel.createStringArrayList();
        this.e = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeStringList(this.d);
        parcel.writeTypedList(this.e);
    }
}
