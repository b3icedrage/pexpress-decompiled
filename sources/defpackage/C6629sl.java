package defpackage;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.sentry.okhttp.h;
import io.sentry.util.l;
import io.sentry.util.network.c;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;

/* JADX INFO: renamed from: sl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6629sl implements MD1, InterfaceC7203vW.a, l.a, OnCompleteListener, c.b {
    public final /* synthetic */ Object d;

    public /* synthetic */ C6629sl(Object obj) {
        this.d = obj;
    }

    @Override // io.sentry.util.network.c.b
    public LinkedHashMap a(Object obj) {
        C4543is1 req = (C4543is1) obj;
        Intrinsics.checkNotNullParameter(req, "req");
        C2813ao0 c2813ao0 = req.c;
        ((h) this.d).getClass();
        return h.f(c2813ao0);
    }

    @Override // io.sentry.util.l.a
    public Object b() {
        return ((C2688aH1) this.d).lambda$new$2();
    }

    @Override // defpackage.InterfaceC7203vW.a
    public void d(InterfaceC1612Nk1 interfaceC1612Nk1) {
        C5080lP c5080lP = (C5080lP) this.d;
        c5080lP.getClass();
        Log.isLoggable("FirebaseCrashlytics", 3);
        c5080lP.b.set((InterfaceC4660jP) interfaceC1612Nk1.get());
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 it) {
        String name;
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC4302hv0 interfaceC4302hv0R = it.r();
        boolean z = false;
        if (interfaceC4302hv0R != null && (name = interfaceC4302hv0R.getName()) != null && d.o(name, "robot.", false)) {
            z = true;
        }
        ((C2512Yo1) this.d).d = z;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Af2.a((Intent) this.d);
    }
}
