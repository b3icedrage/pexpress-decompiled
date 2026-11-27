package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import io.sentry.android.core.b0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: m11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5214m11 {
    public C6748tK0[] A;
    public final View b;
    public final int c;
    public AbstractC4198hR[] j;
    public C3422dj k;
    public int[] o;
    public double[] p;
    public double[] q;
    public String[] r;
    public int[] s;
    public HashMap<String, Ae2> x;
    public HashMap<String, AbstractC6604se2> y;
    public HashMap<String, Zd2> z;
    public final Rect a = new Rect();
    public boolean d = false;
    public int e = -1;
    public final C6473s11 f = new C6473s11();
    public final C6473s11 g = new C6473s11();
    public final C4791k11 h = new C4791k11();
    public final C4791k11 i = new C4791k11();
    public float l = Float.NaN;
    public float m = 0.0f;
    public float n = 1.0f;
    public final float[] t = new float[4];
    public final ArrayList<C6473s11> u = new ArrayList<>();
    public final float[] v = new float[1];
    public final ArrayList<AbstractC3339dK0> w = new ArrayList<>();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public C5214m11(View view) {
        this.b = view;
        this.c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).getClass();
        }
    }

    public static void f(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final float a(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.n;
            if (f3 != 1.0d) {
                float f4 = this.m;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        C3079c50 c3079c50 = this.f.d;
        float f5 = Float.NaN;
        for (C6473s11 c6473s11 : this.u) {
            C3079c50 c3079c51 = c6473s11.d;
            if (c3079c51 != null) {
                float f6 = c6473s11.g;
                if (f6 < f) {
                    c3079c50 = c3079c51;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = c6473s11.g;
                }
            }
        }
        if (c3079c50 != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) c3079c50.a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) c3079c50.b(d);
            }
        }
        return f;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r11v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v6 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r13v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v4 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r25v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: float[]
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
    /* JADX WARN: Failed to calculate best type for var: r3v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v3 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r3v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v4 ??, new type: float
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
    /* JADX WARN: Failed to set immutable type for var: r25v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: float[]
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
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final void b(double r23, float[] r25, float[] r26) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5214m11.b(double, float[], float[]):void");
    }

    public final float c() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float fHypot = 0.0f;
        while (i < 100) {
            float f2 = i * f;
            double dA = f2;
            C3079c50 c3079c50 = this.f.d;
            float f3 = Float.NaN;
            float f4 = 0.0f;
            for (C6473s11 c6473s11 : this.u) {
                C3079c50 c3079c51 = c6473s11.d;
                float f5 = f;
                if (c3079c51 != null) {
                    float f6 = c6473s11.g;
                    if (f6 < f2) {
                        f4 = f6;
                        c3079c50 = c3079c51;
                    } else if (Float.isNaN(f3)) {
                        f3 = c6473s11.g;
                    }
                }
                f = f5;
            }
            float f7 = f;
            if (c3079c50 != null) {
                if (Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                float f8 = f3 - f4;
                dA = (((float) c3079c50.a((f2 - f4) / f8)) * f8) + f4;
            }
            this.j[0].c(dA, this.p);
            float f9 = fHypot;
            int i2 = i;
            this.f.f(dA, this.o, this.p, fArr, 0);
            fHypot = i2 > 0 ? (float) (Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])) + ((double) f9)) : f9;
            d = fArr[0];
            d2 = fArr[1];
            i = i2 + 1;
            f = f7;
        }
        return fHypot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(float f, long j, C7173vM c7173vM, View view) {
        boolean zE;
        boolean z;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        Ae2.d dVar = null;
        float fA = a(f, null);
        int i = this.E;
        if (i != -1) {
            float f8 = 1.0f / i;
            float fFloor = ((float) Math.floor(fA / f8)) * f8;
            float f9 = (fA % f8) / f8;
            if (!Float.isNaN(this.F)) {
                f9 = (f9 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            fA = ((interpolator != null ? interpolator.getInterpolation(f9) : ((double) f9) > 0.5d ? 1.0f : 0.0f) * f8) + fFloor;
        }
        HashMap<String, AbstractC6604se2> map = this.y;
        if (map != null) {
            Iterator<AbstractC6604se2> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().d(view, fA);
            }
        }
        HashMap<String, Ae2> map2 = this.x;
        if (map2 != null) {
            Ae2.d dVar2 = null;
            zE = false;
            for (Ae2 ae2 : map2.values()) {
                if (ae2 instanceof Ae2.d) {
                    dVar2 = (Ae2.d) ae2;
                } else {
                    zE |= ae2.e(fA, j, c7173vM, view);
                }
            }
            dVar = dVar2;
        } else {
            zE = false;
        }
        AbstractC4198hR[] abstractC4198hRArr = this.j;
        C6473s11 c6473s11 = this.f;
        if (abstractC4198hRArr != null) {
            double d = fA;
            abstractC4198hRArr[0].c(d, this.p);
            this.j[0].e(d, this.q);
            C3422dj c3422dj = this.k;
            if (c3422dj != null) {
                double[] dArr = this.p;
                f2 = 1.0f;
                if (dArr.length > 0) {
                    c3422dj.c(d, dArr);
                    this.k.e(d, this.q);
                }
            } else {
                f2 = 1.0f;
            }
            if (this.H) {
                zE = zE;
                d = d;
                f3 = 2.0f;
            } else {
                int[] iArr = this.o;
                double[] dArr2 = this.p;
                f3 = 2.0f;
                double[] dArr3 = this.q;
                boolean z2 = this.d;
                float f10 = c6473s11.i;
                float f11 = c6473s11.j;
                float f12 = c6473s11.k;
                int i2 = 1;
                float f13 = c6473s11.l;
                if (iArr.length != 0) {
                    f4 = f11;
                    if (c6473s11.t.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        c6473s11.t = new double[i3];
                        c6473s11.u = new double[i3];
                    }
                } else {
                    f4 = f11;
                }
                Arrays.fill(c6473s11.t, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = c6473s11.t;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    c6473s11.u[i5] = dArr3[i4];
                }
                float f14 = Float.NaN;
                int i6 = 0;
                float f15 = f4;
                float f16 = f12;
                float f17 = 0.0f;
                float f18 = 0.0f;
                float f19 = 0.0f;
                float f20 = 0.0f;
                while (true) {
                    double[] dArr5 = c6473s11.t;
                    f5 = f13;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        f7 = f10;
                    } else {
                        f7 = f10;
                        float f21 = (float) (Double.isNaN(c6473s11.t[i6]) ? 0.0d : c6473s11.t[i6] + 0.0d);
                        float f22 = (float) c6473s11.u[i6];
                        if (i6 == i2) {
                            f18 = f22;
                            f13 = f5;
                            f10 = f21;
                        } else if (i6 == 2) {
                            f17 = f22;
                            f10 = f7;
                            f13 = f5;
                            f15 = f21;
                        } else if (i6 == 3) {
                            f19 = f22;
                            f10 = f7;
                            f13 = f5;
                            f16 = f21;
                        } else if (i6 == 4) {
                            f20 = f22;
                            f10 = f7;
                            f13 = f21;
                        } else if (i6 == 5) {
                            f10 = f7;
                            f13 = f5;
                            f14 = f21;
                        }
                        i6++;
                        i2 = 1;
                    }
                    f10 = f7;
                    f13 = f5;
                    i6++;
                    i2 = 1;
                }
                float f23 = f10;
                C5214m11 c5214m11 = c6473s11.q;
                if (c5214m11 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    c5214m11.b(d, fArr, fArr2);
                    float f24 = fArr[0];
                    float f25 = fArr[1];
                    float f26 = fArr2[0];
                    float f27 = fArr2[1];
                    double d2 = f24;
                    double d3 = f23;
                    double d4 = f15;
                    float fSin = (float) (((Math.sin(d4) * d3) + d2) - ((double) (f16 / 2.0f)));
                    float fCos = (float) ((((double) f25) - (Math.cos(d4) * d3)) - ((double) (f5 / 2.0f)));
                    double d5 = f18;
                    double dSin = Math.sin(d4) * d5;
                    double dCos = Math.cos(d4) * d3;
                    double d6 = f17;
                    float f28 = (float) ((dCos * d6) + dSin + ((double) f26));
                    float fSin2 = (float) ((Math.sin(d4) * d3 * d6) + (((double) f27) - (Math.cos(d4) * d5)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = f28;
                        dArr3[1] = fSin2;
                    }
                    if (!Float.isNaN(f14)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, f28)) + ((double) f14)));
                    }
                    f6 = fSin;
                    f15 = fCos;
                } else {
                    if (!Float.isNaN(f14)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2((f20 / 2.0f) + f17, (f19 / 2.0f) + f18)) + ((double) f14) + ((double) 0.0f)));
                    }
                    f6 = f23;
                }
                if (view instanceof InterfaceC4246hf0) {
                    ((InterfaceC4246hf0) view).a();
                } else {
                    float f29 = f6 + 0.5f;
                    int i7 = (int) f29;
                    float f30 = f15 + 0.5f;
                    int i8 = (int) f30;
                    int i9 = (int) (f29 + f16);
                    int i10 = (int) (f30 + f5);
                    int i11 = i9 - i7;
                    int i12 = i10 - i8;
                    if (i11 != view.getMeasuredWidth() || i12 != view.getMeasuredHeight() || z2) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    }
                    view.layout(i7, i8, i9, i10);
                }
                this.d = false;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View) view.getParent()).findViewById(this.C);
                }
                View view2 = this.D;
                if (view2 != null) {
                    float bottom = (this.D.getBottom() + view2.getTop()) / f3;
                    float right = (this.D.getRight() + this.D.getLeft()) / f3;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left = right - view.getLeft();
                        float top = bottom - view.getTop();
                        view.setPivotX(left);
                        view.setPivotY(top);
                    }
                }
            }
            HashMap<String, AbstractC6604se2> map3 = this.y;
            if (map3 != null) {
                for (AbstractC6604se2 abstractC6604se2 : map3.values()) {
                    if (abstractC6604se2 instanceof AbstractC6604se2.d) {
                        double[] dArr6 = this.q;
                        if (dArr6.length > 1) {
                            view.setRotation(((AbstractC6604se2.d) abstractC6604se2).a(fA) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (dVar != 0) {
                double[] dArr7 = this.q;
                double d7 = dArr7[0];
                double d8 = dArr7[1];
                Ae2.d dVar3 = dVar;
                view.setRotation(dVar3.d(fA, j, c7173vM, view) + ((float) Math.toDegrees(Math.atan2(d8, d7))));
                z = zE | dVar3.h;
            } else {
                z = zE;
            }
            int i13 = 1;
            while (true) {
                AbstractC4198hR[] abstractC4198hRArr2 = this.j;
                if (i13 >= abstractC4198hRArr2.length) {
                    break;
                }
                AbstractC4198hR abstractC4198hR = abstractC4198hRArr2[i13];
                float[] fArr3 = this.t;
                abstractC4198hR.d(d, fArr3);
                C7609xR.b(c6473s11.r.get(this.r[i13 - 1]), view, fArr3);
                i13++;
            }
            C4791k11 c4791k11 = this.h;
            if (c4791k11.e == 0) {
                if (fA <= 0.0f) {
                    view.setVisibility(c4791k11.g);
                } else {
                    C4791k11 c4791k12 = this.i;
                    if (fA >= f2) {
                        view.setVisibility(c4791k12.g);
                    } else if (c4791k12.g != c4791k11.g) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i14 = 0;
                while (true) {
                    C6748tK0[] c6748tK0Arr = this.A;
                    if (i14 >= c6748tK0Arr.length) {
                        break;
                    }
                    c6748tK0Arr[i14].g(view, fA);
                    i14++;
                }
            }
        } else {
            boolean z3 = zE;
            float f31 = c6473s11.i;
            C6473s11 c6473s12 = this.g;
            float fA2 = BX.a(c6473s12.i, f31, fA, f31);
            float f32 = c6473s11.j;
            float fA3 = BX.a(c6473s12.j, f32, fA, f32);
            float f33 = c6473s11.k;
            float f34 = c6473s12.k;
            float fA4 = BX.a(f34, f33, fA, f33);
            float f35 = c6473s11.l;
            float f36 = c6473s12.l;
            float f37 = fA2 + 0.5f;
            int i15 = (int) f37;
            float f38 = fA3 + 0.5f;
            int i16 = (int) f38;
            int i17 = (int) (f37 + fA4);
            int iA = (int) (f38 + BX.a(f36, f35, fA, f35));
            int i18 = i17 - i15;
            int i19 = iA - i16;
            if (f34 != f33 || f36 != f35 || this.d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.d = false;
            }
            view.layout(i15, i16, i17, iA);
            z = z3;
        }
        HashMap<String, Zd2> map4 = this.z;
        if (map4 != null) {
            for (Zd2 zd2 : map4.values()) {
                if (zd2 instanceof Zd2.d) {
                    double[] dArr8 = this.q;
                    view.setRotation(((Zd2.d) zd2).a(fA) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    zd2.d(view, fA);
                }
            }
        }
        return z;
    }

    public final void e(C6473s11 c6473s11) {
        c6473s11.i((int) this.b.getX(), (int) this.b.getY(), this.b.getWidth(), this.b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:221:0x0689  */
    /* JADX WARN: Code duplicated, block: B:360:0x0a2a  */
    /* JADX WARN: Code duplicated, block: B:432:0x0b55  */
    /* JADX WARN: Code duplicated, block: B:607:0x1057 A[PHI: r5 r8
      0x1057: PHI (r5v41 java.lang.String) = (r5v38 java.lang.String), (r5v39 java.lang.String), (r5v40 java.lang.String), (r5v42 java.lang.String) binds: [B:606:0x1055, B:602:0x103a, B:598:0x101f, B:594:0x100d] A[DONT_GENERATE, DONT_INLINE]
      0x1057: PHI (r8v17 java.lang.String) = (r8v14 java.lang.String), (r8v15 java.lang.String), (r8v16 java.lang.String), (r8v18 java.lang.String) binds: [B:606:0x1055, B:602:0x103a, B:598:0x101f, B:594:0x100d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:635:0x110d A[PHI: r5 r6 r7 r8 r9 r11 r14 r15
      0x110d: PHI (r5v32 java.lang.String) = (r5v31 java.lang.String), (r5v33 java.lang.String) binds: [B:634:0x110b, B:630:0x10f1] A[DONT_GENERATE, DONT_INLINE]
      0x110d: PHI (r6v10 java.lang.String) = (r6v9 java.lang.String), (r6v11 java.lang.String) binds: [B:634:0x110b, B:630:0x10f1] A[DONT_GENERATE, DONT_INLINE]
      0x110d: PHI (r7v18 java.lang.Object) = (r7v17 java.lang.Object), (r7v19 java.lang.Object) binds: [B:634:0x110b, B:630:0x10f1] A[DONT_GENERATE, DONT_INLINE]
      0x110d: PHI (r8v8 java.lang.String) = (r8v7 java.lang.String), (r8v9 java.lang.String) binds: [B:634:0x110b, B:630:0x10f1] A[DONT_GENERATE, DONT_INLINE]
      0x110d: PHI (r9v5 java.lang.String) = (r9v4 java.lang.String), (r9v6 java.lang.String) binds: [B:634:0x110b, B:630:0x10f1] A[DONT_GENERATE, DONT_INLINE]
      0x110d: PHI (r11v11 java.lang.String) = (r11v10 java.lang.String), (r11v12 java.lang.String) binds: [B:634:0x110b, B:630:0x10f1] A[DONT_GENERATE, DONT_INLINE]
      0x110d: PHI (r14v3 java.lang.String) = (r14v2 java.lang.String), (r14v4 java.lang.String) binds: [B:634:0x110b, B:630:0x10f1] A[DONT_GENERATE, DONT_INLINE]
      0x110d: PHI (r15v3 java.lang.String) = (r15v2 java.lang.String), (r15v4 java.lang.String) binds: [B:634:0x110b, B:630:0x10f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:655:0x1198  */
    /* JADX WARN: Code duplicated, block: B:657:0x11b0  */
    /* JADX WARN: Failed to find 'out' block for switch in B:412:0x0ada. Please report as an issue. */
    public final void g(int i, int i2, long j) {
        String str;
        String str2;
        ArrayList arrayList;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        ArrayList<C6473s11> arrayList2;
        C6473s11 c6473s11;
        C6473s11 c6473s12;
        HashSet<String> hashSet3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        C6473s11[] c6473s11Arr;
        byte b;
        byte b2;
        byte b3;
        Zd2 iVar;
        Zd2 bVar;
        Zd2 gVar;
        String str11;
        int i3;
        a aVar;
        HashSet<String> hashSet4;
        Iterator<String> it;
        HashMap<String, Integer> map;
        String str12;
        String str13;
        String str14;
        byte b4;
        byte b5;
        AbstractC2742aZ1 gVar2;
        AbstractC2742aZ1 abstractC2742aZ1;
        AbstractC2742aZ1 iVar2;
        Ae2.b bVar2;
        AbstractC2742aZ1 abstractC2742aZ2;
        a aVar2;
        Integer num;
        HashSet<String> hashSet5;
        ArrayList<C6473s11> arrayList3;
        HashSet<String> hashSet6;
        Iterator<String> it2;
        HashSet<String> hashSet7;
        C6473s11 c6473s13;
        C6473s11 c6473s14;
        Object obj;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        byte b6;
        byte b7;
        DO1 kVar;
        DO1 iVar3;
        a aVar3;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        C6473s11 c6473s15;
        HashSet<String> hashSet8;
        HashSet<String> hashSet9;
        HashMap<String, Integer> map2;
        float fMin;
        float fA;
        String str27 = "translationY";
        String str28 = "translationX";
        String str29 = "scaleY";
        String str30 = "scaleX";
        String str31 = "rotationY";
        String str32 = "progress";
        String str33 = "rotation";
        String str34 = "elevation";
        String str35 = "alpha";
        new HashSet();
        HashSet<String> hashSet10 = new HashSet<>();
        HashSet<String> hashSet11 = new HashSet<>();
        HashSet<String> hashSet12 = new HashSet<>();
        HashSet<String> hashSet13 = hashSet10;
        HashMap<String, Integer> map3 = new HashMap<>();
        int i4 = this.B;
        HashSet<String> hashSet14 = hashSet12;
        C6473s11 c6473s16 = this.f;
        if (i4 != -1) {
            c6473s16.n = i4;
        }
        C4791k11 c4791k11 = this.h;
        float f = c4791k11.d;
        C6473s11 c6473s17 = c6473s16;
        C4791k11 c4791k12 = this.i;
        if (C4791k11.e(f, c4791k12.d)) {
            hashSet11.add("alpha");
        }
        if (C4791k11.e(c4791k11.h, c4791k12.h)) {
            hashSet11.add("elevation");
        }
        int i5 = c4791k11.g;
        int i6 = c4791k12.g;
        if (i5 != i6 && c4791k11.e == 0 && (i5 == 0 || i6 == 0)) {
            hashSet11.add("alpha");
        }
        if (C4791k11.e(c4791k11.i, c4791k12.i)) {
            hashSet11.add("rotation");
        }
        if (!Float.isNaN(c4791k11.s) || !Float.isNaN(c4791k12.s)) {
            hashSet11.add("transitionPathRotate");
        }
        if (!Float.isNaN(c4791k11.t) || !Float.isNaN(c4791k12.t)) {
            hashSet11.add("progress");
        }
        if (C4791k11.e(c4791k11.j, c4791k12.j)) {
            hashSet11.add("rotationX");
        }
        if (C4791k11.e(c4791k11.k, c4791k12.k)) {
            hashSet11.add("rotationY");
        }
        if (C4791k11.e(c4791k11.n, c4791k12.n)) {
            hashSet11.add("transformPivotX");
        }
        if (C4791k11.e(c4791k11.o, c4791k12.o)) {
            hashSet11.add("transformPivotY");
        }
        if (C4791k11.e(c4791k11.l, c4791k12.l)) {
            hashSet11.add("scaleX");
        }
        if (C4791k11.e(c4791k11.m, c4791k12.m)) {
            hashSet11.add("scaleY");
        }
        if (C4791k11.e(c4791k11.p, c4791k12.p)) {
            hashSet11.add("translationX");
        }
        if (C4791k11.e(c4791k11.q, c4791k12.q)) {
            hashSet11.add("translationY");
        }
        if (C4791k11.e(c4791k11.r, c4791k12.r)) {
            str = "translationZ";
            hashSet11.add(str);
        } else {
            str = "translationZ";
        }
        ArrayList<AbstractC3339dK0> arrayList4 = this.w;
        C6473s11 c6473s18 = this.g;
        ArrayList<C6473s11> arrayList5 = this.u;
        Object obj2 = "rotationX";
        if (arrayList4 != null) {
            ArrayList arrayList6 = null;
            for (AbstractC3339dK0 abstractC3339dK0 : arrayList4) {
                String str36 = str31;
                if (abstractC3339dK0 instanceof C5909pK0) {
                    C5909pK0 c5909pK0 = (C5909pK0) abstractC3339dK0;
                    C6473s11 c6473s19 = new C6473s11();
                    str23 = str28;
                    c6473s19.e = 0;
                    c6473s19.m = Float.NaN;
                    c6473s19.n = -1;
                    c6473s19.o = -1;
                    c6473s19.p = Float.NaN;
                    c6473s19.q = null;
                    c6473s19.r = new LinkedHashMap<>();
                    c6473s19.s = 0;
                    str22 = str27;
                    c6473s19.t = new double[18];
                    c6473s19.u = new double[18];
                    c6473s15 = c6473s17;
                    str21 = str;
                    if (c6473s15.o != -1) {
                        float f2 = c5909pK0.a / 100.0f;
                        c6473s19.g = f2;
                        c6473s19.e = c5909pK0.h;
                        c6473s19.s = c5909pK0.o;
                        float f3 = Float.isNaN(c5909pK0.i) ? f2 : c5909pK0.i;
                        str26 = str32;
                        float f4 = Float.isNaN(c5909pK0.j) ? f2 : c5909pK0.j;
                        str25 = str30;
                        float f5 = c6473s18.k;
                        float f6 = c6473s15.k;
                        float f7 = f5 - f6;
                        float f8 = c6473s18.l;
                        float f9 = c6473s15.l;
                        c6473s19.h = c6473s19.g;
                        c6473s19.k = (int) ((f7 * f3) + f6);
                        c6473s19.l = (int) (((f8 - f9) * f4) + f9);
                        int i7 = c5909pK0.o;
                        str24 = str29;
                        if (i7 == 1) {
                            float f10 = Float.isNaN(c5909pK0.k) ? f2 : c5909pK0.k;
                            float f11 = c6473s18.i;
                            float f12 = c6473s15.i;
                            c6473s19.i = BX.a(f11, f12, f10, f12);
                            if (!Float.isNaN(c5909pK0.l)) {
                                f2 = c5909pK0.l;
                            }
                            float f13 = c6473s18.j;
                            float f14 = c6473s15.j;
                            c6473s19.j = BX.a(f13, f14, f2, f14);
                        } else if (i7 != 2) {
                            float f15 = Float.isNaN(c5909pK0.k) ? f2 : c5909pK0.k;
                            float f16 = c6473s18.i;
                            float f17 = c6473s15.i;
                            c6473s19.i = BX.a(f16, f17, f15, f17);
                            if (!Float.isNaN(c5909pK0.l)) {
                                f2 = c5909pK0.l;
                            }
                            float f18 = c6473s18.j;
                            float f19 = c6473s15.j;
                            c6473s19.j = BX.a(f18, f19, f2, f19);
                        } else {
                            if (Float.isNaN(c5909pK0.k)) {
                                float f20 = c6473s18.i;
                                float f21 = c6473s15.i;
                                fMin = BX.a(f20, f21, f2, f21);
                            } else {
                                fMin = Math.min(f4, f3) * c5909pK0.k;
                            }
                            c6473s19.i = fMin;
                            if (Float.isNaN(c5909pK0.l)) {
                                float f22 = c6473s18.j;
                                float f23 = c6473s15.j;
                                fA = BX.a(f22, f23, f2, f23);
                            } else {
                                fA = c5909pK0.l;
                            }
                            c6473s19.j = fA;
                        }
                        c6473s19.o = c6473s15.o;
                        c6473s19.d = C3079c50.c(c5909pK0.f);
                        c6473s19.n = c5909pK0.g;
                    } else {
                        str24 = str29;
                        str25 = str30;
                        str26 = str32;
                        int i8 = c5909pK0.o;
                        if (i8 == 1) {
                            float f24 = c5909pK0.a / 100.0f;
                            c6473s19.g = f24;
                            c6473s19.e = c5909pK0.h;
                            float f25 = Float.isNaN(c5909pK0.i) ? f24 : c5909pK0.i;
                            float f26 = Float.isNaN(c5909pK0.j) ? f24 : c5909pK0.j;
                            float f27 = c6473s18.k - c6473s15.k;
                            float f28 = c6473s18.l - c6473s15.l;
                            c6473s19.h = c6473s19.g;
                            if (!Float.isNaN(c5909pK0.k)) {
                                f24 = c5909pK0.k;
                            }
                            float f29 = c6473s15.i;
                            float f30 = c6473s15.k;
                            float f31 = (f30 / 2.0f) + f29;
                            float f32 = c6473s15.j;
                            float f33 = c6473s15.l;
                            float f34 = ((c6473s18.k / 2.0f) + c6473s18.i) - f31;
                            float f35 = ((c6473s18.l / 2.0f) + c6473s18.j) - ((f33 / 2.0f) + f32);
                            float f36 = f34 * f24;
                            float f37 = f25 * f27;
                            float f38 = f37 / 2.0f;
                            c6473s19.i = (int) ((f29 + f36) - f38);
                            float f39 = f24 * f35;
                            float f40 = f26 * f28;
                            float f41 = f40 / 2.0f;
                            c6473s19.j = (int) ((f32 + f39) - f41);
                            c6473s19.k = (int) (f30 + f37);
                            c6473s19.l = (int) (f33 + f40);
                            float f42 = Float.isNaN(c5909pK0.l) ? 0.0f : c5909pK0.l;
                            float f43 = (-f35) * f42;
                            float f44 = f34 * f42;
                            c6473s19.s = 1;
                            float f45 = (int) ((c6473s15.i + f36) - f38);
                            float f46 = (int) ((c6473s15.j + f39) - f41);
                            c6473s19.i = f45 + f43;
                            c6473s19.j = f46 + f44;
                            c6473s19.o = c6473s19.o;
                            c6473s19.d = C3079c50.c(c5909pK0.f);
                            c6473s19.n = c5909pK0.g;
                        } else if (i8 != 2) {
                            float f47 = c5909pK0.a / 100.0f;
                            c6473s19.g = f47;
                            c6473s19.e = c5909pK0.h;
                            float f48 = Float.isNaN(c5909pK0.i) ? f47 : c5909pK0.i;
                            float f49 = Float.isNaN(c5909pK0.j) ? f47 : c5909pK0.j;
                            float f50 = c6473s18.k;
                            float f51 = c6473s15.k;
                            float f52 = f50 - f51;
                            float f53 = c6473s18.l;
                            float f54 = c6473s15.l;
                            float f55 = f53 - f54;
                            c6473s19.h = c6473s19.g;
                            float f56 = c6473s15.i;
                            float f57 = (f51 / 2.0f) + f56;
                            float f58 = c6473s15.j;
                            float f59 = ((f50 / 2.0f) + c6473s18.i) - f57;
                            float f60 = ((f53 / 2.0f) + c6473s18.j) - ((f54 / 2.0f) + f58);
                            float f61 = f52 * f48;
                            float f62 = f61 / 2.0f;
                            c6473s19.i = (int) (((f59 * f47) + f56) - f62);
                            float f63 = f55 * f49;
                            float f64 = f63 / 2.0f;
                            c6473s19.j = (int) (((f60 * f47) + f58) - f64);
                            c6473s19.k = (int) (f51 + f61);
                            c6473s19.l = (int) (f54 + f63);
                            float f65 = Float.isNaN(c5909pK0.k) ? f47 : c5909pK0.k;
                            float f66 = Float.isNaN(c5909pK0.n) ? 0.0f : c5909pK0.n;
                            float f67 = f65;
                            float f68 = Float.isNaN(c5909pK0.l) ? f47 : c5909pK0.l;
                            float f69 = Float.isNaN(c5909pK0.m) ? 0.0f : c5909pK0.m;
                            c6473s19.s = 0;
                            c6473s19.i = (int) (((f69 * f60) + ((f67 * f59) + c6473s15.i)) - f62);
                            c6473s19.j = (int) (((f60 * f68) + ((f59 * f66) + c6473s15.j)) - f64);
                            c6473s19.d = C3079c50.c(c5909pK0.f);
                            c6473s19.n = c5909pK0.g;
                        } else {
                            float f70 = c5909pK0.a / 100.0f;
                            c6473s19.g = f70;
                            c6473s19.e = c5909pK0.h;
                            float f71 = Float.isNaN(c5909pK0.i) ? f70 : c5909pK0.i;
                            float f72 = Float.isNaN(c5909pK0.j) ? f70 : c5909pK0.j;
                            float f73 = c6473s18.k;
                            float f74 = c6473s15.k;
                            float f75 = f73 - f74;
                            float f76 = c6473s18.l;
                            float f77 = c6473s15.l;
                            float f78 = f76 - f77;
                            c6473s19.h = c6473s19.g;
                            float f79 = c6473s15.i;
                            float f80 = (f74 / 2.0f) + f79;
                            float f81 = c6473s15.j;
                            float f82 = (f73 / 2.0f) + c6473s18.i;
                            float f83 = ((f76 / 2.0f) + c6473s18.j) - ((f77 / 2.0f) + f81);
                            float f84 = f75 * f71;
                            c6473s19.i = (int) ((((f82 - f80) * f70) + f79) - (f84 / 2.0f));
                            float f85 = f78 * f72;
                            c6473s19.j = (int) (((f83 * f70) + f81) - (f85 / 2.0f));
                            c6473s19.k = (int) (f74 + f84);
                            c6473s19.l = (int) (f77 + f85);
                            c6473s19.s = 2;
                            if (!Float.isNaN(c5909pK0.k)) {
                                c6473s19.i = (int) (c5909pK0.k * ((int) (i - c6473s19.k)));
                            }
                            if (!Float.isNaN(c5909pK0.l)) {
                                c6473s19.j = (int) (c5909pK0.l * ((int) (i2 - c6473s19.l)));
                            }
                            c6473s19.o = c6473s19.o;
                            c6473s19.d = C3079c50.c(c5909pK0.f);
                            c6473s19.n = c5909pK0.g;
                        }
                    }
                    int iBinarySearch = Collections.binarySearch(arrayList5, c6473s19);
                    if (iBinarySearch == 0) {
                        b0.c("MotionController", " KeyPath position \"" + c6473s19.h + "\" outside of range");
                    }
                    arrayList5.add((-iBinarySearch) - 1, c6473s19);
                    int i9 = c5909pK0.e;
                    if (i9 != -1) {
                        this.e = i9;
                    }
                    hashSet9 = hashSet13;
                    map2 = map3;
                    hashSet8 = hashSet14;
                } else {
                    str21 = str;
                    str22 = str27;
                    str23 = str28;
                    str24 = str29;
                    str25 = str30;
                    str26 = str32;
                    c6473s15 = c6473s17;
                    if (abstractC3339dK0 instanceof C3758fK0) {
                        hashSet8 = hashSet14;
                        abstractC3339dK0.d(hashSet8);
                        hashSet9 = hashSet13;
                    } else {
                        hashSet8 = hashSet14;
                        if (abstractC3339dK0 instanceof C6538sK0) {
                            hashSet9 = hashSet13;
                            abstractC3339dK0.d(hashSet9);
                        } else {
                            hashSet9 = hashSet13;
                            if (abstractC3339dK0 instanceof C6748tK0) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                ArrayList arrayList7 = arrayList6;
                                arrayList7.add((C6748tK0) abstractC3339dK0);
                                arrayList6 = arrayList7;
                            } else {
                                map2 = map3;
                                abstractC3339dK0.f(map2);
                                abstractC3339dK0.d(hashSet11);
                            }
                        }
                    }
                    map2 = map3;
                }
                hashSet14 = hashSet8;
                c6473s17 = c6473s15;
                hashSet13 = hashSet9;
                map3 = map2;
                str31 = str36;
                str28 = str23;
                str27 = str22;
                str = str21;
                str32 = str26;
                str30 = str25;
                str29 = str24;
            }
            str2 = str30;
            arrayList = arrayList6;
        } else {
            str2 = "scaleX";
            arrayList = null;
        }
        String str37 = str;
        String str38 = str27;
        String str39 = str28;
        String str40 = str29;
        String str41 = str31;
        String str42 = str32;
        HashSet<String> hashSet15 = hashSet13;
        HashMap<String, Integer> map4 = map3;
        HashSet<String> hashSet16 = hashSet14;
        C6473s11 c6473s110 = c6473s17;
        if (arrayList != null) {
            this.A = (C6748tK0[]) arrayList.toArray(new C6748tK0[0]);
        }
        String str43 = "CUSTOM,";
        String str44 = ",";
        if (hashSet11.isEmpty()) {
            hashSet = hashSet16;
            hashSet2 = hashSet11;
            arrayList2 = arrayList5;
            c6473s11 = c6473s18;
            c6473s12 = c6473s110;
            hashSet3 = hashSet15;
            str3 = str38;
            str4 = str37;
            str5 = str42;
            str6 = str2;
            str7 = str40;
        } else {
            this.y = new HashMap<>();
            Iterator<String> it3 = hashSet11.iterator();
            while (it3.hasNext()) {
                String next = it3.next();
                if (!next.startsWith("CUSTOM,")) {
                    hashSet5 = hashSet16;
                    arrayList3 = arrayList5;
                    hashSet6 = hashSet15;
                    it2 = it3;
                    switch (next.hashCode()) {
                        case -1249320806:
                            hashSet7 = hashSet11;
                            c6473s13 = c6473s18;
                            c6473s14 = c6473s110;
                            obj = obj2;
                            str15 = str39;
                            str16 = str38;
                            str17 = str37;
                            str18 = str42;
                            str19 = str2;
                            str20 = str40;
                            b6 = next.equals(obj) ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            hashSet7 = hashSet11;
                            c6473s13 = c6473s18;
                            c6473s14 = c6473s110;
                            String str45 = str41;
                            str15 = str39;
                            str16 = str38;
                            str17 = str37;
                            str18 = str42;
                            str19 = str2;
                            str20 = str40;
                            if (next.equals(str45)) {
                                str41 = str45;
                                obj = obj2;
                                b6 = 1;
                            } else {
                                str41 = str45;
                                obj = obj2;
                            }
                            break;
                        case -1225497657:
                            hashSet7 = hashSet11;
                            c6473s14 = c6473s110;
                            str15 = str39;
                            str16 = str38;
                            str17 = str37;
                            str18 = str42;
                            str19 = str2;
                            str20 = str40;
                            if (next.equals(str15)) {
                                c6473s13 = c6473s18;
                                obj = obj2;
                                b6 = 2;
                            } else {
                                c6473s13 = c6473s18;
                                obj = obj2;
                            }
                            break;
                        case -1225497656:
                            hashSet7 = hashSet11;
                            str16 = str38;
                            str17 = str37;
                            str18 = str42;
                            str19 = str2;
                            str20 = str40;
                            c6473s13 = c6473s18;
                            if (next.equals(str16)) {
                                c6473s14 = c6473s110;
                                obj = obj2;
                                str15 = str39;
                                b6 = 3;
                            } else {
                                c6473s14 = c6473s110;
                                obj = obj2;
                                str15 = str39;
                            }
                            break;
                        case -1225497655:
                            str17 = str37;
                            str18 = str42;
                            str19 = str2;
                            str20 = str40;
                            if (next.equals(str17)) {
                                hashSet7 = hashSet11;
                                c6473s13 = c6473s18;
                                c6473s14 = c6473s110;
                                obj = obj2;
                                str15 = str39;
                                str16 = str38;
                                b6 = 4;
                            } else {
                                hashSet7 = hashSet11;
                                c6473s13 = c6473s18;
                                c6473s14 = c6473s110;
                                obj = obj2;
                                str15 = str39;
                                str16 = str38;
                            }
                            break;
                        case -1001078227:
                            str18 = str42;
                            str19 = str2;
                            str20 = str40;
                            hashSet7 = hashSet11;
                            c6473s13 = c6473s18;
                            c6473s14 = c6473s110;
                            obj = obj2;
                            str15 = str39;
                            str16 = str38;
                            if (next.equals(str18)) {
                                str17 = str37;
                                b6 = 5;
                            } else {
                                str17 = str37;
                            }
                            break;
                        case -908189618:
                            str19 = str2;
                            str20 = str40;
                            hashSet7 = hashSet11;
                            c6473s13 = c6473s18;
                            c6473s14 = c6473s110;
                            obj = obj2;
                            str15 = str39;
                            str16 = str38;
                            str17 = str37;
                            if (next.equals(str19)) {
                                str18 = str42;
                                b6 = 6;
                            } else {
                                str18 = str42;
                            }
                            break;
                        case -908189617:
                            str20 = str40;
                            hashSet7 = hashSet11;
                            c6473s13 = c6473s18;
                            c6473s14 = c6473s110;
                            obj = obj2;
                            str15 = str39;
                            str16 = str38;
                            str17 = str37;
                            str18 = str42;
                            if (next.equals(str20)) {
                                str19 = str2;
                                b6 = 7;
                            } else {
                                str19 = str2;
                            }
                            break;
                        case -797520672:
                            if (next.equals("waveVariesBy")) {
                                hashSet7 = hashSet11;
                                c6473s13 = c6473s18;
                                c6473s14 = c6473s110;
                                obj = obj2;
                                str15 = str39;
                                str16 = str38;
                                str17 = str37;
                                str18 = str42;
                                str19 = str2;
                                str20 = str40;
                                b6 = 8;
                            } else {
                                hashSet7 = hashSet11;
                                c6473s13 = c6473s18;
                                c6473s14 = c6473s110;
                                obj = obj2;
                                str15 = str39;
                                str16 = str38;
                                str17 = str37;
                                str18 = str42;
                                str19 = str2;
                                str20 = str40;
                            }
                            break;
                        case -760884510:
                            if (next.equals("transformPivotX")) {
                                b7 = 9;
                                hashSet7 = hashSet11;
                                c6473s13 = c6473s18;
                                c6473s14 = c6473s110;
                                obj = obj2;
                                str15 = str39;
                                str16 = str38;
                                str17 = str37;
                                str18 = str42;
                                str19 = str2;
                                b6 = b7;
                                str20 = str40;
                            }
                            hashSet7 = hashSet11;
                            c6473s13 = c6473s18;
                            c6473s14 = c6473s110;
                            obj = obj2;
                            str15 = str39;
                            str16 = str38;
                            str17 = str37;
                            str18 = str42;
                            str19 = str2;
                            str20 = str40;
                            break;
                        case -760884509:
                            if (next.equals("transformPivotY")) {
                                b7 = 10;
                                hashSet7 = hashSet11;
                                c6473s13 = c6473s18;
                                c6473s14 = c6473s110;
                                obj = obj2;
                                str15 = str39;
                                str16 = str38;
                                str17 = str37;
                                str18 = str42;
                                str19 = str2;
                                b6 = b7;
                                str20 = str40;
                            }
                            hashSet7 = hashSet11;
                            c6473s13 = c6473s18;
                            c6473s14 = c6473s110;
                            obj = obj2;
                            str15 = str39;
                            str16 = str38;
                            str17 = str37;
                            str18 = str42;
                            str19 = str2;
                            str20 = str40;
                            break;
                        case -40300674:
                            if (next.equals("rotation")) {
                                b7 = 11;
                                hashSet7 = hashSet11;
                                c6473s13 = c6473s18;
                                c6473s14 = c6473s110;
                                obj = obj2;
                                str15 = str39;
                                str16 = str38;
                                str17 = str37;
                                str18 = str42;
                                str19 = str2;
                                b6 = b7;
                                str20 = str40;
                            }
                            hashSet7 = hashSet11;
                            c6473s13 = c6473s18;
                            c6473s14 = c6473s110;
                            obj = obj2;
                            str15 = str39;
                            str16 = str38;
                            str17 = str37;
                            str18 = str42;
                            str19 = str2;
                            str20 = str40;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                b7 = 12;
                                hashSet7 = hashSet11;
                                c6473s13 = c6473s18;
                                c6473s14 = c6473s110;
                                obj = obj2;
                                str15 = str39;
                                str16 = str38;
                                str17 = str37;
                                str18 = str42;
                                str19 = str2;
                                b6 = b7;
                                str20 = str40;
                            }
                            hashSet7 = hashSet11;
                            c6473s13 = c6473s18;
                            c6473s14 = c6473s110;
                            obj = obj2;
                            str15 = str39;
                            str16 = str38;
                            str17 = str37;
                            str18 = str42;
                            str19 = str2;
                            str20 = str40;
                            break;
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                b7 = 13;
                                hashSet7 = hashSet11;
                                c6473s13 = c6473s18;
                                c6473s14 = c6473s110;
                                obj = obj2;
                                str15 = str39;
                                str16 = str38;
                                str17 = str37;
                                str18 = str42;
                                str19 = str2;
                                b6 = b7;
                                str20 = str40;
                            }
                            hashSet7 = hashSet11;
                            c6473s13 = c6473s18;
                            c6473s14 = c6473s110;
                            obj = obj2;
                            str15 = str39;
                            str16 = str38;
                            str17 = str37;
                            str18 = str42;
                            str19 = str2;
                            str20 = str40;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                b7 = 14;
                                hashSet7 = hashSet11;
                                c6473s13 = c6473s18;
                                c6473s14 = c6473s110;
                                obj = obj2;
                                str15 = str39;
                                str16 = str38;
                                str17 = str37;
                                str18 = str42;
                                str19 = str2;
                                b6 = b7;
                                str20 = str40;
                            }
                            hashSet7 = hashSet11;
                            c6473s13 = c6473s18;
                            c6473s14 = c6473s110;
                            obj = obj2;
                            str15 = str39;
                            str16 = str38;
                            str17 = str37;
                            str18 = str42;
                            str19 = str2;
                            str20 = str40;
                            break;
                        case 156108012:
                            if (next.equals("waveOffset")) {
                                b7 = 15;
                                hashSet7 = hashSet11;
                                c6473s13 = c6473s18;
                                c6473s14 = c6473s110;
                                obj = obj2;
                                str15 = str39;
                                str16 = str38;
                                str17 = str37;
                                str18 = str42;
                                str19 = str2;
                                b6 = b7;
                                str20 = str40;
                            }
                            hashSet7 = hashSet11;
                            c6473s13 = c6473s18;
                            c6473s14 = c6473s110;
                            obj = obj2;
                            str15 = str39;
                            str16 = str38;
                            str17 = str37;
                            str18 = str42;
                            str19 = str2;
                            str20 = str40;
                            break;
                        default:
                            hashSet7 = hashSet11;
                            c6473s13 = c6473s18;
                            c6473s14 = c6473s110;
                            obj = obj2;
                            str15 = str39;
                            str16 = str38;
                            str17 = str37;
                            str18 = str42;
                            str19 = str2;
                            str20 = str40;
                            break;
                    }
                    switch (b6) {
                        case 0:
                            obj2 = obj;
                            str39 = str15;
                            iVar3 = new AbstractC6604se2.i();
                            break;
                        case 1:
                            obj2 = obj;
                            str39 = str15;
                            iVar3 = new AbstractC6604se2.j();
                            break;
                        case 2:
                            obj2 = obj;
                            str39 = str15;
                            iVar3 = new AbstractC6604se2.m();
                            break;
                        case 3:
                            obj2 = obj;
                            str39 = str15;
                            iVar3 = new AbstractC6604se2.n();
                            break;
                        case 4:
                            obj2 = obj;
                            str39 = str15;
                            iVar3 = new AbstractC6604se2.o();
                            break;
                        case 5:
                            obj2 = obj;
                            AbstractC6604se2.g gVar3 = new AbstractC6604se2.g();
                            str39 = str15;
                            gVar3.f = false;
                            iVar3 = gVar3;
                            break;
                        case 6:
                            kVar = new AbstractC6604se2.k();
                            DO1 do1 = kVar;
                            obj2 = obj;
                            iVar3 = do1;
                            str39 = str15;
                            break;
                        case 7:
                            kVar = new AbstractC6604se2.l();
                            DO1 do2 = kVar;
                            obj2 = obj;
                            iVar3 = do2;
                            str39 = str15;
                            break;
                        case 8:
                            kVar = new AbstractC6604se2.a();
                            DO1 do3 = kVar;
                            obj2 = obj;
                            iVar3 = do3;
                            str39 = str15;
                            break;
                        case 9:
                            kVar = new AbstractC6604se2.e();
                            DO1 do4 = kVar;
                            obj2 = obj;
                            iVar3 = do4;
                            str39 = str15;
                            break;
                        case 10:
                            kVar = new AbstractC6604se2.f();
                            DO1 do5 = kVar;
                            obj2 = obj;
                            iVar3 = do5;
                            str39 = str15;
                            break;
                        case 11:
                            kVar = new AbstractC6604se2.h();
                            DO1 do6 = kVar;
                            obj2 = obj;
                            iVar3 = do6;
                            str39 = str15;
                            break;
                        case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            kVar = new AbstractC6604se2.c();
                            DO1 do7 = kVar;
                            obj2 = obj;
                            iVar3 = do7;
                            str39 = str15;
                            break;
                        case 13:
                            kVar = new AbstractC6604se2.d();
                            DO1 do8 = kVar;
                            obj2 = obj;
                            iVar3 = do8;
                            str39 = str15;
                            break;
                        case 14:
                            kVar = new AbstractC6604se2.a();
                            DO1 do9 = kVar;
                            obj2 = obj;
                            iVar3 = do9;
                            str39 = str15;
                            break;
                        case 15:
                            kVar = new AbstractC6604se2.a();
                            DO1 do10 = kVar;
                            obj2 = obj;
                            iVar3 = do10;
                            str39 = str15;
                            break;
                        default:
                            obj2 = obj;
                            str39 = str15;
                            iVar3 = null;
                            break;
                    }
                } else {
                    hashSet5 = hashSet16;
                    SparseArray<a> sparseArray = new SparseArray<>();
                    arrayList3 = arrayList5;
                    String str46 = next.split(",")[1];
                    for (AbstractC3339dK0 abstractC3339dK1 : arrayList4) {
                        HashSet<String> hashSet17 = hashSet15;
                        Iterator<String> it4 = it3;
                        HashMap<String, a> map5 = abstractC3339dK1.d;
                        if (map5 != null && (aVar3 = map5.get(str46)) != null) {
                            sparseArray.append(abstractC3339dK1.a, aVar3);
                        }
                        it3 = it4;
                        hashSet15 = hashSet17;
                    }
                    hashSet6 = hashSet15;
                    it2 = it3;
                    AbstractC6604se2.b bVar3 = new AbstractC6604se2.b();
                    String str47 = next.split(",")[1];
                    bVar3.f = sparseArray;
                    hashSet7 = hashSet11;
                    c6473s13 = c6473s18;
                    c6473s14 = c6473s110;
                    str16 = str38;
                    str17 = str37;
                    str18 = str42;
                    str20 = str40;
                    iVar3 = bVar3;
                    str19 = str2;
                }
                if (iVar3 != null) {
                    iVar3.e = next;
                    this.y.put(next, (AbstractC6604se2) iVar3);
                }
                str40 = str20;
                str38 = str16;
                str2 = str19;
                str42 = str18;
                str37 = str17;
                hashSet11 = hashSet7;
                arrayList5 = arrayList3;
                hashSet16 = hashSet5;
                c6473s110 = c6473s14;
                hashSet15 = hashSet6;
                c6473s18 = c6473s13;
                it3 = it2;
            }
            hashSet = hashSet16;
            hashSet2 = hashSet11;
            arrayList2 = arrayList5;
            c6473s11 = c6473s18;
            c6473s12 = c6473s110;
            hashSet3 = hashSet15;
            str3 = str38;
            str4 = str37;
            str5 = str42;
            str6 = str2;
            str7 = str40;
            if (arrayList4 != null) {
                for (AbstractC3339dK0 abstractC3339dK2 : arrayList4) {
                    if (abstractC3339dK2 instanceof C3548eK0) {
                        abstractC3339dK2.a(this.y);
                    }
                }
            }
            c4791k11.b(this.y, 0);
            c4791k12.b(this.y, 100);
            Iterator<String> it5 = this.y.keySet().iterator();
            while (it5.hasNext()) {
                String next2 = it5.next();
                int iIntValue = (!map4.containsKey(next2) || (num = map4.get(next2)) == null) ? 0 : num.intValue();
                Iterator<String> it6 = it5;
                AbstractC6604se2 abstractC6604se2 = this.y.get(next2);
                if (abstractC6604se2 != null) {
                    abstractC6604se2.c(iIntValue);
                }
                it5 = it6;
            }
        }
        if (hashSet3.isEmpty()) {
            str8 = "CUSTOM,";
            str9 = str41;
            str10 = str39;
        } else {
            if (this.x == null) {
                this.x = new HashMap<>();
            }
            Iterator<String> it7 = hashSet3.iterator();
            while (it7.hasNext()) {
                String next3 = it7.next();
                if (!this.x.containsKey(next3)) {
                    if (next3.startsWith(str43)) {
                        SparseArray<a> sparseArray2 = new SparseArray<>();
                        it = it7;
                        String str48 = next3.split(str44)[1];
                        for (AbstractC3339dK0 abstractC3339dK3 : arrayList4) {
                            String str49 = str43;
                            HashMap<String, Integer> map6 = map4;
                            HashMap<String, a> map7 = abstractC3339dK3.d;
                            if (map7 != null && (aVar2 = map7.get(str48)) != null) {
                                sparseArray2.append(abstractC3339dK3.a, aVar2);
                            }
                            str43 = str49;
                            map4 = map6;
                        }
                        map = map4;
                        str12 = str43;
                        Ae2.b bVar4 = new Ae2.b();
                        bVar4.m = new SparseArray<>();
                        bVar4.k = next3.split(str44)[1];
                        bVar4.l = sparseArray2;
                        bVar2 = bVar4;
                        str13 = str41;
                        str14 = str39;
                    } else {
                        it = it7;
                        map = map4;
                        str12 = str43;
                        switch (next3.hashCode()) {
                            case -1249320806:
                                obj2 = obj2;
                                str13 = str41;
                                str14 = str39;
                                b4 = next3.equals(obj2) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                str13 = str41;
                                str14 = str39;
                                if (next3.equals(str13)) {
                                    obj2 = obj2;
                                    b4 = 1;
                                } else {
                                    obj2 = obj2;
                                }
                                break;
                            case -1225497657:
                                str14 = str39;
                                obj2 = obj2;
                                if (next3.equals(str14)) {
                                    str13 = str41;
                                    b4 = 2;
                                } else {
                                    str13 = str41;
                                }
                                break;
                            case -1225497656:
                                if (next3.equals(str3)) {
                                    b4 = 3;
                                    obj2 = obj2;
                                    str13 = str41;
                                    str14 = str39;
                                }
                                obj2 = obj2;
                                str13 = str41;
                                str14 = str39;
                                break;
                            case -1225497655:
                                if (next3.equals(str4)) {
                                    b4 = 4;
                                    obj2 = obj2;
                                    str13 = str41;
                                    str14 = str39;
                                }
                                obj2 = obj2;
                                str13 = str41;
                                str14 = str39;
                                break;
                            case -1001078227:
                                if (next3.equals(str5)) {
                                    b4 = 5;
                                    obj2 = obj2;
                                    str13 = str41;
                                    str14 = str39;
                                }
                                obj2 = obj2;
                                str13 = str41;
                                str14 = str39;
                                break;
                            case -908189618:
                                if (next3.equals(str6)) {
                                    obj2 = obj2;
                                    str13 = str41;
                                    str14 = str39;
                                    b4 = 6;
                                } else {
                                    obj2 = obj2;
                                    str13 = str41;
                                    str14 = str39;
                                }
                                break;
                            case -908189617:
                                if (next3.equals(str7)) {
                                    obj2 = obj2;
                                    str13 = str41;
                                    str14 = str39;
                                    b4 = 7;
                                } else {
                                    obj2 = obj2;
                                    str13 = str41;
                                    str14 = str39;
                                }
                                break;
                            case -40300674:
                                if (next3.equals("rotation")) {
                                    obj2 = obj2;
                                    str13 = str41;
                                    str14 = str39;
                                    b4 = 8;
                                } else {
                                    obj2 = obj2;
                                    str13 = str41;
                                    str14 = str39;
                                }
                                break;
                            case -4379043:
                                if (next3.equals("elevation")) {
                                    b5 = 9;
                                    b4 = b5;
                                    obj2 = obj2;
                                    str13 = str41;
                                    str14 = str39;
                                }
                                obj2 = obj2;
                                str13 = str41;
                                str14 = str39;
                                break;
                            case 37232917:
                                if (next3.equals("transitionPathRotate")) {
                                    b5 = 10;
                                    b4 = b5;
                                    obj2 = obj2;
                                    str13 = str41;
                                    str14 = str39;
                                }
                                obj2 = obj2;
                                str13 = str41;
                                str14 = str39;
                                break;
                            case 92909918:
                                if (next3.equals("alpha")) {
                                    b5 = 11;
                                    b4 = b5;
                                    obj2 = obj2;
                                    str13 = str41;
                                    str14 = str39;
                                }
                                obj2 = obj2;
                                str13 = str41;
                                str14 = str39;
                                break;
                            default:
                                obj2 = obj2;
                                str13 = str41;
                                str14 = str39;
                                break;
                        }
                        switch (b4) {
                            case 0:
                                gVar2 = new Ae2.g();
                                abstractC2742aZ1 = gVar2;
                                abstractC2742aZ1.i = j;
                                abstractC2742aZ2 = abstractC2742aZ1;
                                break;
                            case 1:
                                gVar2 = new Ae2.h();
                                abstractC2742aZ1 = gVar2;
                                abstractC2742aZ1.i = j;
                                abstractC2742aZ2 = abstractC2742aZ1;
                                break;
                            case 2:
                                gVar2 = new Ae2.k();
                                abstractC2742aZ1 = gVar2;
                                abstractC2742aZ1.i = j;
                                abstractC2742aZ2 = abstractC2742aZ1;
                                break;
                            case 3:
                                gVar2 = new Ae2.l();
                                abstractC2742aZ1 = gVar2;
                                abstractC2742aZ1.i = j;
                                abstractC2742aZ2 = abstractC2742aZ1;
                                break;
                            case 4:
                                gVar2 = new Ae2.m();
                                abstractC2742aZ1 = gVar2;
                                abstractC2742aZ1.i = j;
                                abstractC2742aZ2 = abstractC2742aZ1;
                                break;
                            case 5:
                                Ae2.e eVar = new Ae2.e();
                                eVar.k = false;
                                gVar2 = eVar;
                                abstractC2742aZ1 = gVar2;
                                abstractC2742aZ1.i = j;
                                abstractC2742aZ2 = abstractC2742aZ1;
                                break;
                            case 6:
                                iVar2 = new Ae2.i();
                                str44 = str44;
                                abstractC2742aZ1 = iVar2;
                                abstractC2742aZ1.i = j;
                                abstractC2742aZ2 = abstractC2742aZ1;
                                break;
                            case 7:
                                iVar2 = new Ae2.j();
                                str44 = str44;
                                abstractC2742aZ1 = iVar2;
                                abstractC2742aZ1.i = j;
                                abstractC2742aZ2 = abstractC2742aZ1;
                                break;
                            case 8:
                                iVar2 = new Ae2.f();
                                str44 = str44;
                                abstractC2742aZ1 = iVar2;
                                abstractC2742aZ1.i = j;
                                abstractC2742aZ2 = abstractC2742aZ1;
                                break;
                            case 9:
                                iVar2 = new Ae2.c();
                                str44 = str44;
                                abstractC2742aZ1 = iVar2;
                                abstractC2742aZ1.i = j;
                                abstractC2742aZ2 = abstractC2742aZ1;
                                break;
                            case 10:
                                iVar2 = new Ae2.d();
                                str44 = str44;
                                abstractC2742aZ1 = iVar2;
                                abstractC2742aZ1.i = j;
                                abstractC2742aZ2 = abstractC2742aZ1;
                                break;
                            case 11:
                                iVar2 = new Ae2.a();
                                str44 = str44;
                                abstractC2742aZ1 = iVar2;
                                abstractC2742aZ1.i = j;
                                abstractC2742aZ2 = abstractC2742aZ1;
                                break;
                            default:
                                obj2 = obj2;
                                bVar2 = null;
                                break;
                        }
                        if (abstractC2742aZ2 != null) {
                            abstractC2742aZ2.f = next3;
                            this.x.put(next3, (Ae2) abstractC2742aZ2);
                        }
                        str43 = str12;
                        str39 = str14;
                        str41 = str13;
                        str44 = str44;
                        map4 = map;
                        it7 = it;
                    }
                    abstractC2742aZ2 = bVar2;
                    if (abstractC2742aZ2 != null) {
                        abstractC2742aZ2.f = next3;
                        this.x.put(next3, (Ae2) abstractC2742aZ2);
                    }
                    str43 = str12;
                    str39 = str14;
                    str41 = str13;
                    str44 = str44;
                    map4 = map;
                    it7 = it;
                }
            }
            HashMap<String, Integer> map8 = map4;
            str8 = str43;
            str9 = str41;
            str10 = str39;
            if (arrayList4 != null) {
                for (AbstractC3339dK0 abstractC3339dK4 : arrayList4) {
                    if (abstractC3339dK4 instanceof C6538sK0) {
                        ((C6538sK0) abstractC3339dK4).g(this.x);
                    }
                }
            }
            Iterator<String> it8 = this.x.keySet().iterator();
            while (it8.hasNext()) {
                String next4 = it8.next();
                HashMap<String, Integer> map9 = map8;
                Iterator<String> it9 = it8;
                this.x.get(next4).c(map9.containsKey(next4) ? map9.get(next4).intValue() : 0);
                it8 = it9;
                map8 = map9;
            }
        }
        int size = arrayList2.size();
        int i10 = size + 2;
        C6473s11[] c6473s11Arr2 = new C6473s11[i10];
        c6473s11Arr2[0] = c6473s12;
        c6473s11Arr2[size + 1] = c6473s11;
        if (arrayList2.size() > 0) {
            c6473s11Arr = c6473s11Arr2;
            if (this.e == -1) {
                this.e = 0;
            }
        } else {
            c6473s11Arr = c6473s11Arr2;
        }
        Iterator<C6473s11> it10 = arrayList2.iterator();
        int i11 = 1;
        while (it10.hasNext()) {
            c6473s11Arr[i11] = it10.next();
            i11++;
        }
        HashSet hashSet18 = new HashSet();
        Iterator<String> it11 = c6473s11.r.keySet().iterator();
        while (it11.hasNext()) {
            String next5 = it11.next();
            String str50 = str9;
            Iterator<String> it12 = it11;
            C6473s11 c6473s111 = c6473s12;
            if (c6473s111.r.containsKey(next5)) {
                c6473s12 = c6473s111;
                hashSet4 = hashSet2;
                if (!hashSet4.contains(str8 + next5)) {
                    hashSet18.add(next5);
                }
            } else {
                c6473s12 = c6473s111;
                hashSet4 = hashSet2;
            }
            hashSet2 = hashSet4;
            str9 = str50;
            it11 = it12;
        }
        String str51 = str9;
        String[] strArr = (String[]) hashSet18.toArray(new String[0]);
        this.r = strArr;
        this.s = new int[strArr.length];
        int i12 = 0;
        while (true) {
            String[] strArr2 = this.r;
            if (i12 < strArr2.length) {
                String str52 = strArr2[i12];
                this.s[i12] = 0;
                for (int i13 = 0; i13 < i10; i13++) {
                    if (c6473s11Arr[i13].r.containsKey(str52) && (aVar = c6473s11Arr[i13].r.get(str52)) != null) {
                        int[] iArr = this.s;
                        iArr[i12] = aVar.c() + iArr[i12];
                        i12++;
                    }
                }
                i12++;
            } else {
                boolean z = c6473s11Arr[0].n != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                int i14 = 1;
                while (i14 < i10) {
                    boolean z2 = z;
                    C6473s11 c6473s112 = c6473s11Arr[i14];
                    boolean[] zArr2 = zArr;
                    C6473s11 c6473s113 = c6473s11Arr[i14 - 1];
                    int i15 = i14;
                    String str53 = str10;
                    boolean zE = C6473s11.e(c6473s112.i, c6473s113.i);
                    boolean zE2 = C6473s11.e(c6473s112.j, c6473s113.j);
                    zArr2[0] = zArr2[0] | C6473s11.e(c6473s112.h, c6473s113.h);
                    boolean z3 = zE | zE2 | z2;
                    zArr2[1] = zArr2[1] | z3;
                    zArr2[2] = zArr2[2] | z3;
                    zArr2[3] = zArr2[3] | C6473s11.e(c6473s112.k, c6473s113.k);
                    zArr2[4] = zArr2[4] | C6473s11.e(c6473s112.l, c6473s113.l);
                    i14 = i15 + 1;
                    z = z2;
                    zArr = zArr2;
                    str10 = str53;
                }
                String str54 = str10;
                boolean[] zArr3 = zArr;
                int i16 = 0;
                for (int i17 = 1; i17 < length; i17++) {
                    if (zArr3[i17]) {
                        i16++;
                    }
                }
                this.o = new int[i16];
                int iMax = Math.max(2, i16);
                this.p = new double[iMax];
                this.q = new double[iMax];
                int i18 = 0;
                for (int i19 = 1; i19 < length; i19++) {
                    if (zArr3[i19]) {
                        this.o[i18] = i19;
                        i18++;
                    }
                }
                int[] iArr2 = {i10, this.o.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i10];
                int i20 = 0;
                while (i20 < i10) {
                    C6473s11 c6473s114 = c6473s11Arr[i20];
                    double[] dArr3 = dArr[i20];
                    int i21 = i20;
                    String str55 = str3;
                    float[] fArr = {c6473s114.h, c6473s114.i, c6473s114.j, c6473s114.k, c6473s114.l, c6473s114.m};
                    int i22 = 0;
                    int i23 = 0;
                    for (int[] iArr3 = this.o; i22 < iArr3.length; iArr3 = iArr3) {
                        int i24 = iArr3[i22];
                        int i25 = i22;
                        if (i24 < 6) {
                            dArr3[i23] = fArr[i24];
                            i23++;
                        }
                        i22 = i25 + 1;
                    }
                    dArr2[i21] = c6473s11Arr[i21].g;
                    i20 = i21 + 1;
                    str3 = str55;
                }
                String str56 = str3;
                int i26 = 0;
                while (true) {
                    int[] iArr4 = this.o;
                    if (i26 < iArr4.length) {
                        if (iArr4[i26] < 6) {
                            i3 = i26;
                            String strB = C5807oq.b(new StringBuilder(), C6473s11.v[this.o[i26]], " [");
                            for (int i27 = 0; i27 < i10; i27++) {
                                StringBuilder sbF = C1039Gc0.f(strB);
                                sbF.append(dArr[i27][i3]);
                                strB = sbF.toString();
                            }
                        } else {
                            i3 = i26;
                        }
                        i26 = i3 + 1;
                    } else {
                        this.j = new AbstractC4198hR[this.r.length + 1];
                        int i28 = 0;
                        while (true) {
                            String[] strArr3 = this.r;
                            if (i28 >= strArr3.length) {
                                String str57 = str5;
                                String str58 = str4;
                                String str59 = str33;
                                String str60 = str34;
                                String str61 = str35;
                                this.j[0] = AbstractC4198hR.a(this.e, dArr2, dArr);
                                byte b8 = -1;
                                if (c6473s11Arr[0].n != -1) {
                                    int[] iArr5 = new int[i10];
                                    double[] dArr4 = new double[i10];
                                    b = 2;
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i10, 2);
                                    for (int i29 = 0; i29 < i10; i29++) {
                                        C6473s11 c6473s115 = c6473s11Arr[i29];
                                        iArr5[i29] = c6473s115.n;
                                        dArr4[i29] = c6473s115.g;
                                        double[] dArr6 = dArr5[i29];
                                        dArr6[0] = c6473s115.i;
                                        dArr6[1] = c6473s115.j;
                                    }
                                    this.k = new C3422dj(iArr5, dArr4, dArr5);
                                } else {
                                    b = 2;
                                }
                                this.z = new HashMap<>();
                                if (arrayList4 != null) {
                                    Iterator<String> it13 = hashSet.iterator();
                                    float fC = Float.NaN;
                                    while (it13.hasNext()) {
                                        String next6 = it13.next();
                                        if (next6.startsWith("CUSTOM")) {
                                            bVar = new Zd2.b();
                                            str59 = str59;
                                            str60 = str60;
                                            obj2 = obj2;
                                            str51 = str51;
                                            str54 = str54;
                                            str56 = str56;
                                            str58 = str58;
                                            str57 = str57;
                                        } else {
                                            switch (next6.hashCode()) {
                                                case -1249320806:
                                                    str59 = str59;
                                                    str60 = str60;
                                                    obj2 = obj2;
                                                    str51 = str51;
                                                    str54 = str54;
                                                    str56 = str56;
                                                    str58 = str58;
                                                    str57 = str57;
                                                    if (next6.equals(obj2)) {
                                                        b2 = 0;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case -1249320805:
                                                    str59 = str59;
                                                    str60 = str60;
                                                    str51 = str51;
                                                    str54 = str54;
                                                    str56 = str56;
                                                    str58 = str58;
                                                    str57 = str57;
                                                    obj2 = obj2;
                                                    if (next6.equals(str51)) {
                                                        b2 = 1;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case -1225497657:
                                                    str59 = str59;
                                                    str60 = str60;
                                                    str54 = str54;
                                                    str56 = str56;
                                                    str58 = str58;
                                                    str57 = str57;
                                                    b2 = !next6.equals(str54) ? b8 : b;
                                                    obj2 = obj2;
                                                    str51 = str51;
                                                    break;
                                                case -1225497656:
                                                    str59 = str59;
                                                    str60 = str60;
                                                    str56 = str56;
                                                    str58 = str58;
                                                    str57 = str57;
                                                    b2 = !next6.equals(str56) ? b8 : (byte) 3;
                                                    obj2 = obj2;
                                                    str51 = str51;
                                                    str54 = str54;
                                                    break;
                                                case -1225497655:
                                                    str59 = str59;
                                                    str60 = str60;
                                                    str58 = str58;
                                                    str57 = str57;
                                                    b2 = !next6.equals(str58) ? b8 : (byte) 4;
                                                    obj2 = obj2;
                                                    str51 = str51;
                                                    str54 = str54;
                                                    str56 = str56;
                                                    break;
                                                case -1001078227:
                                                    str59 = str59;
                                                    str60 = str60;
                                                    str57 = str57;
                                                    b2 = !next6.equals(str57) ? b8 : (byte) 5;
                                                    obj2 = obj2;
                                                    str51 = str51;
                                                    str54 = str54;
                                                    str56 = str56;
                                                    str58 = str58;
                                                    break;
                                                case -908189618:
                                                    str59 = str59;
                                                    str60 = str60;
                                                    if (next6.equals(str6)) {
                                                        obj2 = obj2;
                                                        str51 = str51;
                                                        str54 = str54;
                                                        str56 = str56;
                                                        str58 = str58;
                                                        str57 = str57;
                                                        b2 = 6;
                                                    } else {
                                                        b2 = b8;
                                                        obj2 = obj2;
                                                        str51 = str51;
                                                        str54 = str54;
                                                        str56 = str56;
                                                        str58 = str58;
                                                        str57 = str57;
                                                    }
                                                    break;
                                                case -908189617:
                                                    str59 = str59;
                                                    str60 = str60;
                                                    if (next6.equals(str7)) {
                                                        obj2 = obj2;
                                                        str51 = str51;
                                                        str54 = str54;
                                                        str56 = str56;
                                                        str58 = str58;
                                                        str57 = str57;
                                                        b2 = 7;
                                                    } else {
                                                        b2 = b8;
                                                        obj2 = obj2;
                                                        str51 = str51;
                                                        str54 = str54;
                                                        str56 = str56;
                                                        str58 = str58;
                                                        str57 = str57;
                                                    }
                                                    break;
                                                case -797520672:
                                                    str59 = str59;
                                                    str60 = str60;
                                                    if (next6.equals("waveVariesBy")) {
                                                        obj2 = obj2;
                                                        str51 = str51;
                                                        str54 = str54;
                                                        str56 = str56;
                                                        str58 = str58;
                                                        str57 = str57;
                                                        b2 = 8;
                                                    } else {
                                                        b2 = b8;
                                                        obj2 = obj2;
                                                        str51 = str51;
                                                        str54 = str54;
                                                        str56 = str56;
                                                        str58 = str58;
                                                        str57 = str57;
                                                    }
                                                    break;
                                                case -40300674:
                                                    str59 = str59;
                                                    str60 = str60;
                                                    if (next6.equals(str59)) {
                                                        b2 = 9;
                                                    } else {
                                                        b2 = b8;
                                                    }
                                                    obj2 = obj2;
                                                    str51 = str51;
                                                    str54 = str54;
                                                    str56 = str56;
                                                    str58 = str58;
                                                    str57 = str57;
                                                    break;
                                                case -4379043:
                                                    str60 = str60;
                                                    b2 = !next6.equals(str60) ? b8 : (byte) 10;
                                                    str59 = str59;
                                                    obj2 = obj2;
                                                    str51 = str51;
                                                    str54 = str54;
                                                    str56 = str56;
                                                    str58 = str58;
                                                    str57 = str57;
                                                    break;
                                                case 37232917:
                                                    if (next6.equals("transitionPathRotate")) {
                                                        b3 = 11;
                                                        b2 = b3;
                                                    } else {
                                                        b2 = b8;
                                                    }
                                                    str59 = str59;
                                                    str60 = str60;
                                                    obj2 = obj2;
                                                    str51 = str51;
                                                    str54 = str54;
                                                    str56 = str56;
                                                    str58 = str58;
                                                    str57 = str57;
                                                    break;
                                                case 92909918:
                                                    if (next6.equals(str61)) {
                                                        b3 = 12;
                                                        b2 = b3;
                                                    } else {
                                                        b2 = b8;
                                                    }
                                                    str59 = str59;
                                                    str60 = str60;
                                                    obj2 = obj2;
                                                    str51 = str51;
                                                    str54 = str54;
                                                    str56 = str56;
                                                    str58 = str58;
                                                    str57 = str57;
                                                    break;
                                                case 156108012:
                                                    if (next6.equals("waveOffset")) {
                                                        b3 = 13;
                                                        b2 = b3;
                                                    } else {
                                                        b2 = b8;
                                                    }
                                                    str59 = str59;
                                                    str60 = str60;
                                                    obj2 = obj2;
                                                    str51 = str51;
                                                    str54 = str54;
                                                    str56 = str56;
                                                    str58 = str58;
                                                    str57 = str57;
                                                    break;
                                                default:
                                                    b2 = b8;
                                                    str59 = str59;
                                                    str60 = str60;
                                                    obj2 = obj2;
                                                    str51 = str51;
                                                    str54 = str54;
                                                    str56 = str56;
                                                    str58 = str58;
                                                    str57 = str57;
                                                    break;
                                            }
                                            switch (b2) {
                                                case 0:
                                                    str7 = str7;
                                                    it13 = it13;
                                                    gVar = new Zd2.g();
                                                    break;
                                                case 1:
                                                    str7 = str7;
                                                    it13 = it13;
                                                    gVar = new Zd2.h();
                                                    break;
                                                case 2:
                                                    str7 = str7;
                                                    it13 = it13;
                                                    gVar = new Zd2.k();
                                                    break;
                                                case 3:
                                                    str7 = str7;
                                                    it13 = it13;
                                                    gVar = new Zd2.l();
                                                    break;
                                                case 4:
                                                    str7 = str7;
                                                    it13 = it13;
                                                    gVar = new Zd2.m();
                                                    break;
                                                case 5:
                                                    str7 = str7;
                                                    Zd2.e eVar2 = new Zd2.e();
                                                    it13 = it13;
                                                    eVar2.g = false;
                                                    gVar = eVar2;
                                                    break;
                                                case 6:
                                                    iVar = new Zd2.i();
                                                    bVar = iVar;
                                                    break;
                                                case 7:
                                                    iVar = new Zd2.j();
                                                    bVar = iVar;
                                                    break;
                                                case 8:
                                                    iVar = new Zd2.a();
                                                    bVar = iVar;
                                                    break;
                                                case 9:
                                                    iVar = new Zd2.f();
                                                    bVar = iVar;
                                                    break;
                                                case 10:
                                                    iVar = new Zd2.c();
                                                    bVar = iVar;
                                                    break;
                                                case 11:
                                                    iVar = new Zd2.d();
                                                    bVar = iVar;
                                                    break;
                                                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                                    iVar = new Zd2.a();
                                                    bVar = iVar;
                                                    break;
                                                case 13:
                                                    iVar = new Zd2.a();
                                                    bVar = iVar;
                                                    break;
                                                default:
                                                    bVar = null;
                                                    break;
                                            }
                                            if (gVar == null) {
                                                String str62 = str6;
                                                if (gVar.e == 1 && Float.isNaN(fC)) {
                                                    fC = c();
                                                }
                                                gVar.b = next6;
                                                this.z.put(next6, gVar);
                                                str6 = str62;
                                            }
                                            str7 = str7;
                                            b8 = -1;
                                            b = 2;
                                        }
                                        gVar = bVar;
                                        if (gVar == null) {
                                            String str63 = str6;
                                            if (gVar.e == 1) {
                                                fC = c();
                                            }
                                            gVar.b = next6;
                                            this.z.put(next6, gVar);
                                            str6 = str63;
                                        }
                                        str7 = str7;
                                        b8 = -1;
                                        b = 2;
                                    }
                                    for (AbstractC3339dK0 abstractC3339dK5 : arrayList4) {
                                        if (abstractC3339dK5 instanceof C3758fK0) {
                                            ((C3758fK0) abstractC3339dK5).g(this.z);
                                        }
                                    }
                                    Iterator<Zd2> it14 = this.z.values().iterator();
                                    while (it14.hasNext()) {
                                        it14.next().c();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str64 = strArr3[i28];
                            int i30 = i28;
                            String str65 = str5;
                            String str66 = str4;
                            int i31 = 0;
                            double[][] dArr7 = null;
                            double[] dArr8 = null;
                            int i32 = 0;
                            while (i32 < i10) {
                                int i33 = i32;
                                if (c6473s11Arr[i33].r.containsKey(str64)) {
                                    if (dArr7 == null) {
                                        dArr8 = new double[i10];
                                        a aVar4 = c6473s11Arr[i33].r.get(str64);
                                        dArr7 = (double[][]) Array.newInstance((Class<?>) cls, i10, aVar4 == null ? 0 : aVar4.c());
                                    }
                                    C6473s11 c6473s116 = c6473s11Arr[i33];
                                    double[][] dArr9 = dArr7;
                                    dArr8[i31] = c6473s116.g;
                                    double[] dArr10 = dArr9[i31];
                                    a aVar5 = c6473s116.r.get(str64);
                                    if (aVar5 != null) {
                                        if (aVar5.c() == 1) {
                                            dArr10[0] = aVar5.a();
                                        } else {
                                            int iC = aVar5.c();
                                            float[] fArr2 = new float[iC];
                                            aVar5.b(fArr2);
                                            int i34 = 0;
                                            int i35 = 0;
                                            while (i34 < iC) {
                                                double[] dArr11 = dArr10;
                                                dArr11[i35] = fArr2[i34];
                                                i34++;
                                                dArr10 = dArr11;
                                                str64 = str64;
                                                i35++;
                                            }
                                        }
                                    }
                                    str11 = str64;
                                    i31++;
                                    dArr7 = dArr9;
                                } else {
                                    str11 = str64;
                                    str35 = str35;
                                }
                                i32 = i33 + 1;
                                str64 = str11;
                                str35 = str35;
                                str33 = str33;
                                str34 = str34;
                            }
                            int i36 = i30 + 1;
                            this.j[i36] = AbstractC4198hR.a(this.e, Arrays.copyOf(dArr8, i31), (double[][]) Arrays.copyOf(dArr7, i31));
                            i28 = i36;
                            str33 = str33;
                            str4 = str66;
                            str5 = str65;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        C6473s11 c6473s11 = this.f;
        sb.append(c6473s11.i);
        sb.append(" y: ");
        sb.append(c6473s11.j);
        sb.append(" end: x: ");
        C6473s11 c6473s12 = this.g;
        sb.append(c6473s12.i);
        sb.append(" y: ");
        sb.append(c6473s12.j);
        return sb.toString();
    }
}
