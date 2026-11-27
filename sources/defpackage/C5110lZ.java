package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5110lZ extends C2943bS.a<InterfaceC1490Lx, InterfaceC1490Lx> {
    public final /* synthetic */ C3027bp1<InterfaceC1490Lx> a;
    public final /* synthetic */ Function1<InterfaceC1490Lx, Boolean> b;

    /* JADX WARN: Multi-variable type inference failed */
    public C5110lZ(C3027bp1<InterfaceC1490Lx> c3027bp1, Function1<? super InterfaceC1490Lx, Boolean> function1) {
        this.a = c3027bp1;
        this.b = function1;
    }

    @Override // defpackage.C2943bS.c
    public final Object a() {
        return this.a.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [Lx, T, java.lang.Object] */
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
    @Override // defpackage.C2943bS.a, defpackage.C2943bS.c
    public final void b(Object obj) {
        ?? current = (InterfaceC1490Lx) obj;
        Intrinsics.checkNotNullParameter(current, "current");
        C3027bp1<InterfaceC1490Lx> c3027bp1 = this.a;
        if (c3027bp1.d == null && ((Boolean) this.b.invoke(current)).booleanValue()) {
            c3027bp1.d = current;
        }
    }

    @Override // defpackage.C2943bS.c
    public final boolean c(Object obj) {
        InterfaceC1490Lx current = (InterfaceC1490Lx) obj;
        Intrinsics.checkNotNullParameter(current, "current");
        return this.a.d == null;
    }
}
