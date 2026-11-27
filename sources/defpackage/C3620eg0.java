package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
public final class C3620eg0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ IK1 e;
    public final /* synthetic */ InterfaceC6396rf0<Object> g;
    public final /* synthetic */ AbstractC3272d1 h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: eg0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<Integer, JM<? super Boolean>, Object> {
        public /* synthetic */ int d;

        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            a aVar = new a(2, jm);
            aVar.d = ((Number) obj).intValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, JM<? super Boolean> jm) {
            return ((a) create(Integer.valueOf(num.intValue()), jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(this.d > 0);
        }
    }

    /* JADX INFO: renamed from: eg0$b */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<GK1, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0<Object> g;
        public final /* synthetic */ AbstractC3272d1 h;
        public final /* synthetic */ Object i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC6396rf0<Object> interfaceC6396rf0, InterfaceC3487e21<Object> interfaceC3487e21, Object obj, JM<? super b> jm) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = (AbstractC3272d1) interfaceC3487e21;
            this.i = obj;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [d1, e21] */
        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            b bVar = new b(this.g, this.h, this.i, jm);
            bVar.e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GK1 gk1, JM<? super Unit> jm) {
            return ((b) create(gk1, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [d1, e21, sf0] */
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
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                int iOrdinal = ((GK1) this.e).ordinal();
                ?? r1 = this.h;
                if (iOrdinal == 0) {
                    this.d = 1;
                    if (this.g.c(r1, this) == mn) {
                        return mn;
                    }
                } else if (iOrdinal == 2) {
                    GW1 gw1 = C1589Ne.g;
                    Object obj2 = this.i;
                    if (obj2 == gw1) {
                        r1.e();
                    } else {
                        r1.h(obj2);
                    }
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
    public C3620eg0(IK1 ik1, InterfaceC6396rf0<Object> interfaceC6396rf0, InterfaceC3487e21<Object> interfaceC3487e21, Object obj, JM<? super C3620eg0> jm) {
        super(2, jm);
        this.e = ik1;
        this.g = interfaceC6396rf0;
        this.h = (AbstractC3272d1) interfaceC3487e21;
        this.i = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [d1, e21] */
    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new C3620eg0(this.e, this.g, this.h, this.i, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3620eg0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r6.c(r2, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r6.c(r2, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (defpackage.C4466ii.j(r9, r1, r8) == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [d1, e21, sf0] */
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
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            r8 = this;
            MN r0 = defpackage.MN.d
            int r1 = r8.d
            d1 r2 = r8.h
            r3 = 4
            r4 = 3
            r5 = 1
            rf0<java.lang.Object> r6 = r8.g
            r7 = 2
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r7) goto L1f
            if (r1 == r4) goto L23
            if (r1 != r3) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            defpackage.C1795Pt1.b(r9)
            goto L50
        L23:
            defpackage.C1795Pt1.b(r9)
            goto L75
        L27:
            defpackage.C1795Pt1.b(r9)
            LL r9 = IK1.a.a
            IK1 r1 = r8.e
            if (r1 != r9) goto L39
            r8.d = r5
            java.lang.Object r9 = r6.c(r2, r8)
            if (r9 != r0) goto L75
            goto L74
        L39:
            vP1 r9 = IK1.a.b
            r5 = 0
            if (r1 != r9) goto L59
            wU1 r9 = r2.i()
            eg0$a r1 = new eg0$a
            r1.<init>(r7, r5)
            r8.d = r7
            java.lang.Object r9 = defpackage.C4466ii.p(r9, r1, r8)
            if (r9 != r0) goto L50
            goto L74
        L50:
            r8.d = r4
            java.lang.Object r9 = r6.c(r2, r8)
            if (r9 != r0) goto L75
            goto L74
        L59:
            wU1 r9 = r2.i()
            rf0 r9 = r1.a(r9)
            rf0 r9 = defpackage.C4466ii.m(r9)
            eg0$b r1 = new eg0$b
            java.lang.Object r4 = r8.i
            r1.<init>(r6, r2, r4, r5)
            r8.d = r3
            java.lang.Object r9 = defpackage.C4466ii.j(r9, r1, r8)
            if (r9 != r0) goto L75
        L74:
            return r0
        L75:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3620eg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
