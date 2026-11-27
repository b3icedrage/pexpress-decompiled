package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
public final class YB1 {
    public static HashSet<String> h;
    public Canvas a;
    public float b;
    public XB1 c;
    public g d;
    public Stack<g> e;
    public Stack<XB1.I> f;
    public Stack<Matrix> g;

    public class a implements XB1.InterfaceC2386w {
        public final ArrayList a;
        public float b;
        public float c;
        public b d;
        public boolean e;
        public boolean f;
        public int g;
        public boolean h;

        public a(YB1 yb1, XB1.C2385v c2385v) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.d = null;
            this.e = false;
            this.f = true;
            this.g = -1;
            if (c2385v == null) {
                return;
            }
            c2385v.h(this);
            if (this.h) {
                this.d.b((b) arrayList.get(this.g));
                arrayList.set(this.g, this.d);
                this.h = false;
            }
            b bVar = this.d;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void a(float f, float f2, float f3, float f4) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.d = new b(f3, f4, f3 - f, f4 - f2);
            this.h = false;
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void b(float f, float f2) {
            boolean z = this.h;
            ArrayList arrayList = this.a;
            if (z) {
                this.d.b((b) arrayList.get(this.g));
                arrayList.set(this.g, this.d);
                this.h = false;
            }
            b bVar = this.d;
            if (bVar != null) {
                arrayList.add(bVar);
            }
            this.b = f;
            this.c = f2;
            this.d = new b(f, f2, 0.0f, 0.0f);
            this.g = arrayList.size();
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.f || this.e) {
                this.d.a(f, f2);
                this.a.add(this.d);
                this.e = false;
            }
            this.d = new b(f5, f6, f5 - f3, f6 - f4);
            this.h = false;
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void close() {
            this.a.add(this.d);
            e(this.b, this.c);
            this.h = true;
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.e = true;
            this.f = false;
            b bVar = this.d;
            YB1.a(bVar.a, bVar.b, f, f2, f3, z, z2, f4, f5, this);
            this.f = true;
            this.h = false;
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void e(float f, float f2) {
            this.d.a(f, f2);
            this.a.add(this.d);
            b bVar = this.d;
            this.d = new b(f, f2, f - bVar.a, f2 - bVar.b);
            this.h = false;
        }
    }

    public class b {
        public final float a;
        public final float b;
        public float c;
        public float d;
        public boolean e = false;

        public b(float f, float f2, float f3, float f4) {
            this.c = 0.0f;
            this.d = 0.0f;
            this.a = f;
            this.b = f2;
            double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
            if (dSqrt != 0.0d) {
                this.c = (float) (((double) f3) / dSqrt);
                this.d = (float) (((double) f4) / dSqrt);
            }
        }

        public final void a(float f, float f2) {
            float f3 = f - this.a;
            float f4 = f2 - this.b;
            double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
            if (dSqrt != 0.0d) {
                f3 = (float) (((double) f3) / dSqrt);
                f4 = (float) (((double) f4) / dSqrt);
            }
            float f5 = this.c;
            if (f3 != (-f5) || f4 != (-this.d)) {
                this.c = f5 + f3;
                this.d += f4;
            } else {
                this.e = true;
                this.c = -f4;
                this.d = f3;
            }
        }

        public final void b(b bVar) {
            float f = bVar.c;
            float f2 = this.c;
            if (f == (-f2)) {
                float f3 = bVar.d;
                if (f3 == (-this.d)) {
                    this.e = true;
                    this.c = -f3;
                    this.d = bVar.c;
                    return;
                }
            }
            this.c = f2 + f;
            this.d += bVar.d;
        }

        public final String toString() {
            return "(" + this.a + "," + this.b + " " + this.c + "," + this.d + ")";
        }
    }

    public class c implements XB1.InterfaceC2386w {
        public final Path a = new Path();
        public float b;
        public float c;

        public c(XB1.C2385v c2385v) {
            if (c2385v == null) {
                return;
            }
            c2385v.h(this);
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void a(float f, float f2, float f3, float f4) {
            this.a.quadTo(f, f2, f3, f4);
            this.b = f3;
            this.c = f4;
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void b(float f, float f2) {
            this.a.moveTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
            this.a.cubicTo(f, f2, f3, f4, f5, f6);
            this.b = f5;
            this.c = f6;
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void close() {
            this.a.close();
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            YB1.a(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
            this.b = f4;
            this.c = f5;
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void e(float f, float f2) {
            this.a.lineTo(f, f2);
            this.b = f;
            this.c = f2;
        }
    }

    public class d extends e {
        public final Path d;

        public d(Path path, float f) {
            super(f, 0.0f);
            this.d = path;
        }

        @Override // YB1.e, YB1.i
        public final void b(String str) {
            YB1 yb1 = YB1.this;
            if (yb1.V()) {
                g gVar = yb1.d;
                if (gVar.b) {
                    yb1.a.drawTextOnPath(str, this.d, this.a, this.b, gVar.d);
                }
                g gVar2 = yb1.d;
                if (gVar2.c) {
                    yb1.a.drawTextOnPath(str, this.d, this.a, this.b, gVar2.e);
                }
            }
            this.a = yb1.d.d.measureText(str) + this.a;
        }
    }

    public class e extends i {
        public float a;
        public float b;

        public e(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @Override // YB1.i
        public void b(String str) {
            YB1 yb1 = YB1.this;
            if (yb1.V()) {
                g gVar = yb1.d;
                if (gVar.b) {
                    yb1.a.drawText(str, this.a, this.b, gVar.d);
                }
                g gVar2 = yb1.d;
                if (gVar2.c) {
                    yb1.a.drawText(str, this.a, this.b, gVar2.e);
                }
            }
            this.a = yb1.d.d.measureText(str) + this.a;
        }
    }

    public class f extends i {
        public float a;
        public final float b;
        public final Path c;

        public f(float f, float f2, Path path) {
            this.a = f;
            this.b = f2;
            this.c = path;
        }

        @Override // YB1.i
        public final boolean a(XB1.X x) {
            if (!(x instanceof XB1.Y)) {
                return true;
            }
            b0.e("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
            return false;
        }

        @Override // YB1.i
        public final void b(String str) {
            String str2;
            YB1 yb1 = YB1.this;
            if (yb1.V()) {
                Path path = new Path();
                str2 = str;
                yb1.d.d.getTextPath(str2, 0, str.length(), this.a, this.b, path);
                this.c.addPath(path);
            } else {
                str2 = str;
            }
            this.a = yb1.d.d.measureText(str2) + this.a;
        }
    }

    public class h extends i {
        public float a;
        public final float b;
        public final RectF c = new RectF();

        public h(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @Override // YB1.i
        public final boolean a(XB1.X x) {
            if (!(x instanceof XB1.Y)) {
                return true;
            }
            XB1.Y y = (XB1.Y) x;
            XB1.K kD = x.a.d(y.n);
            if (kD == null) {
                YB1.o("TextPath path reference '%s' not found", y.n);
                return false;
            }
            XB1.C2384u c2384u = (XB1.C2384u) kD;
            Path path = new c(c2384u.o).a;
            Matrix matrix = c2384u.n;
            if (matrix != null) {
                path.transform(matrix);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.c.union(rectF);
            return false;
        }

        @Override // YB1.i
        public final void b(String str) {
            YB1 yb1 = YB1.this;
            if (yb1.V()) {
                Rect rect = new Rect();
                yb1.d.d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.a, this.b);
                this.c.union(rectF);
            }
            this.a = yb1.d.d.measureText(str) + this.a;
        }
    }

    public abstract class i {
        public boolean a(XB1.X x) {
            return true;
        }

        public abstract void b(String str);
    }

    public class j extends i {
        public float a = 0.0f;

        public j() {
        }

        @Override // YB1.i
        public final void b(String str) {
            this.a = YB1.this.d.d.measureText(str) + this.a;
        }
    }

    public static Path A(XB1.C2388y c2388y) {
        Path path = new Path();
        float[] fArr = c2388y.o;
        path.moveTo(fArr[0], fArr[1]);
        int i2 = 2;
        while (true) {
            float[] fArr2 = c2388y.o;
            if (i2 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i2], fArr2[i2 + 1]);
            i2 += 2;
        }
        if (c2388y instanceof XB1.C2389z) {
            path.close();
        }
        if (c2388y.h == null) {
            c2388y.h = c(path);
        }
        return path;
    }

    public static void N(g gVar, boolean z, XB1.N n) {
        int i2;
        XB1.D d2 = gVar.a;
        float fFloatValue = (z ? d2.h : d2.j).floatValue();
        if (n instanceof XB1.C2368e) {
            i2 = ((XB1.C2368e) n).d;
        } else if (!(n instanceof XB1.C2369f)) {
            return;
        } else {
            i2 = gVar.a.r.d;
        }
        int i3 = i(i2, fFloatValue);
        if (z) {
            gVar.d.setColor(i3);
        } else {
            gVar.e.setColor(i3);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v20 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v11 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v11 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v19 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v20 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r17v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: android.graphics.Matrix
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r27v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r28v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r34v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r34v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r35v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r35v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r36v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v0 ??, new type: XB1$w
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v13 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v25 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v27 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v28 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v11 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v12 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v13 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v15 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v16 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r27v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r28v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r34v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r34v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r35v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r35v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r36v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v0 ??, new type: XB1$w
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v2 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static void a(float r27, float r28, float r29, float r30, float r31, boolean r32, boolean r33, float r34, float r35, defpackage.XB1.InterfaceC2386w r36) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.YB1.a(float, float, float, float, float, boolean, boolean, float, float, XB1$w):void");
    }

    public static XB1.C2364a c(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new XB1.C2364a(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r6 != 9) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix e(defpackage.XB1.C2364a r9, defpackage.XB1.C2364a r10, defpackage.C3835fh1 r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L8c
            fh1$a r1 = r11.a
            if (r1 != 0) goto Ld
            goto L8c
        Ld:
            float r2 = r9.c
            float r3 = r10.c
            float r2 = r2 / r3
            float r3 = r9.d
            float r4 = r10.d
            float r3 = r3 / r4
            float r4 = r10.a
            float r4 = -r4
            float r5 = r10.b
            float r5 = -r5
            fh1 r6 = defpackage.C3835fh1.c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.a
            float r9 = r9.b
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            fh1$b r6 = defpackage.C3835fh1.b.e
            fh1$b r11 = r11.b
            if (r11 != r6) goto L3e
            float r11 = java.lang.Math.max(r2, r3)
            goto L42
        L3e:
            float r11 = java.lang.Math.min(r2, r3)
        L42:
            float r2 = r9.c
            float r2 = r2 / r11
            float r3 = r9.d
            float r3 = r3 / r11
            int r6 = r1.ordinal()
            r7 = 2
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 == r7) goto L68
            r7 = 3
            if (r6 == r7) goto L63
            r7 = 5
            if (r6 == r7) goto L68
            r7 = 6
            if (r6 == r7) goto L63
            r7 = 8
            if (r6 == r7) goto L68
            r7 = 9
            if (r6 == r7) goto L63
            goto L6d
        L63:
            float r6 = r10.c
            float r6 = r6 - r2
        L66:
            float r4 = r4 - r6
            goto L6d
        L68:
            float r6 = r10.c
            float r6 = r6 - r2
            float r6 = r6 / r8
            goto L66
        L6d:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L7a;
                case 7: goto L75;
                case 8: goto L75;
                case 9: goto L75;
                default: goto L74;
            }
        L74:
            goto L7f
        L75:
            float r10 = r10.d
            float r10 = r10 - r3
        L78:
            float r5 = r5 - r10
            goto L7f
        L7a:
            float r10 = r10.d
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L78
        L7f:
            float r10 = r9.a
            float r9 = r9.b
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.YB1.e(XB1$a, XB1$a, fh1):android.graphics.Matrix");
    }

    public static Typeface h(String str, Integer num, XB1.D.b bVar) {
        int i2;
        boolean z = bVar == XB1.D.b.e;
        if (num.intValue() > 500) {
            i2 = z ? 3 : 1;
        } else {
            i2 = z ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i2);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "serif":
                return Typeface.create(Typeface.SERIF, i2);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            default:
                return null;
        }
    }

    public static int i(int i2, float f2) {
        int i3 = 255;
        int iRound = Math.round(((i2 >> 24) & 255) * f2);
        if (iRound < 0) {
            i3 = 0;
        } else if (iRound <= 255) {
            i3 = iRound;
        }
        return (i2 & 16777215) | (i3 << 24);
    }

    public static void o(String str, Object... objArr) {
        b0.c("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void q(XB1.AbstractC2372i abstractC2372i, String str) {
        XB1.K kD = abstractC2372i.a.d(str);
        if (kD == null) {
            b0.e("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(kD instanceof XB1.AbstractC2372i)) {
            o("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (kD == abstractC2372i) {
            o("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        XB1.AbstractC2372i abstractC2372i2 = (XB1.AbstractC2372i) kD;
        if (abstractC2372i.i == null) {
            abstractC2372i.i = abstractC2372i2.i;
        }
        if (abstractC2372i.j == null) {
            abstractC2372i.j = abstractC2372i2.j;
        }
        if (abstractC2372i.k == null) {
            abstractC2372i.k = abstractC2372i2.k;
        }
        if (abstractC2372i.h.isEmpty()) {
            abstractC2372i.h = abstractC2372i2.h;
        }
        try {
            if (abstractC2372i instanceof XB1.L) {
                XB1.L l = (XB1.L) abstractC2372i;
                XB1.L l2 = (XB1.L) kD;
                if (l.m == null) {
                    l.m = l2.m;
                }
                if (l.n == null) {
                    l.n = l2.n;
                }
                if (l.o == null) {
                    l.o = l2.o;
                }
                if (l.p == null) {
                    l.p = l2.p;
                }
            } else {
                r((XB1.P) abstractC2372i, (XB1.P) kD);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC2372i2.l;
        if (str2 != null) {
            q(abstractC2372i, str2);
        }
    }

    public static void r(XB1.P p, XB1.P p2) {
        if (p.m == null) {
            p.m = p2.m;
        }
        if (p.n == null) {
            p.n = p2.n;
        }
        if (p.o == null) {
            p.o = p2.o;
        }
        if (p.p == null) {
            p.p = p2.p;
        }
        if (p.q == null) {
            p.q = p2.q;
        }
    }

    public static void s(XB1.C2387x c2387x, String str) {
        XB1.K kD = c2387x.a.d(str);
        if (kD == null) {
            b0.e("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(kD instanceof XB1.C2387x)) {
            o("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (kD == c2387x) {
            o("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        XB1.C2387x c2387x2 = (XB1.C2387x) kD;
        if (c2387x.p == null) {
            c2387x.p = c2387x2.p;
        }
        if (c2387x.q == null) {
            c2387x.q = c2387x2.q;
        }
        if (c2387x.r == null) {
            c2387x.r = c2387x2.r;
        }
        if (c2387x.s == null) {
            c2387x.s = c2387x2.s;
        }
        if (c2387x.t == null) {
            c2387x.t = c2387x2.t;
        }
        if (c2387x.u == null) {
            c2387x.u = c2387x2.u;
        }
        if (c2387x.v == null) {
            c2387x.v = c2387x2.v;
        }
        if (c2387x.i.isEmpty()) {
            c2387x.i = c2387x2.i;
        }
        if (c2387x.o == null) {
            c2387x.o = c2387x2.o;
        }
        if (c2387x.n == null) {
            c2387x.n = c2387x2.n;
        }
        String str2 = c2387x2.w;
        if (str2 != null) {
            s(c2387x, str2);
        }
    }

    public static boolean x(XB1.D d2, long j2) {
        return (d2.d & j2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    public final Path B(XB1.A a2) {
        float fE;
        float fG;
        float fMin;
        XB1.C2378o c2378o;
        float fE2;
        XB1.C2378o c2378o2;
        float fG2;
        float fE3;
        float fG3;
        float f2;
        float f3;
        Path path;
        XB1.C2378o c2378o3 = a2.s;
        if (c2378o3 == null && a2.t == null) {
            fE = 0.0f;
        } else {
            if (c2378o3 != null) {
                if (a2.t == null) {
                    fE = c2378o3.e(this);
                } else {
                    fE = c2378o3.e(this);
                    fG = a2.t.g(this);
                }
                fMin = Math.min(fE, a2.q.e(this) / 2.0f);
                float fMin2 = Math.min(fG, a2.r.g(this) / 2.0f);
                c2378o = a2.o;
                if (c2378o != null) {
                    fE2 = c2378o.e(this);
                } else {
                    fE2 = 0.0f;
                }
                c2378o2 = a2.p;
                if (c2378o2 != null) {
                    fG2 = c2378o2.g(this);
                } else {
                    fG2 = 0.0f;
                }
                fE3 = a2.q.e(this);
                fG3 = a2.r.g(this);
                if (a2.h == null) {
                    a2.h = new XB1.C2364a(fE2, fG2, fE3, fG3);
                }
                f2 = fE3 + fE2;
                f3 = fG2 + fG3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(fE2, fG2);
                    path.lineTo(f2, fG2);
                    path.lineTo(f2, f3);
                    path.lineTo(fE2, f3);
                    path.lineTo(fE2, fG2);
                } else {
                    float f4 = fMin * 0.5522848f;
                    float f5 = 0.5522848f * fMin2;
                    float f6 = fG2 + fMin2;
                    path.moveTo(fE2, f6);
                    float f7 = f6 - f5;
                    float f8 = fE2 + fMin;
                    float f9 = f8 - f4;
                    path.cubicTo(fE2, f7, f9, fG2, f8, fG2);
                    float f10 = f2 - fMin;
                    path.lineTo(f10, fG2);
                    float f11 = f10 + f4;
                    path.cubicTo(f11, fG2, f2, f7, f2, f6);
                    float f12 = f3 - fMin2;
                    path.lineTo(f2, f12);
                    float f13 = f12 + f5;
                    path.cubicTo(f2, f13, f11, f3, f10, f3);
                    path.lineTo(f8, f3);
                    float f14 = fE2;
                    path.cubicTo(f9, f3, f14, f13, fE2, f12);
                    path.lineTo(f14, f6);
                }
                path.close();
                return path;
            }
            fE = a2.t.g(this);
        }
        fG = fE;
        fMin = Math.min(fE, a2.q.e(this) / 2.0f);
        float fMin3 = Math.min(fG, a2.r.g(this) / 2.0f);
        c2378o = a2.o;
        if (c2378o != null) {
            fE2 = c2378o.e(this);
        } else {
            fE2 = 0.0f;
        }
        c2378o2 = a2.p;
        if (c2378o2 != null) {
            fG2 = c2378o2.g(this);
        } else {
            fG2 = 0.0f;
        }
        fE3 = a2.q.e(this);
        fG3 = a2.r.g(this);
        if (a2.h == null) {
            a2.h = new XB1.C2364a(fE2, fG2, fE3, fG3);
        }
        f2 = fE3 + fE2;
        f3 = fG2 + fG3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(fE2, fG2);
            path.lineTo(f2, fG2);
            path.lineTo(f2, f3);
            path.lineTo(fE2, f3);
            path.lineTo(fE2, fG2);
        } else {
            path.moveTo(fE2, fG2);
            path.lineTo(f2, fG2);
            path.lineTo(f2, f3);
            path.lineTo(fE2, f3);
            path.lineTo(fE2, fG2);
        }
        path.close();
        return path;
    }

    public final XB1.C2364a C(XB1.C2378o c2378o, XB1.C2378o c2378o2, XB1.C2378o c2378o3, XB1.C2378o c2378o4) {
        float fE = c2378o != null ? c2378o.e(this) : 0.0f;
        float fG = c2378o2 != null ? c2378o2.g(this) : 0.0f;
        g gVar = this.d;
        XB1.C2364a c2364a = gVar.g;
        if (c2364a == null) {
            c2364a = gVar.f;
        }
        return new XB1.C2364a(fE, fG, c2378o3 != null ? c2378o3.e(this) : c2364a.c, c2378o4 != null ? c2378o4.g(this) : c2364a.d);
    }

    @TargetApi(19)
    public final Path D(XB1.J j2, boolean z) {
        Path pathA;
        Path pathB;
        this.e.push(this.d);
        g gVar = new g(this.d);
        this.d = gVar;
        T(j2, gVar);
        if (!k() || !V()) {
            this.d = this.e.pop();
            return null;
        }
        if (j2 instanceof XB1.d0) {
            if (!z) {
                o("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            XB1.d0 d0Var = (XB1.d0) j2;
            XB1.K kD = j2.a.d(d0Var.o);
            if (kD == null) {
                o("Use reference '%s' not found", d0Var.o);
                this.d = this.e.pop();
                return null;
            }
            if (!(kD instanceof XB1.J)) {
                this.d = this.e.pop();
                return null;
            }
            pathA = D((XB1.J) kD, false);
            if (pathA != null) {
                if (d0Var.h == null) {
                    d0Var.h = c(pathA);
                }
                Matrix matrix = d0Var.n;
                if (matrix != null) {
                    pathA.transform(matrix);
                }
                if (this.d.a.I != null && (pathB = b(j2, j2.h)) != null) {
                    pathA.op(pathB, Path.Op.INTERSECT);
                }
                this.d = this.e.pop();
                return pathA;
            }
            return null;
        }
        if (j2 instanceof XB1.AbstractC2374k) {
            XB1.AbstractC2374k abstractC2374k = (XB1.AbstractC2374k) j2;
            if (j2 instanceof XB1.C2384u) {
                pathA = new c(((XB1.C2384u) j2).o).a;
                if (j2.h == null) {
                    j2.h = c(pathA);
                }
            } else if (j2 instanceof XB1.A) {
                pathA = B((XB1.A) j2);
            } else if (j2 instanceof XB1.C2366c) {
                pathA = y((XB1.C2366c) j2);
            } else if (j2 instanceof XB1.C2371h) {
                pathA = z((XB1.C2371h) j2);
            } else {
                pathA = j2 instanceof XB1.C2388y ? A((XB1.C2388y) j2) : null;
            }
            if (pathA != null) {
                if (abstractC2374k.h == null) {
                    abstractC2374k.h = c(pathA);
                }
                Matrix matrix2 = abstractC2374k.n;
                if (matrix2 != null) {
                    pathA.transform(matrix2);
                }
                pathA.setFillType(w());
            }
            return null;
        }
        if (!(j2 instanceof XB1.V)) {
            o("Invalid %s element found in clipPath definition", j2.getClass().getSimpleName());
            return null;
        }
        XB1.V v = (XB1.V) j2;
        ArrayList arrayList = v.n;
        float fG = 0.0f;
        float fE = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((XB1.C2378o) v.n.get(0)).e(this);
        ArrayList arrayList2 = v.o;
        float fG2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((XB1.C2378o) v.o.get(0)).g(this);
        ArrayList arrayList3 = v.p;
        float fE2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((XB1.C2378o) v.p.get(0)).e(this);
        ArrayList arrayList4 = v.q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            fG = ((XB1.C2378o) v.q.get(0)).g(this);
        }
        if (this.d.a.y != XB1.D.f.d) {
            float fD = d(v);
            if (this.d.a.y == XB1.D.f.e) {
                fD /= 2.0f;
            }
            fE -= fD;
        }
        if (v.h == null) {
            h hVar = new h(fE, fG2);
            n(v, hVar);
            RectF rectF = hVar.c;
            v.h = new XB1.C2364a(rectF.left, rectF.top, rectF.width(), hVar.c.height());
        }
        Path path = new Path();
        n(v, new f(fE + fE2, fG2 + fG, path));
        Matrix matrix3 = v.r;
        if (matrix3 != null) {
            path.transform(matrix3);
        }
        path.setFillType(w());
        pathA = path;
        if (this.d.a.I != null) {
            pathA.op(pathB, Path.Op.INTERSECT);
        }
        this.d = this.e.pop();
        return pathA;
    }

    public final void E(XB1.J j2) {
        if (this.d.a.K != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.a;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            XB1.C2381r c2381r = (XB1.C2381r) this.c.d(this.d.a.K);
            L(c2381r, j2);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            L(c2381r, j2);
            canvas.restore();
            canvas.restore();
        }
        O();
    }

    public final boolean F() {
        XB1.K kD;
        int i2 = 0;
        if (this.d.a.q.floatValue() >= 1.0f && this.d.a.K == null) {
            return false;
        }
        int iFloatValue = (int) (this.d.a.q.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i2 = 255;
            if (iFloatValue <= 255) {
                i2 = iFloatValue;
            }
        }
        this.a.saveLayerAlpha(null, i2, 31);
        this.e.push(this.d);
        g gVar = new g(this.d);
        this.d = gVar;
        String str = gVar.a.K;
        if (str != null && ((kD = this.c.d(str)) == null || !(kD instanceof XB1.C2381r))) {
            o("Mask reference '%s' not found", this.d.a.K);
            this.d.a.K = null;
        }
        return true;
    }

    public final void G(XB1.E e2, XB1.C2364a c2364a, XB1.C2364a c2364a2, C3835fh1 c3835fh1) {
        if (c2364a.c == 0.0f || c2364a.d == 0.0f) {
            return;
        }
        if (c3835fh1 == null && (c3835fh1 = e2.n) == null) {
            c3835fh1 = C3835fh1.d;
        }
        T(e2, this.d);
        if (k()) {
            g gVar = this.d;
            gVar.f = c2364a;
            if (!gVar.a.z.booleanValue()) {
                XB1.C2364a c2364a3 = this.d.f;
                M(c2364a3.a, c2364a3.b, c2364a3.c, c2364a3.d);
            }
            f(e2, this.d.f);
            Canvas canvas = this.a;
            if (c2364a2 != null) {
                canvas.concat(e(this.d.f, c2364a2, c3835fh1));
                this.d.g = e2.o;
            } else {
                XB1.C2364a c2364a4 = this.d.f;
                canvas.translate(c2364a4.a, c2364a4.b);
            }
            boolean zF = F();
            U();
            I(e2, true);
            if (zF) {
                E(e2);
            }
            R(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(XB1.M m) {
        XB1.C2378o c2378o;
        String str;
        int iIndexOf;
        Set<String> setA;
        XB1.C2378o c2378o2;
        Boolean bool;
        if (m instanceof XB1.InterfaceC2382s) {
            return;
        }
        P();
        if ((m instanceof XB1.K) && (bool = ((XB1.K) m).d) != null) {
            this.d.h = bool.booleanValue();
        }
        if (m instanceof XB1.E) {
            XB1.E e2 = (XB1.E) m;
            G(e2, C(e2.p, e2.q, e2.r, e2.s), e2.o, e2.n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            float fG = 0.0f;
            if (m instanceof XB1.d0) {
                XB1.d0 d0Var = (XB1.d0) m;
                XB1.C2378o c2378o3 = d0Var.r;
                if ((c2378o3 == null || !c2378o3.i()) && ((c2378o2 = d0Var.s) == null || !c2378o2.i())) {
                    T(d0Var, this.d);
                    if (k()) {
                        XB1.M mD = d0Var.a.d(d0Var.o);
                        if (mD == null) {
                            o("Use reference '%s' not found", d0Var.o);
                        } else {
                            Matrix matrix = d0Var.n;
                            Canvas canvas = this.a;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            XB1.C2378o c2378o4 = d0Var.p;
                            float fE = c2378o4 != null ? c2378o4.e(this) : 0.0f;
                            XB1.C2378o c2378o5 = d0Var.q;
                            canvas.translate(fE, c2378o5 != null ? c2378o5.g(this) : 0.0f);
                            f(d0Var, d0Var.h);
                            boolean zF = F();
                            this.f.push(d0Var);
                            this.g.push(this.a.getMatrix());
                            if (mD instanceof XB1.E) {
                                XB1.E e3 = (XB1.E) mD;
                                XB1.C2364a c2364aC = C(null, null, d0Var.r, d0Var.s);
                                P();
                                G(e3, c2364aC, e3.o, e3.n);
                                O();
                            } else if (mD instanceof XB1.S) {
                                XB1.C2378o c2378o6 = d0Var.r;
                                XB1.c0 c0Var = XB1.c0.g;
                                if (c2378o6 == null) {
                                    c2378o6 = new XB1.C2378o(100.0f, c0Var);
                                }
                                XB1.C2378o c2378o7 = d0Var.s;
                                if (c2378o7 == null) {
                                    c2378o7 = new XB1.C2378o(100.0f, c0Var);
                                }
                                XB1.C2364a c2364aC2 = C(null, null, c2378o6, c2378o7);
                                P();
                                XB1.S s = (XB1.S) mD;
                                if (c2364aC2.c != 0.0f && c2364aC2.d != 0.0f) {
                                    C3835fh1 c3835fh1 = s.n;
                                    if (c3835fh1 == null) {
                                        c3835fh1 = C3835fh1.d;
                                    }
                                    T(s, this.d);
                                    g gVar = this.d;
                                    gVar.f = c2364aC2;
                                    if (!gVar.a.z.booleanValue()) {
                                        XB1.C2364a c2364a = this.d.f;
                                        M(c2364a.a, c2364a.b, c2364a.c, c2364a.d);
                                    }
                                    XB1.C2364a c2364a2 = s.o;
                                    if (c2364a2 != null) {
                                        canvas.concat(e(this.d.f, c2364a2, c3835fh1));
                                        this.d.g = s.o;
                                    } else {
                                        XB1.C2364a c2364a3 = this.d.f;
                                        canvas.translate(c2364a3.a, c2364a3.b);
                                    }
                                    boolean zF2 = F();
                                    I(s, true);
                                    if (zF2) {
                                        E(s);
                                    }
                                    R(s);
                                }
                                O();
                            } else {
                                H(mD);
                            }
                            this.f.pop();
                            this.g.pop();
                            if (zF) {
                                E(d0Var);
                            }
                            R(d0Var);
                        }
                    }
                }
            } else if (m instanceof XB1.R) {
                XB1.R r = (XB1.R) m;
                T(r, this.d);
                if (k()) {
                    Matrix matrix2 = r.n;
                    if (matrix2 != null) {
                        this.a.concat(matrix2);
                    }
                    f(r, r.h);
                    boolean zF3 = F();
                    String language = Locale.getDefault().getLanguage();
                    for (XB1.M m2 : r.i) {
                        if (m2 instanceof XB1.F) {
                            XB1.F f2 = (XB1.F) m2;
                            if (f2.b() == null && ((setA = f2.a()) == null || (!setA.isEmpty() && setA.contains(language)))) {
                                Set<String> requiredFeatures = f2.getRequiredFeatures();
                                if (requiredFeatures != null) {
                                    if (h == null) {
                                        synchronized (YB1.class) {
                                            HashSet<String> hashSet = new HashSet<>();
                                            h = hashSet;
                                            hashSet.add("Structure");
                                            h.add("BasicStructure");
                                            h.add("ConditionalProcessing");
                                            h.add("Image");
                                            h.add("Style");
                                            h.add("ViewportAttribute");
                                            h.add("Shape");
                                            h.add("BasicText");
                                            h.add("PaintAttribute");
                                            h.add("BasicPaintAttribute");
                                            h.add("OpacityAttribute");
                                            h.add("BasicGraphicsAttribute");
                                            h.add("Marker");
                                            h.add("Gradient");
                                            h.add("Pattern");
                                            h.add("Clip");
                                            h.add("BasicClip");
                                            h.add("Mask");
                                            h.add("View");
                                        }
                                    }
                                    if (requiredFeatures.isEmpty() || !h.containsAll(requiredFeatures)) {
                                    }
                                }
                                Set<String> setL = f2.l();
                                if (setL == null) {
                                    Set<String> setM = f2.m();
                                    if (setM == null) {
                                        H(m2);
                                        break;
                                    }
                                    setM.isEmpty();
                                } else {
                                    setL.isEmpty();
                                }
                            }
                        }
                    }
                    if (zF3) {
                        E(r);
                    }
                    R(r);
                }
            } else if (m instanceof XB1.C2375l) {
                XB1.C2375l c2375l = (XB1.C2375l) m;
                T(c2375l, this.d);
                if (k()) {
                    Matrix matrix3 = c2375l.n;
                    if (matrix3 != null) {
                        this.a.concat(matrix3);
                    }
                    f(c2375l, c2375l.h);
                    boolean zF4 = F();
                    I(c2375l, true);
                    if (zF4) {
                        E(c2375l);
                    }
                    R(c2375l);
                }
            } else if (m instanceof XB1.C2377n) {
                XB1.C2377n c2377n = (XB1.C2377n) m;
                XB1.C2378o c2378o8 = c2377n.r;
                if (c2378o8 != null && !c2378o8.i() && (c2378o = c2377n.s) != null && !c2378o.i() && (str = c2377n.o) != null) {
                    C3835fh1 c3835fh2 = c2377n.n;
                    if (c3835fh2 == null) {
                        c3835fh2 = C3835fh1.d;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) != -1 && iIndexOf >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                    }
                    if (bitmapDecodeByteArray != null) {
                        XB1.C2364a c2364a4 = new XB1.C2364a(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        T(c2377n, this.d);
                        if (k() && V()) {
                            Matrix matrix4 = c2377n.t;
                            Canvas canvas2 = this.a;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            XB1.C2378o c2378o9 = c2377n.p;
                            float fE2 = c2378o9 != null ? c2378o9.e(this) : 0.0f;
                            XB1.C2378o c2378o10 = c2377n.q;
                            float fG2 = c2378o10 != null ? c2378o10.g(this) : 0.0f;
                            float fE3 = c2377n.r.e(this);
                            float fE4 = c2377n.s.e(this);
                            g gVar2 = this.d;
                            gVar2.f = new XB1.C2364a(fE2, fG2, fE3, fE4);
                            if (!gVar2.a.z.booleanValue()) {
                                XB1.C2364a c2364a5 = this.d.f;
                                M(c2364a5.a, c2364a5.b, c2364a5.c, c2364a5.d);
                            }
                            c2377n.h = this.d.f;
                            R(c2377n);
                            f(c2377n, c2377n.h);
                            boolean zF5 = F();
                            U();
                            canvas2.save();
                            canvas2.concat(e(this.d.f, c2364a4, c3835fh2));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(this.d.a.Q != XB1.D.e.g ? 2 : 0));
                            canvas2.restore();
                            if (zF5) {
                                E(c2377n);
                            }
                        }
                    }
                }
            } else if (m instanceof XB1.C2384u) {
                XB1.C2384u c2384u = (XB1.C2384u) m;
                if (c2384u.o != null) {
                    T(c2384u, this.d);
                    if (k() && V()) {
                        g gVar3 = this.d;
                        if (gVar3.c || gVar3.b) {
                            Matrix matrix5 = c2384u.n;
                            if (matrix5 != null) {
                                this.a.concat(matrix5);
                            }
                            Path path = new c(c2384u.o).a;
                            if (c2384u.h == null) {
                                c2384u.h = c(path);
                            }
                            R(c2384u);
                            g(c2384u);
                            f(c2384u, c2384u.h);
                            boolean zF6 = F();
                            g gVar4 = this.d;
                            if (gVar4.b) {
                                XB1.D.a aVar = gVar4.a.g;
                                path.setFillType((aVar == null || aVar != XB1.D.a.e) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                l(c2384u, path);
                            }
                            if (this.d.c) {
                                m(path);
                            }
                            K(c2384u);
                            if (zF6) {
                                E(c2384u);
                            }
                        }
                    }
                }
            } else if (m instanceof XB1.A) {
                XB1.A a2 = (XB1.A) m;
                XB1.C2378o c2378o11 = a2.q;
                if (c2378o11 != null && a2.r != null && !c2378o11.i() && !a2.r.i()) {
                    T(a2, this.d);
                    if (k() && V()) {
                        Matrix matrix6 = a2.n;
                        if (matrix6 != null) {
                            this.a.concat(matrix6);
                        }
                        Path pathB = B(a2);
                        R(a2);
                        g(a2);
                        f(a2, a2.h);
                        boolean zF7 = F();
                        if (this.d.b) {
                            l(a2, pathB);
                        }
                        if (this.d.c) {
                            m(pathB);
                        }
                        if (zF7) {
                            E(a2);
                        }
                    }
                }
            } else if (m instanceof XB1.C2366c) {
                XB1.C2366c c2366c = (XB1.C2366c) m;
                XB1.C2378o c2378o12 = c2366c.q;
                if (c2378o12 != null && !c2378o12.i()) {
                    T(c2366c, this.d);
                    if (k() && V()) {
                        Matrix matrix7 = c2366c.n;
                        if (matrix7 != null) {
                            this.a.concat(matrix7);
                        }
                        Path pathY = y(c2366c);
                        R(c2366c);
                        g(c2366c);
                        f(c2366c, c2366c.h);
                        boolean zF8 = F();
                        if (this.d.b) {
                            l(c2366c, pathY);
                        }
                        if (this.d.c) {
                            m(pathY);
                        }
                        if (zF8) {
                            E(c2366c);
                        }
                    }
                }
            } else if (m instanceof XB1.C2371h) {
                XB1.C2371h c2371h = (XB1.C2371h) m;
                XB1.C2378o c2378o13 = c2371h.q;
                if (c2378o13 != null && c2371h.r != null && !c2378o13.i() && !c2371h.r.i()) {
                    T(c2371h, this.d);
                    if (k() && V()) {
                        Matrix matrix8 = c2371h.n;
                        if (matrix8 != null) {
                            this.a.concat(matrix8);
                        }
                        Path pathZ = z(c2371h);
                        R(c2371h);
                        g(c2371h);
                        f(c2371h, c2371h.h);
                        boolean zF9 = F();
                        if (this.d.b) {
                            l(c2371h, pathZ);
                        }
                        if (this.d.c) {
                            m(pathZ);
                        }
                        if (zF9) {
                            E(c2371h);
                        }
                    }
                }
            } else if (m instanceof XB1.C2379p) {
                XB1.C2379p c2379p = (XB1.C2379p) m;
                T(c2379p, this.d);
                if (k() && V() && this.d.c) {
                    Matrix matrix9 = c2379p.n;
                    if (matrix9 != null) {
                        this.a.concat(matrix9);
                    }
                    XB1.C2378o c2378o14 = c2379p.o;
                    float fE5 = c2378o14 == null ? 0.0f : c2378o14.e(this);
                    XB1.C2378o c2378o15 = c2379p.p;
                    float fG3 = c2378o15 == null ? 0.0f : c2378o15.g(this);
                    XB1.C2378o c2378o16 = c2379p.q;
                    float fE6 = c2378o16 == null ? 0.0f : c2378o16.e(this);
                    XB1.C2378o c2378o17 = c2379p.r;
                    fG = c2378o17 != null ? c2378o17.g(this) : 0.0f;
                    if (c2379p.h == null) {
                        c2379p.h = new XB1.C2364a(Math.min(fE5, fE6), Math.min(fG3, fG), Math.abs(fE6 - fE5), Math.abs(fG - fG3));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fE5, fG3);
                    path2.lineTo(fE6, fG);
                    R(c2379p);
                    g(c2379p);
                    f(c2379p, c2379p.h);
                    boolean zF10 = F();
                    m(path2);
                    K(c2379p);
                    if (zF10) {
                        E(c2379p);
                    }
                }
            } else if (m instanceof XB1.C2389z) {
                XB1.C2389z c2389z = (XB1.C2389z) m;
                T(c2389z, this.d);
                if (k() && V()) {
                    g gVar5 = this.d;
                    if (gVar5.c || gVar5.b) {
                        Matrix matrix10 = c2389z.n;
                        if (matrix10 != null) {
                            this.a.concat(matrix10);
                        }
                        if (c2389z.o.length >= 2) {
                            Path pathA = A(c2389z);
                            R(c2389z);
                            g(c2389z);
                            f(c2389z, c2389z.h);
                            boolean zF11 = F();
                            if (this.d.b) {
                                l(c2389z, pathA);
                            }
                            if (this.d.c) {
                                m(pathA);
                            }
                            K(c2389z);
                            if (zF11) {
                                E(c2389z);
                            }
                        }
                    }
                }
            } else if (m instanceof XB1.C2388y) {
                XB1.C2388y c2388y = (XB1.C2388y) m;
                T(c2388y, this.d);
                if (k() && V()) {
                    g gVar6 = this.d;
                    if (gVar6.c || gVar6.b) {
                        Matrix matrix11 = c2388y.n;
                        if (matrix11 != null) {
                            this.a.concat(matrix11);
                        }
                        if (c2388y.o.length >= 2) {
                            Path pathA2 = A(c2388y);
                            R(c2388y);
                            XB1.D.a aVar2 = this.d.a.g;
                            pathA2.setFillType((aVar2 == null || aVar2 != XB1.D.a.e) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            g(c2388y);
                            f(c2388y, c2388y.h);
                            boolean zF12 = F();
                            if (this.d.b) {
                                l(c2388y, pathA2);
                            }
                            if (this.d.c) {
                                m(pathA2);
                            }
                            K(c2388y);
                            if (zF12) {
                                E(c2388y);
                            }
                        }
                    }
                }
            } else if (m instanceof XB1.V) {
                XB1.V v = (XB1.V) m;
                T(v, this.d);
                if (k()) {
                    Matrix matrix12 = v.r;
                    if (matrix12 != null) {
                        this.a.concat(matrix12);
                    }
                    ArrayList arrayList = v.n;
                    float fE7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((XB1.C2378o) v.n.get(0)).e(this);
                    ArrayList arrayList2 = v.o;
                    float fG4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((XB1.C2378o) v.o.get(0)).g(this);
                    ArrayList arrayList3 = v.p;
                    float fE8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((XB1.C2378o) v.p.get(0)).e(this);
                    ArrayList arrayList4 = v.q;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fG = ((XB1.C2378o) v.q.get(0)).g(this);
                    }
                    XB1.D.f fVarV = v();
                    if (fVarV != XB1.D.f.d) {
                        float fD = d(v);
                        if (fVarV == XB1.D.f.e) {
                            fD /= 2.0f;
                        }
                        fE7 -= fD;
                    }
                    if (v.h == null) {
                        h hVar = new h(fE7, fG4);
                        n(v, hVar);
                        RectF rectF = hVar.c;
                        v.h = new XB1.C2364a(rectF.left, rectF.top, rectF.width(), hVar.c.height());
                    }
                    R(v);
                    g(v);
                    f(v, v.h);
                    boolean zF13 = F();
                    n(v, new e(fE7 + fE8, fG4 + fG));
                    if (zF13) {
                        E(v);
                    }
                }
            }
        }
        O();
    }

    public final void I(XB1.G g2, boolean z) {
        if (z) {
            this.f.push(g2);
            this.g.push(this.a.getMatrix());
        }
        Iterator it = g2.i.iterator();
        while (it.hasNext()) {
            H((XB1.M) it.next());
        }
        if (z) {
            this.f.pop();
            this.g.pop();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:70:0x010b  */
    public final void J(XB1.C2380q c2380q, b bVar) {
        float fFloatValue;
        float f2;
        float f3;
        float f4;
        P();
        Float f5 = c2380q.u;
        float f6 = 0.0f;
        if (f5 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f5.floatValue())) {
            float f7 = bVar.c;
            if (f7 == 0.0f && bVar.d == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(bVar.d, f7));
            }
        } else {
            fFloatValue = c2380q.u.floatValue();
        }
        float fA = c2380q.p ? 1.0f : this.d.a.k.a(this.b);
        this.d = t(c2380q);
        Matrix matrix = new Matrix();
        matrix.preTranslate(bVar.a, bVar.b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fA, fA);
        XB1.C2378o c2378o = c2380q.q;
        float fE = c2378o != null ? c2378o.e(this) : 0.0f;
        XB1.C2378o c2378o2 = c2380q.r;
        float fG = c2378o2 != null ? c2378o2.g(this) : 0.0f;
        XB1.C2378o c2378o3 = c2380q.s;
        float fE2 = c2378o3 != null ? c2378o3.e(this) : 3.0f;
        XB1.C2378o c2378o4 = c2380q.t;
        float fG2 = c2378o4 != null ? c2378o4.g(this) : 3.0f;
        XB1.C2364a c2364a = c2380q.o;
        Canvas canvas = this.a;
        if (c2364a != null) {
            float fMax = fE2 / c2364a.c;
            float f8 = fG2 / c2364a.d;
            C3835fh1 c3835fh1 = c2380q.n;
            if (c3835fh1 == null) {
                c3835fh1 = C3835fh1.d;
            }
            if (!c3835fh1.equals(C3835fh1.c)) {
                fMax = c3835fh1.b == C3835fh1.b.e ? Math.max(fMax, f8) : Math.min(fMax, f8);
                f8 = fMax;
            }
            matrix.preTranslate((-fE) * fMax, (-fG) * f8);
            canvas.concat(matrix);
            XB1.C2364a c2364a2 = c2380q.o;
            float f9 = c2364a2.c * fMax;
            float f10 = c2364a2.d * f8;
            C3835fh1.a aVar = c3835fh1.a;
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 2) {
                f2 = (fE2 - f9) / 2.0f;
                f3 = 0.0f - f2;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal != 8) {
                                if (iOrdinal != 9) {
                                    f3 = 0.0f;
                                }
                            }
                        }
                    }
                    f2 = (fE2 - f9) / 2.0f;
                    f3 = 0.0f - f2;
                }
                f2 = fE2 - f9;
                f3 = 0.0f - f2;
            }
            switch (aVar.ordinal()) {
                case 4:
                case 5:
                case 6:
                    f4 = (fG2 - f10) / 2.0f;
                    f6 = 0.0f - f4;
                    if (!this.d.a.z.booleanValue()) {
                        M(f3, f6, fE2, fG2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f8);
                    canvas.concat(matrix);
                    break;
                case 7:
                case 8:
                case 9:
                    f4 = fG2 - f10;
                    f6 = 0.0f - f4;
                    if (!this.d.a.z.booleanValue()) {
                        M(f3, f6, fE2, fG2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f8);
                    canvas.concat(matrix);
                    break;
                default:
                    if (!this.d.a.z.booleanValue()) {
                        M(f3, f6, fE2, fG2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f8);
                    canvas.concat(matrix);
                    break;
            }
        } else {
            matrix.preTranslate(-fE, -fG);
            canvas.concat(matrix);
            if (!this.d.a.z.booleanValue()) {
                M(0.0f, 0.0f, fE2, fG2);
            }
        }
        boolean zF = F();
        I(c2380q, false);
        if (zF) {
            E(c2380q);
        }
        O();
    }

    public final void K(XB1.AbstractC2374k abstractC2374k) {
        XB1.C2380q c2380q;
        XB1.C2380q c2380q2;
        XB1.C2380q c2380q3;
        int i2;
        float f2;
        float f3;
        float f4;
        ArrayList arrayList;
        int size;
        XB1.D d2 = this.d.a;
        String str = d2.B;
        if (str == null && d2.C == null && d2.D == null) {
            return;
        }
        if (str == null) {
            c2380q = null;
        } else {
            XB1.K kD = abstractC2374k.a.d(str);
            if (kD != null) {
                c2380q = (XB1.C2380q) kD;
            } else {
                o("Marker reference '%s' not found", this.d.a.B);
                c2380q = null;
            }
        }
        String str2 = this.d.a.C;
        if (str2 == null) {
            c2380q2 = null;
        } else {
            XB1.K kD2 = abstractC2374k.a.d(str2);
            if (kD2 != null) {
                c2380q2 = (XB1.C2380q) kD2;
            } else {
                o("Marker reference '%s' not found", this.d.a.C);
                c2380q2 = null;
            }
        }
        String str3 = this.d.a.D;
        if (str3 == null) {
            c2380q3 = null;
        } else {
            XB1.K kD3 = abstractC2374k.a.d(str3);
            if (kD3 != null) {
                c2380q3 = (XB1.C2380q) kD3;
            } else {
                o("Marker reference '%s' not found", this.d.a.D);
                c2380q3 = null;
            }
        }
        float f5 = 0.0f;
        if (abstractC2374k instanceof XB1.C2384u) {
            arrayList = new a(this, ((XB1.C2384u) abstractC2374k).o).a;
            f3 = 0.0f;
            i2 = 1;
        } else if (abstractC2374k instanceof XB1.C2379p) {
            XB1.C2379p c2379p = (XB1.C2379p) abstractC2374k;
            XB1.C2378o c2378o = c2379p.o;
            float fE = c2378o != null ? c2378o.e(this) : 0.0f;
            XB1.C2378o c2378o2 = c2379p.p;
            float fG = c2378o2 != null ? c2378o2.g(this) : 0.0f;
            XB1.C2378o c2378o3 = c2379p.q;
            float fE2 = c2378o3 != null ? c2378o3.e(this) : 0.0f;
            XB1.C2378o c2378o4 = c2379p.r;
            float fG2 = c2378o4 != null ? c2378o4.g(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f6 = fE2 - fE;
            i2 = 1;
            float f7 = fG2 - fG;
            arrayList2.add(new b(fE, fG, f6, f7));
            arrayList2.add(new b(fE2, fG2, f6, f7));
            f3 = 0.0f;
            arrayList = arrayList2;
        } else {
            i2 = 1;
            XB1.C2388y c2388y = (XB1.C2388y) abstractC2374k;
            int length = c2388y.o.length;
            if (length < 2) {
                arrayList = null;
                f3 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = c2388y.o;
                b bVar = new b(fArr[0], fArr[1], 0.0f, 0.0f);
                int i3 = 2;
                float f8 = 0.0f;
                float f9 = 0.0f;
                while (true) {
                    f2 = bVar.b;
                    f3 = f5;
                    f4 = bVar.a;
                    if (i3 >= length) {
                        break;
                    }
                    float[] fArr2 = c2388y.o;
                    float f10 = fArr2[i3];
                    float f11 = fArr2[i3 + 1];
                    bVar.a(f10, f11);
                    arrayList3.add(bVar);
                    bVar = new b(f10, f11, f10 - f4, f11 - f2);
                    i3 += 2;
                    f9 = f11;
                    f8 = f10;
                    f5 = f3;
                }
                if (c2388y instanceof XB1.C2389z) {
                    float[] fArr3 = c2388y.o;
                    float f12 = fArr3[0];
                    if (f8 != f12) {
                        float f13 = fArr3[1];
                        if (f9 != f13) {
                            bVar.a(f12, f13);
                            arrayList3.add(bVar);
                            b bVar2 = new b(f12, f13, f12 - f4, f13 - f2);
                            bVar2.b((b) arrayList3.get(0));
                            arrayList3.add(bVar2);
                            arrayList3.set(0, bVar2);
                        }
                    }
                } else {
                    arrayList3.add(bVar);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        XB1.D d3 = this.d.a;
        d3.D = null;
        d3.C = null;
        d3.B = null;
        if (c2380q != null) {
            J(c2380q, (b) arrayList.get(0));
        }
        if (c2380q2 != null && arrayList.size() > 2) {
            b bVar3 = (b) arrayList.get(0);
            b bVar4 = (b) arrayList.get(i2);
            int i4 = 1;
            while (i4 < size - 1) {
                i4++;
                b bVar5 = (b) arrayList.get(i4);
                if (bVar4.e) {
                    float f14 = bVar4.c;
                    float f15 = bVar4.d;
                    float f16 = bVar3.a;
                    float f17 = bVar4.a;
                    float f18 = bVar4.b;
                    float f19 = ((f18 - bVar3.b) * f15) + ((f17 - f16) * f14);
                    if (f19 == f3) {
                        f19 = ((bVar5.a - f17) * f14) + ((bVar5.b - f18) * f15);
                    }
                    if (f19 <= f3 && (f19 != f3 || (f14 <= f3 && f15 < f3))) {
                        bVar4.c = -f14;
                        bVar4.d = -f15;
                    }
                }
                J(c2380q2, bVar4);
                bVar3 = bVar4;
                bVar4 = bVar5;
            }
        }
        if (c2380q3 != null) {
            J(c2380q3, (b) arrayList.get(size - 1));
        }
    }

    public final void L(XB1.C2381r c2381r, XB1.J j2) {
        float fE;
        float fG;
        Boolean bool = c2381r.n;
        if (bool == null || !bool.booleanValue()) {
            XB1.C2378o c2378o = c2381r.p;
            float fD = c2378o != null ? c2378o.d(this, 1.0f) : 1.2f;
            XB1.C2378o c2378o2 = c2381r.q;
            float fD2 = c2378o2 != null ? c2378o2.d(this, 1.0f) : 1.2f;
            XB1.C2364a c2364a = j2.h;
            fE = fD * c2364a.c;
            fG = fD2 * c2364a.d;
        } else {
            XB1.C2378o c2378o3 = c2381r.p;
            fE = c2378o3 != null ? c2378o3.e(this) : j2.h.c;
            XB1.C2378o c2378o4 = c2381r.q;
            fG = c2378o4 != null ? c2378o4.g(this) : j2.h.d;
        }
        if (fE == 0.0f || fG == 0.0f) {
            return;
        }
        P();
        g gVarT = t(c2381r);
        this.d = gVarT;
        gVarT.a.q = Float.valueOf(1.0f);
        Boolean bool2 = c2381r.o;
        if (bool2 != null && !bool2.booleanValue()) {
            XB1.C2364a c2364a2 = j2.h;
            float f2 = c2364a2.a;
            float f3 = c2364a2.b;
            Canvas canvas = this.a;
            canvas.translate(f2, f3);
            XB1.C2364a c2364a3 = j2.h;
            canvas.scale(c2364a3.c, c2364a3.d);
        }
        I(c2381r, false);
        O();
    }

    public final void M(float f2, float f3, float f4, float f5) {
        float fE = f4 + f2;
        float fG = f5 + f3;
        XB1.C2365b c2365b = this.d.a.A;
        if (c2365b != null) {
            f2 += c2365b.d.e(this);
            f3 += this.d.a.A.a.g(this);
            fE -= this.d.a.A.b.e(this);
            fG -= this.d.a.A.c.g(this);
        }
        this.a.clipRect(f2, f3, fE, fG);
    }

    public final void O() {
        this.a.restore();
        this.d = this.e.pop();
    }

    public final void P() {
        this.a.save();
        this.e.push(this.d);
        this.d = new g(this.d);
    }

    public final String Q(String str, boolean z, boolean z2) {
        if (this.d.h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void R(XB1.J j2) {
        if (j2.b == null || j2.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.g.peek().invert(matrix)) {
            XB1.C2364a c2364a = j2.h;
            float f2 = c2364a.a;
            float f3 = c2364a.b;
            float fA = c2364a.a();
            XB1.C2364a c2364a2 = j2.h;
            float f4 = c2364a2.b;
            float fA2 = c2364a2.a();
            float fB = j2.h.b();
            XB1.C2364a c2364a3 = j2.h;
            float[] fArr = {f2, f3, fA, f4, fA2, fB, c2364a3.a, c2364a3.b()};
            matrix.preConcat(this.a.getMatrix());
            matrix.mapPoints(fArr);
            float f5 = fArr[0];
            float f6 = fArr[1];
            RectF rectF = new RectF(f5, f6, f5, f6);
            for (int i2 = 2; i2 <= 6; i2 += 2) {
                float f7 = fArr[i2];
                if (f7 < rectF.left) {
                    rectF.left = f7;
                }
                if (f7 > rectF.right) {
                    rectF.right = f7;
                }
                float f8 = fArr[i2 + 1];
                if (f8 < rectF.top) {
                    rectF.top = f8;
                }
                if (f8 > rectF.bottom) {
                    rectF.bottom = f8;
                }
            }
            XB1.J j3 = (XB1.J) this.f.peek();
            XB1.C2364a c2364a4 = j3.h;
            if (c2364a4 == null) {
                float f9 = rectF.left;
                float f10 = rectF.top;
                j3.h = new XB1.C2364a(f9, f10, rectF.right - f9, rectF.bottom - f10);
                return;
            }
            float f11 = rectF.left;
            float f12 = rectF.top;
            float f13 = rectF.right - f11;
            float f14 = rectF.bottom - f12;
            if (f11 < c2364a4.a) {
                c2364a4.a = f11;
            }
            if (f12 < c2364a4.b) {
                c2364a4.b = f12;
            }
            if (f11 + f13 > c2364a4.a()) {
                c2364a4.c = (f11 + f13) - c2364a4.a;
            }
            if (f12 + f14 > c2364a4.b()) {
                c2364a4.d = (f12 + f14) - c2364a4.b;
            }
        }
    }

    public final void S(g gVar, XB1.D d2) {
        XB1.D d3;
        if (x(d2, 4096L)) {
            gVar.a.r = d2.r;
        }
        if (x(d2, 2048L)) {
            gVar.a.q = d2.q;
        }
        boolean zX = x(d2, 1L);
        XB1.C2368e c2368e = XB1.C2368e.g;
        if (zX) {
            gVar.a.e = d2.e;
            XB1.N n = d2.e;
            gVar.b = (n == null || n == c2368e) ? false : true;
        }
        if (x(d2, 4L)) {
            gVar.a.h = d2.h;
        }
        if (x(d2, 6149L)) {
            N(gVar, true, gVar.a.e);
        }
        if (x(d2, 2L)) {
            gVar.a.g = d2.g;
        }
        if (x(d2, 8L)) {
            gVar.a.i = d2.i;
            XB1.N n2 = d2.i;
            gVar.c = (n2 == null || n2 == c2368e) ? false : true;
        }
        if (x(d2, 16L)) {
            gVar.a.j = d2.j;
        }
        if (x(d2, 6168L)) {
            N(gVar, false, gVar.a.i);
        }
        if (x(d2, 34359738368L)) {
            gVar.a.P = d2.P;
        }
        if (x(d2, 32L)) {
            XB1.D d4 = gVar.a;
            XB1.C2378o c2378o = d2.k;
            d4.k = c2378o;
            gVar.e.setStrokeWidth(c2378o.b(this));
        }
        if (x(d2, 64L)) {
            gVar.a.l = d2.l;
            int iOrdinal = d2.l.ordinal();
            Paint paint = gVar.e;
            if (iOrdinal == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iOrdinal == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iOrdinal == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (x(d2, 128L)) {
            gVar.a.m = d2.m;
            int iOrdinal2 = d2.m.ordinal();
            Paint paint2 = gVar.e;
            if (iOrdinal2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iOrdinal2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iOrdinal2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (x(d2, 256L)) {
            gVar.a.n = d2.n;
            gVar.e.setStrokeMiter(d2.n.floatValue());
        }
        if (x(d2, 512L)) {
            gVar.a.o = d2.o;
        }
        if (x(d2, 1024L)) {
            gVar.a.p = d2.p;
        }
        Typeface typefaceH = null;
        if (x(d2, 1536L)) {
            XB1.C2378o[] c2378oArr = gVar.a.o;
            Paint paint3 = gVar.e;
            if (c2378oArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = c2378oArr.length;
                int i2 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i2];
                int i3 = 0;
                float f2 = 0.0f;
                while (true) {
                    d3 = gVar.a;
                    if (i3 >= i2) {
                        break;
                    }
                    float fB = d3.o[i3 % length].b(this);
                    fArr[i3] = fB;
                    f2 += fB;
                    i3++;
                }
                if (f2 == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fB2 = d3.p.b(this);
                    if (fB2 < 0.0f) {
                        fB2 = (fB2 % f2) + f2;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fB2));
                }
            }
        }
        if (x(d2, 16384L)) {
            float textSize = this.d.d.getTextSize();
            gVar.a.t = d2.t;
            gVar.d.setTextSize(d2.t.d(this, textSize));
            gVar.e.setTextSize(d2.t.d(this, textSize));
        }
        if (x(d2, 8192L)) {
            gVar.a.s = d2.s;
        }
        if (x(d2, 32768L)) {
            if (d2.u.intValue() == -1 && gVar.a.u.intValue() > 100) {
                XB1.D d5 = gVar.a;
                d5.u = Integer.valueOf(d5.u.intValue() - 100);
            } else if (d2.u.intValue() != 1 || gVar.a.u.intValue() >= 900) {
                gVar.a.u = d2.u;
            } else {
                XB1.D d6 = gVar.a;
                d6.u = Integer.valueOf(d6.u.intValue() + 100);
            }
        }
        if (x(d2, 65536L)) {
            gVar.a.v = d2.v;
        }
        if (x(d2, 106496L)) {
            XB1.D d7 = gVar.a;
            ArrayList arrayList = d7.s;
            if (arrayList != null && this.c != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceH = h((String) it.next(), d7.u, d7.v)) == null) {
                }
            }
            if (typefaceH == null) {
                typefaceH = h("serif", d7.u, d7.v);
            }
            gVar.d.setTypeface(typefaceH);
            gVar.e.setTypeface(typefaceH);
        }
        if (x(d2, 131072L)) {
            gVar.a.w = d2.w;
            XB1.D.g gVar2 = d2.w;
            XB1.D.g gVar3 = XB1.D.g.h;
            boolean z = gVar2 == gVar3;
            Paint paint4 = gVar.d;
            paint4.setStrikeThruText(z);
            XB1.D.g gVar4 = d2.w;
            XB1.D.g gVar5 = XB1.D.g.e;
            paint4.setUnderlineText(gVar4 == gVar5);
            boolean z2 = d2.w == gVar3;
            Paint paint5 = gVar.e;
            paint5.setStrikeThruText(z2);
            paint5.setUnderlineText(d2.w == gVar5);
        }
        if (x(d2, 68719476736L)) {
            gVar.a.x = d2.x;
        }
        if (x(d2, 262144L)) {
            gVar.a.y = d2.y;
        }
        if (x(d2, 524288L)) {
            gVar.a.z = d2.z;
        }
        if (x(d2, 2097152L)) {
            gVar.a.B = d2.B;
        }
        if (x(d2, 4194304L)) {
            gVar.a.C = d2.C;
        }
        if (x(d2, 8388608L)) {
            gVar.a.D = d2.D;
        }
        if (x(d2, 16777216L)) {
            gVar.a.E = d2.E;
        }
        if (x(d2, 33554432L)) {
            gVar.a.F = d2.F;
        }
        if (x(d2, C2688aH1.MAX_EVENT_SIZE_BYTES)) {
            gVar.a.A = d2.A;
        }
        if (x(d2, 268435456L)) {
            gVar.a.I = d2.I;
        }
        if (x(d2, 536870912L)) {
            gVar.a.J = d2.J;
        }
        if (x(d2, 1073741824L)) {
            gVar.a.K = d2.K;
        }
        if (x(d2, 67108864L)) {
            gVar.a.G = d2.G;
        }
        if (x(d2, 134217728L)) {
            gVar.a.H = d2.H;
        }
        if (x(d2, 8589934592L)) {
            gVar.a.N = d2.N;
        }
        if (x(d2, 17179869184L)) {
            gVar.a.O = d2.O;
        }
        if (x(d2, 137438953472L)) {
            gVar.a.Q = d2.Q;
        }
    }

    public final void T(XB1.K k, g gVar) {
        boolean z = k.b == null;
        XB1.D d2 = gVar.a;
        Boolean bool = Boolean.TRUE;
        d2.E = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        d2.z = bool;
        d2.A = null;
        d2.I = null;
        d2.q = Float.valueOf(1.0f);
        d2.G = XB1.C2368e.e;
        d2.H = Float.valueOf(1.0f);
        d2.K = null;
        d2.L = null;
        d2.M = Float.valueOf(1.0f);
        d2.N = null;
        d2.O = Float.valueOf(1.0f);
        d2.P = XB1.D.i.d;
        XB1.D d3 = k.e;
        if (d3 != null) {
            S(gVar, d3);
        }
        ArrayList arrayList = this.c.b.a;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (C3467dx.o oVar : this.c.b.a) {
                if (C3467dx.g(oVar.a, k)) {
                    S(gVar, oVar.b);
                }
            }
        }
        XB1.D d4 = k.f;
        if (d4 != null) {
            S(gVar, d4);
        }
    }

    public final void U() {
        int i2;
        XB1.D d2 = this.d.a;
        XB1.N n = d2.N;
        if (n instanceof XB1.C2368e) {
            i2 = ((XB1.C2368e) n).d;
        } else if (!(n instanceof XB1.C2369f)) {
            return;
        } else {
            i2 = d2.r.d;
        }
        Float f2 = d2.O;
        if (f2 != null) {
            i2 = i(i2, f2.floatValue());
        }
        this.a.drawColor(i2);
    }

    public final boolean V() {
        Boolean bool = this.d.a.F;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @TargetApi(19)
    public final Path b(XB1.J j2, XB1.C2364a c2364a) {
        Path pathD;
        XB1.K kD = j2.a.d(this.d.a.I);
        if (kD == null) {
            o("ClipPath reference '%s' not found", this.d.a.I);
            return null;
        }
        XB1.C2367d c2367d = (XB1.C2367d) kD;
        this.e.push(this.d);
        this.d = t(c2367d);
        Boolean bool = c2367d.o;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(c2364a.a, c2364a.b);
            matrix.preScale(c2364a.c, c2364a.d);
        }
        Matrix matrix2 = c2367d.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (XB1.M m : c2367d.i) {
            if ((m instanceof XB1.J) && (pathD = D((XB1.J) m, true)) != null) {
                path.op(pathD, Path.Op.UNION);
            }
        }
        if (this.d.a.I != null) {
            if (c2367d.h == null) {
                c2367d.h = c(path);
            }
            Path pathB = b(c2367d, c2367d.h);
            if (pathB != null) {
                path.op(pathB, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.d = this.e.pop();
        return path;
    }

    public final float d(XB1.X x) {
        j jVar = new j();
        n(x, jVar);
        return jVar.a;
    }

    public final void f(XB1.J j2, XB1.C2364a c2364a) {
        Path pathB;
        if (this.d.a.I == null || (pathB = b(j2, c2364a)) == null) {
            return;
        }
        this.a.clipPath(pathB);
    }

    public final void g(XB1.J j2) {
        XB1.N n = this.d.a.e;
        if (n instanceof XB1.C2383t) {
            j(true, j2.h, (XB1.C2383t) n);
        }
        XB1.N n2 = this.d.a.i;
        if (n2 instanceof XB1.C2383t) {
            j(false, j2.h, (XB1.C2383t) n2);
        }
    }

    public final void j(boolean z, XB1.C2364a c2364a, XB1.C2383t c2383t) {
        float fD;
        float f2;
        float fD2;
        float f3;
        float f4;
        float fD3;
        float fD4;
        float f5;
        float f6;
        int i2;
        XB1.K kD = this.c.d(c2383t.d);
        if (kD == null) {
            o("%s reference '%s' not found", z ? "Fill" : "Stroke", c2383t.d);
            XB1.N n = c2383t.e;
            if (n != null) {
                N(this.d, z, n);
                return;
            } else if (z) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        boolean z2 = kD instanceof XB1.L;
        XB1.EnumC2373j enumC2373j = XB1.EnumC2373j.e;
        XB1.EnumC2373j enumC2373j2 = XB1.EnumC2373j.d;
        XB1.C2368e c2368e = XB1.C2368e.e;
        if (z2) {
            XB1.L l = (XB1.L) kD;
            String str = l.l;
            if (str != null) {
                q(l, str);
            }
            Boolean bool = l.i;
            boolean z3 = bool != null && bool.booleanValue();
            g gVar = this.d;
            Paint paint = z ? gVar.d : gVar.e;
            if (z3) {
                g gVar2 = this.d;
                f3 = 256.0f;
                XB1.C2364a c2364a2 = gVar2.g;
                if (c2364a2 == null) {
                    c2364a2 = gVar2.f;
                }
                XB1.C2378o c2378o = l.m;
                float fE = c2378o != null ? c2378o.e(this) : 0.0f;
                XB1.C2378o c2378o2 = l.n;
                fD3 = c2378o2 != null ? c2378o2.g(this) : 0.0f;
                f4 = 0.0f;
                XB1.C2378o c2378o3 = l.o;
                float fE2 = c2378o3 != null ? c2378o3.e(this) : c2364a2.c;
                XB1.C2378o c2378o4 = l.p;
                f6 = fE2;
                f5 = fE;
                fD4 = c2378o4 != null ? c2378o4.g(this) : 0.0f;
            } else {
                f3 = 256.0f;
                f4 = 0.0f;
                XB1.C2378o c2378o5 = l.m;
                float fD5 = c2378o5 != null ? c2378o5.d(this, 1.0f) : 0.0f;
                XB1.C2378o c2378o6 = l.n;
                fD3 = c2378o6 != null ? c2378o6.d(this, 1.0f) : 0.0f;
                XB1.C2378o c2378o7 = l.o;
                float fD6 = c2378o7 != null ? c2378o7.d(this, 1.0f) : 1.0f;
                XB1.C2378o c2378o8 = l.p;
                fD4 = c2378o8 != null ? c2378o8.d(this, 1.0f) : 0.0f;
                f5 = fD5;
                f6 = fD6;
            }
            float f7 = fD3;
            P();
            this.d = t(l);
            Matrix matrix = new Matrix();
            if (!z3) {
                matrix.preTranslate(c2364a.a, c2364a.b);
                matrix.preScale(c2364a.c, c2364a.d);
            }
            Matrix matrix2 = l.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = l.h.size();
            if (size == 0) {
                O();
                if (z) {
                    this.d.b = false;
                    return;
                } else {
                    this.d.c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = l.h.iterator();
            int i3 = 0;
            float f8 = -1.0f;
            while (it.hasNext()) {
                XB1.C c2 = (XB1.C) ((XB1.M) it.next());
                Float f9 = c2.h;
                float fFloatValue = f9 != null ? f9.floatValue() : f4;
                if (i3 == 0 || fFloatValue >= f8) {
                    fArr[i3] = fFloatValue;
                    f8 = fFloatValue;
                } else {
                    fArr[i3] = f8;
                }
                P();
                T(c2, this.d);
                XB1.D d2 = this.d.a;
                XB1.C2368e c2368e2 = (XB1.C2368e) d2.G;
                if (c2368e2 == null) {
                    c2368e2 = c2368e;
                }
                iArr[i3] = i(c2368e2.d, d2.H.floatValue());
                i3++;
                O();
            }
            if ((f5 == f6 && f7 == fD4) || size == 1) {
                O();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            XB1.EnumC2373j enumC2373j3 = l.k;
            if (enumC2373j3 != null) {
                if (enumC2373j3 == enumC2373j2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (enumC2373j3 == enumC2373j) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            O();
            LinearGradient linearGradient = new LinearGradient(f5, f7, f6, fD4, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (this.d.a.h.floatValue() * f3);
            if (iFloatValue < 0) {
                i2 = 0;
            } else {
                i2 = iFloatValue > 255 ? 255 : iFloatValue;
            }
            paint.setAlpha(i2);
            return;
        }
        if (!(kD instanceof XB1.P)) {
            if (kD instanceof XB1.B) {
                XB1.B b2 = (XB1.B) kD;
                if (z) {
                    if (x(b2.e, 2147483648L)) {
                        g gVar3 = this.d;
                        XB1.D d3 = gVar3.a;
                        XB1.N n2 = b2.e.L;
                        d3.e = n2;
                        gVar3.b = n2 != null;
                    }
                    if (x(b2.e, 4294967296L)) {
                        this.d.a.h = b2.e.M;
                    }
                    if (x(b2.e, 6442450944L)) {
                        g gVar4 = this.d;
                        N(gVar4, z, gVar4.a.e);
                        return;
                    }
                    return;
                }
                if (x(b2.e, 2147483648L)) {
                    g gVar5 = this.d;
                    XB1.D d4 = gVar5.a;
                    XB1.N n3 = b2.e.L;
                    d4.i = n3;
                    gVar5.c = n3 != null;
                }
                if (x(b2.e, 4294967296L)) {
                    this.d.a.j = b2.e.M;
                }
                if (x(b2.e, 6442450944L)) {
                    g gVar6 = this.d;
                    N(gVar6, z, gVar6.a.i);
                    return;
                }
                return;
            }
            return;
        }
        XB1.P p = (XB1.P) kD;
        String str2 = p.l;
        if (str2 != null) {
            q(p, str2);
        }
        Boolean bool2 = p.i;
        boolean z4 = bool2 != null && bool2.booleanValue();
        g gVar7 = this.d;
        Paint paint2 = z ? gVar7.d : gVar7.e;
        if (z4) {
            XB1.C2378o c2378o9 = new XB1.C2378o(50.0f, XB1.c0.g);
            XB1.C2378o c2378o10 = p.m;
            float fE3 = c2378o10 != null ? c2378o10.e(this) : c2378o9.e(this);
            XB1.C2378o c2378o11 = p.n;
            fD = c2378o11 != null ? c2378o11.g(this) : c2378o9.g(this);
            XB1.C2378o c2378o12 = p.o;
            fD2 = c2378o12 != null ? c2378o12.b(this) : c2378o9.b(this);
            f2 = fE3;
        } else {
            XB1.C2378o c2378o13 = p.m;
            float fD7 = c2378o13 != null ? c2378o13.d(this, 1.0f) : 0.5f;
            XB1.C2378o c2378o14 = p.n;
            fD = c2378o14 != null ? c2378o14.d(this, 1.0f) : 0.5f;
            XB1.C2378o c2378o15 = p.o;
            f2 = fD7;
            fD2 = c2378o15 != null ? c2378o15.d(this, 1.0f) : 0.5f;
        }
        float f10 = fD;
        P();
        this.d = t(p);
        Matrix matrix3 = new Matrix();
        if (!z4) {
            matrix3.preTranslate(c2364a.a, c2364a.b);
            matrix3.preScale(c2364a.c, c2364a.d);
        }
        Matrix matrix4 = p.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = p.h.size();
        if (size2 == 0) {
            O();
            if (z) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = p.h.iterator();
        int i4 = 0;
        float f11 = -1.0f;
        while (it2.hasNext()) {
            XB1.C c3 = (XB1.C) ((XB1.M) it2.next());
            Float f12 = c3.h;
            float fFloatValue2 = f12 != null ? f12.floatValue() : 0.0f;
            if (i4 == 0 || fFloatValue2 >= f11) {
                fArr2[i4] = fFloatValue2;
                f11 = fFloatValue2;
            } else {
                fArr2[i4] = f11;
            }
            P();
            T(c3, this.d);
            XB1.D d5 = this.d.a;
            XB1.C2368e c2368e3 = (XB1.C2368e) d5.G;
            if (c2368e3 == null) {
                c2368e3 = c2368e;
            }
            iArr2[i4] = i(c2368e3.d, d5.H.floatValue());
            i4++;
            O();
        }
        if (fD2 == 0.0f || size2 == 1) {
            O();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        XB1.EnumC2373j enumC2373j4 = p.k;
        if (enumC2373j4 != null) {
            if (enumC2373j4 == enumC2373j2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (enumC2373j4 == enumC2373j) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        O();
        RadialGradient radialGradient = new RadialGradient(f2, f10, fD2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (this.d.a.h.floatValue() * 256.0f);
        if (iFloatValue2 < 0) {
            iFloatValue2 = 0;
        } else if (iFloatValue2 > 255) {
            iFloatValue2 = 255;
        }
        paint2.setAlpha(iFloatValue2);
    }

    public final boolean k() {
        Boolean bool = this.d.a.E;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0176  */
    public final void l(XB1.J j2, Path path) {
        char c2;
        float fE;
        float fG;
        float fG2;
        float fE2;
        char c3;
        XB1.N n = this.d.a.e;
        boolean z = n instanceof XB1.C2383t;
        Canvas canvas = this.a;
        if (z) {
            XB1.K kD = this.c.d(((XB1.C2383t) n).d);
            if (kD instanceof XB1.C2387x) {
                XB1.C2387x c2387x = (XB1.C2387x) kD;
                Boolean bool = c2387x.p;
                boolean z2 = bool != null && bool.booleanValue();
                String str = c2387x.w;
                if (str != null) {
                    s(c2387x, str);
                }
                if (z2) {
                    XB1.C2378o c2378o = c2387x.s;
                    fE = c2378o != null ? c2378o.e(this) : 0.0f;
                    XB1.C2378o c2378o2 = c2387x.t;
                    fG2 = c2378o2 != null ? c2378o2.g(this) : 0.0f;
                    XB1.C2378o c2378o3 = c2387x.u;
                    fE2 = c2378o3 != null ? c2378o3.e(this) : 0.0f;
                    XB1.C2378o c2378o4 = c2387x.v;
                    fG = c2378o4 != null ? c2378o4.g(this) : 0.0f;
                    c2 = 0;
                } else {
                    XB1.C2378o c2378o5 = c2387x.s;
                    float fD = c2378o5 != null ? c2378o5.d(this, 1.0f) : 0.0f;
                    XB1.C2378o c2378o6 = c2387x.t;
                    float fD2 = c2378o6 != null ? c2378o6.d(this, 1.0f) : 0.0f;
                    XB1.C2378o c2378o7 = c2387x.u;
                    float fD3 = c2378o7 != null ? c2378o7.d(this, 1.0f) : 0.0f;
                    XB1.C2378o c2378o8 = c2387x.v;
                    float fD4 = c2378o8 != null ? c2378o8.d(this, 1.0f) : 0.0f;
                    XB1.C2364a c2364a = j2.h;
                    float f2 = c2364a.a;
                    c2 = 0;
                    float f3 = c2364a.c;
                    fE = (fD * f3) + f2;
                    float f4 = c2364a.b;
                    float f5 = c2364a.d;
                    float f6 = f3 * fD3;
                    fG = fD4 * f5;
                    fG2 = (fD2 * f5) + f4;
                    fE2 = f6;
                }
                if (fE2 == 0.0f || fG == 0.0f) {
                    return;
                }
                C3835fh1 c3835fh1 = c2387x.n;
                if (c3835fh1 == null) {
                    c3835fh1 = C3835fh1.d;
                }
                P();
                canvas.clipPath(path);
                g gVar = new g();
                S(gVar, XB1.D.a());
                gVar.a.z = Boolean.FALSE;
                u(c2387x, gVar);
                this.d = gVar;
                XB1.C2364a c2364a2 = j2.h;
                Matrix matrix = c2387x.r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (c2387x.r.invert(matrix2)) {
                        XB1.C2364a c2364a3 = j2.h;
                        float f7 = c2364a3.a;
                        float f8 = c2364a3.b;
                        float fA = c2364a3.a();
                        c3 = 1;
                        XB1.C2364a c2364a4 = j2.h;
                        float f9 = c2364a4.b;
                        float fA2 = c2364a4.a();
                        float fB = j2.h.b();
                        XB1.C2364a c2364a5 = j2.h;
                        float f10 = c2364a5.a;
                        float fB2 = c2364a5.b();
                        float[] fArr = new float[8];
                        fArr[c2] = f7;
                        fArr[1] = f8;
                        fArr[2] = fA;
                        fArr[3] = f9;
                        fArr[4] = fA2;
                        fArr[5] = fB;
                        fArr[6] = f10;
                        fArr[7] = fB2;
                        matrix2.mapPoints(fArr);
                        float f11 = fArr[c2];
                        float f12 = fArr[1];
                        RectF rectF = new RectF(f11, f12, f11, f12);
                        for (int i2 = 2; i2 <= 6; i2 += 2) {
                            float f13 = fArr[i2];
                            if (f13 < rectF.left) {
                                rectF.left = f13;
                            }
                            if (f13 > rectF.right) {
                                rectF.right = f13;
                            }
                            float f14 = fArr[i2 + 1];
                            if (f14 < rectF.top) {
                                rectF.top = f14;
                            }
                            if (f14 > rectF.bottom) {
                                rectF.bottom = f14;
                            }
                        }
                        float f15 = rectF.left;
                        float f16 = rectF.top;
                        c2364a2 = new XB1.C2364a(f15, f16, rectF.right - f15, rectF.bottom - f16);
                    } else {
                        c3 = 1;
                    }
                } else {
                    c3 = 1;
                }
                float fFloor = (((float) Math.floor((c2364a2.a - fE) / fE2)) * fE2) + fE;
                float fA3 = c2364a2.a();
                float fB3 = c2364a2.b();
                XB1.C2364a c2364a6 = new XB1.C2364a(0.0f, 0.0f, fE2, fG);
                boolean zF = F();
                for (float fFloor2 = (((float) Math.floor((c2364a2.b - fG2) / fG)) * fG) + fG2; fFloor2 < fB3; fFloor2 += fG) {
                    float f17 = fFloor;
                    while (f17 < fA3) {
                        c2364a6.a = f17;
                        c2364a6.b = fFloor2;
                        P();
                        if (!this.d.a.z.booleanValue()) {
                            M(c2364a6.a, c2364a6.b, c2364a6.c, c2364a6.d);
                        }
                        XB1.C2364a c2364a7 = c2387x.o;
                        if (c2364a7 != null) {
                            canvas.concat(e(c2364a6, c2364a7, c3835fh1));
                        } else {
                            Boolean bool2 = c2387x.q;
                            char c4 = (bool2 == null || bool2.booleanValue()) ? c3 : c2;
                            canvas.translate(f17, fFloor2);
                            if (c4 == 0) {
                                XB1.C2364a c2364a8 = j2.h;
                                canvas.scale(c2364a8.c, c2364a8.d);
                            }
                        }
                        Iterator it = c2387x.i.iterator();
                        while (it.hasNext()) {
                            H((XB1.M) it.next());
                        }
                        O();
                        f17 += fE2;
                        fB3 = fB3;
                        fFloor = fFloor;
                    }
                }
                if (zF) {
                    E(c2387x);
                }
                O();
                return;
            }
        }
        canvas.drawPath(path, this.d.d);
    }

    public final void m(Path path) {
        g gVar = this.d;
        XB1.D.i iVar = gVar.a.P;
        XB1.D.i iVar2 = XB1.D.i.e;
        Canvas canvas = this.a;
        if (iVar != iVar2) {
            canvas.drawPath(path, gVar.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = this.d.e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.d.e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void n(XB1.X x, i iVar) {
        float f2;
        float fG;
        float fE;
        XB1.D.f fVarV;
        if (k()) {
            Iterator it = x.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                XB1.M m = (XB1.M) it.next();
                if (m instanceof XB1.b0) {
                    iVar.b(Q(((XB1.b0) m).c, z, !it.hasNext()));
                } else if (iVar.a((XB1.X) m)) {
                    boolean z2 = m instanceof XB1.Y;
                    XB1.D.f fVar = XB1.D.f.e;
                    XB1.D.f fVar2 = XB1.D.f.d;
                    float fG2 = 0.0f;
                    if (z2) {
                        P();
                        XB1.Y y = (XB1.Y) m;
                        T(y, this.d);
                        if (k() && V()) {
                            XB1.K kD = y.a.d(y.n);
                            if (kD == null) {
                                o("TextPath reference '%s' not found", y.n);
                            } else {
                                XB1.C2384u c2384u = (XB1.C2384u) kD;
                                Path path = new c(c2384u.o).a;
                                Matrix matrix = c2384u.n;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                XB1.C2378o c2378o = y.o;
                                fG2 = c2378o != null ? c2378o.d(this, pathMeasure.getLength()) : 0.0f;
                                XB1.D.f fVarV2 = v();
                                if (fVarV2 != fVar2) {
                                    float fD = d(y);
                                    if (fVarV2 == fVar) {
                                        fD /= 2.0f;
                                    }
                                    fG2 -= fD;
                                }
                                g((XB1.J) y.p);
                                boolean zF = F();
                                n(y, new d(path, fG2));
                                if (zF) {
                                    E(y);
                                }
                            }
                        }
                        O();
                    } else if (m instanceof XB1.U) {
                        P();
                        XB1.U u = (XB1.U) m;
                        T(u, this.d);
                        if (k()) {
                            ArrayList arrayList = u.n;
                            boolean z3 = arrayList != null && arrayList.size() > 0;
                            boolean z4 = iVar instanceof e;
                            if (z4) {
                                float fE2 = !z3 ? ((e) iVar).a : ((XB1.C2378o) u.n.get(0)).e(this);
                                ArrayList arrayList2 = u.o;
                                fG = (arrayList2 == null || arrayList2.size() == 0) ? ((e) iVar).b : ((XB1.C2378o) u.o.get(0)).g(this);
                                ArrayList arrayList3 = u.p;
                                fE = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((XB1.C2378o) u.p.get(0)).e(this);
                                ArrayList arrayList4 = u.q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fG2 = ((XB1.C2378o) u.q.get(0)).g(this);
                                }
                                float f3 = fE2;
                                f2 = fG2;
                                fG2 = f3;
                            } else {
                                f2 = 0.0f;
                                fG = 0.0f;
                                fE = 0.0f;
                            }
                            if (z3 && (fVarV = v()) != fVar2) {
                                float fD2 = d(u);
                                if (fVarV == fVar) {
                                    fD2 /= 2.0f;
                                }
                                fG2 -= fD2;
                            }
                            g((XB1.J) u.r);
                            if (z4) {
                                e eVar = (e) iVar;
                                eVar.a = fG2 + fE;
                                eVar.b = fG + f2;
                            }
                            boolean zF2 = F();
                            n(u, iVar);
                            if (zF2) {
                                E(u);
                            }
                        }
                        O();
                    } else if (m instanceof XB1.T) {
                        P();
                        XB1.T t = (XB1.T) m;
                        T(t, this.d);
                        if (k()) {
                            g((XB1.J) t.o);
                            XB1.K kD2 = m.a.d(t.n);
                            if (kD2 == null || !(kD2 instanceof XB1.X)) {
                                o("Tref reference '%s' not found", t.n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                p((XB1.X) kD2, sb);
                                if (sb.length() > 0) {
                                    iVar.b(sb.toString());
                                }
                            }
                        }
                        O();
                    }
                }
                z = false;
            }
        }
    }

    public final void p(XB1.X x, StringBuilder sb) {
        Iterator it = x.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            XB1.M m = (XB1.M) it.next();
            if (m instanceof XB1.X) {
                p((XB1.X) m, sb);
            } else if (m instanceof XB1.b0) {
                sb.append(Q(((XB1.b0) m).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public final g t(XB1.K k) {
        g gVar = new g();
        S(gVar, XB1.D.a());
        u(k, gVar);
        return gVar;
    }

    public final void u(XB1.K k, g gVar) {
        ArrayList arrayList = new ArrayList();
        XB1.M m = k;
        while (true) {
            if (m instanceof XB1.K) {
                arrayList.add(0, (XB1.K) m);
            }
            Object obj = m.b;
            if (obj == null) {
                break;
            } else {
                m = (XB1.M) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            T((XB1.K) it.next(), gVar);
        }
        g gVar2 = this.d;
        gVar.g = gVar2.g;
        gVar.f = gVar2.f;
    }

    public final XB1.D.f v() {
        XB1.D.f fVar;
        XB1.D d2 = this.d.a;
        if (d2.x == XB1.D.h.d || (fVar = d2.y) == XB1.D.f.e) {
            return d2.y;
        }
        XB1.D.f fVar2 = XB1.D.f.d;
        return fVar == fVar2 ? XB1.D.f.g : fVar2;
    }

    public final Path.FillType w() {
        XB1.D.a aVar = this.d.a.J;
        return (aVar == null || aVar != XB1.D.a.e) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final Path y(XB1.C2366c c2366c) {
        XB1.C2378o c2378o = c2366c.o;
        float fE = c2378o != null ? c2378o.e(this) : 0.0f;
        XB1.C2378o c2378o2 = c2366c.p;
        float fG = c2378o2 != null ? c2378o2.g(this) : 0.0f;
        float fB = c2366c.q.b(this);
        float f2 = fE - fB;
        float f3 = fG - fB;
        float f4 = fE + fB;
        float f5 = fG + fB;
        if (c2366c.h == null) {
            float f6 = 2.0f * fB;
            c2366c.h = new XB1.C2364a(f2, f3, f6, f6);
        }
        float f7 = fB * 0.5522848f;
        Path path = new Path();
        path.moveTo(fE, f3);
        float f8 = fE + f7;
        float f9 = fG - f7;
        path.cubicTo(f8, f3, f4, f9, f4, fG);
        float f10 = fG + f7;
        path.cubicTo(f4, f10, f8, f5, fE, f5);
        float f11 = fE - f7;
        path.cubicTo(f11, f5, f2, f10, f2, fG);
        path.cubicTo(f2, f9, f11, f3, fE, f3);
        path.close();
        return path;
    }

    public final Path z(XB1.C2371h c2371h) {
        XB1.C2378o c2378o = c2371h.o;
        float fE = c2378o != null ? c2378o.e(this) : 0.0f;
        XB1.C2378o c2378o2 = c2371h.p;
        float fG = c2378o2 != null ? c2378o2.g(this) : 0.0f;
        float fE2 = c2371h.q.e(this);
        float fG2 = c2371h.r.g(this);
        float f2 = fE - fE2;
        float f3 = fG - fG2;
        float f4 = fE + fE2;
        float f5 = fG + fG2;
        if (c2371h.h == null) {
            c2371h.h = new XB1.C2364a(f2, f3, fE2 * 2.0f, 2.0f * fG2);
        }
        float f6 = fE2 * 0.5522848f;
        float f7 = fG2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fE, f3);
        float f8 = fE + f6;
        float f9 = fG - f7;
        path.cubicTo(f8, f3, f4, f9, f4, fG);
        float f10 = fG + f7;
        path.cubicTo(f4, f10, f8, f5, fE, f5);
        float f11 = fE - f6;
        path.cubicTo(f11, f5, f2, f10, f2, fG);
        path.cubicTo(f2, f9, f11, f3, fE, f3);
        path.close();
        return path;
    }

    public class g {
        public final XB1.D a;
        public boolean b;
        public boolean c;
        public final Paint d;
        public final Paint e;
        public XB1.C2364a f;
        public XB1.C2364a g;
        public boolean h;

        public g() {
            Paint paint = new Paint();
            this.d = paint;
            paint.setFlags(385);
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.e = paint2;
            paint2.setFlags(385);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.a = XB1.D.a();
        }

        public g(g gVar) {
            this.b = gVar.b;
            this.c = gVar.c;
            this.d = new Paint(gVar.d);
            this.e = new Paint(gVar.e);
            XB1.C2364a c2364a = gVar.f;
            if (c2364a != null) {
                this.f = new XB1.C2364a(c2364a);
            }
            XB1.C2364a c2364a2 = gVar.g;
            if (c2364a2 != null) {
                this.g = new XB1.C2364a(c2364a2);
            }
            this.h = gVar.h;
            try {
                this.a = (XB1.D) gVar.a.clone();
            } catch (CloneNotSupportedException e) {
                b0.d("SVGAndroidRenderer", "Unexpected clone error", e);
                this.a = XB1.D.a();
            }
        }
    }
}
