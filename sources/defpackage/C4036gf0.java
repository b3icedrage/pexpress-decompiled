package defpackage;

/* JADX INFO: renamed from: gf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4036gf0 extends AbstractC7799yK0<Float> {
    public C4036gf0() {
        throw null;
    }

    @Override // defpackage.AbstractC1002Fq
    public final Object g(C7589xK0 c7589xK0, float f) {
        return Float.valueOf(m(c7589xK0, f));
    }

    public final float l() {
        return m(b(), d());
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
    public final float m(C7589xK0<Float> c7589xK0, float f) {
        float f2;
        if (c7589xK0.b == null || c7589xK0.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        NU0<A> nu0 = this.e;
        Float f3 = c7589xK0.b;
        if (nu0 != 0) {
            Float f4 = c7589xK0.c;
            float fE = e();
            float f5 = this.d;
            f2 = f;
            Float f6 = (Float) nu0.b(c7589xK0.g, c7589xK0.h.floatValue(), f3, f4, f2, fE, f5);
            if (f6 != null) {
                return f6.floatValue();
            }
        } else {
            f2 = f;
        }
        if (c7589xK0.i == -3987645.8f) {
            c7589xK0.i = f3.floatValue();
        }
        float f7 = c7589xK0.i;
        if (c7589xK0.j == -3987645.8f) {
            c7589xK0.j = c7589xK0.c.floatValue();
        }
        return C7099v01.d(f7, c7589xK0.j, f2);
    }
}
