package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class VO0 extends AbstractC5628o0 {

    @NotNull
    public final LO0 o;

    @NotNull
    public final ZE0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VO0(@NotNull LO0 c, @NotNull ZE0 javaTypeParameter, int i, @NotNull InterfaceC5095lU containingDeclaration) {
        super(c.a.a, containingDeclaration, new C6970uO0(c, javaTypeParameter, false), javaTypeParameter.getName(), EnumC3610ed2.INVARIANT, false, i, c.a.m);
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        this.o = c;
        this.p = javaTypeParameter;
    }

    @Override // defpackage.F1
    @NotNull
    public final List<AbstractC4649jL0> U0(@NotNull List<? extends AbstractC4649jL0> bounds) {
        PL1 pl1;
        AbstractC4649jL0 abstractC4649jL0;
        AbstractC4649jL0 abstractC4649jL0B;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        LO0 context = this.o;
        PL1 pl2 = context.a.r;
        pl2.getClass();
        Intrinsics.checkNotNullParameter(this, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList(XE.m(bounds, 10));
        for (AbstractC4649jL0 abstractC4649jL1 : bounds) {
            CH predicate = CH.g;
            Intrinsics.checkNotNullParameter(abstractC4649jL1, "<this>");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            if (C3089c72.c(abstractC4649jL1, predicate, null)) {
                pl1 = pl2;
                abstractC4649jL0 = abstractC4649jL1;
            } else {
                pl1 = pl2;
                abstractC4649jL0 = abstractC4649jL1;
                abstractC4649jL0B = pl1.b(new RL1(this, false, context, EnumC1976Sc.TYPE_PARAMETER_BOUNDS, false), abstractC4649jL0, C5653o60.d, null, false);
                if (abstractC4649jL0B == null) {
                }
                arrayList.add(abstractC4649jL0B);
                pl2 = pl1;
            }
            abstractC4649jL0B = abstractC4649jL0;
            arrayList.add(abstractC4649jL0B);
            pl2 = pl1;
        }
        return arrayList;
    }

    @Override // defpackage.F1
    public final void V0(@NotNull AbstractC4649jL0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // defpackage.F1
    @NotNull
    public final List<AbstractC4649jL0> W0() {
        Collection<InterfaceC4370iE0> upperBounds = this.p.getUpperBounds();
        boolean zIsEmpty = upperBounds.isEmpty();
        LO0 lo0 = this.o;
        if (zIsEmpty) {
            AbstractC5706oM1 abstractC5706oM1E = lo0.a.o.h.e();
            Intrinsics.checkNotNullExpressionValue(abstractC5706oM1E, "getAnyType(...)");
            AbstractC5706oM1 abstractC5706oM1O = lo0.a.o.h.o();
            Intrinsics.checkNotNullExpressionValue(abstractC5706oM1O, "getNullableAnyType(...)");
            return VE.c(C5492nL0.a(abstractC5706oM1E, abstractC5706oM1O));
        }
        Collection<InterfaceC4370iE0> collection = upperBounds;
        ArrayList arrayList = new ArrayList(XE.m(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(lo0.e.d((InterfaceC4370iE0) it.next(), C3686f.q(EnumC2880b72.e, false, this, 3)));
        }
        return arrayList;
    }
}
