package defpackage;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import io.jsonwebtoken.JwtParser;

/* JADX INFO: renamed from: Zt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2604Zt0 extends IInterface {
    public static final String a = "android$support$v4$app$INotificationSideChannel".replace('$', JwtParser.SEPARATOR_CHAR);

    /* JADX INFO: renamed from: Zt0$a */
    public static abstract class a extends Binder implements InterfaceC2604Zt0 {
        public static final /* synthetic */ int b = 0;

        /* JADX INFO: renamed from: Zt0$a$a, reason: collision with other inner class name */
        public static class C0209a implements InterfaceC2604Zt0 {
            public IBinder b;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.b;
            }

            @Override // defpackage.InterfaceC2604Zt0
            public final void j(String str, int i, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2604Zt0.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(null);
                    if (notification != null) {
                        parcelObtain.writeInt(1);
                        notification.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.b.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }

    void j(String str, int i, Notification notification);
}
