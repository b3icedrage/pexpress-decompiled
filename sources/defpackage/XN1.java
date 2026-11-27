package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class XN1 implements InterfaceC6771tS.a<Object> {
    public final /* synthetic */ I01.a d;
    public final /* synthetic */ YN1 e;

    public XN1(YN1 yn1, I01.a aVar) {
        this.e = yn1;
        this.d = aVar;
    }

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
    @Override // defpackage.InterfaceC6771tS.a
    public final void d(@NonNull Exception exc) {
        YN1 yn1 = this.e;
        I01.a<?> aVar = this.d;
        I01.a<?> aVar2 = yn1.j;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        YN1 yn2 = this.e;
        I01.a aVar3 = this.d;
        RunnableC6777tU runnableC6777tU = yn2.e;
        InterfaceC3129cK0 interfaceC3129cK0 = yn2.k;
        InterfaceC6771tS<Data> interfaceC6771tS = aVar3.c;
        runnableC6777tU.e(interfaceC3129cK0, exc, interfaceC6771tS, interfaceC6771tS.e());
    }

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
    @Override // defpackage.InterfaceC6771tS.a
    public final void f(Object obj) {
        YN1 yn1 = this.e;
        I01.a<?> aVar = this.d;
        I01.a<?> aVar2 = yn1.j;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        YN1 yn2 = this.e;
        I01.a aVar3 = this.d;
        AbstractC2634a20 abstractC2634a20 = yn2.d.p;
        if (obj != null && abstractC2634a20.c(aVar3.c.e())) {
            yn2.i = obj;
            yn2.e.q(RunnableC6777tU.d.e);
        } else {
            RunnableC6777tU runnableC6777tU = yn2.e;
            InterfaceC3129cK0 interfaceC3129cK0 = aVar3.a;
            InterfaceC6771tS<Data> interfaceC6771tS = aVar3.c;
            runnableC6777tU.b(interfaceC3129cK0, obj, interfaceC6771tS, interfaceC6771tS.e(), yn2.k);
        }
    }
}
