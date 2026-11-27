package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: xt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7707xt0 implements InterfaceC7917yt0 {
    public IBinder b;

    @Override // defpackage.InterfaceC7917yt0
    public final void a(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            parcelObtain.writeStringArray(strArr);
            this.b.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }
}
