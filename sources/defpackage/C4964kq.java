package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import com.google.android.gms.auth.api.credentials.CredentialsApi;

/* JADX INFO: renamed from: kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4964kq extends PA<AbstractC4754jq<? extends AbstractC5174lq<? extends InterfaceC3035bs0<? extends C3506e70>>>> {
    public Matrix j;
    public Matrix k;
    public C3791fV0 l;
    public C3791fV0 m;
    public float n;
    public float o;
    public float p;
    public InterfaceC3035bs0 q;
    public VelocityTracker r;
    public long s;
    public C3791fV0 t;
    public C3791fV0 u;
    public float v;
    public float w;

    public C4964kq() {
        throw null;
    }

    public static float e(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    public final C3791fV0 a(float f, float f2) {
        AbstractC4754jq abstractC4754jq = this.i;
        C4454ie2 viewPortHandler = abstractC4754jq.getViewPortHandler();
        float f3 = f - viewPortHandler.b.left;
        b();
        return C3791fV0.b(f3, -((abstractC4754jq.getMeasuredHeight() - f2) - viewPortHandler.k()));
    }

    public final void b() {
        InterfaceC3035bs0 interfaceC3035bs0 = this.q;
        AbstractC4754jq abstractC4754jq = this.i;
        if (interfaceC3035bs0 == null) {
            abstractC4754jq.c0.getClass();
            abstractC4754jq.d0.getClass();
        }
        InterfaceC3035bs0 interfaceC3035bs1 = this.q;
        if (interfaceC3035bs1 != null) {
            (interfaceC3035bs1.S() == Kl2.a.d ? abstractC4754jq.c0 : abstractC4754jq.d0).getClass();
        }
    }

    public final void c(MotionEvent motionEvent, float f, float f2) {
        this.d = PA.a.e;
        this.j.set(this.k);
        R81 onChartGestureListener = this.i.getOnChartGestureListener();
        b();
        this.j.postTranslate(f, f2);
        if (onChartGestureListener != null) {
            onChartGestureListener.a(motionEvent);
        }
    }

    public final void d(MotionEvent motionEvent) {
        this.k.set(this.j);
        float x = motionEvent.getX();
        C3791fV0 c3791fV0 = this.l;
        c3791fV0.e = x;
        c3791fV0.g = motionEvent.getY();
        AbstractC4754jq abstractC4754jq = this.i;
        C7482wo0 c7482wo0C = abstractC4754jq.c(motionEvent.getX(), motionEvent.getY());
        this.q = c7482wo0C != null ? (InterfaceC3035bs0) ((AbstractC5174lq) abstractC4754jq.e).e(c7482wo0C.f) : null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.d = PA.a.k;
        AbstractC4754jq abstractC4754jq = this.i;
        R81 onChartGestureListener = abstractC4754jq.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.f(motionEvent);
        }
        if (abstractC4754jq.M && ((AbstractC5174lq) abstractC4754jq.getData()).h() > 0) {
            C3791fV0 c3791fV0A = a(motionEvent.getX(), motionEvent.getY());
            float f = abstractC4754jq.Q ? 1.4f : 1.0f;
            float f2 = abstractC4754jq.R ? 1.4f : 1.0f;
            float f3 = c3791fV0A.e;
            float f4 = c3791fV0A.g;
            C4454ie2 c4454ie2 = abstractC4754jq.w;
            Matrix matrix = abstractC4754jq.k0;
            c4454ie2.getClass();
            matrix.reset();
            matrix.set(c4454ie2.a);
            matrix.postScale(f, f2, f3, -f4);
            abstractC4754jq.w.l(matrix, abstractC4754jq, false);
            abstractC4754jq.a();
            abstractC4754jq.postInvalidate();
            boolean z = abstractC4754jq.d;
            C3791fV0.c(c3791fV0A);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.d = PA.a.m;
        R81 onChartGestureListener = this.i.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.g(motionEvent, motionEvent2);
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.d = PA.a.l;
        R81 onChartGestureListener = this.i.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.e(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.d = PA.a.j;
        AbstractC4754jq abstractC4754jq = this.i;
        R81 onChartGestureListener = abstractC4754jq.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.d(motionEvent);
        }
        if (!abstractC4754jq.g) {
            return false;
        }
        C7482wo0 c7482wo0C = abstractC4754jq.c(motionEvent.getX(), motionEvent.getY());
        if (c7482wo0C == null || c7482wo0C.a(this.g)) {
            abstractC4754jq.d(null);
            this.g = null;
        } else {
            abstractC4754jq.d(c7482wo0C);
            this.g = c7482wo0C;
        }
        return super.onSingleTapUp(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01ca  */
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C7482wo0 c7482wo0C;
        VelocityTracker velocityTracker;
        if (this.r == null) {
            this.r = VelocityTracker.obtain();
        }
        this.r.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.r) != null) {
            velocityTracker.recycle();
            this.r = null;
        }
        if (this.e == 0) {
            this.h.onTouchEvent(motionEvent);
        }
        AbstractC4754jq abstractC4754jq = this.i;
        int i = 0;
        if (!(abstractC4754jq.O || abstractC4754jq.P) && !abstractC4754jq.Q && !abstractC4754jq.R) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            R81 onChartGestureListener = abstractC4754jq.getOnChartGestureListener();
            if (onChartGestureListener != null) {
                onChartGestureListener.h(motionEvent, this.d);
            }
            C3791fV0 c3791fV0 = this.u;
            c3791fV0.e = 0.0f;
            c3791fV0.g = 0.0f;
            d(motionEvent);
        } else if (action != 1) {
            C3791fV0 c3791fV1 = this.m;
            if (action == 2) {
                int i2 = this.e;
                C3791fV0 c3791fV2 = this.l;
                if (i2 == 1) {
                    ViewParent parent = abstractC4754jq.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    c(motionEvent, abstractC4754jq.O ? motionEvent.getX() - c3791fV2.e : 0.0f, abstractC4754jq.P ? motionEvent.getY() - c3791fV2.g : 0.0f);
                } else if (i2 == 2 || i2 == 3 || i2 == 4) {
                    ViewParent parent2 = abstractC4754jq.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    if ((abstractC4754jq.Q || abstractC4754jq.R) && motionEvent.getPointerCount() >= 2) {
                        R81 onChartGestureListener2 = abstractC4754jq.getOnChartGestureListener();
                        float fE = e(motionEvent);
                        if (fE > this.w) {
                            C3791fV0 c3791fV0A = a(c3791fV1.e, c3791fV1.g);
                            C4454ie2 viewPortHandler = abstractC4754jq.getViewPortHandler();
                            int i3 = this.e;
                            Matrix matrix = this.k;
                            if (i3 == 4) {
                                this.d = PA.a.i;
                                float f = fE / this.p;
                                boolean z = f < 1.0f;
                                boolean z2 = !z ? viewPortHandler.i >= viewPortHandler.h : viewPortHandler.i <= viewPortHandler.g;
                                if (!z ? viewPortHandler.j < viewPortHandler.f : viewPortHandler.j > viewPortHandler.e) {
                                    i = 1;
                                }
                                float f2 = abstractC4754jq.Q ? f : 1.0f;
                                float f3 = abstractC4754jq.R ? f : 1.0f;
                                if (i != 0 || z2) {
                                    this.j.set(matrix);
                                    this.j.postScale(f2, f3, c3791fV0A.e, c3791fV0A.g);
                                    if (onChartGestureListener2 != null) {
                                        onChartGestureListener2.c(motionEvent);
                                    }
                                }
                            } else if (i3 == 2 && abstractC4754jq.Q) {
                                this.d = PA.a.g;
                                float fAbs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) / this.n;
                                if (fAbs >= 1.0f ? viewPortHandler.i < viewPortHandler.h : viewPortHandler.i > viewPortHandler.g) {
                                    this.j.set(matrix);
                                    this.j.postScale(fAbs, 1.0f, c3791fV0A.e, c3791fV0A.g);
                                    if (onChartGestureListener2 != null) {
                                        onChartGestureListener2.c(motionEvent);
                                    }
                                }
                            } else if (i3 == 3 && abstractC4754jq.R) {
                                this.d = PA.a.h;
                                float fAbs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1)) / this.o;
                                if (fAbs2 >= 1.0f ? viewPortHandler.j < viewPortHandler.f : viewPortHandler.j > viewPortHandler.e) {
                                    this.j.set(matrix);
                                    this.j.postScale(1.0f, fAbs2, c3791fV0A.e, c3791fV0A.g);
                                    if (onChartGestureListener2 != null) {
                                        onChartGestureListener2.c(motionEvent);
                                    }
                                }
                            }
                            C3791fV0.c(c3791fV0A);
                        }
                    }
                } else if (i2 == 0) {
                    float x = motionEvent.getX() - c3791fV2.e;
                    float y = motionEvent.getY() - c3791fV2.g;
                    if (Math.abs((float) Math.sqrt((y * y) + (x * x))) > this.v && (abstractC4754jq.O || abstractC4754jq.P)) {
                        C4454ie2 c4454ie2 = abstractC4754jq.w;
                        boolean zB = c4454ie2.b();
                        PA.a aVar = PA.a.e;
                        if (zB && c4454ie2.c()) {
                            C4454ie2 c4454ie3 = abstractC4754jq.w;
                            if (c4454ie3.l > 0.0f || c4454ie3.m > 0.0f) {
                                float fAbs3 = Math.abs(motionEvent.getX() - c3791fV2.e);
                                float fAbs4 = Math.abs(motionEvent.getY() - c3791fV2.g);
                                if (abstractC4754jq.O) {
                                    this.d = aVar;
                                    this.e = 1;
                                } else {
                                    this.d = aVar;
                                    this.e = 1;
                                }
                            } else {
                                boolean z3 = abstractC4754jq.N;
                                if (z3) {
                                    this.d = aVar;
                                    if (z3 && (c7482wo0C = abstractC4754jq.c(motionEvent.getX(), motionEvent.getY())) != null && !c7482wo0C.a(this.g)) {
                                        this.g = c7482wo0C;
                                        abstractC4754jq.d(c7482wo0C);
                                    }
                                }
                            }
                        } else {
                            float fAbs5 = Math.abs(motionEvent.getX() - c3791fV2.e);
                            float fAbs6 = Math.abs(motionEvent.getY() - c3791fV2.g);
                            if ((abstractC4754jq.O || fAbs6 >= fAbs5) && (abstractC4754jq.P || fAbs6 <= fAbs5)) {
                                this.d = aVar;
                                this.e = 1;
                            }
                        }
                    }
                }
            } else if (action == 3) {
                this.e = 0;
                R81 onChartGestureListener3 = this.i.getOnChartGestureListener();
                if (onChartGestureListener3 != null) {
                    onChartGestureListener3.b(motionEvent, this.d);
                }
            } else if (action != 5) {
                if (action == 6) {
                    VelocityTracker velocityTracker2 = this.r;
                    velocityTracker2.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, AbstractC8067zc2.c);
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    float xVelocity = velocityTracker2.getXVelocity(pointerId);
                    float yVelocity = velocityTracker2.getYVelocity(pointerId);
                    int pointerCount = motionEvent.getPointerCount();
                    while (i < pointerCount) {
                        if (i != actionIndex) {
                            int pointerId2 = motionEvent.getPointerId(i);
                            if ((velocityTracker2.getYVelocity(pointerId2) * yVelocity) + (velocityTracker2.getXVelocity(pointerId2) * xVelocity) < 0.0f) {
                                velocityTracker2.clear();
                                break;
                            }
                        }
                        i++;
                    }
                    this.e = 5;
                }
            } else if (motionEvent.getPointerCount() >= 2) {
                ViewParent parent3 = abstractC4754jq.getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
                d(motionEvent);
                this.n = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                this.o = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                float fE2 = e(motionEvent);
                this.p = fE2;
                if (fE2 > 10.0f) {
                    if (abstractC4754jq.L) {
                        this.e = 4;
                    } else {
                        boolean z4 = abstractC4754jq.Q;
                        if (z4 != abstractC4754jq.R) {
                            this.e = z4 ? 2 : 3;
                        } else {
                            this.e = this.n > this.o ? 2 : 3;
                        }
                    }
                }
                float x2 = motionEvent.getX(1) + motionEvent.getX(0);
                float y2 = motionEvent.getY(1) + motionEvent.getY(0);
                c3791fV1.e = x2 / 2.0f;
                c3791fV1.g = y2 / 2.0f;
            }
        } else {
            VelocityTracker velocityTracker3 = this.r;
            int pointerId3 = motionEvent.getPointerId(0);
            velocityTracker3.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, AbstractC8067zc2.c);
            float yVelocity2 = velocityTracker3.getYVelocity(pointerId3);
            float xVelocity2 = velocityTracker3.getXVelocity(pointerId3);
            if ((Math.abs(xVelocity2) > AbstractC8067zc2.b || Math.abs(yVelocity2) > AbstractC8067zc2.b) && this.e == 1 && abstractC4754jq.h) {
                C3791fV0 c3791fV3 = this.u;
                c3791fV3.e = 0.0f;
                c3791fV3.g = 0.0f;
                this.s = AnimationUtils.currentAnimationTimeMillis();
                float x3 = motionEvent.getX();
                C3791fV0 c3791fV4 = this.t;
                c3791fV4.e = x3;
                c3791fV4.g = motionEvent.getY();
                C3791fV0 c3791fV5 = this.u;
                c3791fV5.e = xVelocity2;
                c3791fV5.g = yVelocity2;
                abstractC4754jq.postInvalidateOnAnimation();
            }
            int i4 = this.e;
            if (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) {
                abstractC4754jq.a();
                abstractC4754jq.postInvalidate();
            }
            this.e = 0;
            ViewParent parent4 = abstractC4754jq.getParent();
            if (parent4 != null) {
                parent4.requestDisallowInterceptTouchEvent(false);
            }
            VelocityTracker velocityTracker4 = this.r;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.r = null;
            }
            R81 onChartGestureListener4 = this.i.getOnChartGestureListener();
            if (onChartGestureListener4 != null) {
                onChartGestureListener4.b(motionEvent, this.d);
            }
        }
        C4454ie2 viewPortHandler2 = abstractC4754jq.getViewPortHandler();
        Matrix matrix2 = this.j;
        viewPortHandler2.l(matrix2, abstractC4754jq, true);
        this.j = matrix2;
        return true;
    }
}
