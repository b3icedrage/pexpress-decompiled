package defpackage;

import com.google.firebase.perf.FirebasePerfRegistrar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: he0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4242he0 implements InterfaceC5056lH, MD1 {
    public final /* synthetic */ Object d;

    public /* synthetic */ C4242he0(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        return FirebasePerfRegistrar.lambda$getComponents$0((C7892yl1) this.d, c1480Lt1);
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.m(VE.c("fgs-start-refused"));
        scope.b("fgs.trigger", (String) this.d);
        scope.h(NG1.WARNING);
    }
}
