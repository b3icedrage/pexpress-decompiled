package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class IB0 extends AbstractC7799yK0<Integer> {
    @Override // defpackage.AbstractC1002Fq
    public final Object g(C7589xK0 c7589xK0, float f) {
        return Integer.valueOf(l(c7589xK0, f));
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
    public final int l(C7589xK0<Integer> c7589xK0, float f) {
        float f2;
        if (c7589xK0.b == null || c7589xK0.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        NU0<A> nu0 = this.e;
        Integer num = c7589xK0.b;
        if (nu0 != 0) {
            f2 = f;
            Integer num2 = (Integer) nu0.b(c7589xK0.g, c7589xK0.h.floatValue(), num, c7589xK0.c, f2, e(), this.d);
            if (num2 != null) {
                return num2.intValue();
            }
        } else {
            f2 = f;
        }
        if (c7589xK0.k == 784923401) {
            c7589xK0.k = num.intValue();
        }
        int i = c7589xK0.k;
        if (c7589xK0.l == 784923401) {
            c7589xK0.l = c7589xK0.c.intValue();
        }
        int i2 = c7589xK0.l;
        PointF pointF = C7099v01.a;
        return (int) ((f2 * (i2 - i)) + i);
    }
}
