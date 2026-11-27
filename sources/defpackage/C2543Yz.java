package defpackage;

import com.google.android.gms.common.ConnectionResult;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2543Yz<T, R> extends AbstractC2361Wz<T, R> {

    @NotNull
    public final AW1 i;

    /* JADX INFO: renamed from: Yz$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {ConnectionResult.API_DISABLED}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C2543Yz<T, R> g;
        public final /* synthetic */ InterfaceC6606sf0<R> h;

        /* JADX INFO: renamed from: Yz$a$a, reason: collision with other inner class name */
        public static final class C0203a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C3027bp1<XF0> d;
            public final /* synthetic */ KN e;
            public final /* synthetic */ C2543Yz<T, R> g;
            public final /* synthetic */ InterfaceC6606sf0<R> h;

            /* JADX INFO: renamed from: Yz$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {30}, m = "invokeSuspend")
            public static final class C0204a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
                public int d;
                public final /* synthetic */ C2543Yz<T, R> e;
                public final /* synthetic */ InterfaceC6606sf0<R> g;
                public final /* synthetic */ T h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0204a(C2543Yz<T, R> c2543Yz, InterfaceC6606sf0<? super R> interfaceC6606sf0, T t, JM<? super C0204a> jm) {
                    super(2, jm);
                    this.e = c2543Yz;
                    this.g = interfaceC6606sf0;
                    this.h = t;
                }

                @Override // defpackage.AbstractC7487wq
                @NotNull
                public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
                    return new C0204a(this.e, this.g, this.h, jm);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(KN kn, JM<? super Unit> jm) {
                    return ((C0204a) create(kn, jm)).invokeSuspend(Unit.a);
                }

                /* JADX WARN: Type inference failed for: r4v2, types: [AW1, Gj0] */
                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    MN mn = MN.d;
                    int i = this.d;
                    if (i == 0) {
                        C1795Pt1.b(obj);
                        ?? r4 = this.e.i;
                        this.d = 1;
                        if (r4.k(this.g, this.h, this) == mn) {
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

            /* JADX INFO: renamed from: Yz$a$a$b */
            @InterfaceC3368dU(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {26}, m = "emit")
            public static final class b extends LM {
                public C0203a d;
                public Object e;
                public XF0 g;
                public /* synthetic */ Object h;
                public final /* synthetic */ C0203a<T> i;
                public int j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0203a<? super T> c0203a, JM<? super b> jm) {
                    super(jm);
                    this.i = c0203a;
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.h = obj;
                    this.j |= Integer.MIN_VALUE;
                    return this.i.a(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0203a(C3027bp1<XF0> c3027bp1, KN kn, C2543Yz<T, R> c2543Yz, InterfaceC6606sf0<? super R> interfaceC6606sf0) {
                this.d = c3027bp1;
                this.e = kn;
                this.g = c2543Yz;
                this.h = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(T t, @NotNull JM<? super Unit> jm) {
                b bVar;
                C0203a<T> c0203a;
                if (jm instanceof b) {
                    bVar = (b) jm;
                    int i = bVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        bVar.j = i - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(this, jm);
                    }
                } else {
                    bVar = new b(this, jm);
                }
                Object obj = bVar.h;
                MN mn = MN.d;
                int i2 = bVar.j;
                if (i2 == 0) {
                    C1795Pt1.b(obj);
                    XF0 xf0 = this.d.d;
                    if (xf0 != null) {
                        xf0.l(new UB("Child of the scoped flow was cancelled"));
                        bVar.d = this;
                        bVar.e = t;
                        bVar.g = xf0;
                        bVar.j = 1;
                        if (xf0.b1(bVar) == mn) {
                            return mn;
                        }
                    }
                    c0203a = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t = (T) bVar.e;
                    c0203a = bVar.d;
                    C1795Pt1.b(obj);
                }
                C3027bp1<XF0> c3027bp1 = c0203a.d;
                ON on = ON.d;
                c3027bp1.d = (T) C5189lv.k(c0203a.e, null, new C0204a(c0203a.g, c0203a.h, t, null), 1);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C2543Yz<T, R> c2543Yz, InterfaceC6606sf0<? super R> interfaceC6606sf0, JM<? super a> jm) {
            super(2, jm);
            this.g = c2543Yz;
            this.h = interfaceC6606sf0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            a aVar = new a(this.g, this.h, jm);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type JM to Yz$a for r7v1 'this'  JM
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                MN r0 = defpackage.MN.d
                int r1 = r7.d
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                defpackage.C1795Pt1.b(r8)
                goto L35
            Ld:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L15:
                defpackage.C1795Pt1.b(r8)
                java.lang.Object r8 = r7.e
                KN r8 = (defpackage.KN) r8
                bp1 r1 = new bp1
                r1.<init>()
                Yz<T, R> r3 = r7.g
                rf0<S> r4 = r3.h
                Yz$a$a r5 = new Yz$a$a
                sf0<R> r6 = r7.h
                r5.<init>(r1, r8, r3, r6)
                r7.d = r2
                java.lang.Object r8 = r4.c(r5, r7)
                if (r8 != r0) goto L35
                return r0
            L35:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C2543Yz.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2543Yz(@NotNull InterfaceC1060Gj0<? super InterfaceC6606sf0<? super R>, ? super T, ? super JM<? super Unit>, ? extends Object> interfaceC1060Gj0, @NotNull InterfaceC6396rf0<? extends T> interfaceC6396rf0, @NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        super(i, enumC1796Pu, interfaceC6396rf0, coroutineContext);
        this.i = (AW1) interfaceC1060Gj0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, Gj0] */
    @Override // defpackage.AbstractC2123Tz
    @NotNull
    public final AbstractC2123Tz<R> k(@NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        return new C2543Yz(this.i, this.h, coroutineContext, i, enumC1796Pu);
    }

    @Override // defpackage.AbstractC2361Wz
    @Nullable
    public final Object n(@NotNull InterfaceC6606sf0<? super R> interfaceC6606sf0, @NotNull JM<? super Unit> jm) {
        Object objD = LN.d(new a(this, interfaceC6606sf0, null), jm);
        return objD == MN.d ? objD : Unit.a;
    }
}
