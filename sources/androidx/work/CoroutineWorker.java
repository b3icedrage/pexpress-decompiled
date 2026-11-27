package androidx.work;

import android.content.Context;
import defpackage.AW1;
import defpackage.AbstractC4575j0;
import defpackage.B10;
import defpackage.C1795Pt1;
import defpackage.C2684aG0;
import defpackage.C3536eG0;
import defpackage.C3837fi;
import defpackage.C4946kk2;
import defpackage.C5189lv;
import defpackage.C5565nh0;
import defpackage.C5885pC0;
import defpackage.C6117qJ1;
import defpackage.C6251qy;
import defpackage.C6266r20;
import defpackage.DN;
import defpackage.ED;
import defpackage.EM;
import defpackage.FG;
import defpackage.InterfaceC3368dU;
import defpackage.JM;
import defpackage.KN;
import defpackage.LN;
import defpackage.MN;
import defpackage.PQ0;
import defpackage.QQ0;
import defpackage.RunnableC2477Yd;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u001b\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\t0 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010&\u001a\u00020%8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u001a\u001a\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "LPQ0;", "Landroidx/work/c$a;", "startWork", "()LPQ0;", "doWork", "(LJM;)Ljava/lang/Object;", "Lnh0;", "getForegroundInfo", "Landroidx/work/b;", "data", "", "setProgress", "(Landroidx/work/b;LJM;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Lnh0;LJM;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "LFG;", "job", "LFG;", "getJob$work_runtime_ktx_release", "()LFG;", "LqJ1;", "future", "LqJ1;", "getFuture$work_runtime_ktx_release", "()LqJ1;", "LDN;", "coroutineContext", "LDN;", "getCoroutineContext", "()LDN;", "getCoroutineContext$annotations", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class CoroutineWorker extends c {

    @NotNull
    private final DN coroutineContext;

    @NotNull
    private final C6117qJ1<c.a> future;

    @NotNull
    private final FG job;

    @InterfaceC3368dU(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public C3536eG0 d;
        public int e;
        public final /* synthetic */ C3536eG0<C5565nh0> g;
        public final /* synthetic */ CoroutineWorker h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3536eG0<C5565nh0> c3536eG0, CoroutineWorker coroutineWorker, JM<? super a> jm) {
            super(2, jm);
            this.g = c3536eG0;
            this.h = coroutineWorker;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new a(this.g, this.h, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C3536eG0<C5565nh0> c3536eG0;
            MN mn = MN.d;
            int i = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                C3536eG0<C5565nh0> c3536eG1 = this.g;
                this.d = c3536eG1;
                this.e = 1;
                Object foregroundInfo = this.h.getForegroundInfo(this);
                if (foregroundInfo == mn) {
                    return mn;
                }
                c3536eG0 = c3536eG1;
                obj = foregroundInfo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3536eG0 = this.d;
                C1795Pt1.b(obj);
            }
            c3536eG0.d.j((R) obj);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return CoroutineWorker.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            try {
                if (i == 0) {
                    C1795Pt1.b(obj);
                    this.d = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == mn) {
                        return mn;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                }
                coroutineWorker.getFuture$work_runtime_ktx_release().j((c.a) obj);
            } catch (Throwable th) {
                coroutineWorker.getFuture$work_runtime_ktx_release().k(th);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.job = ED.b();
        C6117qJ1<c.a> c6117qJ1 = new C6117qJ1<>();
        Intrinsics.checkNotNullExpressionValue(c6117qJ1, "create()");
        this.future = c6117qJ1;
        c6117qJ1.f(new RunnableC2477Yd(this, 2), ((C4946kk2) getTaskExecutor()).a);
        this.coroutineContext = C6266r20.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CoroutineWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.future.d instanceof AbstractC4575j0.b) {
            this$0.job.l(null);
        }
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, JM<? super C5565nh0> jm) {
        throw new IllegalStateException("Not implemented");
    }

    @Nullable
    public abstract Object doWork(@NotNull JM<? super c.a> jm);

    @NotNull
    public DN getCoroutineContext() {
        return this.coroutineContext;
    }

    @Nullable
    public Object getForegroundInfo(@NotNull JM<? super C5565nh0> jm) {
        return getForegroundInfo$suspendImpl(this, jm);
    }

    @Override // androidx.work.c
    @NotNull
    public final PQ0<C5565nh0> getForegroundInfoAsync() {
        C2684aG0 c2684aG0B = ED.b();
        DN coroutineContext = getCoroutineContext();
        coroutineContext.getClass();
        EM emA = LN.a(CoroutineContext.Element.a.c(coroutineContext, c2684aG0B));
        C3536eG0 c3536eG0 = new C3536eG0(c2684aG0B);
        C5189lv.k(emA, null, new a(c3536eG0, this, null), 3);
        return c3536eG0;
    }

    @NotNull
    public final C6117qJ1<c.a> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    @NotNull
    /* JADX INFO: renamed from: getJob$work_runtime_ktx_release, reason: from getter */
    public final FG getJob() {
        return this.job;
    }

    @Override // androidx.work.c
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    @Nullable
    public final Object setForeground(@NotNull C5565nh0 c5565nh0, @NotNull JM<? super Unit> frame) throws Throwable {
        PQ0<Void> foregroundAsync = setForegroundAsync(c5565nh0);
        Intrinsics.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
            c6251qy.r();
            foregroundAsync.f(new QQ0(c6251qy, foregroundAsync), B10.d);
            c6251qy.u(new C3837fi(foregroundAsync, 3));
            Object objQ = c6251qy.q();
            MN mn = MN.d;
            if (objQ == mn) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objQ == mn) {
                return objQ;
            }
        }
        return Unit.a;
    }

    @Nullable
    public final Object setProgress(@NotNull androidx.work.b bVar, @NotNull JM<? super Unit> frame) throws Throwable {
        PQ0<Void> progressAsync = setProgressAsync(bVar);
        Intrinsics.checkNotNullExpressionValue(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
            c6251qy.r();
            progressAsync.f(new QQ0(c6251qy, progressAsync), B10.d);
            c6251qy.u(new C3837fi(progressAsync, 3));
            Object objQ = c6251qy.q();
            MN mn = MN.d;
            if (objQ == mn) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objQ == mn) {
                return objQ;
            }
        }
        return Unit.a;
    }

    @Override // androidx.work.c
    @NotNull
    public final PQ0<c.a> startWork() {
        DN coroutineContext = getCoroutineContext();
        FG fg = this.job;
        coroutineContext.getClass();
        C5189lv.k(LN.a(CoroutineContext.Element.a.c(coroutineContext, fg)), null, new b(null), 3);
        return this.future;
    }
}
