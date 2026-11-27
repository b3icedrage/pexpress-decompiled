package com.google.android.material.carousel;

import defpackage.C1742Pc;
import defpackage.C7013uc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final a a;
    public final List<a> b;
    public final List<a> c;
    public final float[] d;
    public final float[] e;
    public final float f;
    public final float g;

    public b(a aVar, ArrayList arrayList, ArrayList arrayList2) {
        this.a = aVar;
        this.b = Collections.unmodifiableList(arrayList);
        this.c = Collections.unmodifiableList(arrayList2);
        float f = ((a) C1742Pc.c(1, arrayList)).b().a - aVar.b().a;
        this.f = f;
        float f2 = aVar.d().a - ((a) C1742Pc.c(1, arrayList2)).d().a;
        this.g = f2;
        this.d = a(f, arrayList, true);
        this.e = a(f2, arrayList2, false);
    }

    public static float[] a(float f, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            a aVar = (a) arrayList.get(i2);
            a aVar2 = (a) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? aVar2.b().a - aVar.b().a : aVar.d().a - aVar2.d().a) / f);
            i++;
        }
        return fArr;
    }

    public static a b(List<a> list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                float fB = C7013uc.b(0.0f, 1.0f, f2, f3, f);
                a aVar = list.get(i - 1);
                a aVar2 = list.get(i);
                if (aVar.a != aVar2.a) {
                    throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
                }
                List<a.b> list2 = aVar.b;
                int size2 = list2.size();
                List<a.b> list3 = aVar2.b;
                if (size2 != list3.size()) {
                    throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    a.b bVar = list2.get(i2);
                    a.b bVar2 = list3.get(i2);
                    arrayList.add(new a.b(C7013uc.a(bVar.a, bVar2.a, fB), C7013uc.a(bVar.b, bVar2.b, fB), C7013uc.a(bVar.c, bVar2.c, fB), C7013uc.a(bVar.d, bVar2.d, fB)));
                }
                return new a(aVar.a, arrayList, C7013uc.c(fB, aVar.c, aVar2.c), C7013uc.c(fB, aVar.d, aVar2.d));
            }
            i++;
            f2 = f3;
        }
        return list.get(0);
    }

    public static a c(a aVar, int i, int i2, float f, int i3, int i4) {
        ArrayList arrayList = new ArrayList(aVar.b);
        arrayList.add(i2, (a.b) arrayList.remove(i));
        a.C0308a c0308a = new a.C0308a(aVar.a);
        int i5 = 0;
        while (i5 < arrayList.size()) {
            a.b bVar = (a.b) arrayList.get(i5);
            float f2 = bVar.d;
            c0308a.a((f2 / 2.0f) + f, bVar.c, f2, i5 >= i3 && i5 <= i4);
            f += bVar.d;
            i5++;
        }
        return c0308a.b();
    }
}
