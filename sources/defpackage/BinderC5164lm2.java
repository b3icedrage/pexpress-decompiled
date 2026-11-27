package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: lm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class BinderC5164lm2 extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        AbstractBinderC7056um2 abstractBinderC7056um2 = (AbstractBinderC7056um2) this;
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i3 = C5587nm2.a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(EK.e(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        BinderC3018bm2 binderC3018bm2 = (BinderC3018bm2) abstractBinderC7056um2;
        Xl2 xl2 = binderC3018bm2.d.d;
        TaskCompletionSource taskCompletionSource = binderC3018bm2.c;
        synchronized (xl2.f) {
            xl2.e.remove(taskCompletionSource);
        }
        xl2.a().post(new Am2(xl2));
        binderC3018bm2.b.a("onRequestIntegrityToken", new Object[0]);
        binderC3018bm2.d.c.getClass();
        int i4 = bundle.getInt("error");
        PB0 pb0 = i4 == 0 ? null : new PB0(i4, null);
        if (pb0 != null) {
            binderC3018bm2.c.trySetException(pb0);
            return true;
        }
        String string = bundle.getString("token");
        if (string == null) {
            binderC3018bm2.c.trySetException(new PB0(-100, null));
            return true;
        }
        bundle.getLong("request.token.sid");
        String str = binderC3018bm2.d.b;
        ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat("IntegrityDialogWrapper");
        binderC3018bm2.c.trySetResult(new C4744jm2(string));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
