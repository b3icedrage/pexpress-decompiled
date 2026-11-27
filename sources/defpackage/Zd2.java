package defpackage;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import io.sentry.android.core.b0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class Zd2 extends AbstractC4178hK0 {

    public static class a extends Zd2 {
        @Override // defpackage.Zd2
        public final void d(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    public static class b extends Zd2 {
        public final float[] g = new float[1];
        public androidx.constraintlayout.widget.a h;

        @Override // defpackage.AbstractC4178hK0
        public final void b(androidx.constraintlayout.widget.a aVar) {
            this.h = aVar;
        }

        @Override // defpackage.Zd2
        public final void d(View view, float f) {
            float fA = a(f);
            float[] fArr = this.g;
            fArr[0] = fA;
            C7609xR.b(this.h, view, fArr);
        }
    }

    public static class c extends Zd2 {
        @Override // defpackage.Zd2
        public final void d(View view, float f) {
            view.setElevation(a(f));
        }
    }

    public static class e extends Zd2 {
        public boolean g;

        @Override // defpackage.Zd2
        public final void d(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
                return;
            }
            if (this.g) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f)));
                } catch (IllegalAccessException e) {
                    b0.d("ViewOscillator", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    b0.d("ViewOscillator", "unable to setProgress", e2);
                }
            }
        }
    }

    public static class f extends Zd2 {
        @Override // defpackage.Zd2
        public final void d(View view, float f) {
            view.setRotation(a(f));
        }
    }

    public static class g extends Zd2 {
        @Override // defpackage.Zd2
        public final void d(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    public static class h extends Zd2 {
        @Override // defpackage.Zd2
        public final void d(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    public static class i extends Zd2 {
        @Override // defpackage.Zd2
        public final void d(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    public static class j extends Zd2 {
        @Override // defpackage.Zd2
        public final void d(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    public static class k extends Zd2 {
        @Override // defpackage.Zd2
        public final void d(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    public static class l extends Zd2 {
        @Override // defpackage.Zd2
        public final void d(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    public static class m extends Zd2 {
        @Override // defpackage.Zd2
        public final void d(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public Zd2() {
        this.c = 0;
        this.d = null;
        this.e = 0;
        this.f = new ArrayList<>();
    }

    public abstract void d(View view, float f2);

    public static class d extends Zd2 {
        @Override // defpackage.Zd2
        public final void d(View view, float f) {
        }
    }
}
