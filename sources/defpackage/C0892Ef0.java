package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ef0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 418}, m = "invokeSuspend")
public final class C0892Ef0 extends AW1 implements InterfaceC1060Gj0<KN, InterfaceC6606sf0<Object>, JM<? super Unit>, Object> {
    public C3027bp1 d;
    public C2817ap1 e;
    public int g;
    public /* synthetic */ Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C4561iz j;
    public final /* synthetic */ C1699On1 k;

    /* JADX INFO: renamed from: Ef0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ InterfaceC6606sf0<Object> e;
        public final /* synthetic */ C3027bp1<Object> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JM jm, InterfaceC6606sf0 interfaceC6606sf0, C3027bp1 c3027bp1) {
            super(1, jm);
            this.e = interfaceC6606sf0;
            this.g = c3027bp1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return new a(jm, this.e, this.g);
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
            C3027bp1<Object> c3027bp1 = this.g;
            if (i == 0) {
                C1795Pt1.b(obj);
                GW1 gw1 = C5208m0.h;
                Object obj2 = c3027bp1.d;
                if (obj2 == gw1) {
                    obj2 = null;
                }
                this.d = 1;
                if (this.e.a(obj2, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            c3027bp1.d = null;
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Ef0$b */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<C3308dA<? extends Object>, JM<? super Unit>, Object> {
        public C3027bp1 d;
        public int e;
        public /* synthetic */ Object g;
        public final /* synthetic */ C3027bp1<Object> h;
        public final /* synthetic */ InterfaceC6606sf0<Object> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JM jm, InterfaceC6606sf0 interfaceC6606sf0, C3027bp1 c3027bp1) {
            super(2, jm);
            this.h = c3027bp1;
            this.i = interfaceC6606sf0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            b bVar = new b(jm, this.i, this.h);
            bVar.g = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C3308dA<? extends Object> c3308dA, JM<? super Unit> jm) {
            return ((b) create(new C3308dA(c3308dA.a), jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v7, types: [GW1, T] */
        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C3027bp1<Object> c3027bp1;
            C3027bp1<Object> c3027bp2;
            MN mn = MN.d;
            int i = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                ?? r6 = ((C3308dA) this.g).a;
                boolean z = r6 instanceof C3308dA.b;
                c3027bp1 = this.h;
                if (!z) {
                    c3027bp1.d = r6;
                }
                if (z) {
                    Throwable thA = C3308dA.a(r6);
                    if (thA != null) {
                        throw thA;
                    }
                    Object obj2 = c3027bp1.d;
                    if (obj2 != null) {
                        if (obj2 == C5208m0.h) {
                            obj2 = null;
                        }
                        this.g = r6;
                        this.d = c3027bp1;
                        this.e = 1;
                        if (this.i.a(obj2, this) == mn) {
                            return mn;
                        }
                        c3027bp2 = c3027bp1;
                    }
                    c3027bp1.d = C5208m0.j;
                }
                return Unit.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3027bp2 = this.d;
            C1795Pt1.b(obj);
            c3027bp1 = c3027bp2;
            c3027bp1.d = C5208m0.j;
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Ef0$c */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {204}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<InterfaceC1133Hh1<? super Object>, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C1699On1 g;

        /* JADX INFO: renamed from: Ef0$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC1133Hh1<Object> d;

            /* JADX INFO: renamed from: Ef0$c$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {204}, m = "emit")
            public static final class C0024a extends LM {
                public /* synthetic */ Object d;
                public final /* synthetic */ a<T> e;
                public int g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0024a(a<? super T> aVar, JM<? super C0024a> jm) {
                    super(jm);
                    this.e = aVar;
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.g |= Integer.MIN_VALUE;
                    return this.e.a(null, this);
                }
            }

            public a(InterfaceC1133Hh1<Object> interfaceC1133Hh1) {
                this.d = interfaceC1133Hh1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(T t, @NotNull JM<? super Unit> jm) {
                C0024a c0024a;
                if (jm instanceof C0024a) {
                    c0024a = (C0024a) jm;
                    int i = c0024a.g;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0024a.g = i - Integer.MIN_VALUE;
                    } else {
                        c0024a = new C0024a(this, jm);
                    }
                } else {
                    c0024a = new C0024a(this, jm);
                }
                Object obj = c0024a.d;
                MN mn = MN.d;
                int i2 = c0024a.g;
                if (i2 == 0) {
                    C1795Pt1.b(obj);
                    if (t == null) {
                        t = (T) C5208m0.h;
                    }
                    c0024a.g = 1;
                    if (this.d.j(c0024a, t) == mn) {
                        return mn;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1699On1 c1699On1, JM jm) {
            super(2, jm);
            this.g = c1699On1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            c cVar = new c(this.g, jm);
            cVar.e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC1133Hh1<? super Object> interfaceC1133Hh1, JM<? super Unit> jm) {
            return ((c) create(interfaceC1133Hh1, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a((InterfaceC1133Hh1) this.e);
                this.d = 1;
                if (this.g.d.c(aVar, this) == mn) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0892Ef0(C4561iz c4561iz, C1699On1 c1699On1, JM jm) {
        super(3, jm);
        this.j = c4561iz;
        this.k = c1699On1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0078  */
    /* JADX WARN: Code duplicated, block: B:17:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7 A[PHI: r2 r7 r8 r9
      0x00a7: PHI (r2v5 ap1) = (r2v7 ap1), (r2v10 ap1), (r2v10 ap1) binds: [B:24:0x00a5, B:14:0x0076, B:17:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r7v2 bp1) = (r7v11 bp1), (r7v12 bp1), (r7v12 bp1) binds: [B:24:0x00a5, B:14:0x0076, B:17:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r8v2 ??) = (r8v12 ??), (r8v13 ??), (r8v14 ??) binds: [B:24:0x00a5, B:14:0x0076, B:17:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r9v4 sf0) = (r9v5 sf0), (r9v6 sf0), (r9v6 sf0) binds: [B:24:0x00a5, B:14:0x0076, B:17:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x0115  */
    /* JADX WARN: Code duplicated, block: B:34:0x011a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [Co1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0892Ef0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(KN kn, InterfaceC6606sf0<Object> interfaceC6606sf0, JM<? super Unit> jm) {
        C0892Ef0 c0892Ef0 = new C0892Ef0(this.j, this.k, jm);
        c0892Ef0.h = kn;
        c0892Ef0.i = interfaceC6606sf0;
        return c0892Ef0.invokeSuspend(Unit.a);
    }
}
