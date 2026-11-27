package defpackage;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4849kI implements SuccessContinuation, MD1 {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C4849kI(Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        String strF = C2017Sp1.a.b(((Throwable) this.e).getClass()).f();
        if (strF == null) {
            strF = "Throwable";
        }
        String str = (String) this.d;
        scope.m(WE.f("data-updater-failed", str, strF));
        scope.b("data.updater", str);
        scope.h(NG1.ERROR);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        C5059lI c5059lI = (C5059lI) this.d;
        C5272mI c5272mI = (C5272mI) this.e;
        synchronized (c5059lI) {
            c5059lI.c = Tasks.forResult(c5272mI);
        }
        return Tasks.forResult(c5272mI);
    }
}
