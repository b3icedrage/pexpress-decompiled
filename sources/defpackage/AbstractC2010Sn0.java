package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Sn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2010Sn0<V extends View> extends Xd2<V> {
    public a c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public VelocityTracker i;

    /* JADX INFO: renamed from: Sn0$a */
    public class a implements Runnable {
        public final CoordinatorLayout d;
        public final V e;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.d = coordinatorLayout;
            this.e = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC2010Sn0 abstractC2010Sn0;
            OverScroller overScroller;
            V v = this.e;
            if (v == null || (overScroller = (abstractC2010Sn0 = AbstractC2010Sn0.this).d) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.d;
            if (!zComputeScrollOffset) {
                abstractC2010Sn0.y(coordinatorLayout, v);
                return;
            }
            abstractC2010Sn0.A(coordinatorLayout, v, abstractC2010Sn0.d.getCurrY());
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            v.postOnAnimation(this);
        }
    }

    public AbstractC2010Sn0() {
        this.f = -1;
        this.h = -1;
    }

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i) {
        z(coordinatorLayout, view, i, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y;
        boolean z;
        OverScroller overScroller;
        int iFindPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.e) {
            int i = this.f;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.g) > this.h) {
                    this.g = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.f = -1;
                    int x = (int) motionEvent.getX();
                    y = (int) motionEvent.getY();
                    if (v(v)) {
                        z = false;
                    } else {
                        z = false;
                    }
                    this.e = z;
                    if (z) {
                        this.g = y;
                        this.f = motionEvent.getPointerId(0);
                        if (this.i == null) {
                            this.i = VelocityTracker.obtain();
                        }
                        overScroller = this.d;
                        if (overScroller != null) {
                            this.d.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.i;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.f = -1;
                int x2 = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (v(v) || !coordinatorLayout.p(v, x2, y)) {
                    z = false;
                } else {
                    z = true;
                }
                this.e = z;
                if (z) {
                    this.g = y;
                    this.f = motionEvent.getPointerId(0);
                    if (this.i == null) {
                        this.i = VelocityTracker.obtain();
                    }
                    overScroller = this.d;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.d.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.i;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i = this.g - y;
                    this.g = y;
                    z(coordinatorLayout, v, t() - i, w(v), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f = motionEvent.getPointerId(i2);
                    this.g = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.e || z;
        }
        VelocityTracker velocityTracker3 = this.i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.i.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
            float yVelocity = this.i.getYVelocity(this.f);
            int i3 = -x(v);
            Runnable runnable = this.c;
            if (runnable != null) {
                v.removeCallbacks(runnable);
                this.c = null;
            }
            if (this.d == null) {
                this.d = new OverScroller(v.getContext());
            }
            this.d.fling(0, s(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (this.d.computeScrollOffset()) {
                a aVar = new a(coordinatorLayout, v);
                this.c = aVar;
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                v.postOnAnimation(aVar);
            } else {
                y(coordinatorLayout, v);
            }
            z = true;
        }
        this.e = false;
        this.f = -1;
        velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.i = null;
        }
        velocityTracker2 = this.i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.e) {
        }
        z = false;
        this.e = false;
        this.f = -1;
        velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.i = null;
        }
        velocityTracker2 = this.i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.e) {
        }
    }

    public boolean v(V v) {
        return false;
    }

    public int w(@NonNull V v) {
        return -v.getHeight();
    }

    public int x(@NonNull V v) {
        return v.getHeight();
    }

    public int z(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int iH;
        int iS = s();
        if (i2 == 0 || iS < i2 || iS > i3 || iS == (iH = C1952Ru.h(i, i2, i3))) {
            return 0;
        }
        Yd2 yd2 = this.a;
        if (yd2 == null) {
            this.b = iH;
        } else if (yd2.d != iH) {
            yd2.d = iH;
            yd2.a();
        }
        return iS - iH;
    }

    public AbstractC2010Sn0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1;
        this.h = -1;
    }

    public void y(CoordinatorLayout coordinatorLayout, V v) {
    }
}
