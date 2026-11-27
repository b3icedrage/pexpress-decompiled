package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, 100}, m = "invokeSuspend")
public final class JS extends AW1 implements Function2<InterfaceC6606sf0<Object>, JM<? super Unit>, Object> {
    public C4669jS d;
    public int e;
    public /* synthetic */ Object g;
    public final /* synthetic */ IS<Object> h;

    @InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<InterfaceC6606sf0<? super EP1<Object>>, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ IS<Object> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IS<Object> is, JM<? super a> jm) {
            super(2, jm);
            this.e = is;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC6606sf0<? super EP1<Object>> interfaceC6606sf0, JM<? super Unit> jm) {
            return ((a) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (IS.d(this.e, this) == mn) {
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

    @InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<EP1<Object>, JM<? super Boolean>, Object> {
        public /* synthetic */ Object d;

        public b() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            b bVar = new b(2, jm);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EP1<Object> ep1, JM<? super Boolean> jm) {
            return ((b) create(ep1, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(!(((EP1) this.d) instanceof C7649xd0));
        }
    }

    @InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<EP1<Object>, JM<? super Boolean>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ EP1<Object> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EP1<Object> ep1, JM<? super c> jm) {
            super(2, jm);
            this.e = ep1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            c cVar = new c(this.e, jm);
            cVar.d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EP1<Object> ep1, JM<? super Boolean> jm) {
            return ((c) create(ep1, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            EP1 ep1 = (EP1) this.d;
            return Boolean.valueOf((ep1 instanceof C4669jS) && ep1.a <= this.e.a);
        }
    }

    @InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
    public static final class d extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<Object>, Throwable, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ IS<Object> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(IS<Object> is, JM<? super d> jm) {
            super(3, jm);
            this.e = is;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (IS.b(this.e, this) == mn) {
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

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(InterfaceC6606sf0<Object> interfaceC6606sf0, Throwable th, JM<? super Unit> jm) {
            return new d(this.e, jm).invokeSuspend(Unit.a);
        }
    }

    public static final class e implements InterfaceC6396rf0<Object> {
        public final /* synthetic */ C1596Nf0 d;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: JS$e$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
            public static final class C0063a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0063a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) throws Throwable {
                C0063a c0063a;
                if (jm instanceof C0063a) {
                    c0063a = (C0063a) jm;
                    int i = c0063a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0063a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0063a = new C0063a(jm);
                    }
                } else {
                    c0063a = new C0063a(jm);
                }
                Object obj2 = c0063a.d;
                MN mn = MN.d;
                int i2 = c0063a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    EP1 ep1 = (EP1) obj;
                    if (ep1 instanceof C0605An1) {
                        throw ((C0605An1) ep1).b;
                    }
                    if (!(ep1 instanceof C4669jS)) {
                        if (ep1 instanceof C7649xd0 ? true : ep1 instanceof C6502s82) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new C6489s51();
                    }
                    T t = ((C4669jS) ep1).b;
                    c0063a.e = 1;
                    if (this.d.a(t, c0063a) == mn) {
                        return mn;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj2);
                }
                return Unit.a;
            }
        }

        public e(C1596Nf0 c1596Nf0) {
            this.d = c1596Nf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Object> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JS(IS<Object> is, JM<? super JS> jm) {
        super(2, jm);
        this.h = is;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        JS js = new JS(this.h, jm);
        js.g = obj;
        return js;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6606sf0<Object> interfaceC6606sf0, JM<? super Unit> jm) {
        return ((JS) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        if (defpackage.C4466ii.n(r9, r4, r3) == r0) goto L31;
     */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            MN r0 = defpackage.MN.d
            int r1 = r9.e
            r2 = 3
            r3 = 1
            IS<java.lang.Object> r4 = r9.h
            r5 = 2
            r6 = 0
            if (r1 == 0) goto L32
            if (r1 == r3) goto L29
            if (r1 == r5) goto L1f
            if (r1 != r2) goto L17
            defpackage.C1795Pt1.b(r10)
            goto Lb8
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            jS r1 = r9.d
            java.lang.Object r3 = r9.g
            sf0 r3 = (defpackage.InterfaceC6606sf0) r3
            defpackage.C1795Pt1.b(r10)
            goto L7a
        L29:
            java.lang.Object r1 = r9.g
            sf0 r1 = (defpackage.InterfaceC6606sf0) r1
            defpackage.C1795Pt1.b(r10)
            r3 = r1
            goto L4f
        L32:
            defpackage.C1795Pt1.b(r10)
            java.lang.Object r10 = r9.g
            sf0 r10 = (defpackage.InterfaceC6606sf0) r10
            r9.g = r10
            r9.e = r3
            EM r1 = r4.c
            WS r3 = new WS
            r3.<init>(r4, r6)
            kotlin.coroutines.CoroutineContext r1 = r1.d
            java.lang.Object r1 = defpackage.C5189lv.p(r1, r3, r9)
            if (r1 != r0) goto L4d
            goto Lb7
        L4d:
            r3 = r10
            r10 = r1
        L4f:
            r1 = r10
            EP1 r1 = (defpackage.EP1) r1
            boolean r10 = r1 instanceof defpackage.C4669jS
            if (r10 == 0) goto L6b
            r10 = r1
            jS r10 = (defpackage.C4669jS) r10
            T r10 = r10.b
            r9.g = r3
            r7 = r1
            jS r7 = (defpackage.C4669jS) r7
            r9.d = r7
            r9.e = r5
            java.lang.Object r10 = r3.a(r10, r9)
            if (r10 != r0) goto L7a
            goto Lb7
        L6b:
            boolean r10 = r1 instanceof defpackage.C6502s82
            if (r10 != 0) goto Lc0
            boolean r10 = r1 instanceof defpackage.C0605An1
            if (r10 != 0) goto Lbb
            boolean r10 = r1 instanceof defpackage.C7649xd0
            if (r10 == 0) goto L7a
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        L7a:
            eT<T> r10 = r4.h
            GP1 r10 = r10.a
            JS$a r7 = new JS$a
            r7.<init>(r4, r6)
            If0 r8 = new If0
            r8.<init>(r10, r7)
            JS$b r10 = new JS$b
            r10.<init>(r5, r6)
            Pf0 r5 = new Pf0
            r5.<init>(r8, r10)
            JS$c r10 = new JS$c
            r10.<init>(r1, r6)
            Nf0 r1 = new Nf0
            r1.<init>(r5, r10)
            JS$e r10 = new JS$e
            r10.<init>(r1)
            JS$d r1 = new JS$d
            r1.<init>(r4, r6)
            Hf0 r4 = new Hf0
            r4.<init>(r10, r1)
            r9.g = r6
            r9.d = r6
            r9.e = r2
            java.lang.Object r10 = defpackage.C4466ii.n(r9, r4, r3)
            if (r10 != r0) goto Lb8
        Lb7:
            return r0
        Lb8:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        Lbb:
            An1 r1 = (defpackage.C0605An1) r1
            java.lang.Throwable r10 = r1.b
            throw r10
        Lc0:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.JS.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
