package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3942gB1 implements InterfaceC3130cK1, AbstractC1002Fq.a {
    public final DU0 a;
    public final AbstractC1002Fq<Float, Float> b;
    public UJ1 c;

    public C3942gB1(DU0 du0, AbstractC1158Hq abstractC1158Hq, C3732fB1 c3732fB1) {
        this.a = du0;
        c3732fB1.getClass();
        AbstractC1002Fq<Float, Float> abstractC1002FqJ = c3732fB1.a.j();
        this.b = abstractC1002FqJ;
        abstractC1158Hq.g(abstractC1002FqJ);
        abstractC1002FqJ.a(this);
    }

    public static int c(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.AbstractC1002Fq.a
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // defpackage.InterfaceC3130cK1
    public final UJ1 d(UJ1 uj1) {
        int i;
        UJ1 uj2 = uj1;
        ArrayList arrayList = uj2.a;
        if (arrayList.size() > 2) {
            float fFloatValue = this.b.f().floatValue();
            if (fFloatValue != 0.0f) {
                ArrayList arrayList2 = uj2.a;
                boolean z = uj2.c;
                boolean z2 = true;
                int size = arrayList2.size() - 1;
                int i2 = 0;
                while (size >= 0) {
                    C5506nQ c5506nQ = (C5506nQ) arrayList2.get(size);
                    C5506nQ c5506nQ2 = (C5506nQ) arrayList2.get(c(size - 1, arrayList2.size()));
                    PointF pointF = (size != 0 || z) ? c5506nQ2.c : uj2.b;
                    i2 = (((size != 0 || z) ? c5506nQ2.b : pointF).equals(pointF) && c5506nQ.a.equals(pointF) && !(!uj2.c && size == 0 && size == arrayList2.size() - 1)) ? i2 + 2 : i2 + 1;
                    size--;
                }
                UJ1 uj3 = this.c;
                if (uj3 == null || uj3.a.size() != i2) {
                    ArrayList arrayList3 = new ArrayList(i2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        arrayList3.add(new C5506nQ());
                    }
                    this.c = new UJ1(new PointF(0.0f, 0.0f), false, arrayList3);
                }
                UJ1 uj4 = this.c;
                uj4.c = z;
                PointF pointF2 = uj2.b;
                uj4.a(pointF2.x, pointF2.y);
                ArrayList arrayList4 = uj4.a;
                boolean z3 = uj2.c;
                int i4 = 0;
                int i5 = 0;
                while (i4 < arrayList.size()) {
                    C5506nQ c5506nQ3 = (C5506nQ) arrayList.get(i4);
                    C5506nQ c5506nQ4 = (C5506nQ) arrayList.get(c(i4 - 1, arrayList.size()));
                    C5506nQ c5506nQ5 = (C5506nQ) arrayList.get(c(i4 - 2, arrayList.size()));
                    PointF pointF3 = (i4 != 0 || z3) ? c5506nQ4.c : uj2.b;
                    PointF pointF4 = (i4 != 0 || z3) ? c5506nQ4.b : pointF3;
                    boolean z4 = z2;
                    PointF pointF5 = c5506nQ3.a;
                    PointF pointF6 = c5506nQ5.c;
                    boolean z5 = (!uj2.c && i4 == 0 && i4 == arrayList.size() + (-1)) ? z4 : false;
                    if (pointF4.equals(pointF3) && pointF5.equals(pointF3) && !z5) {
                        float f = pointF3.x;
                        float f2 = f - pointF6.x;
                        float f3 = pointF3.y;
                        float f4 = f3 - pointF6.y;
                        PointF pointF7 = c5506nQ3.c;
                        float f5 = pointF7.x - f;
                        float f6 = pointF7.y - f3;
                        i = i4;
                        float fHypot = (float) Math.hypot(f2, f4);
                        float fHypot2 = (float) Math.hypot(f5, f6);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f7 = pointF3.x;
                        float fA = BX.a(pointF6.x, f7, fMin, f7);
                        float f8 = pointF3.y;
                        float fA2 = BX.a(pointF6.y, f8, fMin, f8);
                        float fA3 = BX.a(pointF7.x, f7, fMin2, f7);
                        float fA4 = BX.a(pointF7.y, f8, fMin2, f8);
                        float f9 = fA - ((fA - f7) * 0.5519f);
                        float f10 = fA2 - ((fA2 - f8) * 0.5519f);
                        float f11 = fA3 - ((fA3 - f7) * 0.5519f);
                        float f12 = fA4 - ((fA4 - f8) * 0.5519f);
                        C5506nQ c5506nQ6 = (C5506nQ) arrayList4.get(c(i5 - 1, arrayList4.size()));
                        C5506nQ c5506nQ7 = (C5506nQ) arrayList4.get(i5);
                        c5506nQ6.b.set(fA, fA2);
                        c5506nQ6.c.set(fA, fA2);
                        if (i == 0) {
                            uj4.a(fA, fA2);
                        }
                        c5506nQ7.a.set(f9, f10);
                        C5506nQ c5506nQ8 = (C5506nQ) arrayList4.get(i5 + 1);
                        c5506nQ7.b.set(f11, f12);
                        c5506nQ7.c.set(fA3, fA4);
                        c5506nQ8.a.set(fA3, fA4);
                        i5 += 2;
                    } else {
                        i = i4;
                        C5506nQ c5506nQ9 = (C5506nQ) arrayList4.get(c(i5 - 1, arrayList4.size()));
                        C5506nQ c5506nQ10 = (C5506nQ) arrayList4.get(i5);
                        PointF pointF8 = c5506nQ4.b;
                        c5506nQ9.b.set(pointF8.x, pointF8.y);
                        PointF pointF9 = c5506nQ4.c;
                        c5506nQ9.c.set(pointF9.x, pointF9.y);
                        PointF pointF10 = c5506nQ3.a;
                        c5506nQ10.a.set(pointF10.x, pointF10.y);
                        i5++;
                    }
                    i4 = i + 1;
                    uj2 = uj1;
                    z3 = z3;
                    z2 = z4;
                    arrayList = arrayList;
                }
                return uj4;
            }
        }
        return uj2;
    }

    @Override // defpackage.DL
    public final void b(List<DL> list, List<DL> list2) {
    }
}
