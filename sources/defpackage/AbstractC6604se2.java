package defpackage;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import io.sentry.android.core.b0;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: se2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6604se2 extends DO1 {

    /* JADX INFO: renamed from: se2$a */
    public static class a extends AbstractC6604se2 {
        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* JADX INFO: renamed from: se2$b */
    public static class b extends AbstractC6604se2 {
        public SparseArray<androidx.constraintlayout.widget.a> f;
        public float[] g;

        public b() {
            throw null;
        }

        @Override // defpackage.DO1
        public final void b(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // defpackage.DO1
        public final void c(int i) {
            SparseArray<androidx.constraintlayout.widget.a> sparseArray = this.f;
            int size = sparseArray.size();
            int iC = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            this.g = new float[iC];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iC);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                androidx.constraintlayout.widget.a aVarValueAt = sparseArray.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                aVarValueAt.b(this.g);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.g;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.a = AbstractC4198hR.a(i, dArr, dArr2);
        }

        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
            this.a.d(f, this.g);
            C7609xR.b(this.f.valueAt(0), view, this.g);
        }
    }

    /* JADX INFO: renamed from: se2$c */
    public static class c extends AbstractC6604se2 {
        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
            view.setElevation(a(f));
        }
    }

    /* JADX INFO: renamed from: se2$e */
    public static class e extends AbstractC6604se2 {
        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
            view.setPivotX(a(f));
        }
    }

    /* JADX INFO: renamed from: se2$f */
    public static class f extends AbstractC6604se2 {
        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
            view.setPivotY(a(f));
        }
    }

    /* JADX INFO: renamed from: se2$g */
    public static class g extends AbstractC6604se2 {
        public boolean f;

        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
                return;
            }
            if (this.f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f)));
                } catch (IllegalAccessException e) {
                    b0.d("ViewSpline", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    b0.d("ViewSpline", "unable to setProgress", e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: se2$h */
    public static class h extends AbstractC6604se2 {
        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* JADX INFO: renamed from: se2$i */
    public static class i extends AbstractC6604se2 {
        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* JADX INFO: renamed from: se2$j */
    public static class j extends AbstractC6604se2 {
        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* JADX INFO: renamed from: se2$k */
    public static class k extends AbstractC6604se2 {
        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* JADX INFO: renamed from: se2$l */
    public static class l extends AbstractC6604se2 {
        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* JADX INFO: renamed from: se2$m */
    public static class m extends AbstractC6604se2 {
        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* JADX INFO: renamed from: se2$n */
    public static class n extends AbstractC6604se2 {
        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* JADX INFO: renamed from: se2$o */
    public static class o extends AbstractC6604se2 {
        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public abstract void d(View view, float f2);

    /* JADX INFO: renamed from: se2$d */
    public static class d extends AbstractC6604se2 {
        @Override // defpackage.AbstractC6604se2
        public final void d(View view, float f) {
        }
    }
}
