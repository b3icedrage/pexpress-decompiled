package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class VE1<R> implements InterfaceC4778jy, InterfaceC3744fF1, InterfaceC7449wf2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(VE1.class, Object.class, "state$volatile");

    @NotNull
    public final CoroutineContext d;

    @Nullable
    public Object g;
    private volatile /* synthetic */ Object state$volatile = C3954gF1.b;

    @Nullable
    public ArrayList e = new ArrayList(2);
    public int h = -1;

    @Nullable
    public Object i = C3954gF1.e;

    public final class a {

        @NotNull
        public final Object a;

        @NotNull
        public final InterfaceC1060Gj0<Object, InterfaceC3744fF1<?>, Object, Unit> b;

        @NotNull
        public final InterfaceC1060Gj0<Object, Object, Object, Object> c;

        @Nullable
        public final GW1 d;

        @NotNull
        public final Function e;

        @Nullable
        public final InterfaceC1060Gj0<InterfaceC3744fF1<?>, Object, Object, Function1<Throwable, Unit>> f;

        @Nullable
        public Object g;
        public int h = -1;

        public a(@NotNull Object obj, @NotNull InterfaceC1060Gj0 interfaceC1060Gj0, @Nullable InterfaceC1060Gj0 interfaceC1060Gj1, @NotNull GW1 gw1, @Nullable Function function, InterfaceC1060Gj0 interfaceC1060Gj2) {
            this.a = obj;
            this.b = interfaceC1060Gj0;
            this.c = interfaceC1060Gj1;
            this.d = gw1;
            this.e = function;
            this.f = interfaceC1060Gj2;
        }

        public final void a() {
            Object obj = this.g;
            if (obj instanceof AbstractC7992zE1) {
                ((AbstractC7992zE1) obj).h(this.h, VE1.this.d);
                return;
            }
            A20 a20 = obj instanceof A20 ? (A20) obj : null;
            if (a20 != null) {
                a20.b();
            }
        }
    }

    public VE1(@NotNull CoroutineContext coroutineContext) {
        this.d = coroutineContext;
    }

    @Override // defpackage.InterfaceC4778jy
    public final void a(@Nullable Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == C3954gF1.c) {
                return;
            }
            GW1 gw1 = C3954gF1.d;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, gw1)) {
                    ArrayList arrayList = this.e;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a();
                    }
                    this.i = C3954gF1.e;
                    this.e = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // defpackage.InterfaceC3744fF1
    public final boolean b(@NotNull Object obj, @Nullable Object obj2) {
        return j(obj, obj2) == 0;
    }

    @Override // defpackage.InterfaceC7449wf2
    public final void c(@NotNull AbstractC7992zE1<?> abstractC7992zE1, int i) {
        this.g = abstractC7992zE1;
        this.h = i;
    }

    @Override // defpackage.InterfaceC3744fF1
    public final void d(@NotNull A20 a20) {
        this.g = a20;
    }

    @Override // defpackage.InterfaceC3744fF1
    public final void e(@Nullable Object obj) {
        this.i = obj;
    }

    public final Object f(LM lm) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        Object obj = atomicReferenceFieldUpdater.get(this);
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.i;
        ArrayList<a> arrayList = this.e;
        if (arrayList != null) {
            for (a aVar2 : arrayList) {
                if (aVar2 != aVar) {
                    aVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, C3954gF1.c);
            this.i = C3954gF1.e;
            this.e = null;
        }
        Object objK = aVar.c.k(aVar.a, aVar.d, obj2);
        aVar.getClass();
        GW1 gw1 = C3954gF1.f;
        Function function = aVar.e;
        return aVar.d == gw1 ? ((Function1) function).invoke(lm) : ((Function2) function).invoke(objK, lm);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(LM lm) {
        WE1 frame;
        VE1<R> ve1;
        if (lm instanceof WE1) {
            frame = (WE1) lm;
            int i = frame.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                frame.h = i - Integer.MIN_VALUE;
            } else {
                frame = new WE1(this, lm);
            }
        } else {
            frame = new WE1(this, lm);
        }
        Object obj = frame.e;
        MN mn = MN.d;
        int i2 = frame.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            frame.d = this;
            frame.h = 1;
            C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
            c6251qy.r();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                GW1 gw1 = C3954gF1.b;
                if (obj2 == gw1) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c6251qy)) {
                            c6251qy.v(this);
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj2);
                } else {
                    if (!(obj2 instanceof List)) {
                        if (!(obj2 instanceof a)) {
                            throw new IllegalStateException(("unexpected state: " + obj2).toString());
                        }
                        Unit unit = Unit.a;
                        a aVar = (a) obj2;
                        Object obj3 = this.i;
                        InterfaceC1060Gj0<InterfaceC3744fF1<?>, Object, Object, Function1<Throwable, Unit>> interfaceC1060Gj0 = aVar.f;
                        c6251qy.m(unit, interfaceC1060Gj0 != null ? interfaceC1060Gj0.k(this, aVar.d, obj3) : null);
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, gw1)) {
                            Iterator it = ((Iterable) obj2).iterator();
                            while (it.hasNext()) {
                                VE1<R>.a aVarH = h(it.next());
                                Intrinsics.checkNotNull(aVarH);
                                aVarH.g = null;
                                aVarH.h = -1;
                                i(aVarH, true);
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj2);
                }
            }
            Object objQ = c6251qy.q();
            MN mn2 = MN.d;
            if (objQ == mn2) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objQ != mn2) {
                objQ = Unit.a;
            }
            if (objQ != mn) {
                ve1 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        ve1 = frame.d;
        C1795Pt1.b(obj);
        frame.d = null;
        frame.h = 2;
        Object objF = ve1.f(frame);
        return objF == mn ? mn : objF;
    }

    @Override // defpackage.InterfaceC3744fF1
    @NotNull
    public final CoroutineContext getContext() {
        return this.d;
    }

    public final VE1<R>.a h(Object obj) {
        ArrayList arrayList = this.e;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((a) obj3).a == obj) {
                obj2 = obj3;
                break;
            }
        }
        VE1<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void i(@NotNull VE1<R>.a aVar, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        Object obj = aVar.a;
        if (!z) {
            ArrayList arrayList = this.e;
            Intrinsics.checkNotNull(arrayList);
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((a) it.next()).a == obj) {
                        throw new IllegalStateException(FK.c(obj, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        aVar.b.k(obj, this, aVar.d);
        if (this.i != C3954gF1.e) {
            atomicReferenceFieldUpdater.set(this, aVar);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.e;
            Intrinsics.checkNotNull(arrayList2);
            arrayList2.add(aVar);
        }
        aVar.g = this.g;
        aVar.h = this.h;
        this.g = null;
        this.h = -1;
    }

    public final int j(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            boolean z = false;
            if (obj3 instanceof InterfaceC6041py) {
                VE1<R>.a aVarH = h(obj);
                if (aVarH != null) {
                    InterfaceC1060Gj0<InterfaceC3744fF1<?>, Object, Object, Function1<Throwable, Unit>> interfaceC1060Gj0 = aVarH.f;
                    Function1<Throwable, Unit> function1K = interfaceC1060Gj0 != null ? interfaceC1060Gj0.k(this, aVarH.d, obj2) : null;
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, aVarH)) {
                            InterfaceC6041py interfaceC6041py = (InterfaceC6041py) obj3;
                            this.i = obj2;
                            C3954gF1.a aVar = C3954gF1.a;
                            GW1 gw1B = interfaceC6041py.b(Unit.a, function1K);
                            if (gw1B == null) {
                                this.i = C3954gF1.e;
                                return 2;
                            }
                            interfaceC6041py.s(gw1B);
                            return 0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                } else {
                    continue;
                }
            } else {
                if (Intrinsics.a(obj3, C3954gF1.c) ? true : obj3 instanceof a) {
                    return 3;
                }
                if (Intrinsics.a(obj3, C3954gF1.d)) {
                    return 2;
                }
                if (Intrinsics.a(obj3, C3954gF1.b)) {
                    List listC = VE.c(obj);
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, listC)) {
                            z = true;
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                    if (z) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    ArrayList arrayListR = CollectionsKt.R((Collection) obj3, obj);
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListR)) {
                            z = true;
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                    if (z) {
                        return 1;
                    }
                }
            }
        }
    }
}
