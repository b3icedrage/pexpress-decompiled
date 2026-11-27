package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: sf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6607sf1 extends AbstractC7799yK0<PointF> {
    public final PointF i;

    public C6607sf1(List<C7589xK0<PointF>> list) {
        super(list);
        this.i = new PointF();
    }

    @Override // defpackage.AbstractC1002Fq
    public final Object g(C7589xK0 c7589xK0, float f) {
        return h(c7589xK0, f, f, f);
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
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final PointF h(C7589xK0<PointF> c7589xK0, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2 = c7589xK0.b;
        if (pointF2 == null || (pointF = c7589xK0.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        NU0<A> nu0 = this.e;
        if (nu0 != 0) {
            PointF pointF5 = (PointF) nu0.b(c7589xK0.g, c7589xK0.h.floatValue(), pointF3, pointF4, f, e(), this.d);
            if (pointF5 != null) {
                return pointF5;
            }
        }
        PointF pointF6 = this.i;
        float f4 = pointF3.x;
        float fA = BX.a(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF6.set(fA, BX.a(pointF4.y, f5, f3, f5));
        return pointF6;
    }
}
