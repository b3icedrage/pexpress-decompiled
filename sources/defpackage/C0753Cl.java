package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0753Cl implements MD1, OnCompleteListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C0753Cl(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        switch (this.d) {
            case 0:
                Intrinsics.checkNotNullParameter(scope, "scope");
                if (scope.r() == ((C0831Dl.a) this.e).d) {
                    scope.u();
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(scope, "scope");
                scope.m(WE.f("silent-json-parse", (String) this.e));
                scope.h(NG1.WARNING);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((ScheduledFuture) this.e).cancel(false);
    }
}
