package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class VH0 {
    public static final AbstractC7580xH0.a a = AbstractC7580xH0.a.a("x", "y");

    public static int a(AbstractC7580xH0 abstractC7580xH0) {
        abstractC7580xH0.l1();
        int iD0 = (int) (abstractC7580xH0.d0() * 255.0d);
        int iD1 = (int) (abstractC7580xH0.d0() * 255.0d);
        int iD2 = (int) (abstractC7580xH0.d0() * 255.0d);
        while (abstractC7580xH0.hasNext()) {
            abstractC7580xH0.I();
        }
        abstractC7580xH0.h1();
        return Color.argb(255, iD0, iD1, iD2);
    }

    public static PointF b(AbstractC7580xH0 abstractC7580xH0, float f) {
        int iOrdinal = abstractC7580xH0.g().ordinal();
        if (iOrdinal == 0) {
            abstractC7580xH0.l1();
            float fD0 = (float) abstractC7580xH0.d0();
            float fD1 = (float) abstractC7580xH0.d0();
            while (abstractC7580xH0.g() != AbstractC7580xH0.b.e) {
                abstractC7580xH0.I();
            }
            abstractC7580xH0.h1();
            return new PointF(fD0 * f, fD1 * f);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 6) {
                throw new IllegalArgumentException("Unknown point starts with " + abstractC7580xH0.g());
            }
            float fD2 = (float) abstractC7580xH0.d0();
            float fD3 = (float) abstractC7580xH0.d0();
            while (abstractC7580xH0.hasNext()) {
                abstractC7580xH0.I();
            }
            return new PointF(fD2 * f, fD3 * f);
        }
        abstractC7580xH0.X0();
        float fD = 0.0f;
        float fD4 = 0.0f;
        while (abstractC7580xH0.hasNext()) {
            int iL = abstractC7580xH0.l(a);
            if (iL == 0) {
                fD = d(abstractC7580xH0);
            } else if (iL != 1) {
                abstractC7580xH0.p();
                abstractC7580xH0.I();
            } else {
                fD4 = d(abstractC7580xH0);
            }
        }
        abstractC7580xH0.B0();
        return new PointF(fD * f, fD4 * f);
    }

    public static ArrayList c(AbstractC7580xH0 abstractC7580xH0, float f) {
        ArrayList arrayList = new ArrayList();
        abstractC7580xH0.l1();
        while (abstractC7580xH0.g() == AbstractC7580xH0.b.d) {
            abstractC7580xH0.l1();
            arrayList.add(b(abstractC7580xH0, f));
            abstractC7580xH0.h1();
        }
        abstractC7580xH0.h1();
        return arrayList;
    }

    public static float d(AbstractC7580xH0 abstractC7580xH0) {
        AbstractC7580xH0.b bVarG = abstractC7580xH0.g();
        int iOrdinal = bVarG.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 6) {
                return (float) abstractC7580xH0.d0();
            }
            throw new IllegalArgumentException("Unknown value for token of type " + bVarG);
        }
        abstractC7580xH0.l1();
        float fD0 = (float) abstractC7580xH0.d0();
        while (abstractC7580xH0.hasNext()) {
            abstractC7580xH0.I();
        }
        abstractC7580xH0.h1();
        return fD0;
    }
}
