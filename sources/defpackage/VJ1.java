package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class VJ1 implements Zc2<UJ1> {
    public static final VJ1 d = new VJ1();
    public static final AbstractC7580xH0.a e = AbstractC7580xH0.a.a("c", "v", "i", R51.PUSH_MINIFIED_BUTTONS_LIST);

    @Override // defpackage.Zc2
    public final UJ1 d(AbstractC7580xH0 abstractC7580xH0, float f) {
        if (abstractC7580xH0.g() == AbstractC7580xH0.b.d) {
            abstractC7580xH0.l1();
        }
        abstractC7580xH0.X0();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zF = false;
        while (abstractC7580xH0.hasNext()) {
            int iL = abstractC7580xH0.l(e);
            if (iL == 0) {
                zF = abstractC7580xH0.f();
            } else if (iL == 1) {
                arrayListC = VH0.c(abstractC7580xH0, f);
            } else if (iL == 2) {
                arrayListC2 = VH0.c(abstractC7580xH0, f);
            } else if (iL != 3) {
                abstractC7580xH0.p();
                abstractC7580xH0.I();
            } else {
                arrayListC3 = VH0.c(abstractC7580xH0, f);
            }
        }
        abstractC7580xH0.B0();
        if (abstractC7580xH0.g() == AbstractC7580xH0.b.e) {
            abstractC7580xH0.h1();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new UJ1(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new C5506nQ(C7099v01.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), C7099v01.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zF) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new C5506nQ(C7099v01.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), C7099v01.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new UJ1(pointF, zF, arrayList);
    }
}
