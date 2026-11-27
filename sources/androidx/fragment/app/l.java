package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C4961kp;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();
    public ArrayList<String> d;
    public ArrayList<String> e;
    public b[] g;
    public int h;
    public String i = null;
    public ArrayList<String> j = new ArrayList<>();
    public ArrayList<C4961kp> k = new ArrayList<>();
    public ArrayList<FragmentManager.l> l;

    public class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            l lVar = new l();
            lVar.i = null;
            lVar.j = new ArrayList<>();
            lVar.k = new ArrayList<>();
            lVar.d = parcel.createStringArrayList();
            lVar.e = parcel.createStringArrayList();
            lVar.g = (b[]) parcel.createTypedArray(b.CREATOR);
            lVar.h = parcel.readInt();
            lVar.i = parcel.readString();
            lVar.j = parcel.createStringArrayList();
            lVar.k = parcel.createTypedArrayList(C4961kp.CREATOR);
            lVar.l = parcel.createTypedArrayList(FragmentManager.l.CREATOR);
            return lVar;
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i) {
            return new l[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.d);
        parcel.writeStringList(this.e);
        parcel.writeTypedArray(this.g, i);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeStringList(this.j);
        parcel.writeTypedList(this.k);
        parcel.writeTypedList(this.l);
    }
}
