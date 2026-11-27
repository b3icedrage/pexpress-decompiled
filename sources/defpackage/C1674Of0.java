package defpackage;

import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Of0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1674Of0<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ C2512Yo1 d;
    public final /* synthetic */ InterfaceC6606sf0<T> e;
    public final /* synthetic */ AW1 g;

    /* JADX INFO: renamed from: Of0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {33, 34, 36}, m = "emit")
    public static final class a extends LM {
        public C1674Of0 d;
        public Object e;
        public /* synthetic */ Object g;
        public final /* synthetic */ C1674Of0<T> h;
        public int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C1674Of0<? super T> c1674Of0, JM<? super a> jm) {
            super(jm);
            this.h = c1674Of0;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return this.h.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1674Of0(C2512Yo1 c2512Yo1, InterfaceC6606sf0<? super T> interfaceC6606sf0, Function2<? super T, ? super JM<? super Boolean>, ? extends Object> function2) {
        this.d = c2512Yo1;
        this.e = interfaceC6606sf0;
        this.g = (AW1) function2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r6.e.a(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r2.e.a(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Type inference failed for: r8v4, types: [AW1, kotlin.jvm.functions.Function2] */
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
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(T r7, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C1674Of0.a
            if (r0 == 0) goto L13
            r0 = r8
            Of0$a r0 = (defpackage.C1674Of0.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            Of0$a r0 = new Of0$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.C1795Pt1.b(r8)
            goto L84
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.e
            Of0 r2 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L68
        L3d:
            defpackage.C1795Pt1.b(r8)
            goto L55
        L41:
            defpackage.C1795Pt1.b(r8)
            Yo1 r8 = r6.d
            boolean r8 = r8.d
            if (r8 == 0) goto L58
            r0.i = r5
            sf0<T> r8 = r6.e
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L55
            goto L83
        L55:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L58:
            r0.d = r6
            r0.e = r7
            r0.i = r4
            AW1 r8 = r6.g
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L67
            goto L83
        L67:
            r2 = r6
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L87
            Yo1 r8 = r2.d
            r8.d = r5
            r8 = 0
            r0.d = r8
            r0.e = r8
            r0.i = r3
            sf0<T> r8 = r2.e
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L84
        L83:
            return r1
        L84:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L87:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1674Of0.a(java.lang.Object, JM):java.lang.Object");
    }
}
