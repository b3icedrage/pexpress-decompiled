package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3782fS0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(C3782fS0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(C3782fS0.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(C3782fS0.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: fS0$a */
    public static abstract class a extends AbstractC2078Tk<C3782fS0> {

        @NotNull
        public final AbstractC3746fG0 b;

        @Nullable
        public C7119v51 c;

        public a(@NotNull AbstractC3746fG0 abstractC3746fG0) {
            this.b = abstractC3746fG0;
        }

        @Override // defpackage.AbstractC2078Tk
        public final void b(C3782fS0 c3782fS0, Object obj) {
            C3782fS0 c3782fS1 = c3782fS0;
            boolean z = obj == null;
            AbstractC3746fG0 abstractC3746fG0 = this.b;
            InterfaceC7719xx0 interfaceC7719xx0 = z ? abstractC3746fG0 : this.c;
            if (interfaceC7719xx0 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3782fS0.d;
                while (!atomicReferenceFieldUpdater.compareAndSet(c3782fS1, this, interfaceC7719xx0)) {
                    if (atomicReferenceFieldUpdater.get(c3782fS1) != this) {
                        return;
                    }
                }
                if (z) {
                    C7119v51 c7119v51 = this.c;
                    Intrinsics.checkNotNull(c7119v51);
                    abstractC3746fG0.d(c7119v51);
                }
            }
        }
    }

    /* JADX INFO: renamed from: fS0$b */
    public /* synthetic */ class b extends C1217Ij1 {
        @Override // defpackage.JJ0
        @Nullable
        public final Object get() {
            return this.e.getClass().getSimpleName();
        }
    }

    public void b() {
        k();
    }

    public final C3782fS0 c() {
        C3782fS0 c3782fS0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e;
            C3782fS0 c3782fS1 = (C3782fS0) atomicReferenceFieldUpdater2.get(this);
            c3782fS0 = c3782fS1;
            while (true) {
                C3782fS0 c3782fS2 = null;
                while (true) {
                    atomicReferenceFieldUpdater = d;
                    obj = atomicReferenceFieldUpdater.get(c3782fS0);
                    if (obj == this) {
                        if (c3782fS1 != c3782fS0) {
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, c3782fS1, c3782fS0)) {
                                if (atomicReferenceFieldUpdater2.get(this) != c3782fS1) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (j()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof L91) {
                        ((L91) obj).a(c3782fS0);
                        break;
                    }
                    if (!(obj instanceof C1241Ir1)) {
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        c3782fS2 = c3782fS0;
                        c3782fS0 = (C3782fS0) obj;
                    } else {
                        if (c3782fS2 != null) {
                            break;
                        }
                        c3782fS0 = (C3782fS0) atomicReferenceFieldUpdater2.get(c3782fS0);
                    }
                }
                C3782fS0 c3782fS3 = ((C1241Ir1) obj).a;
                while (!atomicReferenceFieldUpdater.compareAndSet(c3782fS2, c3782fS0, c3782fS3)) {
                    if (atomicReferenceFieldUpdater.get(c3782fS2) != c3782fS0) {
                        break;
                    }
                }
                c3782fS0 = c3782fS2;
            }
        }
        return c3782fS0;
    }

    public final void d(C3782fS0 c3782fS0) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            C3782fS0 c3782fS1 = (C3782fS0) atomicReferenceFieldUpdater.get(c3782fS0);
            if (f() != c3782fS0) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c3782fS0, c3782fS1, this)) {
                    if (j()) {
                        c3782fS0.c();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c3782fS0) == c3782fS1);
        }
    }

    @NotNull
    public final Object f() {
        while (true) {
            Object obj = d.get(this);
            if (!(obj instanceof L91)) {
                return obj;
            }
            ((L91) obj).a(this);
        }
    }

    @NotNull
    public final C3782fS0 i() {
        C3782fS0 c3782fS0;
        Object objF = f();
        C1241Ir1 c1241Ir1 = objF instanceof C1241Ir1 ? (C1241Ir1) objF : null;
        if (c1241Ir1 != null && (c3782fS0 = c1241Ir1.a) != null) {
            return c3782fS0;
        }
        Intrinsics.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C3782fS0) objF;
    }

    public boolean j() {
        return f() instanceof C1241Ir1;
    }

    public final void k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            Object objF = f();
            if (objF instanceof C1241Ir1) {
                C3782fS0 c3782fS0 = ((C1241Ir1) objF).a;
                return;
            }
            if (objF == this) {
                return;
            }
            Intrinsics.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            C3782fS0 c3782fS1 = (C3782fS0) objF;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g;
            C1241Ir1 c1241Ir1 = (C1241Ir1) atomicReferenceFieldUpdater2.get(c3782fS1);
            if (c1241Ir1 == null) {
                c1241Ir1 = new C1241Ir1(c3782fS1);
                atomicReferenceFieldUpdater2.set(c3782fS1, c1241Ir1);
            }
            do {
                atomicReferenceFieldUpdater = d;
                if (atomicReferenceFieldUpdater.compareAndSet(this, objF, c1241Ir1)) {
                    c3782fS1.c();
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == objF);
        }
    }

    @NotNull
    public String toString() {
        return new b(this, C3787fU.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + C3787fU.f(this);
    }
}
