package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class GM1 {
    public static volatile GM1 d;
    public final c a;
    public final HashSet b = new HashSet();
    public boolean c;

    public class a implements InterfaceC4742jm0<ConnectivityManager> {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.InterfaceC4742jm0
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.a.getSystemService("connectivity");
        }
    }

    public class b implements InterfaceC6118qK.a {
        public b() {
        }

        @Override // defpackage.InterfaceC6118qK.a
        public final void a(boolean z) {
            ArrayList arrayList;
            C6177qc2.a();
            synchronized (GM1.this) {
                arrayList = new ArrayList(GM1.this.b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC6118qK.a) it.next()).a(z);
            }
        }
    }

    public static final class c {
        public boolean a;
        public final b b;
        public final C4483im0 c;
        public final a d = new a();

        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(@NonNull Network network) {
                C6177qc2.f().post(new HM1(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(@NonNull Network network) {
                C6177qc2.f().post(new HM1(this, false));
            }
        }

        public c(C4483im0 c4483im0, b bVar) {
            this.c = c4483im0;
            this.b = bVar;
        }
    }

    public GM1(@NonNull Context context) {
        this.a = new c(new C4483im0(new a(context)), new b());
    }

    public static GM1 a(@NonNull Context context) {
        if (d == null) {
            synchronized (GM1.class) {
                try {
                    if (d == null) {
                        d = new GM1(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final void b() {
        if (this.c || this.b.isEmpty()) {
            return;
        }
        c cVar = this.a;
        C4483im0 c4483im0 = cVar.c;
        boolean z = false;
        cVar.a = ((ConnectivityManager) c4483im0.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) c4483im0.get()).registerDefaultNetworkCallback(cVar.d);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                b0.f("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.c = z;
    }
}
