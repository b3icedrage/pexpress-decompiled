package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: renamed from: Kh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1366Kh0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float d;
    public final int e;
    public final int g;
    public final View h;
    public a i;
    public b j;
    public boolean k;
    public int l;
    public final int[] m = new int[2];

    /* JADX INFO: renamed from: Kh0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = AbstractViewOnTouchListenerC1366Kh0.this.h.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: Kh0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractViewOnTouchListenerC1366Kh0 abstractViewOnTouchListenerC1366Kh0 = AbstractViewOnTouchListenerC1366Kh0.this;
            abstractViewOnTouchListenerC1366Kh0.a();
            View view = abstractViewOnTouchListenerC1366Kh0.h;
            if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1366Kh0.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                abstractViewOnTouchListenerC1366Kh0.k = true;
            }
        }
    }

    public AbstractViewOnTouchListenerC1366Kh0(View view) {
        this.h = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.e = tapTimeout;
        this.g = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.j;
        View view = this.h;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.i;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    public abstract InterfaceC8013zL1 b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC8013zL1 interfaceC8013zL1B = b();
        if (interfaceC8013zL1B == null || !interfaceC8013zL1B.a()) {
            return true;
        }
        interfaceC8013zL1B.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        Z30 z30J;
        boolean z2 = this.k;
        View view2 = this.h;
        if (z2) {
            InterfaceC8013zL1 interfaceC8013zL1B = b();
            if (interfaceC8013zL1B != null && interfaceC8013zL1B.a() && (z30J = interfaceC8013zL1B.j()) != null && z30J.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.m;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                z30J.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = z30J.b(motionEventObtainNoHistory, this.l);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z3) {
                    z = true;
                } else if (d()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (d()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.l = motionEvent.getPointerId(0);
                    if (this.i == null) {
                        this.i = new a();
                    }
                    view2.postDelayed(this.i, this.e);
                    if (this.j == null) {
                        this.j = new b();
                    }
                    view2.postDelayed(this.j, this.g);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.l);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.d;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.k = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.k = false;
        this.l = -1;
        a aVar = this.i;
        if (aVar != null) {
            this.h.removeCallbacks(aVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
