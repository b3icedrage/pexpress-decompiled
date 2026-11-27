package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import defpackage.ViewOnTouchListenerC8070zd1.d;

/* JADX INFO: renamed from: nR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5509nR {
    public int a = -1;
    public int b = 0;
    public final ScaleGestureDetector c;
    public VelocityTracker d;
    public boolean e;
    public float f;
    public float g;
    public final float h;
    public final float i;
    public final ViewOnTouchListenerC8070zd1.a j;

    public C5509nR(Context context, ViewOnTouchListenerC8070zd1.a aVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h = viewConfiguration.getScaledTouchSlop();
        this.j = aVar;
        this.c = new ScaleGestureDetector(context, new ScaleGestureDetectorOnScaleGestureListenerC5299mR(this));
    }

    public final void a(MotionEvent motionEvent) {
        float x;
        float y;
        float x2;
        float y2;
        RectF rectF;
        int iRound;
        int i;
        int iRound2;
        int i2;
        float x3;
        float y3;
        int i3;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            ViewOnTouchListenerC8070zd1.a aVar = this.j;
            if (action == 1) {
                this.a = -1;
                if (this.e && this.d != null) {
                    try {
                        x2 = motionEvent.getX(this.b);
                    } catch (Exception unused) {
                        x2 = motionEvent.getX();
                    }
                    this.f = x2;
                    try {
                        y2 = motionEvent.getY(this.b);
                    } catch (Exception unused2) {
                        y2 = motionEvent.getY();
                    }
                    this.g = y2;
                    this.d.addMovement(motionEvent);
                    this.d.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                    float xVelocity = this.d.getXVelocity();
                    float yVelocity = this.d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.i) {
                        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = ViewOnTouchListenerC8070zd1.this;
                        ViewOnTouchListenerC8070zd1.d dVar = viewOnTouchListenerC8070zd1.new d(viewOnTouchListenerC8070zd1.l.getContext());
                        viewOnTouchListenerC8070zd1.v = dVar;
                        PhotoView photoView = viewOnTouchListenerC8070zd1.l;
                        int width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
                        int height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
                        int i4 = (int) (-xVelocity);
                        int i5 = (int) (-yVelocity);
                        viewOnTouchListenerC8070zd1.b();
                        Matrix matrixC = viewOnTouchListenerC8070zd1.c();
                        Drawable drawable = viewOnTouchListenerC8070zd1.l.getDrawable();
                        if (drawable != null) {
                            rectF = viewOnTouchListenerC8070zd1.r;
                            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            matrixC.mapRect(rectF);
                        } else {
                            rectF = null;
                        }
                        if (rectF != null) {
                            int iRound3 = Math.round(-rectF.left);
                            float f = width;
                            if (f < rectF.width()) {
                                iRound = Math.round(rectF.width() - f);
                                i = 0;
                            } else {
                                iRound = iRound3;
                                i = iRound;
                            }
                            int iRound4 = Math.round(-rectF.top);
                            float f2 = height;
                            if (f2 < rectF.height()) {
                                iRound2 = Math.round(rectF.height() - f2);
                                i2 = 0;
                            } else {
                                iRound2 = iRound4;
                                i2 = iRound2;
                            }
                            dVar.e = iRound3;
                            dVar.g = iRound4;
                            if (iRound3 != iRound || iRound4 != iRound2) {
                                dVar.d.fling(iRound3, iRound4, i4, i5, i, iRound, i2, iRound2, 0, 0);
                            }
                        }
                        photoView.post(viewOnTouchListenerC8070zd1.v);
                    }
                }
                VelocityTracker velocityTracker = this.d;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.d = null;
                }
            } else if (action == 2) {
                try {
                    x3 = motionEvent.getX(this.b);
                } catch (Exception unused3) {
                    x3 = motionEvent.getX();
                }
                try {
                    y3 = motionEvent.getY(this.b);
                } catch (Exception unused4) {
                    y3 = motionEvent.getY();
                }
                float f3 = x3 - this.f;
                float f4 = y3 - this.g;
                if (!this.e) {
                    this.e = Math.sqrt((double) ((f4 * f4) + (f3 * f3))) >= ((double) this.h);
                }
                if (this.e) {
                    ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd2 = ViewOnTouchListenerC8070zd1.this;
                    if (!viewOnTouchListenerC8070zd2.n.c.isInProgress()) {
                        viewOnTouchListenerC8070zd2.q.postTranslate(f3, f4);
                        viewOnTouchListenerC8070zd2.a();
                        ViewParent parent = viewOnTouchListenerC8070zd2.l.getParent();
                        if (viewOnTouchListenerC8070zd2.j && !viewOnTouchListenerC8070zd2.n.c.isInProgress() && !viewOnTouchListenerC8070zd2.k) {
                            int i6 = viewOnTouchListenerC8070zd2.w;
                            if ((i6 == 2 || ((i6 == 0 && f3 >= 1.0f) || ((i6 == 1 && f3 <= -1.0f) || (((i3 = viewOnTouchListenerC8070zd2.x) == 0 && f4 >= 1.0f) || (i3 == 1 && f4 <= -1.0f))))) && parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        } else if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f = x3;
                    this.g = y3;
                    VelocityTracker velocityTracker2 = this.d;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.a = -1;
                VelocityTracker velocityTracker3 = this.d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.d = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.a) {
                    int i7 = action2 != 0 ? 0 : 1;
                    this.a = motionEvent.getPointerId(i7);
                    this.f = motionEvent.getX(i7);
                    this.g = motionEvent.getY(i7);
                }
            }
        } else {
            this.a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            try {
                x = motionEvent.getX(this.b);
            } catch (Exception unused5) {
                x = motionEvent.getX();
            }
            this.f = x;
            try {
                y = motionEvent.getY(this.b);
            } catch (Exception unused6) {
                y = motionEvent.getY();
            }
            this.g = y;
            this.e = false;
        }
        int i8 = this.a;
        this.b = motionEvent.findPointerIndex(i8 != -1 ? i8 : 0);
    }
}
