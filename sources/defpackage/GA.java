package defpackage;

import defpackage.InterfaceC5387mq;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class GA<T extends InterfaceC5387mq> implements InterfaceC1009Fs0 {
    public final AbstractC4754jq a;
    public final ArrayList b = new ArrayList();

    public GA(AbstractC4754jq abstractC4754jq) {
        this.a = abstractC4754jq;
    }

    public static float b(ArrayList arrayList, float f, Kl2.a aVar) {
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < arrayList.size(); i++) {
            C7482wo0 c7482wo0 = (C7482wo0) arrayList.get(i);
            if (c7482wo0.g == aVar) {
                float fAbs = Math.abs(c7482wo0.d - f);
                if (fAbs < f2) {
                    f2 = fAbs;
                }
            }
        }
        return f2;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [ss0] */
    @Override // defpackage.InterfaceC1009Fs0
    public C7482wo0 a(float f, float f2) {
        AbstractC5174lq abstractC5174lq;
        int i;
        float f3;
        C3506e70 c3506e70G;
        C3581eV0 c3581eV0B = this.a.i(Kl2.a.d).b(f, f2);
        float f4 = (float) c3581eV0B.e;
        C3581eV0.c(c3581eV0B);
        ArrayList arrayList = this.b;
        arrayList.clear();
        AbstractC5174lq data = this.a.getData();
        if (data != null) {
            int iG = data.g();
            int i2 = 0;
            while (i2 < iG) {
                ?? E = data.e(i2);
                if (E.X()) {
                    AS.a aVar = AS.a.g;
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<C3506e70> arrayListK = E.K(f4);
                    if (arrayListK.size() == 0 && (c3506e70G = E.G(f4, Float.NaN, aVar)) != null) {
                        arrayListK = E.K(c3506e70G.b());
                    }
                    if (arrayListK.size() != 0) {
                        for (C3506e70 c3506e70 : arrayListK) {
                            C3581eV0 c3581eV0A = this.a.i(E.S()).a(c3506e70.b(), c3506e70.a());
                            ArrayList arrayList3 = arrayList2;
                            arrayList3.add(new C7482wo0(c3506e70.b(), c3506e70.a(), (float) c3581eV0A.e, (float) c3581eV0A.g, i2, E.S()));
                            arrayList2 = arrayList3;
                            f4 = f4;
                            iG = iG;
                            data = data;
                        }
                    }
                    abstractC5174lq = data;
                    i = iG;
                    f3 = f4;
                    arrayList.addAll(arrayList2);
                } else {
                    abstractC5174lq = data;
                    i = iG;
                    f3 = f4;
                }
                i2++;
                f4 = f3;
                iG = i;
                data = abstractC5174lq;
            }
        }
        C7482wo0 c7482wo0 = null;
        if (!arrayList.isEmpty()) {
            Kl2.a aVar2 = Kl2.a.d;
            float fB = b(arrayList, f2, aVar2);
            Kl2.a aVar3 = Kl2.a.e;
            if (fB >= b(arrayList, f2, aVar3)) {
                aVar2 = aVar3;
            }
            float maxHighlightDistance = this.a.getMaxHighlightDistance();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                C7482wo0 c7482wo1 = (C7482wo0) arrayList.get(i3);
                if (c7482wo1.g == aVar2) {
                    float fHypot = (float) Math.hypot(f - c7482wo1.c, f2 - c7482wo1.d);
                    if (fHypot < maxHighlightDistance) {
                        c7482wo0 = c7482wo1;
                        maxHighlightDistance = fHypot;
                    }
                }
            }
        }
        return c7482wo0;
    }
}
