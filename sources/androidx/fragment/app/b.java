package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final int[] d;
    public final ArrayList<String> e;
    public final int[] g;
    public final int[] h;
    public final int i;
    public final String j;
    public final int k;
    public final int l;
    public final CharSequence m;
    public final int n;
    public final CharSequence o;
    public final ArrayList<String> p;
    public final ArrayList<String> q;
    public final boolean r;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.a.size();
        this.d = new int[size * 6];
        if (!aVar.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.e = new ArrayList<>(size);
        this.g = new int[size];
        this.h = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            q.a aVar2 = aVar.a.get(i2);
            int i3 = i + 1;
            this.d[i] = aVar2.a;
            ArrayList<String> arrayList = this.e;
            Fragment fragment = aVar2.b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.d;
            iArr[i3] = aVar2.c ? 1 : 0;
            iArr[i + 2] = aVar2.d;
            iArr[i + 3] = aVar2.e;
            int i4 = i + 5;
            iArr[i + 4] = aVar2.f;
            i += 6;
            iArr[i4] = aVar2.g;
            this.g[i2] = aVar2.h.ordinal();
            this.h[i2] = aVar2.i.ordinal();
        }
        this.i = aVar.f;
        this.j = aVar.i;
        this.k = aVar.s;
        this.l = aVar.j;
        this.m = aVar.k;
        this.n = aVar.l;
        this.o = aVar.m;
        this.p = aVar.n;
        this.q = aVar.o;
        this.r = aVar.p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.d);
        parcel.writeStringList(this.e);
        parcel.writeIntArray(this.g);
        parcel.writeIntArray(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeInt(this.n);
        TextUtils.writeToParcel(this.o, parcel, 0);
        parcel.writeStringList(this.p);
        parcel.writeStringList(this.q);
        parcel.writeInt(this.r ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.d = parcel.createIntArray();
        this.e = parcel.createStringArrayList();
        this.g = parcel.createIntArray();
        this.h = parcel.createIntArray();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.m = (CharSequence) creator.createFromParcel(parcel);
        this.n = parcel.readInt();
        this.o = (CharSequence) creator.createFromParcel(parcel);
        this.p = parcel.createStringArrayList();
        this.q = parcel.createStringArrayList();
        this.r = parcel.readInt() != 0;
    }
}
