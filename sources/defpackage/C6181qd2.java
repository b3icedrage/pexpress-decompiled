package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: qd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6181qd2 extends AbstractC5971pd2 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public C6181qd2(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C8092zj(), new C8092zj(), new C8092zj());
    }

    @Override // defpackage.AbstractC5971pd2
    public final C6181qd2 a() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new C6181qd2(parcel, iDataPosition, i, C5807oq.b(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // defpackage.AbstractC5971pd2
    public final boolean e() {
        return this.e.readInt() != 0;
    }

    @Override // defpackage.AbstractC5971pd2
    public final byte[] f() {
        Parcel parcel = this.e;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // defpackage.AbstractC5971pd2
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // defpackage.AbstractC5971pd2
    public final boolean h(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i4;
        }
        return this.k == i;
    }

    @Override // defpackage.AbstractC5971pd2
    public final int i() {
        return this.e.readInt();
    }

    @Override // defpackage.AbstractC5971pd2
    public final <T extends Parcelable> T j() {
        return (T) this.e.readParcelable(C6181qd2.class.getClassLoader());
    }

    @Override // defpackage.AbstractC5971pd2
    public final String k() {
        return this.e.readString();
    }

    @Override // defpackage.AbstractC5971pd2
    public final void m(int i) {
        u();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        q(0);
        q(i);
    }

    @Override // defpackage.AbstractC5971pd2
    public final void n(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    @Override // defpackage.AbstractC5971pd2
    public final void o(byte[] bArr) {
        Parcel parcel = this.e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // defpackage.AbstractC5971pd2
    public final void p(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // defpackage.AbstractC5971pd2
    public final void q(int i) {
        this.e.writeInt(i);
    }

    @Override // defpackage.AbstractC5971pd2
    public final void r(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // defpackage.AbstractC5971pd2
    public final void s(String str) {
        this.e.writeString(str);
    }

    public final void u() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.d.get(i);
            Parcel parcel = this.e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    public C6181qd2(Parcel parcel, int i, int i2, String str, C8092zj<String, Method> c8092zj, C8092zj<String, Method> c8092zj2, C8092zj<String, Class> c8092zj3) {
        super(c8092zj, c8092zj2, c8092zj3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
