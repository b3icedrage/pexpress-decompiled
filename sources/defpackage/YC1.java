package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class YC1 extends AbstractC7799yK0<ZC1> {
    public final ZC1 i;

    public YC1(List<C7589xK0<ZC1>> list) {
        super(list);
        this.i = new ZC1();
    }

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
        float f2;
        Object obj2 = c7589xK0.b;
        if (obj2 == null || (obj = c7589xK0.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ZC1 zc1 = (ZC1) obj2;
        ZC1 zc2 = (ZC1) obj;
        NU0<A> nu0 = this.e;
        if (nu0 != 0) {
            f2 = f;
            ZC1 zc3 = (ZC1) nu0.b(c7589xK0.g, c7589xK0.h.floatValue(), zc1, zc2, f2, e(), this.d);
            if (zc3 != null) {
                return zc3;
            }
        } else {
            f2 = f;
        }
        float fD = C7099v01.d(zc1.a, zc2.a, f2);
        float fD2 = C7099v01.d(zc1.b, zc2.b, f2);
        ZC1 zc4 = this.i;
        zc4.a = fD;
        zc4.b = fD2;
        return zc4;
    }
}
