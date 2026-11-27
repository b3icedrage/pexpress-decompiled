package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import defpackage.AbstractBinderC8127zt0;
import defpackage.InterfaceC7917yt0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MultiInstanceInvalidationService extends Service {
    public int d;

    @NotNull
    public final LinkedHashMap e = new LinkedHashMap();

    @NotNull
    public final b g = new b();

    @NotNull
    public final a h = new a();

    public static final class a extends AbstractBinderC8127zt0 {
        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }
    }

    public static final class b extends RemoteCallbackList<InterfaceC7917yt0> {
        public b() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object cookie) {
            InterfaceC7917yt0 callback = (InterfaceC7917yt0) iInterface;
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            MultiInstanceInvalidationService.this.e.remove((Integer) cookie);
        }
    }

    @Override // android.app.Service
    @NotNull
    public final IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.h;
    }
}
