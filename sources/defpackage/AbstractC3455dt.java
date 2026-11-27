package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3455dt {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(AbstractC3455dt.class, Object.class, "state");

    @Nullable
    public final XF0 a;

    @NotNull
    public final c b;

    @Nullable
    public final A20 c;
    public int d;
    public int e;

    @NotNull
    volatile /* synthetic */ int result;

    @NotNull
    volatile /* synthetic */ Object state;

    /* JADX INFO: renamed from: dt$a */
    @InterfaceC3368dU(c = "io.ktor.utils.io.jvm.javaio.BlockingAdapter$block$1", f = "Blocking.kt", l = {186}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return AbstractC3455dt.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (AbstractC3455dt.this.a(this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: dt$b */
    public static final class b extends ML0 implements Function1<Throwable, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Throwable th2 = th;
            if (th2 != null) {
                c cVar = AbstractC3455dt.this.b;
                C1717Ot1.a aVar = C1717Ot1.e;
                cVar.resumeWith(C1795Pt1.a(th2));
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: dt$c */
    public static final class c implements JM<Unit> {

        @NotNull
        public final CoroutineContext d;

        public c() {
            CoroutineContext coroutineContextC;
            XF0 xf0 = AbstractC3455dt.this.a;
            if (xf0 != null) {
                C3726f92 c3726f92 = C3726f92.g;
                c3726f92.getClass();
                coroutineContextC = CoroutineContext.Element.a.c(c3726f92, xf0);
            } else {
                coroutineContextC = C3726f92.g;
            }
            this.d = coroutineContextC;
        }

        @Override // defpackage.JM
        @NotNull
        public final CoroutineContext getContext() {
            return this.d;
        }

        @Override // defpackage.JM
        public final void resumeWith(@NotNull Object obj) {
            Object obj2;
            boolean z;
            boolean z2;
            Throwable thA;
            XF0 xf0;
            Object objA = C1717Ot1.a(obj);
            if (objA == null) {
                objA = Unit.a;
            }
            AbstractC3455dt abstractC3455dt = AbstractC3455dt.this;
            do {
                obj2 = abstractC3455dt.state;
                z = obj2 instanceof Thread;
                z2 = true;
                if (!(z ? true : obj2 instanceof JM ? true : Intrinsics.a(obj2, this))) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC3455dt.f;
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC3455dt, obj2, objA)) {
                    if (atomicReferenceFieldUpdater.get(abstractC3455dt) != obj2) {
                        z2 = false;
                        break;
                    }
                }
            } while (!z2);
            if (z) {
                InterfaceC3815fc1 interfaceC3815fc1 = C7027uf1.a.get();
                if (interfaceC3815fc1 == null) {
                    interfaceC3815fc1 = FV.a;
                }
                interfaceC3815fc1.b(obj2);
            } else if ((obj2 instanceof JM) && (thA = C1717Ot1.a(obj)) != null) {
                ((JM) obj2).resumeWith(C1795Pt1.a(thA));
            }
            if ((obj instanceof C1717Ot1.b) && !(C1717Ot1.a(obj) instanceof CancellationException) && (xf0 = AbstractC3455dt.this.a) != null) {
                xf0.l(null);
            }
            A20 a20 = AbstractC3455dt.this.c;
            if (a20 != null) {
                a20.b();
            }
        }
    }

    public AbstractC3455dt() {
        this(null);
    }

    @Nullable
    public abstract Object a(@NotNull LM lm);

    public final int b(@NotNull byte[] jobToken, int i, int i2) throws Throwable {
        Object c6489s51;
        Intrinsics.checkNotNullParameter(jobToken, "buffer");
        this.d = i;
        this.e = i2;
        Intrinsics.checkNotNullParameter(jobToken, "jobToken");
        Thread thread = Thread.currentThread();
        JM jm = null;
        while (true) {
            Object obj = this.state;
            if (obj instanceof JM) {
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any>");
                jm = (JM) obj;
                c6489s51 = thread;
            } else {
                if (obj instanceof Unit) {
                    return this.result;
                }
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                if (obj instanceof Thread) {
                    throw new IllegalStateException("There is already thread owning adapter");
                }
                if (Intrinsics.a(obj, this)) {
                    throw new IllegalStateException("Not yet started");
                }
                c6489s51 = new C6489s51();
            }
            Intrinsics.checkNotNullExpressionValue(c6489s51, "when (value) {\n         …Exception()\n            }");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c6489s51)) {
                    Intrinsics.checkNotNull(jm);
                    C1717Ot1.a aVar = C1717Ot1.e;
                    jm.resumeWith(jobToken);
                    Intrinsics.checkNotNullExpressionValue(thread, "thread");
                    if (this.state == thread) {
                        InterfaceC3815fc1<Thread> interfaceC3815fc1 = C7027uf1.a.get();
                        FV fv = FV.a;
                        if (interfaceC3815fc1 == null) {
                            interfaceC3815fc1 = fv;
                        }
                        if (interfaceC3815fc1 == C4941kj1.a) {
                            ((FS0) C4295ht.a.getValue()).a();
                        }
                        while (true) {
                            A80 a80 = EY1.a.get();
                            long jV1 = a80 != null ? a80.v1() : Long.MAX_VALUE;
                            if (this.state != thread) {
                                break;
                            }
                            if (jV1 > 0) {
                                InterfaceC3815fc1<Thread> interfaceC3815fc2 = C7027uf1.a.get();
                                if (interfaceC3815fc2 == null) {
                                    interfaceC3815fc2 = fv;
                                }
                                interfaceC3815fc2.a(jV1);
                            }
                        }
                    }
                    Object obj2 = this.state;
                    if (obj2 instanceof Throwable) {
                        throw ((Throwable) obj2);
                    }
                    return this.result;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public AbstractC3455dt(@Nullable XF0 xf0) {
        this.a = xf0;
        c cVar = new c();
        this.b = cVar;
        this.state = this;
        this.result = 0;
        this.c = xf0 != null ? xf0.W(new b()) : null;
        a aVar = new a(null);
        F62.e(1, aVar);
        aVar.invoke(cVar);
        if (this.state == this) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
