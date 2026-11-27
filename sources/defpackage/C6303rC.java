package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;

/* JADX INFO: renamed from: rC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6303rC extends AbstractC1102Gx0<ObjectAnimator> {
    public static final int[] l = {0, 1350, 2700, 4050};
    public static final int[] m = {667, 2017, 3367, 4717};
    public static final int[] n = {CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, 2350, 3700, 5050};
    public static final a o = new a(Float.class, "animationFraction");
    public static final b p = new b(Float.class, "completeEndFraction");
    public ObjectAnimator d;
    public ObjectAnimator e;
    public final C6513sC g;
    public float i;
    public float j;
    public int h = 0;
    public AbstractC1392Kq.c k = null;
    public final C1581Nb0 f = new C1581Nb0();

    /* JADX INFO: renamed from: rC$a */
    public class a extends Property<C6303rC, Float> {
        @Override // android.util.Property
        public final Float get(C6303rC c6303rC) {
            return Float.valueOf(c6303rC.i);
        }

        @Override // android.util.Property
        public final void set(C6303rC c6303rC, Float f) {
            C1581Nb0 c1581Nb0;
            C6303rC c6303rC2 = c6303rC;
            float fFloatValue = f.floatValue();
            c6303rC2.i = fFloatValue;
            int i = (int) (5400.0f * fFloatValue);
            float f2 = fFloatValue * 1520.0f;
            float[] fArr = c6303rC2.b;
            fArr[0] = (-20.0f) + f2;
            fArr[1] = f2;
            int i2 = 0;
            while (true) {
                c1581Nb0 = c6303rC2.f;
                if (i2 >= 4) {
                    break;
                }
                float f3 = 667;
                fArr[1] = (c1581Nb0.getInterpolation((i - C6303rC.l[i2]) / f3) * 250.0f) + fArr[1];
                fArr[0] = (c1581Nb0.getInterpolation((i - C6303rC.m[i2]) / f3) * 250.0f) + fArr[0];
                i2++;
            }
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = ((f5 - f4) * c6303rC2.j) + f4;
            fArr[0] = f6;
            fArr[0] = f6 / 360.0f;
            fArr[1] = f5 / 360.0f;
            for (int i3 = 0; i3 < 4; i3++) {
                float f7 = (i - C6303rC.n[i3]) / 333;
                if (f7 >= 0.0f && f7 <= 1.0f) {
                    int i4 = i3 + c6303rC2.h;
                    C6513sC c6513sC = c6303rC2.g;
                    int[] iArr = c6513sC.c;
                    int length = i4 % iArr.length;
                    c6303rC2.c[0] = C4051gj.a(c1581Nb0.getInterpolation(f7), Integer.valueOf(C8056za.b(iArr[length], c6303rC2.a.n)), Integer.valueOf(C8056za.b(c6513sC.c[(length + 1) % iArr.length], c6303rC2.a.n))).intValue();
                    break;
                }
            }
            c6303rC2.a.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: rC$b */
    public class b extends Property<C6303rC, Float> {
        @Override // android.util.Property
        public final Float get(C6303rC c6303rC) {
            return Float.valueOf(c6303rC.j);
        }

        @Override // android.util.Property
        public final void set(C6303rC c6303rC, Float f) {
            c6303rC.j = f.floatValue();
        }
    }

    public C6303rC(@NonNull C6513sC c6513sC) {
        this.g = c6513sC;
    }

    public final void a() {
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new C5884pC(this));
        }
        if (this.e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, p, 0.0f, 1.0f);
            this.e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.e.setInterpolator(this.f);
            this.e.addListener(new C6094qC(this));
        }
        this.h = 0;
        this.c[0] = C8056za.b(this.g.c[0], this.a.n);
        this.j = 0.0f;
        this.d.start();
    }
}
