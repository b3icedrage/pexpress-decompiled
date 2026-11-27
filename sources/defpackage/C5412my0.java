package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: my0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5412my0 {

    @NotNull
    public final Set<AbstractC0637Ay0<?, ?>> a;

    @NotNull
    public final GP1 b;

    @NotNull
    public final b c;

    @NotNull
    public final C4250hg0 d;

    /* JADX INFO: renamed from: my0$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.indicatormanualconfig.IndicatorManualConfigProvider$special$$inlined$flatMapLatest$1", f = "IndicatorManualConfigProvider.kt", l = {189}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<? super InterfaceC7722xy0<? extends E10.c>>, AbstractC0637Ay0<?, ?>, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ InterfaceC6606sf0 e;
        public /* synthetic */ Object g;

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC6606sf0 interfaceC6606sf0 = this.e;
                C6610sg0 c6610sg0D = ((AbstractC0637Ay0) this.g).d();
                this.d = 1;
                if (C4466ii.n(this, c6610sg0D, interfaceC6606sf0) == mn) {
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
        public final Object k(InterfaceC6606sf0<? super InterfaceC7722xy0<? extends E10.c>> interfaceC6606sf0, AbstractC0637Ay0<?, ?> abstractC0637Ay0, JM<? super Unit> jm) {
            a aVar = new a(3, jm);
            aVar.e = interfaceC6606sf0;
            aVar.g = abstractC0637Ay0;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: renamed from: my0$b */
    public static final class b implements InterfaceC6396rf0<AbstractC0637Ay0<?, ?>> {
        public final /* synthetic */ GP1 d;
        public final /* synthetic */ C5412my0 e;

        /* JADX INFO: renamed from: my0$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ C5412my0 e;

            /* JADX INFO: renamed from: my0$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.indicatormanualconfig.IndicatorManualConfigProvider$special$$inlined$mapNotNull$1$2", f = "IndicatorManualConfigProvider.kt", l = {222}, m = "emit")
            public static final class C0446a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0446a(JM jm) {
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

            public a(InterfaceC6606sf0 interfaceC6606sf0, C5412my0 c5412my0) {
                this.d = interfaceC6606sf0;
                this.e = c5412my0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0446a c0446a;
                if (jm instanceof C0446a) {
                    c0446a = (C0446a) jm;
                    int i = c0446a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0446a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0446a = new C0446a(jm);
                    }
                } else {
                    c0446a = new C0446a(jm);
                }
                Object obj2 = c0446a.d;
                MN mn = MN.d;
                int i2 = c0446a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    String str = (String) obj;
                    AbstractC0637Ay0 abstractC0637Ay0 = null;
                    if (str != null) {
                        for (T t : this.e.a) {
                            if (((AbstractC0637Ay0) t).c().d.equals(str)) {
                                abstractC0637Ay0 = t;
                                break;
                            }
                        }
                        abstractC0637Ay0 = abstractC0637Ay0;
                    }
                    if (abstractC0637Ay0 != null) {
                        c0446a.e = 1;
                        if (this.d.a(abstractC0637Ay0, c0446a) == mn) {
                            return mn;
                        }
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

        public b(GP1 gp1, C5412my0 c5412my0) {
            this.d = gp1;
            this.e = c5412my0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super AbstractC0637Ay0<?, ?>> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0, this.e), jm);
            return MN.d;
        }
    }

    public C5412my0(@NotNull Set<AbstractC0637Ay0<?, ?>> indicators) {
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        this.a = indicators;
        GP1 gp1I = C1589Ne.i(null);
        this.b = gp1I;
        b bVar = new b(gp1I, this);
        this.c = bVar;
        a aVar = new a(3, null);
        int i = C2220Vf0.a;
        this.d = new C4250hg0(new C2543Yz(aVar, bVar, e.d, -2, EnumC1796Pu.d), 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r6 == r1) goto L24;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.LM r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C4989ky0
            if (r0 == 0) goto L13
            r0 = r6
            ky0 r0 = (defpackage.C4989ky0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ky0 r0 = new ky0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.d
            MN r1 = defpackage.MN.d
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r6)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.C1795Pt1.b(r6)
            goto L44
        L36:
            defpackage.C1795Pt1.b(r6)
            r0.g = r4
            my0$b r6 = r5.c
            java.lang.Object r6 = defpackage.C4466ii.o(r6, r0)
            if (r6 != r1) goto L44
            goto L5b
        L44:
            Ay0 r6 = (defpackage.AbstractC0637Ay0) r6
            r0.g = r3
            CR0 r2 = r6.c()
            java.lang.String r2 = r2.d
            By0 r6 = r6.a
            java.lang.Object r6 = r6.c(r2, r0)
            if (r6 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r6 = kotlin.Unit.a
        L59:
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5412my0.a(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r6 == r1) goto L24;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.InterfaceC7722xy0 r6, @org.jetbrains.annotations.NotNull defpackage.LM r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C5202ly0
            if (r0 == 0) goto L13
            r0 = r7
            ly0 r0 = (defpackage.C5202ly0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ly0 r0 = new ly0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r7)
            goto L6e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            xy0 r6 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L48
        L38:
            defpackage.C1795Pt1.b(r7)
            r0.d = r6
            r0.h = r4
            my0$b r7 = r5.c
            java.lang.Object r7 = defpackage.C4466ii.o(r7, r0)
            if (r7 != r1) goto L48
            goto L6d
        L48:
            Ay0 r7 = (defpackage.AbstractC0637Ay0) r7
            r2 = 0
            r0.d = r2
            r0.h = r3
            CR0 r2 = r7.c()
            java.lang.String r2 = r2.d
            com.google.gson.Gson r3 = r7.b
            java.lang.String r6 = r3.i(r6)
            java.lang.String r3 = "toJson(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            By0 r7 = r7.a
            java.lang.Object r6 = r7.a(r2, r6, r0)
            if (r6 != r1) goto L69
            goto L6b
        L69:
            kotlin.Unit r6 = kotlin.Unit.a
        L6b:
            if (r6 != r1) goto L6e
        L6d:
            return r1
        L6e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5412my0.b(xy0, LM):java.lang.Object");
    }
}
