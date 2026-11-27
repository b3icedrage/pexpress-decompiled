package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class M20 implements Zc2<L20> {
    public static final M20 d = new M20();
    public static final AbstractC7580xH0.a e = AbstractC7580xH0.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.Zc2
    public final L20 d(AbstractC7580xH0 abstractC7580xH0, float f) {
        boolean z;
        int i;
        L20.a aVar = L20.a.d;
        abstractC7580xH0.X0();
        String strB = null;
        L20.a aVar2 = aVar;
        float fD0 = 0.0f;
        float fD1 = 0.0f;
        float fD2 = 0.0f;
        float fD3 = 0.0f;
        int iE0 = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zF = true;
        String strB2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (abstractC7580xH0.hasNext()) {
            switch (abstractC7580xH0.l(e)) {
                case 0:
                    z = zF;
                    strB = abstractC7580xH0.B();
                    zF = z;
                    break;
                case 1:
                    z = zF;
                    strB2 = abstractC7580xH0.B();
                    zF = z;
                    break;
                case 2:
                    z = zF;
                    fD0 = (float) abstractC7580xH0.d0();
                    zF = z;
                    break;
                case 3:
                    z = zF;
                    i = iA2;
                    int iE1 = abstractC7580xH0.E0();
                    aVar2 = (iE1 > 2 || iE1 < 0) ? aVar : L20.a.values()[iE1];
                    iA2 = i;
                    zF = z;
                    break;
                case 4:
                    z = zF;
                    iE0 = abstractC7580xH0.E0();
                    zF = z;
                    break;
                case 5:
                    z = zF;
                    fD1 = (float) abstractC7580xH0.d0();
                    zF = z;
                    break;
                case 6:
                    z = zF;
                    fD2 = (float) abstractC7580xH0.d0();
                    zF = z;
                    break;
                case 7:
                    z = zF;
                    iA = VH0.a(abstractC7580xH0);
                    zF = z;
                    break;
                case 8:
                    iA2 = VH0.a(abstractC7580xH0);
                    break;
                case 9:
                    z = zF;
                    fD3 = (float) abstractC7580xH0.d0();
                    zF = z;
                    break;
                case 10:
                    zF = abstractC7580xH0.f();
                    iA2 = iA2;
                    break;
                case 11:
                    z = zF;
                    abstractC7580xH0.l1();
                    i = iA2;
                    pointF = new PointF(((float) abstractC7580xH0.d0()) * f, ((float) abstractC7580xH0.d0()) * f);
                    abstractC7580xH0.h1();
                    iA2 = i;
                    zF = z;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    abstractC7580xH0.l1();
                    z = zF;
                    pointF2 = new PointF(((float) abstractC7580xH0.d0()) * f, ((float) abstractC7580xH0.d0()) * f);
                    abstractC7580xH0.h1();
                    iA2 = iA2;
                    zF = z;
                    break;
                default:
                    abstractC7580xH0.p();
                    abstractC7580xH0.I();
                    break;
            }
        }
        abstractC7580xH0.B0();
        L20 l20 = new L20();
        l20.a = strB;
        l20.b = strB2;
        l20.c = fD0;
        l20.d = aVar2;
        l20.e = iE0;
        l20.f = fD1;
        l20.g = fD2;
        l20.h = iA;
        l20.i = iA2;
        l20.j = fD3;
        l20.k = zF;
        l20.l = pointF;
        l20.m = pointF2;
        return l20;
    }
}
