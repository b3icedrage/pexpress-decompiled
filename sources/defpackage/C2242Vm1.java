package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Vm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2242Vm1 extends AbstractC2299We0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2242Vm1(@NotNull AbstractC5706oM1 lowerBound, @NotNull AbstractC5706oM1 upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        InterfaceC4859kL0.a.d(lowerBound, upperBound);
    }

    public static final ArrayList f1(C2964bZ c2964bZ, AbstractC4649jL0 abstractC4649jL0) {
        List<N62> listT0 = abstractC4649jL0.T0();
        ArrayList arrayList = new ArrayList(XE.m(listT0, 10));
        Iterator<T> it = listT0.iterator();
        while (it.hasNext()) {
            arrayList.add(c2964bZ.f0((N62) it.next()));
        }
        return arrayList;
    }

    public static final String g1(String str, String str2) {
        if (!StringsKt.D(str, '<')) {
            return str;
        }
        return StringsKt.X(str, '<') + '<' + str2 + '>' + StringsKt.W('>', str, str);
    }

    @Override // defpackage.P92
    public final P92 Z0(boolean z) {
        return new C2242Vm1(this.e.Z0(z), this.g.Z0(z));
    }

    @Override // defpackage.P92
    public final P92 b1(C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new C2242Vm1(this.e.b1(newAttributes), this.g.b1(newAttributes));
    }

    @Override // defpackage.AbstractC2299We0
    @NotNull
    public final AbstractC5706oM1 c1() {
        return this.e;
    }

    @Override // defpackage.AbstractC2299We0
    @NotNull
    public final String d1(@NotNull C2964bZ renderer, @NotNull C2964bZ options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        AbstractC5706oM1 abstractC5706oM1 = this.e;
        String strZ = renderer.Z(abstractC5706oM1);
        AbstractC5706oM1 abstractC5706oM2 = this.g;
        String strZ2 = renderer.Z(abstractC5706oM2);
        if (options.d.n()) {
            return "raw (" + strZ + ".." + strZ2 + ')';
        }
        if (abstractC5706oM2.T0().isEmpty()) {
            return renderer.F(strZ, strZ2, C0564Aa.l(this));
        }
        ArrayList arrayListF1 = f1(renderer, abstractC5706oM1);
        ArrayList arrayListF2 = f1(renderer, abstractC5706oM2);
        String strJ = CollectionsKt.J(arrayListF1, ", ", null, null, C2164Um1.d, 30);
        ArrayList arrayListJ0 = CollectionsKt.j0(arrayListF1, arrayListF2);
        if (!arrayListJ0.isEmpty()) {
            Iterator it = arrayListJ0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strZ2 = g1(strZ2, strJ);
                    break;
                }
                Pair pair = (Pair) it.next();
                String str = (String) pair.d;
                String str2 = (String) pair.e;
                if (!Intrinsics.a(str, StringsKt.M(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
        } else {
            strZ2 = g1(strZ2, strJ);
            break;
        }
        String strG1 = g1(strZ, strJ);
        return Intrinsics.a(strG1, strZ2) ? strG1 : renderer.F(strG1, strZ2, C0564Aa.l(this));
    }

    @Override // defpackage.P92
    @NotNull
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final AbstractC2299We0 X0(@NotNull AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC4649jL0 abstractC4649jL0T = kotlinTypeRefiner.t(this.e);
        Intrinsics.c(abstractC4649jL0T, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC4649jL0 abstractC4649jL0T2 = kotlinTypeRefiner.t(this.g);
        Intrinsics.c(abstractC4649jL0T2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C2242Vm1((AbstractC5706oM1) abstractC4649jL0T, (AbstractC5706oM1) abstractC4649jL0T2);
    }

    @Override // defpackage.AbstractC2299We0, defpackage.AbstractC4649jL0
    @NotNull
    public final QY0 v() {
        InterfaceC5044lD interfaceC5044lDC = V0().c();
        FC fc = interfaceC5044lDC instanceof FC ? (FC) interfaceC5044lDC : null;
        if (fc != null) {
            QY0 qy0H0 = fc.h0(new C2086Tm1());
            Intrinsics.checkNotNullExpressionValue(qy0H0, "getMemberScope(...)");
            return qy0H0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + V0().c()).toString());
    }
}
