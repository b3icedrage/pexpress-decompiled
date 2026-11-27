package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();
    public final String d;
    public final String e;
    public final boolean g;
    public final int h;
    public final int i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final String p;
    public final int q;
    public final boolean r;

    public class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i) {
            return new n[i];
        }
    }

    public n(Fragment fragment) {
        this.d = fragment.getClass().getName();
        this.e = fragment.mWho;
        this.g = fragment.mFromLayout;
        this.h = fragment.mFragmentId;
        this.i = fragment.mContainerId;
        this.j = fragment.mTag;
        this.k = fragment.mRetainInstance;
        this.l = fragment.mRemoving;
        this.m = fragment.mDetached;
        this.n = fragment.mHidden;
        this.o = fragment.mMaxState.ordinal();
        this.p = fragment.mTargetWho;
        this.q = fragment.mTargetRequestCode;
        this.r = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb.append("FragmentState{");
        sb.append(this.d);
        sb.append(" (");
        sb.append(this.e);
        sb.append(")}:");
        if (this.g) {
            sb.append(" fromLayout");
        }
        int i = this.i;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.k) {
            sb.append(" retainInstance");
        }
        if (this.l) {
            sb.append(" removing");
        }
        if (this.m) {
            sb.append(" detached");
        }
        if (this.n) {
            sb.append(" hidden");
        }
        String str2 = this.p;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.q);
        }
        if (this.r) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r ? 1 : 0);
    }

    public n(Parcel parcel) {
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt() != 0;
        this.m = parcel.readInt() != 0;
        this.n = parcel.readInt() != 0;
        this.o = parcel.readInt();
        this.p = parcel.readString();
        this.q = parcel.readInt();
        this.r = parcel.readInt() != 0;
    }
}
