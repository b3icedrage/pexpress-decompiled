package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import io.sentry.android.core.b0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC8127zt0 extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        InterfaceC7917yt0 callback = null;
        InterfaceC7917yt0 callback2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC7917yt0)) {
                    C7707xt0 c7707xt0 = new C7707xt0();
                    c7707xt0.b = strongBinder;
                    callback = c7707xt0;
                } else {
                    callback = (InterfaceC7917yt0) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            MultiInstanceInvalidationService.a aVar = (MultiInstanceInvalidationService.a) this;
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                synchronized (multiInstanceInvalidationService.g) {
                    try {
                        int i4 = multiInstanceInvalidationService.d + 1;
                        multiInstanceInvalidationService.d = i4;
                        if (multiInstanceInvalidationService.g.register(callback, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.e.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.d--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC7917yt0)) {
                    C7707xt0 c7707xt1 = new C7707xt0();
                    c7707xt1.b = strongBinder2;
                    callback2 = c7707xt1;
                } else {
                    callback2 = (InterfaceC7917yt0) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            Intrinsics.checkNotNullParameter(callback2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService2.g) {
                multiInstanceInvalidationService2.g.unregister(callback2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] tables = parcel.createStringArray();
        Intrinsics.checkNotNullParameter(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = MultiInstanceInvalidationService.this;
        synchronized (multiInstanceInvalidationService3.g) {
            try {
                String str = (String) multiInstanceInvalidationService3.e.get(Integer.valueOf(i6));
                if (str == null) {
                    b0.e("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int iBeginBroadcast = multiInstanceInvalidationService3.g.beginBroadcast();
                    while (i3 < iBeginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.g.getBroadcastCookie(i3);
                            Intrinsics.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str2 = (String) multiInstanceInvalidationService3.e.get(num);
                            if (i6 != iIntValue && str.equals(str2)) {
                                try {
                                    multiInstanceInvalidationService3.g.getBroadcastItem(i3).a(tables);
                                } catch (RemoteException e) {
                                    b0.f("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                            i3++;
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService3.g.finishBroadcast();
                            throw th2;
                        }
                    }
                    multiInstanceInvalidationService3.g.finishBroadcast();
                    Unit unit = Unit.a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
