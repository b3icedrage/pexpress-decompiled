package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: ss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6652ss<DataType> implements InterfaceC4765jt1<DataType, BitmapDrawable> {
    public final InterfaceC4765jt1<DataType, Bitmap> a;
    public final Resources b;

    public C6652ss(@NonNull Resources resources, @NonNull InterfaceC4765jt1<DataType, Bitmap> interfaceC4765jt1) {
        this.b = resources;
        this.a = interfaceC4765jt1;
    }

    @Override // defpackage.InterfaceC4765jt1
    public final InterfaceC3667et1<BitmapDrawable> a(@NonNull DataType datatype, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        InterfaceC3667et1<Bitmap> interfaceC3667et1A = this.a.a(datatype, i, i2, c4227ha1);
        if (interfaceC3667et1A == null) {
            return null;
        }
        return new C4190hO0(this.b, interfaceC3667et1A);
    }

    @Override // defpackage.InterfaceC4765jt1
    public final boolean b(@NonNull DataType datatype, @NonNull C4227ha1 c4227ha1) {
        return this.a.b(datatype, c4227ha1);
    }
}
