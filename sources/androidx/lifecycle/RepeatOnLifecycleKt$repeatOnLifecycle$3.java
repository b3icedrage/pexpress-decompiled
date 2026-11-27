package androidx.lifecycle;

import defpackage.AW1;
import defpackage.AbstractC8109zn0;
import defpackage.C1717Ot1;
import defpackage.C1795Pt1;
import defpackage.C3027bp1;
import defpackage.C4795k21;
import defpackage.C5189lv;
import defpackage.C5885pC0;
import defpackage.C6251qy;
import defpackage.C6266r20;
import defpackage.ED;
import defpackage.FP0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC4117h21;
import defpackage.JM;
import defpackage.KN;
import defpackage.LN;
import defpackage.MN;
import defpackage.QV0;
import defpackage.RV;
import defpackage.XF0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ g g;
    public final /* synthetic */ g.b h;
    public final /* synthetic */ AW1 i;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    @InterfaceC3368dU(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public C3027bp1 d;
        public C3027bp1 e;
        public KN g;
        public int h;
        public final /* synthetic */ g i;
        public final /* synthetic */ g.b j;
        public final /* synthetic */ KN k;
        public final /* synthetic */ AW1 l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(g gVar, g.b bVar, KN kn, Function2<? super KN, ? super JM<? super Unit>, ? extends Object> function2, JM<? super AnonymousClass1> jm) {
            super(2, jm);
            this.i = gVar;
            this.j = bVar;
            this.k = kn;
            this.l = (AW1) function2;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [AW1, kotlin.jvm.functions.Function2] */
        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new AnonymousClass1(this.i, this.j, this.k, this.l, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((AnonymousClass1) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0085  */
        /* JADX WARN: Code duplicated, block: B:30:0x008e  */
        /* JADX WARN: Code duplicated, block: B:37:0x009d  */
        /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:46:? A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [AW1, kotlin.jvm.functions.Function2] */
        /* JADX WARN: Type inference failed for: r4v3, types: [EP0, T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C3027bp1 c3027bp1;
            Throwable th;
            C3027bp1 c3027bp2;
            XF0 xf0;
            k kVar;
            XF0 xf1;
            k kVar2;
            MN mn = MN.d;
            int i = this.h;
            g gVar = this.i;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3027bp1 = this.e;
                c3027bp2 = this.d;
                try {
                    C1795Pt1.b(obj);
                    xf1 = (XF0) c3027bp2.d;
                    if (xf1 != null) {
                        xf1.l(null);
                    }
                    kVar2 = (k) c3027bp1.d;
                    if (kVar2 != null) {
                        gVar.c(kVar2);
                    }
                    return Unit.a;
                } catch (Throwable th2) {
                    th = th2;
                    xf0 = (XF0) c3027bp2.d;
                    if (xf0 != null) {
                        xf0.l(null);
                    }
                    kVar = (k) c3027bp1.d;
                    if (kVar != null) {
                        throw th;
                    }
                    gVar.c(kVar);
                    throw th;
                }
            }
            C1795Pt1.b(obj);
            if (gVar.b() == g.b.d) {
                return Unit.a;
            }
            final C3027bp1 c3027bp3 = new C3027bp1();
            c3027bp1 = new C3027bp1();
            try {
                g.b bVar = this.j;
                final KN kn = this.k;
                final ?? r11 = this.l;
                this.d = c3027bp3;
                this.e = c3027bp1;
                this.g = kn;
                this.h = 1;
                final C6251qy c6251qy = new C6251qy(1, C5885pC0.b(this));
                c6251qy.r();
                g.a.Companion.getClass();
                final g.a aVarB = g.a.C0236a.b(bVar);
                final g.a aVarA = g.a.C0236a.a(bVar);
                final C4795k21 c4795k21C = ED.c();
                ?? r4 = new k(c3027bp3, kn, aVarA, c6251qy, c4795k21C, r11) { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1
                    public final /* synthetic */ C3027bp1<XF0> e;
                    public final /* synthetic */ KN g;
                    public final /* synthetic */ g.a h;
                    public final /* synthetic */ C6251qy i;
                    public final /* synthetic */ C4795k21 j;
                    public final /* synthetic */ AW1 k;

                    @InterfaceC3368dU(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
                    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
                        public InterfaceC4117h21 d;
                        public AW1 e;
                        public int g;
                        public final /* synthetic */ C4795k21 h;
                        public final /* synthetic */ AW1 i;

                        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a, reason: collision with other inner class name */
                        @InterfaceC3368dU(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
                        public static final class C0233a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
                            public int d;
                            public /* synthetic */ Object e;
                            public final /* synthetic */ Function2<KN, JM<? super Unit>, Object> g;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C0233a(Function2<? super KN, ? super JM<? super Unit>, ? extends Object> function2, JM<? super C0233a> jm) {
                                super(2, jm);
                                this.g = function2;
                            }

                            @Override // defpackage.AbstractC7487wq
                            @NotNull
                            public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
                                C0233a c0233a = new C0233a(this.g, jm);
                                c0233a.e = obj;
                                return c0233a;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(KN kn, JM<? super Unit> jm) {
                                return ((C0233a) create(kn, jm)).invokeSuspend(Unit.a);
                            }

                            @Override // defpackage.AbstractC7487wq
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                MN mn = MN.d;
                                int i = this.d;
                                if (i == 0) {
                                    C1795Pt1.b(obj);
                                    KN kn = (KN) this.e;
                                    this.d = 1;
                                    if (this.g.invoke(kn, this) == mn) {
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
                        /* JADX WARN: Multi-variable type inference failed */
                        public a(C4795k21 c4795k21, Function2 function2, JM jm) {
                            super(2, jm);
                            this.h = c4795k21;
                            this.i = (AW1) function2;
                        }

                        /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function2] */
                        @Override // defpackage.AbstractC7487wq
                        @NotNull
                        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
                            return new a(this.h, this.i, jm);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(KN kn, JM<? super Unit> jm) {
                            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function2] */
                        /* JADX WARN: Type inference failed for: r1v6 */
                        /* JADX WARN: Type inference failed for: r1v7 */
                        @Override // defpackage.AbstractC7487wq
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                            InterfaceC4117h21 interfaceC4117h21;
                            ?? r1;
                            InterfaceC4117h21 interfaceC4117h22;
                            Throwable th;
                            MN mn = MN.d;
                            int i = this.g;
                            try {
                                if (i == 0) {
                                    C1795Pt1.b(obj);
                                    interfaceC4117h21 = this.h;
                                    this.d = interfaceC4117h21;
                                    AW1 aw1 = this.i;
                                    this.e = aw1;
                                    this.g = 1;
                                    r1 = aw1;
                                    if (interfaceC4117h21.a(this) != mn) {
                                    }
                                    return mn;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    interfaceC4117h22 = this.d;
                                    try {
                                        C1795Pt1.b(obj);
                                        Unit unit = Unit.a;
                                        interfaceC4117h22.b(null);
                                        return Unit.a;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        interfaceC4117h22.b(null);
                                        throw th;
                                    }
                                }
                                Function2 function2 = (Function2) this.e;
                                InterfaceC4117h21 interfaceC4117h23 = this.d;
                                C1795Pt1.b(obj);
                                interfaceC4117h21 = interfaceC4117h23;
                                r1 = function2;
                                C0233a c0233a = new C0233a(r1, null);
                                this.d = interfaceC4117h21;
                                this.e = null;
                                this.g = 2;
                                if (LN.d(c0233a, this) != mn) {
                                    interfaceC4117h22 = interfaceC4117h21;
                                    Unit unit2 = Unit.a;
                                    interfaceC4117h22.b(null);
                                    return Unit.a;
                                }
                                return mn;
                            } catch (Throwable th3) {
                                interfaceC4117h22 = interfaceC4117h21;
                                th = th3;
                                interfaceC4117h22.b(null);
                                throw th;
                            }
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.k = (AW1) r11;
                    }

                    /* JADX WARN: Type inference failed for: r2v0, types: [AW1, kotlin.jvm.functions.Function2] */
                    /* JADX WARN: Type inference failed for: r5v3, types: [T, bP1] */
                    @Override // androidx.lifecycle.k
                    public final void b(@NotNull FP0 fp0, @NotNull g.a event) {
                        Intrinsics.checkNotNullParameter(fp0, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        C3027bp1<XF0> c3027bp4 = this.e;
                        if (event == this.d) {
                            c3027bp4.d = C5189lv.k(this.g, null, new a(this.j, this.k, null), 3);
                            return;
                        }
                        if (event == this.h) {
                            XF0 xf2 = c3027bp4.d;
                            if (xf2 != null) {
                                xf2.l(null);
                            }
                            c3027bp4.d = null;
                        }
                        if (event == g.a.ON_DESTROY) {
                            C1717Ot1.a aVar = C1717Ot1.e;
                            this.i.resumeWith(Unit.a);
                        }
                    }
                };
                c3027bp1.d = r4;
                gVar.a(r4);
                Object objQ = c6251qy.q();
                if (objQ == mn) {
                    Intrinsics.checkNotNullParameter(this, "frame");
                }
                if (objQ == mn) {
                    return mn;
                }
                c3027bp2 = c3027bp3;
                xf1 = (XF0) c3027bp2.d;
                if (xf1 != null) {
                    xf1.l(null);
                }
                kVar2 = (k) c3027bp1.d;
                if (kVar2 != null) {
                    gVar.c(kVar2);
                }
                return Unit.a;
            } catch (Throwable th3) {
                th = th3;
                c3027bp2 = c3027bp3;
                xf0 = (XF0) c3027bp2.d;
                if (xf0 != null) {
                    xf0.l(null);
                }
                kVar = (k) c3027bp1.d;
                if (kVar != null) {
                    throw th;
                }
                gVar.c(kVar);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(g gVar, g.b bVar, Function2<? super KN, ? super JM<? super Unit>, ? extends Object> function2, JM<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> jm) {
        super(2, jm);
        this.g = gVar;
        this.h = bVar;
        this.i = (AW1) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.g, this.h, this.i, jm);
        repeatOnLifecycleKt$repeatOnLifecycle$3.e = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            KN kn = (KN) this.e;
            RV rv = C6266r20.a;
            AbstractC8109zn0 abstractC8109zn0S1 = QV0.a.s1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.g, this.h, kn, this.i, null);
            this.d = 1;
            if (C5189lv.p(abstractC8109zn0S1, anonymousClass1, this) == mn) {
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
