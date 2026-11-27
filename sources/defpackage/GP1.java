package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class GP1<T> extends AbstractC3272d1<HP1> implements InterfaceC3907g21<T>, InterfaceC6460ry<T>, InterfaceC4475ik0<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(GP1.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int i;

    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
    public static final class a extends LM {
        public GP1 d;
        public InterfaceC6606sf0 e;
        public HP1 g;
        public XF0 h;
        public Object i;
        public /* synthetic */ Object j;
        public final /* synthetic */ GP1<T> k;
        public int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GP1<T> gp1, JM<? super a> jm) {
            super(jm);
            this.k = gp1;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            this.k.c(null, this);
            return MN.d;
        }
    }

    public GP1(@NotNull Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.InterfaceC3487e21, defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(T t, @NotNull JM<? super Unit> jm) {
        setValue(t);
        return Unit.a;
    }

    @Override // defpackage.InterfaceC5910pK1
    @NotNull
    public final List<T> b() {
        return VE.c(getValue());
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009b A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0034, B:37:0x0093, B:39:0x009b, B:42:0x00a2, B:43:0x00a6, B:45:0x00a9, B:55:0x00ca, B:58:0x00da, B:47:0x00af, B:51:0x00b6, B:21:0x004d, B:24:0x0058, B:36:0x0084), top: B:65:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0034, B:37:0x0093, B:39:0x009b, B:42:0x00a2, B:43:0x00a6, B:45:0x00a9, B:55:0x00ca, B:58:0x00da, B:47:0x00af, B:51:0x00b6, B:21:0x004d, B:24:0x0058, B:36:0x0084), top: B:65:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00af A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0034, B:37:0x0093, B:39:0x009b, B:42:0x00a2, B:43:0x00a6, B:45:0x00a9, B:55:0x00ca, B:58:0x00da, B:47:0x00af, B:51:0x00b6, B:21:0x004d, B:24:0x0058, B:36:0x0084), top: B:65:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00da A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0034, B:37:0x0093, B:39:0x009b, B:42:0x00a2, B:43:0x00a6, B:45:0x00a9, B:55:0x00ca, B:58:0x00da, B:47:0x00af, B:51:0x00b6, B:21:0x004d, B:24:0x0058, B:36:0x0084), top: B:65:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [f1] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [HP1] */
    /* JADX WARN: Type inference failed for: r6v7, types: [HP1] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [sf0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [sf0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00d9 -> B:37:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00ea -> B:37:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.InterfaceC6396rf0
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull defpackage.InterfaceC6606sf0<? super T> r11, @org.jetbrains.annotations.NotNull defpackage.JM<?> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GP1.c(sf0, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3907g21
    public final boolean d(T t, T t2) {
        GW1 gw1 = C5208m0.h;
        if (t == null) {
            t = (T) gw1;
        }
        if (t2 == null) {
            t2 = (T) gw1;
        }
        return m(t, t2);
    }

    @Override // defpackage.InterfaceC3487e21
    public final void e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.InterfaceC4475ik0
    @NotNull
    public final InterfaceC6396rf0<T> f(@NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        return (((i < 0 || i >= 2) && i != -2) || enumC1796Pu != EnumC1796Pu.e) ? C1589Ne.o(this, coroutineContext, i, enumC1796Pu) : this;
    }

    @Override // defpackage.InterfaceC3907g21, defpackage.FP1
    public final T getValue() {
        GW1 gw1 = C5208m0.h;
        T t = (T) j.get(this);
        if (t == gw1) {
            return null;
        }
        return t;
    }

    @Override // defpackage.InterfaceC3487e21
    public final boolean h(T t) {
        setValue(t);
        return true;
    }

    @Override // defpackage.AbstractC3272d1
    public final AbstractC3691f1 j() {
        return new HP1();
    }

    @Override // defpackage.AbstractC3272d1
    public final AbstractC3691f1[] k() {
        return new HP1[2];
    }

    public final boolean m(Object obj, Object obj2) {
        int i;
        Object obj3;
        GW1 gw1;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj4 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.a(obj4, obj)) {
                return false;
            }
            if (Intrinsics.a(obj4, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.i;
            if ((i2 & 1) != 0) {
                this.i = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.i = i3;
            Object obj5 = this.d;
            Unit unit = Unit.a;
            while (true) {
                HP1[] hp1Arr = (HP1[]) obj5;
                if (hp1Arr != null) {
                    for (HP1 hp1 : hp1Arr) {
                        if (hp1 != null) {
                            AtomicReference<Object> atomicReference = hp1.a;
                            while (true) {
                                Object obj6 = atomicReference.get();
                                if (obj6 == null || obj6 == (gw1 = C1589Ne.i)) {
                                    break;
                                }
                                GW1 gw2 = C1589Ne.h;
                                if (obj6 != gw2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj6, gw2)) {
                                            C1717Ot1.a aVar = C1717Ot1.e;
                                            ((C6251qy) obj6).resumeWith(Unit.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj6);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj6, gw1)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj6);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.i;
                    if (i == i3) {
                        this.i = i3 + 1;
                        return true;
                    }
                    obj3 = this.d;
                    Unit unit2 = Unit.a;
                }
                obj5 = obj3;
                i3 = i;
            }
        }
    }

    @Override // defpackage.InterfaceC3907g21
    public final void setValue(T t) {
        if (t == null) {
            t = (T) C5208m0.h;
        }
        m(null, t);
    }
}
