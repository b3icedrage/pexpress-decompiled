package defpackage;

import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFf1mSDK;
import com.appsflyer.internal.AFf1pSDK;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.sentry.android.core.internal.gestures.e;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7680xl implements InterfaceC5014l42, OnCompleteListener, AFf1mSDK, MD1 {
    public final /* synthetic */ Object d;

    public /* synthetic */ C7680xl(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.InterfaceC5014l42
    public void a(InterfaceC4302hv0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C0831Dl.a aVar = (C0831Dl.a) this.d;
        aVar.j.c.remove(aVar);
        if (aVar.c.compareAndSet(false, true)) {
            aVar.j.b.remove(aVar);
            QF1.d(new C8100zl(aVar, 0));
            WF1.a("auth", "auth.attempt_finished", NG1.WARNING, PW0.e(new Pair("flow", aVar.a), new Pair("attempt_id", aVar.b), new Pair("result", "deadline")));
        }
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 interfaceC1015Fu0) {
        e eVar = (e) this.d;
        eVar.getClass();
        interfaceC1015Fu0.G(new C5479nH(eVar, interfaceC1015Fu0));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        W92 this$0 = (W92) this.d;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            C4201hS c4201hS = C6104qF0.a;
            C6104qF0.c("Fetching FCM registration token failed", new Throwable(task.getException()));
            return;
        }
        String str = (String) task.getResult();
        if (str != null) {
            this$0.c.h(str);
            this$0.b(str);
            this$0.c.g(true);
        }
    }

    @Override // com.appsflyer.internal.AFf1mSDK
    public void onRemoteConfigUpdateFinished(AFf1pSDK aFf1pSDK) {
        ((AFa1tSDK) this.d).AFLogger(aFf1pSDK);
    }
}
