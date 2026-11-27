package defpackage;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.NonNull;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1538Mn implements View.OnTouchListener {
    public static final int u = ViewConfiguration.getTapTimeout();
    public final a d;
    public final AccelerateInterpolator e;
    public final ListView g;
    public b h;
    public final float[] i;
    public final float[] j;
    public final int k;
    public final int l;
    public final float[] m;
    public final float[] n;
    public final float[] o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;

    /* JADX INFO: renamed from: Mn$a */
    public static class a {
        public int a;
        public int b;
        public float c;
        public float d;
        public long e;
        public long f;
        public long g;
        public float h;
        public int i;

        public final float a(long j) {
            long j2 = this.e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.g;
            if (j3 < 0 || j < j3) {
                return AbstractViewOnTouchListenerC1538Mn.b((j - j2) / this.a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.h;
            return (AbstractViewOnTouchListenerC1538Mn.b((j - j3) / this.i, 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    /* JADX INFO: renamed from: Mn$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractViewOnTouchListenerC1538Mn abstractViewOnTouchListenerC1538Mn = AbstractViewOnTouchListenerC1538Mn.this;
            if (abstractViewOnTouchListenerC1538Mn.s) {
                boolean z = abstractViewOnTouchListenerC1538Mn.q;
                a aVar = abstractViewOnTouchListenerC1538Mn.d;
                if (z) {
                    abstractViewOnTouchListenerC1538Mn.q = false;
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar.e = jCurrentAnimationTimeMillis;
                    aVar.g = -1L;
                    aVar.f = jCurrentAnimationTimeMillis;
                    aVar.h = 0.5f;
                }
                if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + ((long) aVar.i)) || !abstractViewOnTouchListenerC1538Mn.e()) {
                    abstractViewOnTouchListenerC1538Mn.s = false;
                    return;
                }
                boolean z2 = abstractViewOnTouchListenerC1538Mn.r;
                ListView listView = abstractViewOnTouchListenerC1538Mn.g;
                if (z2) {
                    abstractViewOnTouchListenerC1538Mn.r = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    listView.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (aVar.f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA = aVar.a(jCurrentAnimationTimeMillis2);
                long j = jCurrentAnimationTimeMillis2 - aVar.f;
                aVar.f = jCurrentAnimationTimeMillis2;
                ((OQ0) abstractViewOnTouchListenerC1538Mn).v.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.d));
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                listView.postOnAnimation(this);
            }
        }
    }

    public AbstractViewOnTouchListenerC1538Mn(@NonNull ListView listView) {
        a aVar = new a();
        aVar.e = Long.MIN_VALUE;
        aVar.g = -1L;
        aVar.f = 0L;
        this.d = aVar;
        this.e = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.i = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.j = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.m = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.n = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.o = fArr5;
        this.g = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.k = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.l = u;
        aVar.a = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        aVar.b = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(int i, float f, float f2, float f3) {
        float fB;
        float interpolation;
        float fB2 = b(this.i[i] * f2, 0.0f, this.j[i]);
        float fC = c(f2 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.e;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f4 = this.m[i];
            float f5 = this.n[i];
            float f6 = this.o[i];
            float f7 = f4 * f3;
            return fB > 0.0f ? b(fB * f7, f5, f6) : -b((-fB) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f8 = this.m[i];
        float f9 = this.n[i];
        float f10 = this.o[i];
        float f11 = f8 * f3;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.k;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.s && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.q) {
            this.s = false;
            return;
        }
        a aVar = this.d;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - aVar.e);
        int i3 = aVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        Z30 z30;
        int count;
        a aVar = this.d;
        float f = aVar.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(aVar.c);
        if (iAbs != 0 && (count = (z30 = ((OQ0) this).v).getCount()) != 0) {
            int childCount = z30.getChildCount();
            int firstVisiblePosition = z30.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && z30.getChildAt(0).getTop() >= 0)) : !(i >= count && z30.getChildAt(childCount - 1).getBottom() <= z30.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.t
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.d()
            return r1
        L1b:
            r7.r = r2
            r7.p = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.g
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            Mn$a r9 = r7.d
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.s
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            Mn$b r8 = r7.h
            if (r8 != 0) goto L60
            Mn$b r8 = new Mn$b
            r8.<init>()
            r7.h = r8
        L60:
            r7.s = r2
            r7.q = r2
            boolean r8 = r7.p
            if (r8 != 0) goto L75
            int r8 = r7.l
            if (r8 <= 0) goto L75
            Mn$b r9 = r7.h
            long r5 = (long) r8
            java.util.WeakHashMap<android.view.View, me2> r8 = defpackage.Cd2.a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            Mn$b r8 = r7.h
            r8.run()
        L7a:
            r7.p = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractViewOnTouchListenerC1538Mn.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
