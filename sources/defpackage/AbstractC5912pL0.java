package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5912pL0 extends G1 {

    /* JADX INFO: renamed from: pL0$a */
    public static final class a extends AbstractC5912pL0 {

        @NotNull
        public static final a e = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [jC0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [jC0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r3v0, types: [H62] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static AbstractC5706oM1 x(AbstractC5706oM1 abstractC5706oM1) {
        AbstractC4649jL0 type;
        InterfaceC6494s62 interfaceC6494s62V0 = abstractC5706oM1.V0();
        ?? r3 = 0;
        if (interfaceC6494s62V0 instanceof C2618Zy) {
            C2618Zy c2618Zy = (C2618Zy) interfaceC6494s62V0;
            N62 n62 = c2618Zy.a;
            if (n62.b() != EnumC3610ed2.IN_VARIANCE) {
                n62 = null;
            }
            P92 p92Y0 = (n62 == null || (type = n62.getType()) == null) ? null : type.Y0();
            if (c2618Zy.b == null) {
                Collection<AbstractC4649jL0> collectionA = c2618Zy.a();
                ArrayList supertypes = new ArrayList(XE.m(collectionA, 10));
                Iterator it = collectionA.iterator();
                while (it.hasNext()) {
                    supertypes.add(((AbstractC4649jL0) it.next()).Y0());
                }
                N62 projection = c2618Zy.a;
                Intrinsics.checkNotNullParameter(projection, "projection");
                Intrinsics.checkNotNullParameter(supertypes, "supertypes");
                c2618Zy.b = new C5436n41(projection, new BZ(supertypes, 3), (H62) r3, 8);
            }
            EnumC2120Ty enumC2120Ty = EnumC2120Ty.d;
            C5436n41 c5436n41 = c2618Zy.b;
            Intrinsics.checkNotNull(c5436n41);
            return new C5226m41(enumC2120Ty, c5436n41, p92Y0, abstractC5706oM1.U0(), abstractC5706oM1.W0(), 32);
        }
        if (interfaceC6494s62V0 instanceof NB0) {
            ((NB0) interfaceC6494s62V0).getClass();
            XE.m(null, 10);
            throw null;
        }
        if (!(interfaceC6494s62V0 instanceof C4622jC0) || !abstractC5706oM1.W0()) {
            return abstractC5706oM1;
        }
        ?? r0 = (C4622jC0) interfaceC6494s62V0;
        LinkedHashSet<AbstractC4649jL0> linkedHashSet = r0.b;
        ArrayList typesToIntersect = new ArrayList(XE.m(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            typesToIntersect.add(C0564Aa.s((AbstractC4649jL0) it2.next()));
            z = true;
        }
        if (z) {
            AbstractC4649jL0 abstractC4649jL0 = r0.a;
            P92 p92S = abstractC4649jL0 != null ? C0564Aa.s(abstractC4649jL0) : null;
            Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
            typesToIntersect.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(typesToIntersect);
            linkedHashSet2.hashCode();
            C4622jC0 c4622jC0 = new C4622jC0(linkedHashSet2);
            c4622jC0.a = p92S;
            r3 = c4622jC0;
        }
        if (r3 != 0) {
            r0 = r3;
        }
        return r0.g();
    }

    @NotNull
    public final P92 w(@NotNull InterfaceC5702oL0 type) {
        P92 p92A;
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof AbstractC4649jL0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        P92 origin = ((AbstractC4649jL0) type).Y0();
        if (origin instanceof AbstractC5706oM1) {
            p92A = x((AbstractC5706oM1) origin);
        } else {
            if (!(origin instanceof AbstractC2299We0)) {
                throw new C6489s51();
            }
            AbstractC2299We0 abstractC2299We0 = (AbstractC2299We0) origin;
            AbstractC5706oM1 abstractC5706oM1 = abstractC2299We0.e;
            AbstractC5706oM1 abstractC5706oM1X = x(abstractC5706oM1);
            AbstractC5706oM1 abstractC5706oM2 = abstractC2299We0.g;
            AbstractC5706oM1 abstractC5706oM1X2 = x(abstractC5706oM2);
            p92A = (abstractC5706oM1X == abstractC5706oM1 && abstractC5706oM1X2 == abstractC5706oM2) ? origin : C5492nL0.a(abstractC5706oM1X, abstractC5706oM1X2);
        }
        C6122qL0 transform = new C6122qL0(1, this);
        Intrinsics.checkNotNullParameter(p92A, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(transform, "transform");
        AbstractC4649jL0 abstractC4649jL0E = C6621sj.e(origin);
        return C6621sj.r(p92A, abstractC4649jL0E != null ? (AbstractC4649jL0) transform.invoke(abstractC4649jL0E) : null);
    }
}
