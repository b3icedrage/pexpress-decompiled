package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import defpackage.AS0;
import defpackage.Bk2;
import defpackage.C6117qJ1;
import defpackage.PQ0;
import defpackage.RK;
import defpackage.Sj2;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/c;", "LSj2;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ConstraintTrackingWorker extends c implements Sj2 {

    @NotNull
    public final WorkerParameters d;

    @NotNull
    public final Object e;
    public volatile boolean g;
    public final C6117qJ1<c.a> h;

    @Nullable
    public c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.d = workerParameters;
        this.e = new Object();
        this.h = new C6117qJ1<>();
    }

    @Override // defpackage.Sj2
    public final void d(@NotNull ArrayList workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        AS0 as0C = AS0.c();
        String str = RK.a;
        Objects.toString(workSpecs);
        as0C.getClass();
        synchronized (this.e) {
            this.g = true;
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.Sj2
    public final void f(@NotNull List<Bk2> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
    }

    @Override // androidx.work.c
    public final void onStopped() {
        super.onStopped();
        c cVar = this.i;
        if (cVar == null || cVar.isStopped()) {
            return;
        }
        cVar.stop();
    }

    @Override // androidx.work.c
    @NotNull
    public final PQ0<c.a> startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: PK
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker this$0 = this.d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.h.d instanceof AbstractC4575j0.b) {
                    return;
                }
                String strB = this$0.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                AS0 as0C = AS0.c();
                Intrinsics.checkNotNullExpressionValue(as0C, "get()");
                if (strB == null || strB.length() == 0) {
                    as0C.a(RK.a, "No worker to delegate to.");
                    C6117qJ1<c.a> future = this$0.h;
                    Intrinsics.checkNotNullExpressionValue(future, "future");
                    future.j(new c.a.C0242a());
                    return;
                }
                c cVarB = this$0.getWorkerFactory().b(this$0.getApplicationContext(), strB, this$0.d);
                this$0.i = cVarB;
                if (cVarB == null) {
                    String str = RK.a;
                    as0C.getClass();
                    C6117qJ1<c.a> future2 = this$0.h;
                    Intrinsics.checkNotNullExpressionValue(future2, "future");
                    future2.j(new c.a.C0242a());
                    return;
                }
                C4736jk2 c4736jk2B = C4736jk2.b(this$0.getApplicationContext());
                Intrinsics.checkNotNullExpressionValue(c4736jk2B, "getInstance(applicationContext)");
                Ck2 ck2U = c4736jk2B.c.u();
                String string = this$0.getId().toString();
                Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
                Bk2 bk2O = ck2U.o(string);
                if (bk2O == null) {
                    C6117qJ1<c.a> future3 = this$0.h;
                    Intrinsics.checkNotNullExpressionValue(future3, "future");
                    String str2 = RK.a;
                    future3.j(new c.a.C0242a());
                    return;
                }
                Q02 q02 = c4736jk2B.j;
                Intrinsics.checkNotNullExpressionValue(q02, "workManagerImpl.trackers");
                Tj2 tj2 = new Tj2(q02, this$0);
                tj2.b(VE.c(bk2O));
                String string2 = this$0.getId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "id.toString()");
                if (!tj2.a(string2)) {
                    String str3 = RK.a;
                    as0C.getClass();
                    C6117qJ1<c.a> future4 = this$0.h;
                    Intrinsics.checkNotNullExpressionValue(future4, "future");
                    future4.j(new c.a.b());
                    return;
                }
                String str4 = RK.a;
                as0C.getClass();
                try {
                    c cVar = this$0.i;
                    Intrinsics.checkNotNull(cVar);
                    PQ0<c.a> pq0StartWork = cVar.startWork();
                    Intrinsics.checkNotNullExpressionValue(pq0StartWork, "delegate!!.startWork()");
                    pq0StartWork.f(new QK(0, this$0, pq0StartWork), this$0.getBackgroundExecutor());
                } catch (Throwable unused) {
                    String str5 = RK.a;
                    synchronized (this$0.e) {
                        try {
                            if (this$0.g) {
                                C6117qJ1<c.a> future5 = this$0.h;
                                Intrinsics.checkNotNullExpressionValue(future5, "future");
                                future5.j(new c.a.b());
                            } else {
                                C6117qJ1<c.a> future6 = this$0.h;
                                Intrinsics.checkNotNullExpressionValue(future6, "future");
                                future6.j(new c.a.C0242a());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        });
        C6117qJ1<c.a> future = this.h;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }
}
