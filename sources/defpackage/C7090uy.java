package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7090uy<T> implements JM<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(C7090uy.class, Object.class, "state");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(C7090uy.class, Object.class, "jobCancellationHandler");

    @NotNull
    private volatile /* synthetic */ Object state = null;

    @NotNull
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    /* JADX INFO: renamed from: uy$a */
    public final class a implements Function1<Throwable, Unit> {

        @NotNull
        public final XF0 d;

        @Nullable
        public A20 e;
        public final /* synthetic */ C7090uy<T> g;

        public a(@NotNull C7090uy c7090uy, XF0 job) {
            Intrinsics.checkNotNullParameter(job, "job");
            this.g = c7090uy;
            this.d = job;
            A20 a20A = job.A(true, true, this);
            if (job.g()) {
                this.e = a20A;
            }
        }

        public final void a() {
            A20 a20 = this.e;
            if (a20 != null) {
                this.e = null;
                a20.b();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            Throwable th2 = th;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C7090uy.d;
            C7090uy<T> c7090uy = this.g;
            c7090uy.getClass();
            do {
                atomicReferenceFieldUpdater = C7090uy.e;
                if (atomicReferenceFieldUpdater.compareAndSet(c7090uy, this, null)) {
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(c7090uy) == this);
            a();
            if (th2 != null) {
                C7090uy.a(c7090uy, this.d, th2);
            }
            return Unit.a;
        }
    }

    public static final void a(C7090uy c7090uy, XF0 xf0, Throwable th) {
        while (true) {
            Object obj = c7090uy.state;
            if (!(obj instanceof JM)) {
                return;
            }
            JM jm = (JM) obj;
            if (jm.getContext().p(XF0.a.d) != xf0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c7090uy, obj, null)) {
                    Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
                    C1717Ot1.a aVar = C1717Ot1.e;
                    jm.resumeWith(C1795Pt1.a(th));
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c7090uy) == obj);
        }
    }

    public final void c(@NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        C1717Ot1.a aVar = C1717Ot1.e;
        resumeWith(C1795Pt1.a(cause));
        a aVar2 = (a) e.getAndSet(this, null);
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    @NotNull
    public final Object d(@NotNull JM<? super T> actual) {
        Intrinsics.checkNotNullParameter(actual, "actual");
        while (true) {
            Object obj = this.state;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, actual)) {
                        XF0 xf0 = (XF0) actual.getContext().p(XF0.a.d);
                        a aVar = (a) this.jobCancellationHandler;
                        if ((aVar != null ? aVar.d : null) != xf0) {
                            if (xf0 == null) {
                                a aVar2 = (a) e.getAndSet(this, null);
                                if (aVar2 != null) {
                                    aVar2.a();
                                }
                            } else {
                                a aVar3 = new a(this, xf0);
                                loop3: while (true) {
                                    Object obj2 = this.jobCancellationHandler;
                                    a aVar4 = (a) obj2;
                                    if (aVar4 != null && aVar4.d == xf0) {
                                        aVar3.a();
                                        break;
                                    }
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e;
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, aVar3)) {
                                            if (aVar4 == null) {
                                                break loop3;
                                            }
                                            aVar4.a();
                                            break loop3;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(this) == obj2);
                                }
                            }
                        }
                        return MN.d;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = d;
                do {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, null)) {
                        if (obj instanceof Throwable) {
                            throw ((Throwable) obj);
                        }
                        return obj;
                    }
                } while (atomicReferenceFieldUpdater3.get(this) == obj);
            }
        }
    }

    @Override // defpackage.JM
    @NotNull
    public final CoroutineContext getContext() {
        CoroutineContext context;
        Object obj = this.state;
        JM jm = obj instanceof JM ? (JM) obj : null;
        return (jm == null || (context = jm.getContext()) == null) ? e.d : context;
    }

    @Override // defpackage.JM
    public final void resumeWith(@NotNull Object obj) {
        Object objA;
        while (true) {
            Object obj2 = this.state;
            if (obj2 == null) {
                objA = C1717Ot1.a(obj);
                if (objA == null) {
                    C1795Pt1.b(obj);
                    objA = obj;
                }
            } else if (!(obj2 instanceof JM)) {
                return;
            } else {
                objA = null;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objA)) {
                    if (obj2 instanceof JM) {
                        ((JM) obj2).resumeWith(obj);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }
}
