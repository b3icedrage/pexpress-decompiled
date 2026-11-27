package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ZX1 extends AbstractC7799yK0<L20> {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.AbstractC1002Fq
    public final Object g(C7589xK0 c7589xK0, float f) {
        Object obj;
        NU0<A> nu0 = this.e;
        Object obj2 = c7589xK0.b;
        if (nu0 == 0) {
            return (f != 1.0f || (obj = c7589xK0.c) == null) ? (L20) obj2 : (L20) obj;
        }
        Float f2 = c7589xK0.h;
        float fFloatValue = f2 == null ? Float.MAX_VALUE : f2.floatValue();
        L20 l20 = (L20) obj2;
        Object obj3 = c7589xK0.c;
        return (L20) nu0.b(c7589xK0.g, fFloatValue, l20, obj3 == null ? l20 : (L20) obj3, f, d(), this.d);
    }
}
