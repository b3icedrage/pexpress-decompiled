package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import defpackage.AS0;
import defpackage.C4736jk2;
import defpackage.Ck2;
import defpackage.InterfaceC5579nk2;
import defpackage.S00;
import defpackage.Sk2;
import defpackage.VW1;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    @NotNull
    public final c.a.C0243c a() {
        C4736jk2 c4736jk2B = C4736jk2.b(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(c4736jk2B, "getInstance(applicationContext)");
        WorkDatabase workDatabase = c4736jk2B.c;
        Intrinsics.checkNotNullExpressionValue(workDatabase, "workManager.workDatabase");
        Ck2 ck2U = workDatabase.u();
        InterfaceC5579nk2 interfaceC5579nk2S = workDatabase.s();
        Sk2 sk2V = workDatabase.v();
        VW1 vw1R = workDatabase.r();
        ArrayList arrayListF = ck2U.f(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        ArrayList arrayListK = ck2U.k();
        ArrayList arrayListB = ck2U.b();
        if (!arrayListF.isEmpty()) {
            AS0 as0C = AS0.c();
            int i = S00.a;
            as0C.getClass();
            AS0 as0C2 = AS0.c();
            S00.a(interfaceC5579nk2S, sk2V, vw1R, arrayListF);
            as0C2.getClass();
        }
        if (!arrayListK.isEmpty()) {
            AS0 as0C3 = AS0.c();
            int i2 = S00.a;
            as0C3.getClass();
            AS0 as0C4 = AS0.c();
            S00.a(interfaceC5579nk2S, sk2V, vw1R, arrayListK);
            as0C4.getClass();
        }
        if (!arrayListB.isEmpty()) {
            AS0 as0C5 = AS0.c();
            int i3 = S00.a;
            as0C5.getClass();
            AS0 as0C6 = AS0.c();
            S00.a(interfaceC5579nk2S, sk2V, vw1R, arrayListB);
            as0C6.getClass();
        }
        c.a.C0243c c0243c = new c.a.C0243c();
        Intrinsics.checkNotNullExpressionValue(c0243c, "success()");
        return c0243c;
    }
}
