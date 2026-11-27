package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: renamed from: Ic1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1196Ic1 extends AbstractC7799yK0<PointF> {
    public final PointF i;
    public final float[] j;
    public final PathMeasure k;
    public C1118Hc1 l;

    public C1196Ic1(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new PathMeasure();
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
        float f2;
        C1118Hc1 c1118Hc1 = (C1118Hc1) c7589xK0;
        Path path = c1118Hc1.q;
        if (path == null) {
            return (PointF) c7589xK0.b;
        }
        NU0<A> nu0 = this.e;
        if (nu0 != 0) {
            f2 = f;
            PointF pointF = (PointF) nu0.b(c1118Hc1.g, c1118Hc1.h.floatValue(), (PointF) c1118Hc1.b, (PointF) c1118Hc1.c, e(), f2, this.d);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f2 = f;
        }
        C1118Hc1 c1118Hc2 = this.l;
        PathMeasure pathMeasure = this.k;
        if (c1118Hc2 != c1118Hc1) {
            pathMeasure.setPath(path, false);
            this.l = c1118Hc1;
        }
        float length = pathMeasure.getLength() * f2;
        float[] fArr = this.j;
        pathMeasure.getPosTan(length, fArr, null);
        PointF pointF2 = this.i;
        pointF2.set(fArr[0], fArr[1]);
        return pointF2;
    }
}
