package defpackage;

import android.graphics.Rect;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.c;
import io.sentry.android.core.b0;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: k11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4791k11 implements Comparable<C4791k11> {
    public int g;
    public float d = 1.0f;
    public int e = 0;
    public float h = 0.0f;
    public float i = 0.0f;
    public float j = 0.0f;
    public float k = 0.0f;
    public float l = 1.0f;
    public float m = 1.0f;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = 0.0f;
    public float q = 0.0f;
    public float r = 0.0f;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public final LinkedHashMap<String, a> u = new LinkedHashMap<>();

    public static boolean e(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    public final void b(HashMap<String, AbstractC6604se2> map, int i) {
        for (String str : map.keySet()) {
            AbstractC6604se2 abstractC6604se2 = map.get(str);
            str.getClass();
            switch (str) {
                case "rotationX":
                    abstractC6604se2.b(i, Float.isNaN(this.j) ? 0.0f : this.j);
                    break;
                case "rotationY":
                    abstractC6604se2.b(i, Float.isNaN(this.k) ? 0.0f : this.k);
                    break;
                case "translationX":
                    abstractC6604se2.b(i, Float.isNaN(this.p) ? 0.0f : this.p);
                    break;
                case "translationY":
                    abstractC6604se2.b(i, Float.isNaN(this.q) ? 0.0f : this.q);
                    break;
                case "translationZ":
                    abstractC6604se2.b(i, Float.isNaN(this.r) ? 0.0f : this.r);
                    break;
                case "progress":
                    abstractC6604se2.b(i, Float.isNaN(this.t) ? 0.0f : this.t);
                    break;
                case "scaleX":
                    abstractC6604se2.b(i, Float.isNaN(this.l) ? 1.0f : this.l);
                    break;
                case "scaleY":
                    abstractC6604se2.b(i, Float.isNaN(this.m) ? 1.0f : this.m);
                    break;
                case "transformPivotX":
                    abstractC6604se2.b(i, Float.isNaN(this.n) ? 0.0f : this.n);
                    break;
                case "transformPivotY":
                    abstractC6604se2.b(i, Float.isNaN(this.o) ? 0.0f : this.o);
                    break;
                case "rotation":
                    abstractC6604se2.b(i, Float.isNaN(this.i) ? 0.0f : this.i);
                    break;
                case "elevation":
                    abstractC6604se2.b(i, Float.isNaN(this.h) ? 0.0f : this.h);
                    break;
                case "transitionPathRotate":
                    abstractC6604se2.b(i, Float.isNaN(this.s) ? 0.0f : this.s);
                    break;
                case "alpha":
                    abstractC6604se2.b(i, Float.isNaN(this.d) ? 1.0f : this.d);
                    break;
                default:
                    if (!str.startsWith("CUSTOM")) {
                        b0.c("MotionPaths", "UNKNOWN spline ".concat(str));
                        break;
                    } else {
                        String str2 = str.split(",")[1];
                        LinkedHashMap<String, a> linkedHashMap = this.u;
                        if (linkedHashMap.containsKey(str2)) {
                            a aVar = linkedHashMap.get(str2);
                            if (abstractC6604se2 instanceof AbstractC6604se2.b) {
                                ((AbstractC6604se2.b) abstractC6604se2).f.append(i, aVar);
                            } else {
                                b0.c("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + aVar.a() + abstractC6604se2);
                            }
                        }
                        break;
                    }
                    break;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(C4791k11 c4791k11) {
        c4791k11.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public final void f(Rect rect, c cVar, int i, int i2) {
        rect.width();
        rect.height();
        c.a aVarH = cVar.h(i2);
        c.d dVar = aVarH.c;
        int i3 = dVar.c;
        this.e = i3;
        int i4 = dVar.b;
        this.g = i4;
        this.d = (i4 == 0 || i3 != 0) ? dVar.d : 0.0f;
        c.e eVar = aVarH.f;
        boolean z = eVar.m;
        this.h = eVar.n;
        this.i = eVar.b;
        this.j = eVar.c;
        this.k = eVar.d;
        this.l = eVar.e;
        this.m = eVar.f;
        this.n = eVar.g;
        this.o = eVar.h;
        this.p = eVar.j;
        this.q = eVar.k;
        this.r = eVar.l;
        c.C0228c c0228c = aVarH.d;
        C3079c50.c(c0228c.d);
        this.s = c0228c.h;
        this.t = aVarH.c.e;
        for (String str : aVarH.g.keySet()) {
            a aVar = aVarH.g.get(str);
            int iOrdinal = aVar.c.ordinal();
            if (iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.u.put(str, aVar);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.i + 90.0f;
            this.i = f;
            if (f > 180.0f) {
                this.i = f - 360.0f;
                return;
            }
            return;
        }
        this.i -= 90.0f;
    }
}
