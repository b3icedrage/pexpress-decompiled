package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: rm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6426rm2 implements InterfaceC6846tm2, IInterface {
    public final IBinder b;

    public C6426rm2(IBinder iBinder) {
        this.b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }

    @Override // defpackage.InterfaceC6846tm2
    public final void d(Bundle bundle, BinderC3018bm2 binderC3018bm2) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
        int i = C5587nm2.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(binderC3018bm2);
        try {
            this.b.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
