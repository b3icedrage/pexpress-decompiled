package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.ScrollingView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.carousel.CarouselLayoutManager;
import defpackage.AbstractC7727y;
import defpackage.C1283Jf1;
import defpackage.C1332Jw;
import defpackage.C2703aM1;
import defpackage.C3017bm1;
import defpackage.C3289d50;
import defpackage.C3491e31;
import defpackage.C4564j;
import defpackage.C5345me2;
import defpackage.C5426n2;
import defpackage.Cd2;
import defpackage.Ed2;
import defpackage.G02;
import defpackage.HT0;
import defpackage.Id2;
import defpackage.InterfaceC1205If1;
import defpackage.InterfaceC3282d31;
import defpackage.Jd2;
import defpackage.K1;
import defpackage.QO;
import defpackage.R1;
import defpackage.WE;
import io.jsonwebtoken.JwtParser;
import io.sentry.android.core.b0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, InterfaceC3282d31 {
    public static final int[] F0 = {R.attr.nestedScrollingEnabled};
    public static final float G0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean H0 = true;
    public static final boolean I0 = true;
    public static final boolean J0 = true;
    public static final Class<?>[] K0;
    public static final InterpolatorC2801c L0;
    public static final z M0;
    public int A;
    public final RunnableC2800b A0;
    public boolean B;
    public boolean B0;
    public boolean C;
    public int C0;
    public boolean D;
    public int D0;
    public int E;
    public final d E0;
    public boolean F;
    public final AccessibilityManager G;
    public ArrayList H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;

    @NonNull
    public i M;
    public EdgeEffect N;
    public EdgeEffect O;
    public EdgeEffect P;
    public EdgeEffect Q;
    public j R;
    public int S;
    public int T;
    public VelocityTracker U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public final float d;
    public p d0;
    public final v e;
    public final int e0;
    public final int f0;
    public final t g;
    public final float g0;
    public w h;
    public final float h0;
    public final C2802a i;
    public boolean i0;
    public final C2807f j;
    public final B j0;
    public final J k;
    public androidx.recyclerview.widget.s k0;
    public boolean l;
    public final androidx.recyclerview.widget.s.b l0;
    public final RunnableC2799a m;
    public final y m0;
    public final Rect n;
    public r n0;
    public final Rect o;
    public ArrayList o0;
    public final RectF p;
    public boolean p0;
    public e q;
    public boolean q0;
    public m r;
    public final k r0;
    public u s;
    public boolean s0;
    public final ArrayList t;
    public E t0;
    public final ArrayList<l> u;
    public final int[] u0;
    public final ArrayList<q> v;
    public C3491e31 v0;
    public q w;
    public final int[] w0;
    public boolean x;
    public final int[] x0;
    public boolean y;
    public final int[] y0;
    public boolean z;
    public final ArrayList z0;

    public static abstract class A {
    }

    public class B implements Runnable {
        public int d;
        public int e;
        public OverScroller g;
        public Interpolator h;
        public boolean i;
        public boolean j;

        public B() {
            InterpolatorC2801c interpolatorC2801c = RecyclerView.L0;
            this.h = interpolatorC2801c;
            this.i = false;
            this.j = false;
            this.g = new OverScroller(RecyclerView.this.getContext(), interpolatorC2801c);
        }

        public final void a(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.e = 0;
            this.d = 0;
            Interpolator interpolator = this.h;
            InterpolatorC2801c interpolatorC2801c = RecyclerView.L0;
            if (interpolator != interpolatorC2801c) {
                this.h = interpolatorC2801c;
                this.g = new OverScroller(recyclerView.getContext(), interpolatorC2801c);
            }
            this.g.fling(0, 0, i, i2, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            b();
        }

        public final void b() {
            if (this.i) {
                this.j = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            recyclerView.postOnAnimation(this);
        }

        public final void c(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    iAbs = iAbs2;
                }
                i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            }
            int i4 = i3;
            Interpolator interpolator = baseInterpolator;
            if (baseInterpolator == null) {
                interpolator = RecyclerView.L0;
            }
            if (this.h != interpolator) {
                this.h = interpolator;
                this.g = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.e = 0;
            this.d = 0;
            recyclerView.setScrollState(2);
            this.g.startScroll(0, 0, i, i2, i4);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.r == null) {
                recyclerView.removeCallbacks(this);
                this.g.abortAnimation();
                return;
            }
            this.j = false;
            this.i = true;
            recyclerView.n();
            OverScroller overScroller = this.g;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.d;
                int i7 = currY - this.e;
                this.d = currX;
                this.e = currY;
                int iM = RecyclerView.m(i6, recyclerView.N, recyclerView.P, recyclerView.getWidth());
                int iM2 = RecyclerView.m(i7, recyclerView.O, recyclerView.Q, recyclerView.getHeight());
                int[] iArr = recyclerView.y0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean zT = recyclerView.t(iM, iM2, iArr, null, 1);
                int[] iArr2 = recyclerView.y0;
                if (zT) {
                    iM -= iArr2[0];
                    iM2 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.l(iM, iM2);
                }
                if (recyclerView.q != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.e0(iM, iM2, iArr2);
                    int i8 = iArr2[0];
                    int i9 = iArr2[1];
                    int i10 = iM - i8;
                    int i11 = iM2 - i9;
                    androidx.recyclerview.widget.u uVar = recyclerView.r.e;
                    if (uVar != null && !uVar.d && uVar.e) {
                        int iB = recyclerView.m0.b();
                        if (iB == 0) {
                            uVar.d();
                        } else if (uVar.a >= iB) {
                            uVar.a = iB - 1;
                            uVar.b(i8, i9);
                        } else {
                            uVar.b(i8, i9);
                        }
                    }
                    i = i10;
                    i3 = i8;
                    i2 = i11;
                    i4 = i9;
                } else {
                    i = iM;
                    i2 = iM2;
                    i3 = 0;
                    i4 = 0;
                }
                if (!recyclerView.u.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.y0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.u(i3, i4, i, i2, null, 1, iArr3);
                int i12 = i - iArr2[0];
                int i13 = i2 - iArr2[1];
                if (i3 != 0 || i4 != 0) {
                    recyclerView.v(i3, i4);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                androidx.recyclerview.widget.u uVar2 = recyclerView.r.e;
                if ((uVar2 == null || !uVar2.d) && z) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i12 < 0) {
                            i5 = -currVelocity;
                        } else {
                            i5 = i12 > 0 ? currVelocity : 0;
                        }
                        if (i13 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i13 <= 0) {
                            currVelocity = 0;
                        }
                        if (i5 < 0) {
                            recyclerView.x();
                            if (recyclerView.N.isFinished()) {
                                recyclerView.N.onAbsorb(-i5);
                            }
                        } else if (i5 > 0) {
                            recyclerView.y();
                            if (recyclerView.P.isFinished()) {
                                recyclerView.P.onAbsorb(i5);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.z();
                            if (recyclerView.O.isFinished()) {
                                recyclerView.O.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.w();
                            if (recyclerView.Q.isFinished()) {
                                recyclerView.Q.onAbsorb(currVelocity);
                            }
                        }
                        if (i5 != 0 || currVelocity != 0) {
                            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                    if (RecyclerView.J0) {
                        androidx.recyclerview.widget.s.b bVar = recyclerView.l0;
                        int[] iArr4 = bVar.c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        bVar.d = 0;
                    }
                } else {
                    b();
                    androidx.recyclerview.widget.s sVar = recyclerView.k0;
                    if (sVar != null) {
                        sVar.a(recyclerView, i3, i4);
                    }
                }
            }
            androidx.recyclerview.widget.u uVar3 = recyclerView.r.e;
            if (uVar3 != null && uVar3.d) {
                uVar3.b(0, 0);
            }
            this.i = false;
            if (!this.j) {
                recyclerView.setScrollState(0);
                recyclerView.l0(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    public static abstract class C {
        public static final List<Object> t = Collections.EMPTY_LIST;

        @NonNull
        public final View a;
        public WeakReference<RecyclerView> b;
        public int j;
        public RecyclerView r;
        public e<? extends C> s;
        public int c = -1;
        public int d = -1;
        public long e = -1;
        public int f = -1;
        public int g = -1;
        public C h = null;
        public C i = null;
        public ArrayList k = null;
        public List<Object> l = null;
        public int m = 0;
        public t n = null;
        public boolean o = false;
        public int p = 0;
        public int q = -1;

        public C(@NonNull View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.a = view;
        }

        public final void a(int i) {
            this.j = i | this.j;
        }

        public final int b() {
            int i = this.g;
            return i == -1 ? this.c : i;
        }

        public final List<Object> c() {
            ArrayList arrayList;
            return ((this.j & UserVerificationMethods.USER_VERIFY_ALL) != 0 || (arrayList = this.k) == null || arrayList.size() == 0) ? t : this.l;
        }

        public final boolean d() {
            View view = this.a;
            return (view.getParent() == null || view.getParent() == this.r) ? false : true;
        }

        public final boolean e() {
            return (this.j & 1) != 0;
        }

        public final boolean f() {
            return (this.j & 4) != 0;
        }

        public final boolean g() {
            if ((this.j & 16) != 0) {
                return false;
            }
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            return !this.a.hasTransientState();
        }

        public final boolean h() {
            return (this.j & 8) != 0;
        }

        public final boolean i() {
            return this.n != null;
        }

        public final boolean j() {
            return (this.j & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
        }

        public final boolean k() {
            return (this.j & 2) != 0;
        }

        public final void l(int i, boolean z) {
            if (this.d == -1) {
                this.d = this.c;
            }
            if (this.g == -1) {
                this.g = this.c;
            }
            if (z) {
                this.g += i;
            }
            this.c += i;
            View view = this.a;
            if (view.getLayoutParams() != null) {
                ((n) view.getLayoutParams()).c = true;
            }
        }

        public final void m() {
            this.j = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1L;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            ArrayList arrayList = this.k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.j &= -1025;
            this.p = 0;
            this.q = -1;
            RecyclerView.j(this);
        }

        public final void n(boolean z) {
            int i = this.m;
            int i2 = z ? i - 1 : i + 1;
            this.m = i2;
            if (i2 < 0) {
                this.m = 0;
                b0.c("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i2 == 1) {
                this.j |= 16;
            } else if (z && i2 == 0) {
                this.j &= -17;
            }
        }

        public final boolean o() {
            return (this.j & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
        }

        public final boolean p() {
            return (this.j & 32) != 0;
        }

        public final String toString() {
            StringBuilder sbB = K1.b(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbB.append(Integer.toHexString(hashCode()));
            sbB.append(" position=");
            sbB.append(this.c);
            sbB.append(" id=");
            sbB.append(this.e);
            sbB.append(", oldPos=");
            sbB.append(this.d);
            sbB.append(", pLpos:");
            sbB.append(this.g);
            StringBuilder sb = new StringBuilder(sbB.toString());
            if (i()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (f()) {
                sb.append(" invalid");
            }
            if (!e()) {
                sb.append(" unbound");
            }
            if ((this.j & 2) != 0) {
                sb.append(" update");
            }
            if (h()) {
                sb.append(" removed");
            }
            if (o()) {
                sb.append(" ignored");
            }
            if (j()) {
                sb.append(" tmpDetached");
            }
            if (!g()) {
                sb.append(" not recyclable(" + this.m + ")");
            }
            if ((this.j & UserVerificationMethods.USER_VERIFY_NONE) != 0 || f()) {
                sb.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    public class RunnableC2799a implements Runnable {
        public RunnableC2799a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.z || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.x) {
                recyclerView.requestLayout();
            } else if (recyclerView.C) {
                recyclerView.B = true;
            } else {
                recyclerView.n();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    public class RunnableC2800b implements Runnable {
        public RunnableC2800b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j;
            RecyclerView recyclerView = RecyclerView.this;
            j jVar = recyclerView.R;
            if (jVar != null) {
                androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) jVar;
                ArrayList<C> arrayList = oVar.h;
                boolean zIsEmpty = arrayList.isEmpty();
                ArrayList<androidx.recyclerview.widget.o.b> arrayList2 = oVar.j;
                boolean zIsEmpty2 = arrayList2.isEmpty();
                ArrayList<androidx.recyclerview.widget.o.a> arrayList3 = oVar.k;
                boolean zIsEmpty3 = arrayList3.isEmpty();
                ArrayList<C> arrayList4 = oVar.i;
                boolean zIsEmpty4 = arrayList4.isEmpty();
                if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                    Iterator<C> it = arrayList.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        j = oVar.d;
                        if (!zHasNext) {
                            break;
                        }
                        C next = it.next();
                        View view = next.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        oVar.q.add(next);
                        viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C2811j(view, viewPropertyAnimatorAnimate, oVar, next)).start();
                        arrayList = arrayList;
                    }
                    arrayList.clear();
                    if (!zIsEmpty2) {
                        ArrayList<androidx.recyclerview.widget.o.b> arrayList5 = new ArrayList<>();
                        arrayList5.addAll(arrayList2);
                        oVar.m.add(arrayList5);
                        arrayList2.clear();
                        RunnableC2808g runnableC2808g = new RunnableC2808g(oVar, arrayList5);
                        if (zIsEmpty) {
                            runnableC2808g.run();
                        } else {
                            View view2 = arrayList5.get(0).a.a;
                            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                            view2.postOnAnimationDelayed(runnableC2808g, j);
                        }
                    }
                    if (!zIsEmpty3) {
                        ArrayList<androidx.recyclerview.widget.o.a> arrayList6 = new ArrayList<>();
                        arrayList6.addAll(arrayList3);
                        oVar.n.add(arrayList6);
                        arrayList3.clear();
                        RunnableC2809h runnableC2809h = new RunnableC2809h(oVar, arrayList6);
                        if (zIsEmpty) {
                            runnableC2809h.run();
                        } else {
                            View view3 = arrayList6.get(0).a.a;
                            WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                            view3.postOnAnimationDelayed(runnableC2809h, j);
                        }
                    }
                    if (!zIsEmpty4) {
                        ArrayList<C> arrayList7 = new ArrayList<>();
                        arrayList7.addAll(arrayList4);
                        oVar.l.add(arrayList7);
                        arrayList4.clear();
                        RunnableC2810i runnableC2810i = new RunnableC2810i(oVar, arrayList7);
                        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                            runnableC2810i.run();
                        } else {
                            if (zIsEmpty) {
                                j = 0;
                            }
                            long jMax = Math.max(!zIsEmpty2 ? oVar.e : 0L, zIsEmpty3 ? 0L : oVar.f) + j;
                            View view4 = arrayList7.get(0).a;
                            WeakHashMap<View, C5345me2> weakHashMap3 = Cd2.a;
                            view4.postOnAnimationDelayed(runnableC2810i, jMax);
                        }
                    }
                }
            }
            recyclerView.s0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    public class InterpolatorC2801c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class d {
        public d() {
        }

        public final void a(C c, j.b bVar, j.b bVar2) {
            boolean zG;
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.getClass();
            c.n(false);
            G g = (G) recyclerView.R;
            g.getClass();
            if (bVar == null || ((i = bVar.a) == (i2 = bVar2.a) && bVar.b == bVar2.b)) {
                androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) g;
                oVar.l(c);
                c.a.setAlpha(0.0f);
                oVar.i.add(c);
                zG = true;
            } else {
                zG = g.g(c, i, bVar.b, i2, bVar2.b);
            }
            if (zG) {
                recyclerView.V();
            }
        }

        public final void b(C c, @NonNull j.b bVar, j.b bVar2) {
            boolean zG;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.g.l(c);
            recyclerView.f(c);
            c.n(false);
            G g = (G) recyclerView.R;
            g.getClass();
            int i = bVar.a;
            int i2 = bVar.b;
            View view = c.a;
            int left = bVar2 == null ? view.getLeft() : bVar2.a;
            int top = bVar2 == null ? view.getTop() : bVar2.b;
            if (c.h() || (i == left && i2 == top)) {
                androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) g;
                oVar.l(c);
                oVar.h.add(c);
                zG = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                zG = g.g(c, i, i2, left, top);
            }
            if (zG) {
                recyclerView.V();
            }
        }
    }

    public static abstract class e<VH extends C> {
        public final f a = new f();
        public boolean b = false;
        public final a c = a.d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a d;
            public static final /* synthetic */ a[] e;

            static {
                a aVar = new a("ALLOW", 0);
                d = aVar;
                e = new a[]{aVar, new a("PREVENT_WHEN_EMPTY", 1), new a("PREVENT", 2)};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) e.clone();
            }
        }

        public abstract int c();

        public long d(int i) {
            return -1L;
        }

        public int e(int i) {
            return 0;
        }

        public void f(@NonNull RecyclerView recyclerView) {
        }

        public abstract void g(@NonNull VH vh, int i);

        public void h(@NonNull VH vh, int i, @NonNull List<Object> list) {
            g(vh, i);
        }

        @NonNull
        public abstract VH i(@NonNull ViewGroup viewGroup, int i);

        public void j(@NonNull RecyclerView recyclerView) {
        }

        public boolean k(@NonNull VH vh) {
            return false;
        }

        public void l(@NonNull VH vh) {
        }

        public void m(@NonNull VH vh) {
        }

        public final void n(@NonNull g gVar) {
            this.a.registerObserver(gVar);
        }
    }

    public static class f extends Observable<g> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).e(i, i2);
            }
        }

        public final void d(Object obj, int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).c(obj, i, i2);
            }
        }

        public final void e(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).d(i, i2);
            }
        }

        public final void f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).f(i, i2);
            }
        }
    }

    public interface h {
    }

    public static class i {
    }

    public static abstract class j {
        public k a;
        public ArrayList<a> b;
        public long c;
        public long d;
        public long e;
        public long f;

        public interface a {
            void a();
        }

        public static class b {
            public int a;
            public int b;

            @NonNull
            public final void a(@NonNull C c) {
                View view = c.a;
                this.a = view.getLeft();
                this.b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void b(C c) {
            RecyclerView recyclerView;
            int i = c.j;
            if (c.f() || (i & 4) != 0 || (recyclerView = c.r) == null) {
                return;
            }
            recyclerView.H(c);
        }

        public abstract boolean a(@NonNull C c, @NonNull C c2, @NonNull b bVar, @NonNull b bVar2);

        public final void c(@NonNull C c) {
            k kVar = this.a;
            if (kVar != null) {
                boolean z = true;
                c.n(true);
                if (c.h != null && c.i == null) {
                    c.h = null;
                }
                c.i = null;
                if ((c.j & 16) != 0) {
                    return;
                }
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.j0();
                C2807f c2807f = recyclerView.j;
                androidx.recyclerview.widget.C c2 = c2807f.a;
                RecyclerView recyclerView2 = c2.a;
                View view = c.a;
                int iIndexOfChild = recyclerView2.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    c2807f.j(view);
                } else {
                    C2807f.a aVar = c2807f.b;
                    if (aVar.d(iIndexOfChild)) {
                        aVar.f(iIndexOfChild);
                        c2807f.j(view);
                        c2.a(iIndexOfChild);
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C cK = RecyclerView.K(view);
                    t tVar = recyclerView.g;
                    tVar.l(cK);
                    tVar.i(cK);
                }
                recyclerView.k0(!z);
                if (z || !c.j()) {
                    return;
                }
                recyclerView.removeDetachedView(view, false);
            }
        }

        public abstract void d(@NonNull C c);

        public abstract void e();

        public abstract boolean f();
    }

    public class k {
        public k() {
        }
    }

    public interface o {
        void a(@NonNull View view);
    }

    public static abstract class p {
    }

    public interface q {
        void a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        boolean b(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);
    }

    public static abstract class r {
        public void a(@NonNull RecyclerView recyclerView, int i) {
        }

        public void b(@NonNull RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class s {
        public SparseArray<a> a;
        public int b;
        public Set<e<?>> c;

        public static class a {
            public final ArrayList<C> a = new ArrayList<>();
            public final int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public final a a(int i) {
            SparseArray<a> sparseArray = this.a;
            a aVar = sparseArray.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i, aVar2);
            return aVar2;
        }
    }

    public final class t {
        public final ArrayList<C> a;
        public ArrayList<C> b;
        public final ArrayList<C> c;
        public final List<C> d;
        public int e;
        public int f;
        public s g;

        public t() {
            ArrayList<C> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList<>();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public final void a(@NonNull C c, boolean z) {
            RecyclerView.j(c);
            RecyclerView recyclerView = RecyclerView.this;
            E e = recyclerView.t0;
            View view = c.a;
            if (e != null) {
                E.a aVar = e.e;
                Cd2.l(view, aVar != null ? (R1) aVar.e.remove(view) : null);
            }
            if (z) {
                u uVar = recyclerView.s;
                if (uVar != null) {
                    uVar.a();
                }
                ArrayList arrayList = recyclerView.t;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((u) arrayList.get(i)).a();
                }
                e eVar = recyclerView.q;
                if (eVar != null) {
                    eVar.m(c);
                }
                if (recyclerView.m0 != null) {
                    recyclerView.k.d(c);
                }
            }
            c.s = null;
            c.r = null;
            s sVarC = c();
            sVarC.getClass();
            int i2 = c.f;
            ArrayList<C> arrayList2 = sVarC.a(i2).a;
            if (sVarC.a.get(i2).b <= arrayList2.size()) {
                QO.e(view);
            } else {
                c.m();
                arrayList2.add(c);
            }
        }

        public final int b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i >= 0 && i < recyclerView.m0.b()) {
                return !recyclerView.m0.g ? i : recyclerView.i.f(i, 0);
            }
            StringBuilder sbC = C1332Jw.c(i, "invalid position ", ". State item count is ");
            sbC.append(recyclerView.m0.b());
            sbC.append(recyclerView.A());
            throw new IndexOutOfBoundsException(sbC.toString());
        }

        public final s c() {
            if (this.g == null) {
                s sVar = new s();
                sVar.a = new SparseArray<>();
                sVar.b = 0;
                sVar.c = Collections.newSetFromMap(new IdentityHashMap());
                this.g = sVar;
                d();
            }
            return this.g;
        }

        public final void d() {
            RecyclerView recyclerView;
            e<?> eVar;
            s sVar = this.g;
            if (sVar == null || (eVar = (recyclerView = RecyclerView.this).q) == null || !recyclerView.x) {
                return;
            }
            sVar.c.add(eVar);
        }

        public final void e(e<?> eVar, boolean z) {
            s sVar = this.g;
            if (sVar == null) {
                return;
            }
            Set<e<?>> set = sVar.c;
            set.remove(eVar);
            if (set.size() != 0 || z) {
                return;
            }
            int i = 0;
            while (true) {
                SparseArray<s.a> sparseArray = sVar.a;
                if (i >= sparseArray.size()) {
                    return;
                }
                ArrayList<C> arrayList = sparseArray.get(sparseArray.keyAt(i)).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    QO.e(arrayList.get(i2).a);
                }
                i++;
            }
        }

        public final void f() {
            ArrayList<C> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                g(size);
            }
            arrayList.clear();
            if (RecyclerView.J0) {
                androidx.recyclerview.widget.s.b bVar = RecyclerView.this.l0;
                int[] iArr = bVar.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.d = 0;
            }
        }

        public final void g(int i) {
            ArrayList<C> arrayList = this.c;
            a(arrayList.get(i), true);
            arrayList.remove(i);
        }

        public final void h(@NonNull View view) {
            C cK = RecyclerView.K(view);
            boolean zJ = cK.j();
            RecyclerView recyclerView = RecyclerView.this;
            if (zJ) {
                recyclerView.removeDetachedView(view, false);
            }
            if (cK.i()) {
                cK.n.l(cK);
            } else if (cK.p()) {
                cK.j &= -33;
            }
            i(cK);
            if (recyclerView.R == null || cK.g()) {
                return;
            }
            recyclerView.R.d(cK);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0030  */
        /* JADX WARN: Code duplicated, block: B:47:0x0082  */
        /* JADX WARN: Code duplicated, block: B:49:0x0090  */
        /* JADX WARN: Code duplicated, block: B:51:0x0097  */
        /* JADX WARN: Code duplicated, block: B:54:0x00a0 A[LOOP:2: B:50:0x0095->B:54:0x00a0, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:80:0x00a3 A[EDGE_INSN: B:80:0x00a3->B:55:0x00a3 BREAK  A[LOOP:1: B:46:0x0080->B:53:0x009d], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x00a3 A[EDGE_INSN: B:81:0x00a3->B:55:0x00a3 BREAK  A[LOOP:1: B:46:0x0080->B:53:0x009d, LOOP_LABEL: LOOP:1: B:46:0x0080->B:53:0x009d], SYNTHETIC] */
        public final void i(C c) {
            boolean z;
            boolean z2;
            int i;
            int i2;
            androidx.recyclerview.widget.s.b bVar;
            int i3;
            int i4;
            boolean zI = c.i();
            boolean z3 = false;
            RecyclerView recyclerView = RecyclerView.this;
            boolean z4 = true;
            View view = c.a;
            if (zI || view.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(c.i());
                sb.append(" isAttached:");
                sb.append(view.getParent() != null);
                sb.append(recyclerView.A());
                throw new IllegalArgumentException(sb.toString());
            }
            if (c.j()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c + recyclerView.A());
            }
            if (c.o()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.A());
            }
            if ((c.j & 16) == 0) {
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                if (view.hasTransientState()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            e eVar = recyclerView.q;
            if ((eVar != null && z && eVar.k(c)) || c.g()) {
                if (this.f <= 0 || (c.j & 526) != 0) {
                    z2 = false;
                } else {
                    ArrayList<C> arrayList = this.c;
                    int size = arrayList.size();
                    if (size >= this.f && size > 0) {
                        g(0);
                        size--;
                    }
                    if (RecyclerView.J0 && size > 0) {
                        androidx.recyclerview.widget.s.b bVar2 = recyclerView.l0;
                        int i5 = c.c;
                        if (bVar2.c != null) {
                            int i6 = bVar2.d * 2;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    i = size - 1;
                                    loop1: while (i >= 0) {
                                        i2 = arrayList.get(i).c;
                                        bVar = recyclerView.l0;
                                        if (bVar.c != null) {
                                            break;
                                        }
                                        i3 = bVar.d * 2;
                                        i4 = 0;
                                        while (true) {
                                            if (i4 < i3) {
                                                break loop1;
                                            } else if (bVar.c[i4] == i2) {
                                                break;
                                            } else {
                                                i4 += 2;
                                            }
                                        }
                                        i--;
                                    }
                                    size = i + 1;
                                } else if (bVar2.c[i7] != i5) {
                                    i7 += 2;
                                }
                            }
                        } else {
                            i = size - 1;
                            loop1: while (i >= 0) {
                                i2 = arrayList.get(i).c;
                                bVar = recyclerView.l0;
                                if (bVar.c != null) {
                                    break;
                                    break;
                                }
                                i3 = bVar.d * 2;
                                i4 = 0;
                                while (true) {
                                    if (i4 < i3) {
                                        break loop1;
                                        break loop1;
                                    } else if (bVar.c[i4] == i2) {
                                        break;
                                    } else {
                                        i4 += 2;
                                    }
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                    }
                    arrayList.add(size, c);
                    z2 = true;
                }
                if (z2) {
                    z4 = false;
                } else {
                    a(c, true);
                }
                z3 = z2;
            } else {
                z4 = false;
            }
            recyclerView.k.d(c);
            if (z3 || z4 || !z) {
                return;
            }
            QO.e(view);
            c.s = null;
            c.r = null;
        }

        public final void j(View view) {
            j jVar;
            C cK = RecyclerView.K(view);
            boolean z = (cK.j & 12) != 0;
            RecyclerView recyclerView = RecyclerView.this;
            if (!z && cK.k() && (jVar = recyclerView.R) != null) {
                androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) jVar;
                if (cK.c().isEmpty() && oVar.g && !cK.f()) {
                    if (this.b == null) {
                        this.b = new ArrayList<>();
                    }
                    cK.n = this;
                    cK.o = true;
                    this.b.add(cK);
                    return;
                }
            }
            if (cK.f() && !cK.h() && !recyclerView.q.b) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.A());
            }
            cK.n = this;
            cK.o = false;
            this.a.add(cK);
        }

        /* JADX WARN: Code duplicated, block: B:110:0x01d0  */
        /* JADX WARN: Code duplicated, block: B:178:0x031f A[EDGE_INSN: B:178:0x031f->B:179:0x0320 BREAK  A[LOOP:3: B:173:0x0307->B:177:0x031c]] */
        /* JADX WARN: Code duplicated, block: B:253:0x0467  */
        /* JADX WARN: Code duplicated, block: B:255:0x0470  */
        /* JADX WARN: Code duplicated, block: B:256:0x0473  */
        /* JADX WARN: Code duplicated, block: B:258:0x0476  */
        /* JADX WARN: Code duplicated, block: B:260:0x047c  */
        /* JADX WARN: Code duplicated, block: B:264:0x049c  */
        /* JADX WARN: Code duplicated, block: B:266:0x04a0  */
        /* JADX WARN: Code duplicated, block: B:269:0x04b1  */
        /* JADX WARN: Code duplicated, block: B:274:0x04d0  */
        /* JADX WARN: Code duplicated, block: B:280:0x04e5  */
        /* JADX WARN: Code duplicated, block: B:282:0x04e8  */
        /* JADX WARN: Code duplicated, block: B:284:0x04f1  */
        /* JADX WARN: Code duplicated, block: B:288:0x04f9  */
        /* JADX WARN: Code duplicated, block: B:290:0x04fd  */
        /* JADX WARN: Code duplicated, block: B:293:0x0504  */
        /* JADX WARN: Code duplicated, block: B:295:0x0508  */
        /* JADX WARN: Code duplicated, block: B:296:0x050e  */
        /* JADX WARN: Code duplicated, block: B:301:0x0521  */
        /* JADX WARN: Code duplicated, block: B:304:0x0526  */
        /* JADX WARN: Code duplicated, block: B:308:0x052f  */
        /* JADX WARN: Code duplicated, block: B:309:0x0539  */
        /* JADX WARN: Code duplicated, block: B:311:0x053f  */
        /* JADX WARN: Code duplicated, block: B:312:0x0549  */
        /* JADX WARN: Code duplicated, block: B:315:0x054f A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:317:0x0553  */
        /* JADX WARN: Code duplicated, block: B:35:0x007d A[EDGE_INSN: B:35:0x007d->B:36:0x007e BREAK  A[LOOP:0: B:14:0x0027->B:20:0x0041]] */
        /* JADX WARN: Code duplicated, block: B:77:0x0126  */
        public final C k(int i, long j) {
            boolean z;
            C cI;
            boolean z2;
            long j2;
            long j3;
            boolean z3;
            e<? extends C> eVar;
            boolean z4;
            long nanoTime;
            long j4;
            AccessibilityManager accessibilityManager;
            boolean z5;
            boolean z6;
            boolean z7;
            E e;
            E.a aVar;
            View.AccessibilityDelegate accessibilityDelegateC;
            ArrayList arrayList;
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            n nVar;
            boolean z8;
            RecyclerView recyclerViewF;
            C cRemove;
            View view;
            int iB;
            boolean z9;
            int size;
            int iF;
            boolean z10 = true;
            RecyclerView recyclerView = RecyclerView.this;
            if (i < 0 || i >= recyclerView.m0.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.m0.b() + recyclerView.A());
            }
            y yVar = recyclerView.m0;
            if (yVar.g) {
                ArrayList<C> arrayList2 = this.b;
                if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            if (recyclerView.q.b && (iF = recyclerView.i.f(i, 0)) > 0 && iF < recyclerView.q.c()) {
                                long jD = recyclerView.q.d(iF);
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size) {
                                        cI = null;
                                        break;
                                    }
                                    C c = this.b.get(i3);
                                    if (!c.p() && c.e == jD) {
                                        c.a(32);
                                        cI = c;
                                        break;
                                    }
                                    i3++;
                                }
                            } else {
                                cI = null;
                                break;
                            }
                        } else {
                            cI = this.b.get(i2);
                            if (!cI.p() && cI.b() == i) {
                                cI.a(32);
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    cI = null;
                    break;
                }
                z = cI != null;
            } else {
                z = false;
                cI = null;
            }
            ArrayList<C> arrayList3 = this.c;
            ArrayList<C> arrayList4 = this.a;
            if (cI == null) {
                int size2 = arrayList4.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        ArrayList arrayList5 = recyclerView.j.c;
                        int size3 = arrayList5.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                z2 = z10;
                                view = null;
                                break;
                            }
                            view = (View) arrayList5.get(i5);
                            C cK = RecyclerView.K(view);
                            z2 = z10;
                            if (cK.b() == i && !cK.f() && !cK.h()) {
                                break;
                            }
                            i5++;
                            z10 = z2;
                        }
                        if (view == null) {
                            int size4 = arrayList3.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size4) {
                                    cI = null;
                                    break;
                                }
                                C c2 = arrayList3.get(i6);
                                if (!c2.f() && c2.b() == i && !c2.d()) {
                                    arrayList3.remove(i6);
                                    cI = c2;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            C cK2 = RecyclerView.K(view);
                            C2807f c2807f = recyclerView.j;
                            int iIndexOfChild = c2807f.a.a.indexOfChild(view);
                            if (iIndexOfChild < 0) {
                                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                            }
                            C2807f.a aVar2 = c2807f.b;
                            if (!aVar2.d(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                            }
                            aVar2.a(iIndexOfChild);
                            c2807f.j(view);
                            C2807f c2807f2 = recyclerView.j;
                            int iIndexOfChild2 = c2807f2.a.a.indexOfChild(view);
                            if (iIndexOfChild2 == -1) {
                                iB = -1;
                            } else {
                                C2807f.a aVar3 = c2807f2.b;
                                if (aVar3.d(iIndexOfChild2)) {
                                    iB = -1;
                                } else {
                                    iB = iIndexOfChild2 - aVar3.b(iIndexOfChild2);
                                }
                            }
                            if (iB == -1) {
                                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + cK2 + recyclerView.A());
                            }
                            recyclerView.j.c(iB);
                            j(view);
                            cK2.a(8224);
                            cI = cK2;
                            break;
                        }
                    } else {
                        C c3 = arrayList4.get(i4);
                        if (!c3.p() && c3.b() == i && !c3.f() && (yVar.g || !c3.h())) {
                            c3.a(32);
                            z2 = true;
                            cI = c3;
                            break;
                        }
                        i4++;
                    }
                }
                if (cI != null) {
                    if (cI.h()) {
                        z9 = yVar.g;
                    } else {
                        int i7 = cI.c;
                        if (i7 < 0 || i7 >= recyclerView.q.c()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + cI + recyclerView.A());
                        }
                        if (yVar.g || recyclerView.q.e(cI.c) == cI.f) {
                            e eVar2 = recyclerView.q;
                            if (!eVar2.b || cI.e == eVar2.d(cI.c)) {
                                z9 = z2;
                            } else {
                                z9 = false;
                            }
                        } else {
                            z9 = false;
                        }
                    }
                    if (z9) {
                        z = z2;
                    } else {
                        cI.a(4);
                        if (cI.i()) {
                            recyclerView.removeDetachedView(cI.a, false);
                            cI.n.l(cI);
                        } else if (cI.p()) {
                            cI.j &= -33;
                        }
                        i(cI);
                        cI = null;
                    }
                }
            } else {
                z2 = true;
            }
            if (cI == null) {
                int iF2 = recyclerView.i.f(i, 0);
                if (iF2 < 0 || iF2 >= recyclerView.q.c()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iF2 + ").state:" + yVar.b() + recyclerView.A());
                }
                int iE = recyclerView.q.e(iF2);
                j2 = 3;
                e eVar3 = recyclerView.q;
                if (eVar3.b) {
                    long jD2 = eVar3.d(iF2);
                    int size5 = arrayList4.size() - 1;
                    while (true) {
                        if (size5 < 0) {
                            j3 = 4;
                            int size6 = arrayList3.size() - 1;
                            while (true) {
                                if (size6 >= 0) {
                                    C c4 = arrayList3.get(size6);
                                    if (c4.e != jD2 || c4.d()) {
                                        size6--;
                                    } else {
                                        if (iE == c4.f) {
                                            arrayList3.remove(size6);
                                            cI = c4;
                                            break;
                                        }
                                        g(size6);
                                    }
                                }
                                cI = null;
                                break;
                            }
                        }
                        j3 = 4;
                        C c5 = arrayList4.get(size5);
                        if (c5.e == jD2 && !c5.p()) {
                            if (iE == c5.f) {
                                c5.a(32);
                                if (c5.h() && !yVar.g) {
                                    c5.j = (c5.j & (-15)) | 2;
                                }
                                cI = c5;
                                break;
                            }
                            arrayList4.remove(size5);
                            View view2 = c5.a;
                            recyclerView.removeDetachedView(view2, false);
                            C cK3 = RecyclerView.K(view2);
                            cK3.n = null;
                            cK3.o = false;
                            cK3.j &= -33;
                            i(cK3);
                        }
                        size5--;
                    }
                    if (cI != null) {
                        cI.c = iF2;
                        z = z2;
                    }
                } else {
                    j3 = 4;
                }
                if (cI == null) {
                    s.a aVar4 = c().a.get(iE);
                    if (aVar4 == null) {
                        cRemove = null;
                        break;
                    }
                    ArrayList<C> arrayList6 = aVar4.a;
                    if (!arrayList6.isEmpty()) {
                        int size7 = arrayList6.size() - 1;
                        while (true) {
                            if (size7 < 0) {
                                cRemove = null;
                                break;
                            }
                            if (!arrayList6.get(size7).d()) {
                                cRemove = arrayList6.remove(size7);
                                break;
                            }
                            size7--;
                        }
                    } else {
                        cRemove = null;
                        break;
                    }
                    if (cRemove != null) {
                        cRemove.m();
                        int[] iArr = RecyclerView.F0;
                    }
                    cI = cRemove;
                }
                if (cI == null) {
                    long nanoTime2 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        long j5 = this.g.a(iE).c;
                        if (!((j5 == 0 || j5 + nanoTime2 < j) ? z2 : false)) {
                            return null;
                        }
                    }
                    e eVar4 = recyclerView.q;
                    eVar4.getClass();
                    try {
                        int i8 = G02.a;
                        Trace.beginSection("RV CreateView");
                        cI = eVar4.i(recyclerView, iE);
                        if (cI.a.getParent() != null) {
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        cI.f = iE;
                        Trace.endSection();
                        if (RecyclerView.J0 && (recyclerViewF = RecyclerView.F(cI.a)) != null) {
                            cI.b = new WeakReference<>(recyclerViewF);
                        }
                        long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                        s.a aVarA = this.g.a(iE);
                        long j6 = aVarA.c;
                        if (j6 != 0) {
                            nanoTime3 = (nanoTime3 / j3) + ((j6 / j3) * 3);
                        }
                        aVarA.c = nanoTime3;
                    } catch (Throwable th) {
                        int i9 = G02.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            } else {
                j2 = 3;
                j3 = 4;
            }
            if (z && !yVar.g) {
                int i10 = cI.j;
                if ((i10 & 8192) != 0 ? z2 : false) {
                    cI.j = i10 & (-8193);
                    if (yVar.j) {
                        j.b(cI);
                        j jVar = recyclerView.R;
                        cI.c();
                        jVar.getClass();
                        j.b bVar = new j.b();
                        bVar.a(cI);
                        recyclerView.Y(cI, bVar);
                    }
                }
            }
            boolean z11 = yVar.g;
            View view3 = cI.a;
            if (!z11 || !cI.e()) {
                if (cI.e()) {
                    if (((cI.j & 2) != 0 ? z2 : false) || cI.f()) {
                    }
                    layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2 == null) {
                        nVar = (n) recyclerView.generateDefaultLayoutParams();
                        view3.setLayoutParams(nVar);
                    } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                        nVar = (n) layoutParams2;
                    } else {
                        nVar = (n) recyclerView.generateLayoutParams(layoutParams2);
                        view3.setLayoutParams(nVar);
                    }
                    nVar.a = cI;
                    if (z || !z7) {
                        z8 = z3;
                    } else {
                        z8 = z6;
                    }
                    nVar.d = z8;
                    return cI;
                }
                z3 = false;
                int iF3 = recyclerView.i.f(i, 0);
                R1 r1 = null;
                cI.s = null;
                cI.r = recyclerView;
                int i11 = cI.f;
                long nanoTime4 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j7 = this.g.a(i11).d;
                    if (j7 == 0 || j7 + nanoTime4 < j) {
                        eVar = recyclerView.q;
                        eVar.getClass();
                        if (cI.s == null) {
                            z4 = z2;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            cI.c = iF3;
                            if (eVar.b) {
                                cI.e = eVar.d(iF3);
                            }
                            cI.j = (cI.j & (-520)) | 1;
                            int i12 = G02.a;
                            Trace.beginSection("RV OnBindView");
                        }
                        cI.s = eVar;
                        eVar.h(cI, iF3, cI.c());
                        if (z4) {
                            arrayList = cI.k;
                            if (arrayList != null) {
                                arrayList.clear();
                            }
                            cI.j &= -1025;
                            layoutParams = view3.getLayoutParams();
                            if (layoutParams instanceof n) {
                                ((n) layoutParams).c = z2;
                            }
                            int i13 = G02.a;
                            Trace.endSection();
                        }
                        nanoTime = recyclerView.getNanoTime() - nanoTime4;
                        s.a aVarA2 = this.g.a(cI.f);
                        j4 = aVarA2.d;
                        if (j4 != 0) {
                            nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                        }
                        aVarA2.d = nanoTime;
                        accessibilityManager = recyclerView.G;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                            z6 = true;
                            if (view3.getImportantForAccessibility() == 0) {
                                view3.setImportantForAccessibility(1);
                            }
                            e = recyclerView.t0;
                            if (e != null) {
                                aVar = e.e;
                                if (aVar != null) {
                                    accessibilityDelegateC = Cd2.c(view3);
                                    if (accessibilityDelegateC != null) {
                                        if (accessibilityDelegateC instanceof R1.a) {
                                            r1 = ((R1.a) accessibilityDelegateC).a;
                                        } else {
                                            r1 = new R1(accessibilityDelegateC);
                                        }
                                    }
                                    if (r1 != null && r1 != aVar) {
                                        aVar.e.put(view3, r1);
                                    }
                                }
                                Cd2.l(view3, aVar);
                            }
                        } else {
                            z6 = true;
                        }
                        if (yVar.g) {
                            cI.g = i;
                        }
                        z7 = z6;
                    } else {
                        z7 = false;
                        z6 = z2;
                    }
                } else {
                    eVar = recyclerView.q;
                    eVar.getClass();
                    if (cI.s == null) {
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        cI.c = iF3;
                        if (eVar.b) {
                            cI.e = eVar.d(iF3);
                        }
                        cI.j = (cI.j & (-520)) | 1;
                        int i14 = G02.a;
                        Trace.beginSection("RV OnBindView");
                    }
                    cI.s = eVar;
                    eVar.h(cI, iF3, cI.c());
                    if (z4) {
                        arrayList = cI.k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        cI.j &= -1025;
                        layoutParams = view3.getLayoutParams();
                        if (layoutParams instanceof n) {
                            ((n) layoutParams).c = z2;
                        }
                        int i15 = G02.a;
                        Trace.endSection();
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    s.a aVarA3 = this.g.a(cI.f);
                    j4 = aVarA3.d;
                    if (j4 != 0) {
                        nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                    }
                    aVarA3.d = nanoTime;
                    accessibilityManager = recyclerView.G;
                    if (accessibilityManager == null) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                        z6 = true;
                        if (view3.getImportantForAccessibility() == 0) {
                            view3.setImportantForAccessibility(1);
                        }
                        e = recyclerView.t0;
                        if (e != null) {
                            aVar = e.e;
                            if (aVar != null) {
                                accessibilityDelegateC = Cd2.c(view3);
                                if (accessibilityDelegateC != null) {
                                    if (accessibilityDelegateC instanceof R1.a) {
                                        r1 = ((R1.a) accessibilityDelegateC).a;
                                    } else {
                                        r1 = new R1(accessibilityDelegateC);
                                    }
                                }
                                if (r1 != null) {
                                    aVar.e.put(view3, r1);
                                }
                            }
                            Cd2.l(view3, aVar);
                        }
                    } else {
                        z6 = true;
                    }
                    if (yVar.g) {
                        cI.g = i;
                    }
                    z7 = z6;
                }
                layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 == null) {
                    nVar = (n) recyclerView.generateDefaultLayoutParams();
                    view3.setLayoutParams(nVar);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    nVar = (n) recyclerView.generateLayoutParams(layoutParams2);
                    view3.setLayoutParams(nVar);
                } else {
                    nVar = (n) layoutParams2;
                }
                nVar.a = cI;
                if (z) {
                    z8 = z3;
                } else {
                    z8 = z3;
                }
                nVar.d = z8;
                return cI;
            }
            cI.g = i;
            z6 = z2;
            z7 = false;
            z3 = false;
            layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 == null) {
                nVar = (n) recyclerView.generateDefaultLayoutParams();
                view3.setLayoutParams(nVar);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                nVar = (n) recyclerView.generateLayoutParams(layoutParams2);
                view3.setLayoutParams(nVar);
            } else {
                nVar = (n) layoutParams2;
            }
            nVar.a = cI;
            if (z) {
                z8 = z3;
            } else {
                z8 = z3;
            }
            nVar.d = z8;
            return cI;
        }

        public final void l(C c) {
            if (c.o) {
                this.b.remove(c);
            } else {
                this.a.remove(c);
            }
            c.n = null;
            c.o = false;
            c.j &= -33;
        }

        public final void m() {
            m mVar = RecyclerView.this.r;
            this.f = this.e + (mVar != null ? mVar.j : 0);
            ArrayList<C> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
                g(size);
            }
        }
    }

    public interface u {
        void a();
    }

    public class v extends g {
        public v() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i(null);
            recyclerView.m0.f = true;
            recyclerView.X(true);
            if (recyclerView.i.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(Object obj, int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i(null);
            C2802a c2802a = recyclerView.i;
            if (i2 < 1) {
                c2802a.getClass();
                return;
            }
            ArrayList<C2802a.C0239a> arrayList = c2802a.b;
            arrayList.add(c2802a.h(obj, 4, i, i2));
            c2802a.f |= 4;
            if (arrayList.size() == 1) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i(null);
            C2802a c2802a = recyclerView.i;
            if (i2 < 1) {
                c2802a.getClass();
                return;
            }
            ArrayList<C2802a.C0239a> arrayList = c2802a.b;
            arrayList.add(c2802a.h(null, 1, i, i2));
            c2802a.f |= 1;
            if (arrayList.size() == 1) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i(null);
            C2802a c2802a = recyclerView.i;
            c2802a.getClass();
            if (i == i2) {
                return;
            }
            ArrayList<C2802a.C0239a> arrayList = c2802a.b;
            arrayList.add(c2802a.h(null, 8, i, i2));
            c2802a.f |= 8;
            if (arrayList.size() == 1) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i(null);
            C2802a c2802a = recyclerView.i;
            if (i2 < 1) {
                c2802a.getClass();
                return;
            }
            ArrayList<C2802a.C0239a> arrayList = c2802a.b;
            arrayList.add(c2802a.h(null, 2, i, i2));
            c2802a.f |= 2;
            if (arrayList.size() == 1) {
                g();
            }
        }

        public final void g() {
            boolean z = RecyclerView.I0;
            RecyclerView recyclerView = RecyclerView.this;
            if (z && recyclerView.y && recyclerView.x) {
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                recyclerView.postOnAnimation(recyclerView.m);
            } else {
                recyclerView.F = true;
                recyclerView.requestLayout();
            }
        }
    }

    public static class w extends AbstractC7727y {
        public static final Parcelable.Creator<w> CREATOR = new a();
        public Parcelable g;

        public class a implements Parcelable.ClassLoaderCreator<w> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final w createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new w(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new w[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new w(parcel, null);
            }
        }

        public w(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        @Override // defpackage.AbstractC7727y, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.g, 0);
        }
    }

    public static abstract class x {
        public int a = -1;
        public RecyclerView b;
        public m c;
        public boolean d;
        public boolean e;
        public View f;
        public final a g;
        public boolean h;

        public static class a {
            public int a;
            public int b;
            public int c;
            public int d;
            public BaseInterpolator e;
            public boolean f;
            public int g;

            public final void a(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.P(i);
                    this.f = false;
                    return;
                }
                if (!this.f) {
                    this.g = 0;
                    return;
                }
                BaseInterpolator baseInterpolator = this.e;
                if (baseInterpolator != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i2 = this.c;
                if (i2 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.j0.c(this.a, this.b, i2, baseInterpolator);
                int i3 = this.g + 1;
                this.g = i3;
                if (i3 > 10) {
                    b0.c("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f = false;
            }
        }

        public interface b {
            PointF a(int i);
        }

        public x() {
            a aVar = new a();
            aVar.d = -1;
            aVar.f = false;
            aVar.g = 0;
            aVar.a = 0;
            aVar.b = 0;
            aVar.c = Integer.MIN_VALUE;
            aVar.e = null;
            this.g = aVar;
        }

        public PointF a(int i) {
            Object obj = this.c;
            if (obj instanceof b) {
                return ((b) obj).a(i);
            }
            b0.e("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00fb  */
        public final void b(int i, int i2) {
            PointF pointFA;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                d();
            }
            if (this.d && this.f == null && this.c != null && (pointFA = a(this.a)) != null) {
                float f = pointFA.x;
                if (f != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.e0((int) Math.signum(f), (int) Math.signum(pointFA.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            a aVar = this.g;
            if (view != null) {
                this.b.getClass();
                C cK = RecyclerView.K(view);
                if ((cK != null ? cK.b() : -1) == this.a) {
                    View view2 = this.f;
                    y yVar = recyclerView.m0;
                    c(view2, aVar);
                    aVar.a(recyclerView);
                    d();
                } else {
                    b0.c("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                y yVar2 = recyclerView.m0;
                androidx.recyclerview.widget.u uVar = (androidx.recyclerview.widget.u) this;
                if (uVar.b.r.v() == 0) {
                    uVar.d();
                } else {
                    int i3 = uVar.o;
                    int i4 = i3 - i;
                    if (i3 * i4 <= 0) {
                        i4 = 0;
                    }
                    uVar.o = i4;
                    int i5 = uVar.p;
                    int i6 = i5 - i2;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    uVar.p = i6;
                    if (i4 == 0 && i6 == 0) {
                        PointF pointFA2 = uVar.a(uVar.a);
                        if (pointFA2 != null) {
                            float f2 = pointFA2.x;
                            if (f2 == 0.0f && pointFA2.y == 0.0f) {
                                aVar.d = uVar.a;
                                uVar.d();
                            } else {
                                float f3 = pointFA2.y;
                                float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                                float f4 = pointFA2.x / fSqrt;
                                pointFA2.x = f4;
                                float f5 = pointFA2.y / fSqrt;
                                pointFA2.y = f5;
                                uVar.k = pointFA2;
                                uVar.o = (int) (f4 * 10000.0f);
                                uVar.p = (int) (f5 * 10000.0f);
                                int iH = uVar.h(10000);
                                int i7 = (int) (uVar.o * 1.2f);
                                int i8 = (int) (uVar.p * 1.2f);
                                LinearInterpolator linearInterpolator = uVar.i;
                                aVar.a = i7;
                                aVar.b = i8;
                                aVar.c = (int) (iH * 1.2f);
                                aVar.e = linearInterpolator;
                                aVar.f = true;
                            }
                        } else {
                            aVar.d = uVar.a;
                            uVar.d();
                        }
                    }
                }
                boolean z = aVar.d >= 0;
                aVar.a(recyclerView);
                if (z && this.e) {
                    this.d = true;
                    recyclerView.j0.b();
                }
            }
        }

        public abstract void c(@NonNull View view, @NonNull a aVar);

        public final void d() {
            if (this.e) {
                this.e = false;
                androidx.recyclerview.widget.u uVar = (androidx.recyclerview.widget.u) this;
                uVar.p = 0;
                uVar.o = 0;
                uVar.k = null;
                this.b.m0.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                m mVar = this.c;
                if (mVar.e == this) {
                    mVar.e = null;
                }
                this.c = null;
                this.b = null;
            }
        }
    }

    public static class y {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public int l;
        public long m;
        public int n;

        public final void a(int i) {
            if ((this.d & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
        }

        public final int b() {
            return this.g ? this.b - this.c : this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.a);
            sb.append(", mData=null, mItemCount=");
            sb.append(this.e);
            sb.append(", mIsMeasuring=");
            sb.append(this.i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.c);
            sb.append(", mStructureChanged=");
            sb.append(this.f);
            sb.append(", mInPreLayout=");
            sb.append(this.g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.j);
            sb.append(", mRunPredictiveAnimations=");
            return C4564j.f(sb, this.k, '}');
        }
    }

    public static class z extends i {
    }

    static {
        Class cls = Integer.TYPE;
        K0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        L0 = new InterpolatorC2801c();
        M0 = new z();
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.pexpress.tool.R.attr.recyclerViewStyle);
    }

    public static RecyclerView F(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewF = F(viewGroup.getChildAt(i2));
            if (recyclerViewF != null) {
                return recyclerViewF;
            }
        }
        return null;
    }

    public static C K(View view) {
        if (view == null) {
            return null;
        }
        return ((n) view.getLayoutParams()).a;
    }

    public static void L(View view, Rect rect) {
        n nVar = (n) view.getLayoutParams();
        Rect rect2 = nVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
    }

    private C3491e31 getScrollingChildHelper() {
        if (this.v0 == null) {
            this.v0 = new C3491e31(this);
        }
        return this.v0;
    }

    public static void j(@NonNull C c) {
        WeakReference<RecyclerView> weakReference = c.b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == c.a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            c.b = null;
        }
    }

    public static int m(int i2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i2 > 0 && edgeEffect != null && C3289d50.a(edgeEffect) != 0.0f) {
            int iRound = Math.round(C3289d50.b(edgeEffect, ((-i2) * 4.0f) / i3, 0.5f) * ((-i3) / 4.0f));
            if (iRound != i2) {
                edgeEffect.finish();
            }
            return i2 - iRound;
        }
        if (i2 >= 0 || edgeEffect2 == null || C3289d50.a(edgeEffect2) == 0.0f) {
            return i2;
        }
        float f2 = i3;
        int iRound2 = Math.round(C3289d50.b(edgeEffect2, (i2 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
        if (iRound2 != i2) {
            edgeEffect2.finish();
        }
        return i2 - iRound2;
    }

    public final String A() {
        return " " + super.toString() + ", adapter:" + this.q + ", layout:" + this.r + ", context:" + getContext();
    }

    public final void B(y yVar) {
        if (getScrollState() != 2) {
            yVar.getClass();
            return;
        }
        OverScroller overScroller = this.j0.g;
        overScroller.getFinalX();
        overScroller.getCurrX();
        yVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View C(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<q> arrayList = this.v;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = arrayList.get(i2);
            if (qVar.b(this, motionEvent) && action != 3) {
                this.w = qVar;
                return true;
            }
        }
        return false;
    }

    public final void E(int[] iArr) {
        int iE = this.j.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iE; i4++) {
            C cK = K(this.j.d(i4));
            if (!cK.o()) {
                int iB = cK.b();
                if (iB < i2) {
                    i2 = iB;
                }
                if (iB > i3) {
                    i3 = iB;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public final C G(int i2) {
        C c = null;
        if (this.I) {
            return null;
        }
        int iH = this.j.h();
        for (int i3 = 0; i3 < iH; i3++) {
            C cK = K(this.j.g(i3));
            if (cK != null && !cK.h() && H(cK) == i2) {
                if (!this.j.c.contains(cK.a)) {
                    return cK;
                }
                c = cK;
            }
        }
        return c;
    }

    public final int H(C c) {
        if (((c.j & 524) != 0) || !c.e()) {
            return -1;
        }
        C2802a c2802a = this.i;
        int i2 = c.c;
        ArrayList<C2802a.C0239a> arrayList = c2802a.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C2802a.C0239a c0239a = arrayList.get(i3);
            int i4 = c0239a.a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = c0239a.b;
                    if (i5 <= i2) {
                        int i6 = c0239a.d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = c0239a.b;
                    if (i7 == i2) {
                        i2 = c0239a.d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (c0239a.d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (c0239a.b <= i2) {
                i2 += c0239a.d;
            }
        }
        return i2;
    }

    public final long I(C c) {
        return this.q.b ? c.e : c.c;
    }

    public final C J(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return K(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect M(View view) {
        n nVar = (n) view.getLayoutParams();
        boolean z2 = nVar.c;
        Rect rect = nVar.b;
        if (z2) {
            y yVar = this.m0;
            if (!yVar.g || (!nVar.a.k() && !nVar.a.f())) {
                rect.set(0, 0, 0, 0);
                ArrayList<l> arrayList = this.u;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Rect rect2 = this.n;
                    rect2.set(0, 0, 0, 0);
                    arrayList.get(i2).c(rect2, view, this, yVar);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                nVar.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean N() {
        return !this.z || this.I || this.i.g();
    }

    public final boolean O() {
        return this.K > 0;
    }

    public final void P(int i2) {
        if (this.r == null) {
            return;
        }
        setScrollState(2);
        this.r.o0(i2);
        awakenScrollBars();
    }

    public final void Q() {
        int iH = this.j.h();
        for (int i2 = 0; i2 < iH; i2++) {
            ((n) this.j.g(i2).getLayoutParams()).c = true;
        }
        ArrayList<C> arrayList = this.g.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = (n) arrayList.get(i3).a.getLayoutParams();
            if (nVar != null) {
                nVar.c = true;
            }
        }
    }

    public final void R(int i2, boolean z2, int i3) {
        int i4 = i2 + i3;
        int iH = this.j.h();
        for (int i5 = 0; i5 < iH; i5++) {
            C cK = K(this.j.g(i5));
            if (cK != null && !cK.o()) {
                int i6 = cK.c;
                y yVar = this.m0;
                if (i6 >= i4) {
                    cK.l(-i3, z2);
                    yVar.f = true;
                } else if (i6 >= i2) {
                    cK.a(8);
                    cK.l(-i3, z2);
                    cK.c = i2 - 1;
                    yVar.f = true;
                }
            }
        }
        t tVar = this.g;
        ArrayList<C> arrayList = tVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C c = arrayList.get(size);
            if (c != null) {
                int i7 = c.c;
                if (i7 >= i4) {
                    c.l(-i3, z2);
                } else if (i7 >= i2) {
                    c.a(8);
                    tVar.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void S() {
        this.K++;
    }

    public final void T(boolean z2) {
        int i2;
        AccessibilityManager accessibilityManager;
        int i3 = this.K - 1;
        this.K = i3;
        if (i3 < 1) {
            this.K = 0;
            if (z2) {
                int i4 = this.E;
                this.E = 0;
                if (i4 != 0 && (accessibilityManager = this.G) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i4);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.z0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C c = (C) arrayList.get(size);
                    if (c.a.getParent() == this && !c.o() && (i2 = c.q) != -1) {
                        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                        c.a.setImportantForAccessibility(i2);
                        c.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void U(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.T) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.T = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.a0 = x2;
            this.V = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.b0 = y2;
            this.W = y2;
        }
    }

    public final void V() {
        if (this.s0 || !this.x) {
            return;
        }
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        postOnAnimation(this.A0);
        this.s0 = true;
    }

    public final void W() {
        boolean z2;
        boolean z3 = false;
        if (this.I) {
            C2802a c2802a = this.i;
            c2802a.k(c2802a.b);
            c2802a.k(c2802a.c);
            c2802a.f = 0;
            if (this.J) {
                this.r.W();
            }
        }
        if (this.R == null || !this.r.A0()) {
            this.i.c();
        } else {
            this.i.j();
        }
        boolean z4 = this.p0 || this.q0;
        boolean z5 = this.z && this.R != null && ((z2 = this.I) || z4 || this.r.f) && (!z2 || this.q.b);
        y yVar = this.m0;
        yVar.j = z5;
        if (z5 && z4 && !this.I && this.R != null && this.r.A0()) {
            z3 = true;
        }
        yVar.k = z3;
    }

    public final void X(boolean z2) {
        this.J = z2 | this.J;
        this.I = true;
        int iH = this.j.h();
        for (int i2 = 0; i2 < iH; i2++) {
            C cK = K(this.j.g(i2));
            if (cK != null && !cK.o()) {
                cK.a(6);
            }
        }
        Q();
        t tVar = this.g;
        ArrayList<C> arrayList = tVar.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C c = arrayList.get(i3);
            if (c != null) {
                c.a(6);
                c.a(UserVerificationMethods.USER_VERIFY_ALL);
            }
        }
        e eVar = RecyclerView.this.q;
        if (eVar == null || !eVar.b) {
            tVar.f();
        }
    }

    public final void Y(C c, j.b bVar) {
        c.j &= -8193;
        boolean z2 = this.m0.h;
        J j2 = this.k;
        if (z2 && c.k() && !c.h() && !c.o()) {
            j2.b.g(I(c), c);
        }
        C2703aM1<C, J.a> c2703aM1 = j2.a;
        J.a orDefault = c2703aM1.getOrDefault(c, null);
        if (orDefault == null) {
            orDefault = J.a.a();
            c2703aM1.put(c, orDefault);
        }
        orDefault.b = bVar;
        orDefault.a |= 4;
    }

    public final int Z(int i2, float f2) {
        float height = f2 / getHeight();
        float width = i2 / getWidth();
        EdgeEffect edgeEffect = this.N;
        float f3 = 0.0f;
        if (edgeEffect == null || C3289d50.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.P;
            if (edgeEffect2 != null && C3289d50.a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.P.onRelease();
                } else {
                    float fB = C3289d50.b(this.P, width, height);
                    if (C3289d50.a(this.P) == 0.0f) {
                        this.P.onRelease();
                    }
                    f3 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.N.onRelease();
            } else {
                float f4 = -C3289d50.b(this.N, -width, 1.0f - height);
                if (C3289d50.a(this.N) == 0.0f) {
                    this.N.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    public final int a0(int i2, float f2) {
        float width = f2 / getWidth();
        float height = i2 / getHeight();
        EdgeEffect edgeEffect = this.O;
        float f3 = 0.0f;
        if (edgeEffect == null || C3289d50.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.Q;
            if (edgeEffect2 != null && C3289d50.a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.Q.onRelease();
                } else {
                    float fB = C3289d50.b(this.Q, height, 1.0f - width);
                    if (C3289d50.a(this.Q) == 0.0f) {
                        this.Q.onRelease();
                    }
                    f3 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.O.onRelease();
            } else {
                float f4 = -C3289d50.b(this.O, -height, width);
                if (C3289d50.a(this.O) == 0.0f) {
                    this.O.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        m mVar = this.r;
        if (mVar != null) {
            mVar.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void b0(@NonNull View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.n;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n) {
            n nVar = (n) layoutParams;
            if (!nVar.c) {
                int i2 = rect.left;
                Rect rect2 = nVar.b;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.r.l0(this, view, this.n, !this.z, view2 == null);
    }

    public final void c0() {
        VelocityTracker velocityTracker = this.U;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        l0(0);
        EdgeEffect edgeEffect = this.N;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.N.isFinished();
        }
        EdgeEffect edgeEffect2 = this.O;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.P;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.P.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Q;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.Q.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n) && this.r.f((n) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        m mVar = this.r;
        if (mVar != null && mVar.d()) {
            return this.r.j(this.m0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        m mVar = this.r;
        if (mVar != null && mVar.d()) {
            return this.r.k(this.m0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        m mVar = this.r;
        if (mVar != null && mVar.d()) {
            return this.r.l(this.m0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        m mVar = this.r;
        if (mVar != null && mVar.e()) {
            return this.r.m(this.m0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        m mVar = this.r;
        if (mVar != null && mVar.e()) {
            return this.r.n(this.m0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        m mVar = this.r;
        if (mVar != null && mVar.e()) {
            return this.r.o(this.m0);
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc A[DONT_INVERT, PHI: r7
      0x00fc: PHI (r7v10 boolean) = (r7v8 boolean), (r7v11 boolean) binds: [B:34:0x00e3, B:32:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    public final boolean d0(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        n();
        e eVar = this.q;
        int[] iArr = this.y0;
        if (eVar != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            e0(i2, i3, iArr);
            i5 = iArr[0];
            i6 = iArr[1];
            i7 = i2 - i5;
            i8 = i3 - i6;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.u.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        u(i5, i6, i7, i8, this.w0, i4, iArr);
        int i9 = iArr[0];
        int i10 = i7 - i9;
        int i11 = iArr[1];
        int i12 = i8 - i11;
        boolean z4 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.a0;
        int[] iArr2 = this.w0;
        int i14 = iArr2[0];
        this.a0 = i13 - i14;
        int i15 = this.b0;
        int i16 = iArr2[1];
        this.b0 = i15 - i16;
        int[] iArr3 = this.x0;
        iArr3[0] = iArr3[0] + i14;
        iArr3[1] = iArr3[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z2 = true;
            } else {
                float x2 = motionEvent.getX();
                float f2 = i10;
                float y2 = motionEvent.getY();
                float f3 = i12;
                if (f2 < 0.0f) {
                    x();
                    z2 = true;
                    C3289d50.b(this.N, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else {
                    z2 = true;
                    if (f2 > 0.0f) {
                        y();
                        C3289d50.b(this.P, f2 / getWidth(), y2 / getHeight());
                    } else {
                        z3 = false;
                    }
                    if (f3 < 0.0f) {
                        z();
                        C3289d50.b(this.O, (-f3) / getHeight(), x2 / getWidth());
                    } else if (f3 > 0.0f) {
                        w();
                        C3289d50.b(this.Q, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                    } else if (z3 || f2 != 0.0f || f3 != 0.0f) {
                        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                        postInvalidateOnAnimation();
                    }
                    z3 = z2;
                    if (z3) {
                        WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                        postInvalidateOnAnimation();
                    } else {
                        WeakHashMap<View, C5345me2> weakHashMap3 = Cd2.a;
                        postInvalidateOnAnimation();
                    }
                }
                z3 = z2;
                if (f3 < 0.0f) {
                    z();
                    C3289d50.b(this.O, (-f3) / getHeight(), x2 / getWidth());
                } else if (f3 > 0.0f) {
                    w();
                    C3289d50.b(this.Q, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                } else if (z3) {
                    WeakHashMap<View, C5345me2> weakHashMap4 = Cd2.a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap<View, C5345me2> weakHashMap5 = Cd2.a;
                    postInvalidateOnAnimation();
                }
                z3 = z2;
                if (z3) {
                    WeakHashMap<View, C5345me2> weakHashMap6 = Cd2.a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap<View, C5345me2> weakHashMap7 = Cd2.a;
                    postInvalidateOnAnimation();
                }
            }
            l(i2, i3);
        } else {
            z2 = true;
        }
        if (i5 != 0 || i6 != 0) {
            v(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z4 && i5 == 0 && i6 == 0) {
            return false;
        }
        return z2;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList<l> arrayList = this.u;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).e(canvas, this);
        }
        EdgeEffect edgeEffect = this.N;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.l ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.N;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.O;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.l) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.O;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.P;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.l ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.P;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.Q;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.l) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.Q;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.R == null || arrayList.size() <= 0 || !this.R.f()) ? z2 : true) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e0(int i2, int i3, int[] iArr) {
        C c;
        C2807f c2807f = this.j;
        j0();
        S();
        int i4 = G02.a;
        Trace.beginSection("RV Scroll");
        y yVar = this.m0;
        B(yVar);
        t tVar = this.g;
        int iN0 = i2 != 0 ? this.r.n0(i2, tVar, yVar) : 0;
        int iP0 = i3 != 0 ? this.r.p0(i3, tVar, yVar) : 0;
        Trace.endSection();
        int iE = c2807f.e();
        for (int i5 = 0; i5 < iE; i5++) {
            View viewD = c2807f.d(i5);
            C cJ = J(viewD);
            if (cJ != null && (c = cJ.i) != null) {
                int left = viewD.getLeft();
                int top = viewD.getTop();
                View view = c.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        T(true);
        k0(false);
        if (iArr != null) {
            iArr[0] = iN0;
            iArr[1] = iP0;
        }
    }

    public final void f(C c) {
        View view = c.a;
        boolean z2 = view.getParent() == this;
        this.g.l(J(view));
        if (c.j()) {
            this.j.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.j.a(view, -1, true);
            return;
        }
        C2807f c2807f = this.j;
        int iIndexOfChild = c2807f.a.a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c2807f.b.h(iIndexOfChild);
            c2807f.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void f0(int i2) {
        androidx.recyclerview.widget.u uVar;
        if (this.C) {
            return;
        }
        setScrollState(0);
        B b = this.j0;
        RecyclerView.this.removeCallbacks(b);
        b.g.abortAnimation();
        m mVar = this.r;
        if (mVar != null && (uVar = mVar.e) != null) {
            uVar.d();
        }
        m mVar2 = this.r;
        if (mVar2 == null) {
            b0.c("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            mVar2.o0(i2);
            awakenScrollBars();
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0163  */
    /* JADX WARN: Code duplicated, block: B:137:0x019a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:138:0x019b  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i2) {
        View viewQ;
        int i3;
        byte b;
        boolean z2;
        this.r.getClass();
        boolean z3 = true;
        boolean z4 = (this.q == null || this.r == null || O() || this.C) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        y yVar = this.m0;
        t tVar = this.g;
        if (z4 && (i2 == 2 || i2 == 1)) {
            if (this.r.e()) {
                if (focusFinder.findNextFocus(this, view, i2 == 2 ? 130 : 33) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.r.d()) {
                z2 = focusFinder.findNextFocus(this, view, (this.r.A() == 1) ^ (i2 == 2) ? 66 : 17) == null;
            }
            if (z2) {
                n();
                if (C(view) != null) {
                    j0();
                    this.r.Q(view, i2, tVar, yVar);
                    k0(false);
                }
                return null;
            }
            viewQ = focusFinder.findNextFocus(this, view, i2);
            if (viewQ == null) {
            }
            if (viewQ != null) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (z3) {
                return viewQ;
            }
            return super.focusSearch(view, i2);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i2);
        if (viewFindNextFocus == null && z4) {
            n();
            if (C(view) != null) {
                j0();
                viewQ = this.r.Q(view, i2, tVar, yVar);
                k0(false);
            }
            return null;
        }
        viewQ = viewFindNextFocus;
        if (viewQ == null && !viewQ.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i2);
            }
            b0(viewQ, null);
            return view;
        }
        if (viewQ != null || viewQ == this || viewQ == view) {
            z3 = false;
        } else if (C(viewQ) == null) {
            z3 = false;
        } else if (view != null && C(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.n;
            rect.set(0, 0, width, height);
            int width2 = viewQ.getWidth();
            int height2 = viewQ.getHeight();
            Rect rect2 = this.o;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewQ, rect2);
            int i4 = this.r.A() == 1 ? -1 : 1;
            int i5 = rect.left;
            int i6 = rect2.left;
            if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
                i3 = 1;
            } else {
                int i7 = rect.right;
                int i8 = rect2.right;
                i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
            }
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                b = 1;
            } else {
                int i11 = rect.bottom;
                int i12 = rect2.bottom;
                b = ((i11 > i12 || i9 >= i12) && i9 > i10) ? (byte) -1 : (byte) 0;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 17) {
                        if (i2 != 33) {
                            if (i2 != 66) {
                                if (i2 != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i2 + A());
                                }
                                if (b <= 0) {
                                    z3 = false;
                                }
                            } else if (i3 <= 0) {
                                z3 = false;
                            }
                        } else if (b >= 0) {
                            z3 = false;
                        }
                    } else if (i3 >= 0) {
                        z3 = false;
                    }
                } else if (b <= 0 && (b != 0 || i3 * i4 <= 0)) {
                    z3 = false;
                }
            } else if (b >= 0 && (b != 0 || i3 * i4 >= 0)) {
                z3 = false;
            }
        }
        if (z3) {
            return viewQ;
        }
        return super.focusSearch(view, i2);
    }

    public final void g(@NonNull l lVar) {
        m mVar = this.r;
        if (mVar != null) {
            mVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<l> arrayList = this.u;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(lVar);
        Q();
        requestLayout();
    }

    public final boolean g0(@NonNull EdgeEffect edgeEffect, int i2, int i3) {
        if (i2 > 0) {
            return true;
        }
        float fA = C3289d50.a(edgeEffect) * i3;
        float fAbs = Math.abs(-i2) * 0.35f;
        float f2 = this.d * 0.015f;
        double dLog = Math.log(fAbs / f2);
        double d2 = G0;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f2))) < fA;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.r;
        if (mVar != null) {
            return mVar.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + A());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.r;
        if (mVar != null) {
            return mVar.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + A());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e getAdapter() {
        return this.q;
    }

    @Override // android.view.View
    public int getBaseline() {
        m mVar = this.r;
        if (mVar == null) {
            return super.getBaseline();
        }
        mVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.l;
    }

    public E getCompatAccessibilityDelegate() {
        return this.t0;
    }

    @NonNull
    public i getEdgeEffectFactory() {
        return this.M;
    }

    public j getItemAnimator() {
        return this.R;
    }

    public int getItemDecorationCount() {
        return this.u.size();
    }

    public m getLayoutManager() {
        return this.r;
    }

    public int getMaxFlingVelocity() {
        return this.f0;
    }

    public int getMinFlingVelocity() {
        return this.e0;
    }

    public long getNanoTime() {
        if (J0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public p getOnFlingListener() {
        return this.d0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.i0;
    }

    @NonNull
    public s getRecycledViewPool() {
        return this.g.c();
    }

    public int getScrollState() {
        return this.S;
    }

    public final void h(@NonNull r rVar) {
        if (this.o0 == null) {
            this.o0 = new ArrayList();
        }
        this.o0.add(rVar);
    }

    public final void h0(int i2, boolean z2, int i3) {
        m mVar = this.r;
        if (mVar == null) {
            b0.c("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.C) {
            return;
        }
        if (!mVar.d()) {
            i2 = 0;
        }
        if (!this.r.e()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (z2) {
            int i4 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().g(i4, 1);
        }
        this.j0.c(i2, i3, Integer.MIN_VALUE, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (O()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + A());
        }
        if (this.L > 0) {
            b0.f("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + A()));
        }
    }

    public final void i0(int i2) {
        if (this.C) {
            return;
        }
        m mVar = this.r;
        if (mVar == null) {
            b0.c("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            mVar.y0(this, i2);
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.x;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.C;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j0() {
        int i2 = this.A + 1;
        this.A = i2;
        if (i2 != 1 || this.C) {
            return;
        }
        this.B = false;
    }

    public final void k() {
        int iH = this.j.h();
        for (int i2 = 0; i2 < iH; i2++) {
            C cK = K(this.j.g(i2));
            if (!cK.o()) {
                cK.d = -1;
                cK.g = -1;
            }
        }
        t tVar = this.g;
        ArrayList<C> arrayList = tVar.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C c = arrayList.get(i3);
            c.d = -1;
            c.g = -1;
        }
        ArrayList<C> arrayList2 = tVar.a;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C c2 = arrayList2.get(i4);
            c2.d = -1;
            c2.g = -1;
        }
        ArrayList<C> arrayList3 = tVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                C c3 = tVar.b.get(i5);
                c3.d = -1;
                c3.g = -1;
            }
        }
    }

    public final void k0(boolean z2) {
        if (this.A < 1) {
            this.A = 1;
        }
        if (!z2 && !this.C) {
            this.B = false;
        }
        if (this.A == 1) {
            if (z2 && this.B && !this.C && this.r != null && this.q != null) {
                q();
            }
            if (!this.C) {
                this.B = false;
            }
        }
        this.A--;
    }

    public final void l(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.N;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.N.onRelease();
            zIsFinished = this.N.isFinished();
        }
        EdgeEffect edgeEffect2 = this.P;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.P.onRelease();
            zIsFinished |= this.P.isFinished();
        }
        EdgeEffect edgeEffect3 = this.O;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.O.onRelease();
            zIsFinished |= this.O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Q;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.Q.onRelease();
            zIsFinished |= this.Q.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            postInvalidateOnAnimation();
        }
    }

    public final void l0(int i2) {
        getScrollingChildHelper().h(i2);
    }

    public final void n() {
        C2807f c2807f = this.j;
        C2802a c2802a = this.i;
        if (!this.z || this.I) {
            int i2 = G02.a;
            Trace.beginSection("RV FullInvalidate");
            q();
            Trace.endSection();
            return;
        }
        if (c2802a.g()) {
            int i3 = c2802a.f;
            if ((i3 & 4) == 0 || (i3 & 11) != 0) {
                if (c2802a.g()) {
                    int i4 = G02.a;
                    Trace.beginSection("RV FullInvalidate");
                    q();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i5 = G02.a;
            Trace.beginSection("RV PartialInvalidate");
            j0();
            S();
            c2802a.j();
            if (!this.B) {
                int iE = c2807f.e();
                for (int i6 = 0; i6 < iE; i6++) {
                    C cK = K(c2807f.d(i6));
                    if (cK != null && !cK.o() && cK.k()) {
                        q();
                    }
                }
                c2802a.b();
            }
            k0(true);
            T(true);
            Trace.endSection();
        }
    }

    public final void o(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        setMeasuredDimension(m.g(i2, paddingRight, getMinimumWidth()), m.g(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.K = 0;
        this.x = true;
        this.z = this.z && !isLayoutRequested();
        this.g.d();
        m mVar = this.r;
        if (mVar != null) {
            mVar.g = true;
        }
        this.s0 = false;
        if (J0) {
            ThreadLocal<androidx.recyclerview.widget.s> threadLocal = androidx.recyclerview.widget.s.i;
            androidx.recyclerview.widget.s sVar = threadLocal.get();
            this.k0 = sVar;
            if (sVar == null) {
                this.k0 = new androidx.recyclerview.widget.s();
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.s sVar2 = this.k0;
                sVar2.g = (long) (1.0E9f / refreshRate);
                threadLocal.set(sVar2);
            }
            this.k0.d.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t tVar;
        androidx.recyclerview.widget.s sVar;
        androidx.recyclerview.widget.u uVar;
        super.onDetachedFromWindow();
        j jVar = this.R;
        if (jVar != null) {
            jVar.e();
        }
        setScrollState(0);
        B b = this.j0;
        RecyclerView.this.removeCallbacks(b);
        b.g.abortAnimation();
        m mVar = this.r;
        if (mVar != null && (uVar = mVar.e) != null) {
            uVar.d();
        }
        this.x = false;
        m mVar2 = this.r;
        if (mVar2 != null) {
            mVar2.g = false;
            mVar2.P(this);
        }
        this.z0.clear();
        removeCallbacks(this.A0);
        this.k.getClass();
        while (J.a.d.a() != null) {
        }
        int i2 = 0;
        while (true) {
            tVar = this.g;
            ArrayList<C> arrayList = tVar.c;
            if (i2 >= arrayList.size()) {
                break;
            }
            QO.e(arrayList.get(i2).a);
            i2++;
        }
        tVar.e(RecyclerView.this.q, false);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Iterator<View> it = new Id2(this).iterator();
        while (true) {
            Jd2 jd2 = (Jd2) it;
            if (!jd2.hasNext()) {
                break;
            }
            View view = (View) jd2.next();
            C1283Jf1 c1283Jf1 = (C1283Jf1) view.getTag(com.pexpress.tool.R.id.pooling_container_listener_holder_tag);
            if (c1283Jf1 == null) {
                c1283Jf1 = new C1283Jf1();
                view.setTag(com.pexpress.tool.R.id.pooling_container_listener_holder_tag, c1283Jf1);
            }
            ArrayList<InterfaceC1205If1> arrayList2 = c1283Jf1.a;
            for (int iE = WE.e(arrayList2); -1 < iE; iE--) {
                arrayList2.get(iE).a();
            }
        }
        if (!J0 || (sVar = this.k0) == null) {
            return;
        }
        sVar.d.remove(this);
        this.k0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<l> arrayList = this.u;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).d(canvas, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float axisValue;
        if (this.r != null && !this.C && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.r.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.r.d() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.r.e()) {
                    f2 = -axisValue2;
                } else if (this.r.d()) {
                    axisValue = axisValue2;
                    f2 = 0.0f;
                } else {
                    f2 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f2 = 0.0f;
                axisValue = 0.0f;
            }
            if (f2 != 0.0f || axisValue != 0.0f) {
                int i2 = (int) (axisValue * this.g0);
                int i3 = (int) (f2 * this.h0);
                m mVar = this.r;
                if (mVar == null) {
                    b0.c("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return false;
                }
                if (!this.C) {
                    int[] iArr = this.y0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zD = mVar.d();
                    boolean zE = this.r.e();
                    int i4 = zE ? (zD ? 1 : 0) | 2 : zD ? 1 : 0;
                    float y2 = motionEvent.getY();
                    float x2 = motionEvent.getX();
                    int iZ = i2 - Z(i2, y2);
                    int iA0 = i3 - a0(i3, x2);
                    getScrollingChildHelper().g(i4, 1);
                    if (t(zD ? iZ : 0, zE ? iA0 : 0, this.y0, this.w0, 1)) {
                        iZ -= iArr[0];
                        iA0 -= iArr[1];
                    }
                    d0(zD ? iZ : 0, zE ? iA0 : 0, motionEvent, 1);
                    androidx.recyclerview.widget.s sVar = this.k0;
                    if (sVar != null && (iZ != 0 || iA0 != 0)) {
                        sVar.a(this, iZ, iA0);
                    }
                    l0(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (!this.C) {
            this.w = null;
            if (D(motionEvent)) {
                c0();
                setScrollState(0);
                return true;
            }
            m mVar = this.r;
            if (mVar != null) {
                boolean zD = mVar.d();
                boolean zE = this.r.e();
                if (this.U == null) {
                    this.U = VelocityTracker.obtain();
                }
                this.U.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.D) {
                        this.D = false;
                    }
                    this.T = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.a0 = x2;
                    this.V = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.b0 = y2;
                    this.W = y2;
                    EdgeEffect edgeEffect = this.N;
                    if (edgeEffect == null || C3289d50.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z2 = false;
                    } else {
                        C3289d50.b(this.N, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z2 = true;
                    }
                    EdgeEffect edgeEffect2 = this.P;
                    boolean z4 = z2;
                    if (edgeEffect2 != null) {
                        z4 = z2;
                        if (C3289d50.a(edgeEffect2) != 0.0f) {
                            z4 = z2;
                            if (!canScrollHorizontally(1)) {
                                C3289d50.b(this.P, 0.0f, motionEvent.getY() / getHeight());
                                z4 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.O;
                    boolean z5 = z4;
                    if (edgeEffect3 != null) {
                        z5 = z4;
                        if (C3289d50.a(edgeEffect3) != 0.0f) {
                            z5 = z4;
                            if (!canScrollVertically(-1)) {
                                C3289d50.b(this.O, 0.0f, motionEvent.getX() / getWidth());
                                z5 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.Q;
                    boolean z6 = z5;
                    if (edgeEffect4 != null) {
                        z6 = z5;
                        if (C3289d50.a(edgeEffect4) != 0.0f) {
                            z6 = z5;
                            if (!canScrollVertically(1)) {
                                C3289d50.b(this.Q, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                                z6 = true;
                            }
                        }
                    }
                    if (z6 || this.S == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        l0(1);
                    }
                    int[] iArr = this.x0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i2 = zD;
                    if (zE) {
                        i2 = (zD ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i2, 0);
                } else if (actionMasked == 1) {
                    this.U.clear();
                    l0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.T);
                    if (iFindPointerIndex < 0) {
                        b0.c("RecyclerView", "Error processing scroll; pointer index for id " + this.T + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.S != 1) {
                        int i3 = x3 - this.V;
                        int i4 = y3 - this.W;
                        if (!zD || Math.abs(i3) <= this.c0) {
                            z3 = false;
                        } else {
                            this.a0 = x3;
                            z3 = true;
                        }
                        if (zE && Math.abs(i4) > this.c0) {
                            this.b0 = y3;
                            z3 = true;
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    c0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.T = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.a0 = x4;
                    this.V = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.b0 = y4;
                    this.W = y4;
                } else if (actionMasked == 6) {
                    U(motionEvent);
                }
                if (this.S == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = G02.a;
        Trace.beginSection("RV OnLayout");
        q();
        Trace.endSection();
        this.z = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        m mVar = this.r;
        if (mVar == null) {
            o(i2, i3);
            return;
        }
        boolean zJ = mVar.J();
        boolean z2 = false;
        y yVar = this.m0;
        if (zJ) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.r.b.o(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.B0 = z2;
            if (z2 || this.q == null) {
                return;
            }
            if (yVar.d == 1) {
                r();
            }
            this.r.r0(i2, i3);
            yVar.i = true;
            s();
            this.r.t0(i2, i3);
            if (this.r.w0()) {
                this.r.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                yVar.i = true;
                s();
                this.r.t0(i2, i3);
            }
            this.C0 = getMeasuredWidth();
            this.D0 = getMeasuredHeight();
            return;
        }
        if (this.y) {
            this.r.b.o(i2, i3);
            return;
        }
        if (this.F) {
            j0();
            S();
            W();
            T(true);
            if (yVar.k) {
                yVar.g = true;
            } else {
                this.i.c();
                yVar.g = false;
            }
            this.F = false;
            k0(false);
        } else if (yVar.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        e eVar = this.q;
        if (eVar != null) {
            yVar.e = eVar.c();
        } else {
            yVar.e = 0;
        }
        j0();
        this.r.b.o(i2, i3);
        k0(false);
        yVar.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (O()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w wVar = (w) parcelable;
        this.h = wVar;
        super.onRestoreInstanceState(wVar.d);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w wVar = new w(super.onSaveInstanceState());
        w wVar2 = this.h;
        if (wVar2 != null) {
            wVar.g = wVar2.g;
            return wVar;
        }
        m mVar = this.r;
        if (mVar != null) {
            wVar.g = mVar.d0();
            return wVar;
        }
        wVar.g = null;
        return wVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.Q = null;
        this.O = null;
        this.P = null;
        this.N = null;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x024e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0290  */
    /* JADX WARN: Code duplicated, block: B:199:0x0318  */
    /* JADX WARN: Code duplicated, block: B:262:0x03de  */
    /* JADX WARN: Code duplicated, block: B:264:0x03e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:265:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:266:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd A[PHI: r1
      0x00fd: PHI (r1v70 int) = (r1v54 int), (r1v74 int) binds: [B:51:0x00e6, B:55:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02b2, code lost:
    
        if (r5 == 0) goto L268;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.recyclerview.widget.RecyclerView$m] */
    /* JADX WARN: Type inference failed for: r1v17, types: [e31] */
    /* JADX WARN: Type inference failed for: r1v22, types: [e31] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.recyclerview.widget.B, androidx.recyclerview.widget.H] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instruction units count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view) {
        K(view);
        ArrayList arrayList = this.H;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((o) this.H.get(size)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0349  */
    /* JADX WARN: Code duplicated, block: B:185:0x038d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0390  */
    /* JADX WARN: Code duplicated, block: B:193:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:195:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:197:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:200:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:203:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:206:0x03ca A[LOOP:4: B:199:0x03b7->B:206:0x03ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:212:0x03de  */
    /* JADX WARN: Code duplicated, block: B:215:0x03e8 A[LOOP:5: B:208:0x03d5->B:215:0x03e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:247:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x03eb A[EDGE_INSN: B:251:0x03eb->B:216:0x03eb BREAK  A[LOOP:5: B:208:0x03d5->B:215:0x03e8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.recyclerview.widget.RecyclerView$C] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void q() {
        boolean z2;
        long j2;
        ?? r11;
        int i2;
        int iB;
        int i3;
        int iMin;
        C cG;
        View view;
        C cG2;
        View view2;
        int i4;
        View viewFindViewById;
        ArrayList arrayList;
        View view3;
        boolean z3;
        j.b bVar;
        ?? r3;
        boolean zG;
        boolean z4;
        if (this.q == null) {
            b0.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.r == null) {
            b0.c("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        y yVar = this.m0;
        boolean z5 = false;
        yVar.i = false;
        boolean z6 = true;
        boolean z7 = this.B0 && !(this.C0 == getWidth() && this.D0 == getHeight());
        this.C0 = 0;
        this.D0 = 0;
        this.B0 = false;
        if (yVar.d == 1) {
            r();
            this.r.q0(this);
            s();
        } else {
            C2802a c2802a = this.i;
            if ((c2802a.c.isEmpty() || c2802a.b.isEmpty()) && !z7 && this.r.n == getWidth() && this.r.o == getHeight()) {
                this.r.q0(this);
            } else {
                this.r.q0(this);
                s();
            }
        }
        yVar.a(4);
        j0();
        S();
        yVar.d = 1;
        boolean z8 = yVar.j;
        View view4 = null;
        Long l2 = null;
        t tVar = this.g;
        J j3 = this.k;
        if (z8) {
            int iE = this.j.e() - 1;
            while (iE >= 0) {
                C cK = K(this.j.d(iE));
                if (cK.o()) {
                    z4 = z6;
                } else {
                    long jI = I(cK);
                    this.R.getClass();
                    j.b bVar2 = new j.b();
                    bVar2.a(cK);
                    C c = (C) j3.b.d(jI, l2);
                    if (c == null || c.o()) {
                        z4 = z6;
                        j3.a(cK, bVar2);
                    } else {
                        C2703aM1<C, J.a> c2703aM1 = j3.a;
                        z4 = z6;
                        J.a orDefault = c2703aM1.getOrDefault(c, l2);
                        boolean z9 = (orDefault == null || (orDefault.a & 1) == 0) ? false : z4;
                        J.a orDefault2 = c2703aM1.getOrDefault(cK, l2);
                        boolean z10 = (orDefault2 == null || (orDefault2.a & 1) == 0) ? false : z4;
                        if (z9 && c == cK) {
                            j3.a(cK, bVar2);
                        } else {
                            j.b bVarB = j3.b(c, 4);
                            j3.a(cK, bVar2);
                            j.b bVarB2 = j3.b(cK, 8);
                            if (bVarB == null) {
                                int iE2 = this.j.e();
                                for (int i5 = 0; i5 < iE2; i5++) {
                                    C cK2 = K(this.j.d(i5));
                                    if (cK2 != cK && I(cK2) == jI) {
                                        e eVar = this.q;
                                        if (eVar == null || !eVar.b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + cK2 + " \n View Holder 2:" + cK + A());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + cK2 + " \n View Holder 2:" + cK + A());
                                    }
                                }
                                b0.c("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c + " cannot be found but it is necessary for " + cK + A());
                            } else {
                                c.n(false);
                                if (z9) {
                                    f(c);
                                }
                                if (c != cK) {
                                    if (z10) {
                                        f(cK);
                                    }
                                    c.h = cK;
                                    f(c);
                                    tVar.l(c);
                                    cK.n(false);
                                    cK.i = c;
                                }
                                if (this.R.a(c, cK, bVarB, bVarB2)) {
                                    V();
                                }
                            }
                        }
                    }
                }
                iE--;
                z6 = z4;
                l2 = null;
            }
            z2 = z6;
            C2703aM1<C, J.a> c2703aM2 = j3.a;
            int i6 = c2703aM2.g - 1;
            while (i6 >= 0) {
                C cI = c2703aM2.i(i6);
                J.a aVarK = c2703aM2.k(i6);
                int i7 = aVarK.a;
                int i8 = i7 & 3;
                d dVar = this.E0;
                if (i8 == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.r.i0(cI.a, recyclerView.g);
                    r3 = z5;
                } else if ((i7 & 1) != 0) {
                    j.b bVar3 = aVarK.b;
                    if (bVar3 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.r.i0(cI.a, recyclerView2.g);
                        r3 = z5;
                    } else {
                        dVar.b(cI, bVar3, aVarK.c);
                        r3 = z5;
                    }
                } else if ((i7 & 14) == 14) {
                    dVar.a(cI, aVarK.b, aVarK.c);
                    r3 = z5;
                } else {
                    if ((i7 & 12) == 12) {
                        j.b bVar4 = aVarK.b;
                        j.b bVar5 = aVarK.c;
                        dVar.getClass();
                        cI.n(z5);
                        RecyclerView recyclerView3 = RecyclerView.this;
                        if (!recyclerView3.I) {
                            G g2 = (G) recyclerView3.R;
                            g2.getClass();
                            int i9 = bVar4.a;
                            int i10 = bVar5.a;
                            if (i9 == i10 && bVar4.b == bVar5.b) {
                                g2.c(cI);
                                zG = false;
                            } else {
                                zG = g2.g(cI, i9, bVar4.b, i10, bVar5.b);
                            }
                            if (zG) {
                                recyclerView3.V();
                            }
                        } else if (recyclerView3.R.a(cI, cI, bVar4, bVar5)) {
                            recyclerView3.V();
                        }
                        r3 = 0;
                    } else {
                        if ((i7 & 4) != 0) {
                            bVar = null;
                            dVar.b(cI, aVarK.b, null);
                        } else {
                            bVar = null;
                            if ((i7 & 8) != 0) {
                                dVar.a(cI, aVarK.b, aVarK.c);
                            }
                        }
                        r3 = 0;
                    }
                    aVarK.a = r3;
                    aVarK.b = bVar;
                    aVarK.c = bVar;
                    J.a.d.b(aVarK);
                    i6--;
                    z5 = false;
                }
                bVar = null;
                aVarK.a = r3;
                aVarK.b = bVar;
                aVarK.c = bVar;
                J.a.d.b(aVarK);
                i6--;
                z5 = false;
            }
            view4 = null;
        } else {
            z2 = true;
        }
        this.r.h0(tVar);
        yVar.b = yVar.e;
        this.I = false;
        this.J = false;
        yVar.j = false;
        yVar.k = false;
        this.r.f = false;
        ArrayList<C> arrayList2 = tVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        m mVar = this.r;
        if (mVar.k) {
            mVar.j = 0;
            mVar.k = false;
            tVar.m();
        }
        this.r.b0(yVar);
        boolean z11 = z2;
        T(z11);
        k0(false);
        j3.a.clear();
        j3.b.a();
        int[] iArr = this.u0;
        int i11 = iArr[0];
        int i12 = iArr[z11 ? 1 : 0];
        E(iArr);
        if ((iArr[0] == i11 && iArr[z11 ? 1 : 0] == i12) ? false : true) {
            v(0, 0);
        }
        if (this.i0 && this.q != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j2 = yVar.m;
                if (j2 == -1) {
                    r11 = view4;
                } else {
                    r11 = view4;
                }
                if (r11 != 0) {
                    arrayList = this.j.c;
                    view3 = r11.a;
                    if (!arrayList.contains(view3)) {
                        if (this.j.e() > 0) {
                            int i13 = yVar.l;
                            if (i13 != -1) {
                            }
                            iB = yVar.b();
                            i3 = i2;
                            while (true) {
                                if (i3 < iB) {
                                    cG2 = G(i3);
                                    if (cG2 != null) {
                                        view2 = cG2.a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i2) - 1; iMin >= 0; iMin--) {
                                    cG = G(iMin);
                                    if (cG == null) {
                                        break;
                                        break;
                                    }
                                    view = cG.a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.j.e() > 0) {
                        int i14 = yVar.l;
                        if (i14 != -1) {
                        }
                        iB = yVar.b();
                        i3 = i2;
                        while (true) {
                            if (i3 < iB) {
                                cG2 = G(i3);
                                if (cG2 != null) {
                                    view2 = cG2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                cG = G(iMin);
                                if (cG == null) {
                                    break;
                                    break;
                                }
                                view = cG.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.j.e() > 0) {
                    int i15 = yVar.l;
                    if (i15 != -1) {
                    }
                    iB = yVar.b();
                    i3 = i2;
                    while (true) {
                        if (i3 < iB) {
                            cG2 = G(i3);
                            if (cG2 != null) {
                                view2 = cG2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            cG = G(iMin);
                            if (cG == null) {
                                break;
                                break;
                            }
                            view = cG.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i4 = yVar.n;
                    if (i4 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (this.j.c.contains(getFocusedChild())) {
                j2 = yVar.m;
                if (j2 == -1 && (z3 = this.q.b) && z3) {
                    int iH = this.j.h();
                    int i16 = 0;
                    r11 = view4;
                    while (i16 < iH) {
                        C cK3 = K(this.j.g(i16));
                        if (cK3 != null && !cK3.h() && cK3.e == j2) {
                            if (!this.j.c.contains(cK3.a)) {
                                r11 = cK3;
                                break;
                            }
                            r11 = cK3;
                        }
                        i16++;
                        r11 = r11;
                    }
                } else {
                    r11 = view4;
                }
                if (r11 != 0) {
                    arrayList = this.j.c;
                    view3 = r11.a;
                    if (!arrayList.contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (this.j.e() > 0) {
                        int i17 = yVar.l;
                        i2 = i17 != -1 ? i17 : 0;
                        iB = yVar.b();
                        i3 = i2;
                        while (true) {
                            if (i3 < iB) {
                                cG2 = G(i3);
                                if (cG2 != null) {
                                    view2 = cG2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                cG = G(iMin);
                                if (cG == null) {
                                    break;
                                }
                                view = cG.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.j.e() > 0) {
                    int i18 = yVar.l;
                    if (i18 != -1) {
                    }
                    iB = yVar.b();
                    i3 = i2;
                    while (true) {
                        if (i3 < iB) {
                            cG2 = G(i3);
                            if (cG2 != null) {
                                view2 = cG2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            cG = G(iMin);
                            if (cG == null) {
                                break;
                                break;
                            }
                            view = cG.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i4 = yVar.n;
                    if (i4 != -1 && (viewFindViewById = view4.findViewById(i4)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        yVar.m = -1L;
        yVar.l = -1;
        yVar.n = -1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    public final void r() {
        View viewC;
        int iH;
        J.a orDefault;
        y yVar = this.m0;
        yVar.a(1);
        B(yVar);
        yVar.i = false;
        j0();
        J j2 = this.k;
        j2.a.clear();
        HT0<C> ht0 = j2.b;
        ht0.a();
        S();
        W();
        View focusedChild = (this.i0 && hasFocus() && this.q != null) ? getFocusedChild() : null;
        C cJ = (focusedChild == null || (viewC = C(focusedChild)) == null) ? null : J(viewC);
        if (cJ == null) {
            yVar.m = -1L;
            yVar.l = -1;
            yVar.n = -1;
        } else {
            yVar.m = this.q.b ? cJ.e : -1L;
            if (this.I) {
                iH = -1;
            } else if (cJ.h()) {
                iH = cJ.d;
            } else {
                RecyclerView recyclerView = cJ.r;
                if (recyclerView == null) {
                    iH = -1;
                } else {
                    iH = recyclerView.H(cJ);
                }
            }
            yVar.l = iH;
            View focusedChild2 = cJ.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            yVar.n = id;
        }
        yVar.h = yVar.j && this.q0;
        this.q0 = false;
        this.p0 = false;
        yVar.g = yVar.k;
        yVar.e = this.q.c();
        E(this.u0);
        boolean z2 = yVar.j;
        C2703aM1<C, J.a> c2703aM1 = j2.a;
        if (z2) {
            int iE = this.j.e();
            for (int i2 = 0; i2 < iE; i2++) {
                C cK = K(this.j.d(i2));
                if (!cK.o() && (!cK.f() || this.q.b)) {
                    j jVar = this.R;
                    j.b(cK);
                    cK.c();
                    jVar.getClass();
                    j.b bVar = new j.b();
                    bVar.a(cK);
                    J.a orDefault2 = c2703aM1.getOrDefault(cK, null);
                    if (orDefault2 == null) {
                        orDefault2 = J.a.a();
                        c2703aM1.put(cK, orDefault2);
                    }
                    orDefault2.b = bVar;
                    orDefault2.a |= 4;
                    if (yVar.h && cK.k() && !cK.h() && !cK.o() && !cK.f()) {
                        ht0.g(I(cK), cK);
                    }
                }
            }
        }
        if (yVar.k) {
            int iH2 = this.j.h();
            for (int i3 = 0; i3 < iH2; i3++) {
                C cK2 = K(this.j.g(i3));
                if (!cK2.o() && cK2.d == -1) {
                    cK2.d = cK2.c;
                }
            }
            boolean z3 = yVar.f;
            yVar.f = false;
            this.r.a0(this.g, yVar);
            yVar.f = z3;
            for (int i4 = 0; i4 < this.j.e(); i4++) {
                C cK3 = K(this.j.d(i4));
                if (!cK3.o() && ((orDefault = c2703aM1.getOrDefault(cK3, null)) == null || (orDefault.a & 4) == 0)) {
                    j.b(cK3);
                    boolean z4 = (cK3.j & 8192) != 0;
                    j jVar2 = this.R;
                    cK3.c();
                    jVar2.getClass();
                    j.b bVar2 = new j.b();
                    bVar2.a(cK3);
                    if (z4) {
                        Y(cK3, bVar2);
                    } else {
                        J.a orDefault3 = c2703aM1.getOrDefault(cK3, null);
                        if (orDefault3 == null) {
                            orDefault3 = J.a.a();
                            c2703aM1.put(cK3, orDefault3);
                        }
                        orDefault3.a |= 2;
                        orDefault3.b = bVar2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        T(true);
        k0(false);
        yVar.d = 2;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        C cK = K(view);
        if (cK != null) {
            if (cK.j()) {
                cK.j &= -257;
            } else if (!cK.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + cK + A());
            }
        }
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        androidx.recyclerview.widget.u uVar = this.r.e;
        if ((uVar == null || !uVar.e) && !O() && view2 != null) {
            b0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.r.l0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList<q> arrayList = this.v;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A != 0 || this.C) {
            this.B = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        j0();
        S();
        y yVar = this.m0;
        yVar.a(6);
        this.i.c();
        yVar.e = this.q.c();
        yVar.c = 0;
        if (this.h != null) {
            e eVar = this.q;
            int iOrdinal = eVar.c.ordinal();
            if (iOrdinal == 1 ? eVar.c() > 0 : iOrdinal != 2) {
                Parcelable parcelable = this.h.g;
                if (parcelable != null) {
                    this.r.c0(parcelable);
                }
                this.h = null;
            }
        }
        yVar.g = false;
        this.r.a0(this.g, yVar);
        yVar.f = false;
        yVar.j = yVar.j && this.R != null;
        yVar.d = 4;
        T(true);
        k0(false);
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        m mVar = this.r;
        if (mVar == null) {
            b0.c("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.C) {
            return;
        }
        boolean zD = mVar.d();
        boolean zE = this.r.e();
        if (zD || zE) {
            if (!zD) {
                i2 = 0;
            }
            if (!zE) {
                i3 = 0;
            }
            d0(i2, i3, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        b0.e("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!O()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.E |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(E e2) {
        this.t0 = e2;
        Cd2.l(this, e2);
    }

    public void setAdapter(e eVar) {
        setLayoutFrozen(false);
        e eVar2 = this.q;
        v vVar = this.e;
        if (eVar2 != null) {
            eVar2.a.unregisterObserver(vVar);
            this.q.j(this);
        }
        j jVar = this.R;
        if (jVar != null) {
            jVar.e();
        }
        m mVar = this.r;
        t tVar = this.g;
        if (mVar != null) {
            mVar.g0(tVar);
            this.r.h0(tVar);
        }
        tVar.a.clear();
        tVar.f();
        C2802a c2802a = this.i;
        c2802a.k(c2802a.b);
        c2802a.k(c2802a.c);
        c2802a.f = 0;
        e<?> eVar3 = this.q;
        this.q = eVar;
        if (eVar != null) {
            eVar.n(vVar);
            eVar.f(this);
        }
        m mVar2 = this.r;
        if (mVar2 != null) {
            mVar2.O();
        }
        e eVar4 = this.q;
        tVar.a.clear();
        tVar.f();
        tVar.e(eVar3, true);
        s sVarC = tVar.c();
        if (eVar3 != null) {
            sVarC.b--;
        }
        if (sVarC.b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray<s.a> sparseArray = sVarC.a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                s.a aVarValueAt = sparseArray.valueAt(i2);
                Iterator<C> it = aVarValueAt.a.iterator();
                while (it.hasNext()) {
                    QO.e(it.next().a);
                }
                aVarValueAt.a.clear();
                i2++;
            }
        }
        if (eVar4 != null) {
            sVarC.b++;
        }
        tVar.d();
        this.m0.f = true;
        X(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(h hVar) {
        if (hVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.l) {
            this.Q = null;
            this.O = null;
            this.P = null;
            this.N = null;
        }
        this.l = z2;
        super.setClipToPadding(z2);
        if (this.z) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull i iVar) {
        iVar.getClass();
        this.M = iVar;
        this.Q = null;
        this.O = null;
        this.P = null;
        this.N = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.y = z2;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.R;
        if (jVar2 != null) {
            jVar2.e();
            this.R.a = null;
        }
        this.R = jVar;
        if (jVar != null) {
            jVar.a = this.r0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        t tVar = this.g;
        tVar.e = i2;
        tVar.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(m mVar) {
        RecyclerView recyclerView;
        androidx.recyclerview.widget.u uVar;
        if (mVar == this.r) {
            return;
        }
        setScrollState(0);
        B b = this.j0;
        RecyclerView.this.removeCallbacks(b);
        b.g.abortAnimation();
        m mVar2 = this.r;
        if (mVar2 != null && (uVar = mVar2.e) != null) {
            uVar.d();
        }
        m mVar3 = this.r;
        t tVar = this.g;
        if (mVar3 != null) {
            j jVar = this.R;
            if (jVar != null) {
                jVar.e();
            }
            this.r.g0(tVar);
            this.r.h0(tVar);
            tVar.a.clear();
            tVar.f();
            if (this.x) {
                m mVar4 = this.r;
                mVar4.g = false;
                mVar4.P(this);
            }
            this.r.u0(null);
            this.r = null;
        } else {
            tVar.a.clear();
            tVar.f();
        }
        C2807f c2807f = this.j;
        c2807f.b.g();
        ArrayList arrayList = c2807f.c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = c2807f.a.a;
            if (size < 0) {
                break;
            }
            C cK = K((View) arrayList.get(size));
            if (cK != null) {
                int i2 = cK.p;
                if (recyclerView.O()) {
                    cK.q = i2;
                    recyclerView.z0.add(cK);
                } else {
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    cK.a.setImportantForAccessibility(i2);
                }
                cK.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.p(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.r = mVar;
        if (mVar != null) {
            if (mVar.b != null) {
                throw new IllegalArgumentException("LayoutManager " + mVar + " is already attached to a RecyclerView:" + mVar.b.A());
            }
            mVar.u0(this);
            if (this.x) {
                this.r.g = true;
            }
        }
        tVar.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C3491e31 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            Cd2.d.z(scrollingChildHelper.c);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(p pVar) {
        this.d0 = pVar;
    }

    @Deprecated
    public void setOnScrollListener(r rVar) {
        this.n0 = rVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.i0 = z2;
    }

    public void setRecycledViewPool(s sVar) {
        t tVar = this.g;
        RecyclerView recyclerView = RecyclerView.this;
        tVar.e(recyclerView.q, false);
        s sVar2 = tVar.g;
        if (sVar2 != null) {
            sVar2.b--;
        }
        tVar.g = sVar;
        if (sVar != null && recyclerView.getAdapter() != null) {
            tVar.g.b++;
        }
        tVar.d();
    }

    @Deprecated
    public void setRecyclerListener(u uVar) {
        this.s = uVar;
    }

    public void setScrollState(int i2) {
        androidx.recyclerview.widget.u uVar;
        if (i2 == this.S) {
            return;
        }
        this.S = i2;
        if (i2 != 2) {
            B b = this.j0;
            RecyclerView.this.removeCallbacks(b);
            b.g.abortAnimation();
            m mVar = this.r;
            if (mVar != null && (uVar = mVar.e) != null) {
                uVar.d();
            }
        }
        m mVar2 = this.r;
        if (mVar2 != null) {
            mVar2.e0(i2);
        }
        r rVar = this.n0;
        if (rVar != null) {
            rVar.a(this, i2);
        }
        ArrayList arrayList = this.o0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((r) this.o0.get(size)).a(this, i2);
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.c0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            b0.e("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.c0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(A a) {
        this.g.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        androidx.recyclerview.widget.u uVar;
        if (z2 != this.C) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.C = false;
                if (this.B && this.r != null && this.q != null) {
                    requestLayout();
                }
                this.B = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.C = true;
            this.D = true;
            setScrollState(0);
            B b = this.j0;
            RecyclerView.this.removeCallbacks(b);
            b.g.abortAnimation();
            m mVar = this.r;
            if (mVar == null || (uVar = mVar.e) == null) {
                return;
            }
            uVar.d();
        }
    }

    public final boolean t(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    public final void u(int i2, int i3, int i4, int i5, int[] iArr, int i6, @NonNull int[] iArr2) {
        getScrollingChildHelper().d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public final void v(int i2, int i3) {
        this.L++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        r rVar = this.n0;
        if (rVar != null) {
            rVar.b(this, i2, i3);
        }
        ArrayList arrayList = this.o0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((r) this.o0.get(size)).b(this, i2, i3);
            }
        }
        this.L--;
    }

    public final void w() {
        if (this.Q != null) {
            return;
        }
        ((z) this.M).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Q = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void x() {
        if (this.N != null) {
            return;
        }
        ((z) this.M).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.N = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void y() {
        if (this.P != null) {
            return;
        }
        ((z) this.M).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.P = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.O != null) {
            return;
        }
        ((z) this.M).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.O = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet, int i2) {
        float fA;
        int i3;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i2);
        this.e = new v();
        this.g = new t();
        this.k = new J();
        this.m = new RunnableC2799a();
        this.n = new Rect();
        this.o = new Rect();
        this.p = new RectF();
        this.t = new ArrayList();
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        this.A = 0;
        this.I = false;
        this.J = false;
        this.K = 0;
        this.L = 0;
        this.M = M0;
        androidx.recyclerview.widget.o oVar = new androidx.recyclerview.widget.o();
        oVar.a = null;
        oVar.b = new ArrayList<>();
        oVar.c = 120L;
        oVar.d = 120L;
        oVar.e = 250L;
        oVar.f = 250L;
        oVar.g = true;
        oVar.h = new ArrayList<>();
        oVar.i = new ArrayList<>();
        oVar.j = new ArrayList<>();
        oVar.k = new ArrayList<>();
        oVar.l = new ArrayList<>();
        oVar.m = new ArrayList<>();
        oVar.n = new ArrayList<>();
        oVar.o = new ArrayList<>();
        oVar.p = new ArrayList<>();
        oVar.q = new ArrayList<>();
        oVar.r = new ArrayList<>();
        this.R = oVar;
        this.S = 0;
        this.T = -1;
        this.g0 = Float.MIN_VALUE;
        this.h0 = Float.MIN_VALUE;
        this.i0 = true;
        this.j0 = new B();
        this.l0 = J0 ? new androidx.recyclerview.widget.s.b() : null;
        y yVar = new y();
        yVar.a = -1;
        yVar.b = 0;
        yVar.c = 0;
        yVar.d = 1;
        yVar.e = 0;
        yVar.f = false;
        yVar.g = false;
        yVar.h = false;
        yVar.i = false;
        yVar.j = false;
        yVar.k = false;
        this.m0 = yVar;
        this.p0 = false;
        this.q0 = false;
        k kVar = new k();
        this.r0 = kVar;
        this.s0 = false;
        this.u0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = new int[2];
        this.z0 = new ArrayList();
        this.A0 = new RunnableC2800b();
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.c0 = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = Ed2.a;
            fA = Ed2.a.a(viewConfiguration);
        } else {
            fA = Ed2.a(viewConfiguration, context);
        }
        this.g0 = fA;
        this.h0 = i4 >= 26 ? Ed2.a.b(viewConfiguration) : Ed2.a(viewConfiguration, context);
        this.e0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.R.a = kVar;
        this.i = new C2802a(new D(this));
        this.j = new C2807f(new androidx.recyclerview.widget.C(this));
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if ((i4 >= 26 ? Cd2.g.c(this) : 0) == 0 && i4 >= 26) {
            Cd2.g.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.G = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new E(this));
        int[] iArr = C3017bm1.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        Cd2.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.l = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + A());
            }
            Resources resources = getContext().getResources();
            i3 = 4;
            new androidx.recyclerview.widget.r(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.pexpress.tool.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.pexpress.tool.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.pexpress.tool.R.dimen.fastscroll_margin));
        } else {
            i3 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + JwtParser.SEPARATOR_CHAR + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(m.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(K0);
                        objArr = new Object[i3];
                        objArr[0] = context;
                        objArr[r11] = attributeSet;
                        objArr[2] = Integer.valueOf(i2);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((m) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e4);
                } catch (ClassNotFoundException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e6);
                } catch (InstantiationException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e8);
                }
            }
        }
        int[] iArr2 = F0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        Cd2.k(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        Intrinsics.checkNotNullParameter(this, "<this>");
        setTag(com.pexpress.tool.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static class n extends ViewGroup.MarginLayoutParams {
        public C a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public n(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public n(n nVar) {
            super((ViewGroup.LayoutParams) nVar);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.r;
        if (mVar != null) {
            return mVar.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + A());
    }

    public static abstract class g {
        public void a() {
        }

        public void c(Object obj, int i, int i2) {
            b();
        }

        public void d(int i, int i2) {
        }

        public void f(int i, int i2) {
        }

        public void b() {
        }

        public void e(int i, int i2) {
        }
    }

    public static abstract class m {
        public C2807f a;
        public RecyclerView b;
        public final I c;
        public final I d;
        public androidx.recyclerview.widget.u e;
        public boolean f;
        public boolean g;
        public final boolean h;
        public final boolean i;
        public int j;
        public boolean k;
        public int l;
        public int m;
        public int n;
        public int o;

        public class a implements I.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.I.b
            public final int a(View view) {
                return (view.getLeft() - ((n) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.I.b
            public final int b() {
                return m.this.C();
            }

            @Override // androidx.recyclerview.widget.I.b
            public final int c() {
                m mVar = m.this;
                return mVar.n - mVar.D();
            }

            @Override // androidx.recyclerview.widget.I.b
            public final View d(int i) {
                return m.this.u(i);
            }

            @Override // androidx.recyclerview.widget.I.b
            public final int e(View view) {
                return view.getRight() + ((n) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements I.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.I.b
            public final int a(View view) {
                return (view.getTop() - ((n) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.I.b
            public final int b() {
                return m.this.E();
            }

            @Override // androidx.recyclerview.widget.I.b
            public final int c() {
                m mVar = m.this;
                return mVar.o - mVar.B();
            }

            @Override // androidx.recyclerview.widget.I.b
            public final View d(int i) {
                return m.this.u(i);
            }

            @Override // androidx.recyclerview.widget.I.b
            public final int e(View view) {
                return view.getBottom() + ((n) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).bottomMargin;
            }
        }

        public static class c {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public m() {
            a aVar = new a();
            b bVar = new b();
            this.c = new I(aVar);
            this.d = new I(bVar);
            this.f = false;
            this.g = false;
            this.h = true;
            this.i = true;
        }

        public static int F(@NonNull View view) {
            return ((n) view.getLayoutParams()).a.b();
        }

        public static c G(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
            c cVar = new c();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3017bm1.a, i, i2);
            cVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
            cVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
            cVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            cVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return cVar;
        }

        public static boolean K(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public static void L(@NonNull View view, int i, int i2, int i3, int i4) {
            n nVar = (n) view.getLayoutParams();
            Rect rect = nVar.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) nVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) nVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) nVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public static int g(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int w(boolean z, int i, int i2, int i3, int i4) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i2 = 1073741824;
                } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 == -1) {
                i4 = iMax;
            } else if (i4 != -2) {
                i2 = 0;
                i4 = 0;
            } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                i4 = iMax;
                i2 = Integer.MIN_VALUE;
            } else {
                i4 = iMax;
                i2 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public final int A() {
            RecyclerView recyclerView = this.b;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            return recyclerView.getLayoutDirection();
        }

        public boolean A0() {
            return false;
        }

        public final int B() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int C() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int D() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int E() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int H(@NonNull t tVar, @NonNull y yVar) {
            return -1;
        }

        public final void I(@NonNull View view, @NonNull Rect rect) {
            Matrix matrix;
            Rect rect2 = ((n) view.getLayoutParams()).b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.p;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean J() {
            return false;
        }

        public void M(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int iE = recyclerView.j.e();
                for (int i2 = 0; i2 < iE; i2++) {
                    recyclerView.j.d(i2).offsetLeftAndRight(i);
                }
            }
        }

        public void N(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int iE = recyclerView.j.e();
                for (int i2 = 0; i2 < iE; i2++) {
                    recyclerView.j.d(i2).offsetTopAndBottom(i);
                }
            }
        }

        public View Q(@NonNull View view, int i, @NonNull t tVar, @NonNull y yVar) {
            return null;
        }

        public void R(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            t tVar = recyclerView.g;
            if (accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            e eVar = this.b.q;
            if (eVar != null) {
                accessibilityEvent.setItemCount(eVar.c());
            }
        }

        public void S(@NonNull t tVar, @NonNull y yVar, @NonNull C5426n2 c5426n2) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                c5426n2.a(8192);
                c5426n2.l(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                c5426n2.a(4096);
                c5426n2.l(true);
            }
            c5426n2.a.setCollectionInfo(C5426n2.e.a(H(tVar, yVar), x(tVar, yVar), 0).a);
        }

        public final void T(View view, C5426n2 c5426n2) {
            C cK = RecyclerView.K(view);
            if (cK == null || cK.h() || this.a.c.contains(cK.a)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            U(recyclerView.g, recyclerView.m0, view, c5426n2);
        }

        @SuppressLint({"UnknownNullness"})
        public void a0(t tVar, y yVar) {
            b0.c("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0064  */
        public final void b(View view, int i, boolean z) {
            int iB;
            C cK = RecyclerView.K(view);
            if (z || cK.h()) {
                C2703aM1<C, J.a> c2703aM1 = this.b.k.a;
                J.a orDefault = c2703aM1.getOrDefault(cK, null);
                if (orDefault == null) {
                    orDefault = J.a.a();
                    c2703aM1.put(cK, orDefault);
                }
                orDefault.a |= 1;
            } else {
                this.b.k.c(cK);
            }
            n nVar = (n) view.getLayoutParams();
            if (cK.p() || cK.i()) {
                if (cK.i()) {
                    cK.n.l(cK);
                } else {
                    cK.j &= -33;
                }
                this.a.b(view, i, view.getLayoutParams(), false);
            } else {
                if (view.getParent() == this.b) {
                    C2807f c2807f = this.a;
                    int iIndexOfChild = c2807f.a.a.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        iB = -1;
                    } else {
                        C2807f.a aVar = c2807f.b;
                        if (aVar.d(iIndexOfChild)) {
                            iB = -1;
                        } else {
                            iB = iIndexOfChild - aVar.b(iIndexOfChild);
                        }
                    }
                    if (i == -1) {
                        i = this.a.e();
                    }
                    if (iB == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.A());
                    }
                    if (iB != i) {
                        m mVar = this.b.r;
                        View viewU = mVar.u(iB);
                        if (viewU == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + mVar.b.toString());
                        }
                        mVar.u(iB);
                        mVar.a.c(iB);
                        n nVar2 = (n) viewU.getLayoutParams();
                        C cK2 = RecyclerView.K(viewU);
                        if (cK2.h()) {
                            C2703aM1<C, J.a> c2703aM2 = mVar.b.k.a;
                            J.a orDefault2 = c2703aM2.getOrDefault(cK2, null);
                            if (orDefault2 == null) {
                                orDefault2 = J.a.a();
                                c2703aM2.put(cK2, orDefault2);
                            }
                            orDefault2.a = 1 | orDefault2.a;
                        } else {
                            mVar.b.k.c(cK2);
                        }
                        mVar.a.b(viewU, i, nVar2, cK2.h());
                    }
                } else {
                    this.a.a(view, i, false);
                    nVar.c = true;
                    androidx.recyclerview.widget.u uVar = this.e;
                    if (uVar != null && uVar.e) {
                        uVar.b.getClass();
                        C cK3 = RecyclerView.K(view);
                        if ((cK3 != null ? cK3.b() : -1) == uVar.a) {
                            uVar.f = view;
                        }
                    }
                }
            }
            if (nVar.d) {
                cK.a.invalidate();
                nVar.d = false;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void b0(y yVar) {
        }

        @SuppressLint({"UnknownNullness"})
        public void c(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void c0(Parcelable parcelable) {
        }

        public boolean d() {
            return this instanceof CarouselLayoutManager;
        }

        public Parcelable d0() {
            return null;
        }

        public boolean e() {
            return false;
        }

        public void e0(int i) {
        }

        public boolean f(n nVar) {
            return nVar != null;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0062 A[PHI: r3
          0x0062: PHI (r3v8 int) = (r3v5 int), (r3v11 int) binds: [B:28:0x007e, B:20:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean f0(@NonNull t tVar, @NonNull y yVar, int i, Bundle bundle) {
            int iE;
            int iC;
            if (this.b != null) {
                int iHeight = this.o;
                int iWidth = this.n;
                Rect rect = new Rect();
                if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                    iHeight = rect.height();
                    iWidth = rect.width();
                }
                if (i == 4096) {
                    iE = this.b.canScrollVertically(1) ? (iHeight - E()) - B() : 0;
                    if (this.b.canScrollHorizontally(1)) {
                        iC = (iWidth - C()) - D();
                    } else {
                        iC = 0;
                    }
                } else if (i != 8192) {
                    iE = 0;
                    iC = 0;
                } else {
                    iE = this.b.canScrollVertically(-1) ? -((iHeight - E()) - B()) : 0;
                    if (this.b.canScrollHorizontally(-1)) {
                        iC = -((iWidth - C()) - D());
                    } else {
                        iC = 0;
                    }
                }
                if (iE != 0 || iC != 0) {
                    this.b.h0(iC, true, iE);
                    return true;
                }
            }
            return false;
        }

        public final void g0(@NonNull t tVar) {
            for (int iV = v() - 1; iV >= 0; iV--) {
                if (!RecyclerView.K(u(iV)).o()) {
                    j0(iV, tVar);
                }
            }
        }

        public final void h0(t tVar) {
            ArrayList<C> arrayList;
            int size = tVar.a.size();
            int i = size - 1;
            while (true) {
                arrayList = tVar.a;
                if (i < 0) {
                    break;
                }
                View view = arrayList.get(i).a;
                C cK = RecyclerView.K(view);
                if (!cK.o()) {
                    cK.n(false);
                    if (cK.j()) {
                        this.b.removeDetachedView(view, false);
                    }
                    j jVar = this.b.R;
                    if (jVar != null) {
                        jVar.d(cK);
                    }
                    cK.n(true);
                    C cK2 = RecyclerView.K(view);
                    cK2.n = null;
                    cK2.o = false;
                    cK2.j &= -33;
                    tVar.i(cK2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList<C> arrayList2 = tVar.b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.b.invalidate();
            }
        }

        public final void i0(@NonNull View view, @NonNull t tVar) {
            C2807f c2807f = this.a;
            androidx.recyclerview.widget.C c2 = c2807f.a;
            int iIndexOfChild = c2.a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (c2807f.b.f(iIndexOfChild)) {
                    c2807f.j(view);
                }
                c2.a(iIndexOfChild);
            }
            tVar.h(view);
        }

        public int j(@NonNull y yVar) {
            return 0;
        }

        public final void j0(int i, @NonNull t tVar) {
            View viewU = u(i);
            k0(i);
            tVar.h(viewU);
        }

        public int k(@NonNull y yVar) {
            return 0;
        }

        public final void k0(int i) {
            if (u(i) != null) {
                C2807f c2807f = this.a;
                int iF = c2807f.f(i);
                androidx.recyclerview.widget.C c2 = c2807f.a;
                View childAt = c2.a.getChildAt(iF);
                if (childAt == null) {
                    return;
                }
                if (c2807f.b.f(iF)) {
                    c2807f.j(childAt);
                }
                c2.a(iF);
            }
        }

        public int l(@NonNull y yVar) {
            return 0;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
        public boolean l0(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            int iC = C();
            int iE = E();
            int iD = this.n - D();
            int iB = this.o - B();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - iC;
            int iMin = Math.min(0, i);
            int i2 = top - iE;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - iD;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - iB);
            if (A() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            int[] iArr = {iMax, iMin2};
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (z2) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int iC2 = C();
                    int iE2 = E();
                    int iD2 = this.n - D();
                    int iB2 = this.o - B();
                    Rect rect2 = this.b.n;
                    y(focusedChild, rect2);
                    if (rect2.left - i4 < iD2 && rect2.right - i4 > iC2 && rect2.top - i5 < iB2 && rect2.bottom - i5 > iE2) {
                        if (i4 == 0) {
                        }
                        if (z) {
                            recyclerView.scrollBy(i4, i5);
                            return true;
                        }
                        recyclerView.h0(i4, false, i5);
                        return true;
                    }
                }
            } else if (i4 == 0 || i5 != 0) {
                if (z) {
                    recyclerView.scrollBy(i4, i5);
                    return true;
                }
                recyclerView.h0(i4, false, i5);
                return true;
            }
            return false;
        }

        public int m(@NonNull y yVar) {
            return 0;
        }

        public final void m0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int n(@NonNull y yVar) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public int n0(int i, t tVar, y yVar) {
            return 0;
        }

        public int o(@NonNull y yVar) {
            return 0;
        }

        public void o0(int i) {
        }

        public final void p(@NonNull t tVar) {
            for (int iV = v() - 1; iV >= 0; iV--) {
                View viewU = u(iV);
                C cK = RecyclerView.K(viewU);
                if (!cK.o()) {
                    if (!cK.f() || cK.h() || this.b.q.b) {
                        u(iV);
                        this.a.c(iV);
                        tVar.j(viewU);
                        this.b.k.c(cK);
                    } else {
                        k0(iV);
                        tVar.i(cK);
                    }
                }
            }
        }

        @SuppressLint({"UnknownNullness"})
        public int p0(int i, t tVar, y yVar) {
            return 0;
        }

        public View q(int i) {
            int iV = v();
            for (int i2 = 0; i2 < iV; i2++) {
                View viewU = u(i2);
                C cK = RecyclerView.K(viewU);
                if (cK != null && cK.b() == i && !cK.o() && (this.b.m0.g || !cK.h())) {
                    return viewU;
                }
            }
            return null;
        }

        public final void q0(RecyclerView recyclerView) {
            r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        @SuppressLint({"UnknownNullness"})
        public abstract n r();

        public final void r0(int i, int i2) {
            this.n = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.l = mode;
            if (mode == 0 && !RecyclerView.H0) {
                this.n = 0;
            }
            this.o = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.m = mode2;
            if (mode2 != 0 || RecyclerView.H0) {
                return;
            }
            this.o = 0;
        }

        @SuppressLint({"UnknownNullness"})
        public n s(Context context, AttributeSet attributeSet) {
            return new n(context, attributeSet);
        }

        public void s0(Rect rect, int i, int i2) {
            int iD = D() + C() + rect.width();
            int iB = B() + E() + rect.height();
            RecyclerView recyclerView = this.b;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            this.b.setMeasuredDimension(g(i, iD, recyclerView.getMinimumWidth()), g(i2, iB, this.b.getMinimumHeight()));
        }

        @SuppressLint({"UnknownNullness"})
        public n t(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof n) {
                return new n((n) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new n((ViewGroup.MarginLayoutParams) layoutParams) : new n(layoutParams);
        }

        public final void t0(int i, int i2) {
            int iV = v();
            if (iV == 0) {
                this.b.o(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < iV; i7++) {
                View viewU = u(i7);
                Rect rect = this.b.n;
                y(viewU, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.b.n.set(i6, i4, i3, i5);
            s0(this.b.n, i, i2);
        }

        public final View u(int i) {
            C2807f c2807f = this.a;
            if (c2807f != null) {
                return c2807f.d(i);
            }
            return null;
        }

        public final void u0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.n = 0;
                this.o = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.j;
                this.n = recyclerView.getWidth();
                this.o = recyclerView.getHeight();
            }
            this.l = 1073741824;
            this.m = 1073741824;
        }

        public final int v() {
            C2807f c2807f = this.a;
            if (c2807f != null) {
                return c2807f.e();
            }
            return 0;
        }

        public final boolean v0(View view, int i, int i2, n nVar) {
            return (!view.isLayoutRequested() && this.h && K(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) nVar).width) && K(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        public boolean w0() {
            return false;
        }

        public int x(@NonNull t tVar, @NonNull y yVar) {
            return -1;
        }

        public final boolean x0(View view, int i, int i2, n nVar) {
            return (this.h && K(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) nVar).width) && K(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        public void y(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.L(view, rect);
        }

        @SuppressLint({"UnknownNullness"})
        public void y0(RecyclerView recyclerView, int i) {
            b0.c("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final int z() {
            RecyclerView recyclerView = this.b;
            e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.c();
            }
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public final void z0(androidx.recyclerview.widget.u uVar) {
            androidx.recyclerview.widget.u uVar2 = this.e;
            if (uVar2 != null && uVar != uVar2 && uVar2.e) {
                uVar2.d();
            }
            this.e = uVar;
            RecyclerView recyclerView = this.b;
            B b2 = recyclerView.j0;
            RecyclerView.this.removeCallbacks(b2);
            b2.g.abortAnimation();
            if (uVar.h) {
                b0.e("RecyclerView", "An instance of " + uVar.getClass().getSimpleName() + " was started more than once. Each instance of" + uVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            uVar.b = recyclerView;
            uVar.c = this;
            int i = uVar.a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.m0.a = i;
            uVar.e = true;
            uVar.d = true;
            uVar.f = recyclerView.r.q(i);
            uVar.b.j0.b();
            uVar.h = true;
        }

        public void O() {
        }

        public void W() {
        }

        @SuppressLint({"UnknownNullness"})
        public void P(RecyclerView recyclerView) {
        }

        public void V(int i, int i2) {
        }

        public void X(int i, int i2) {
        }

        public void Y(int i, int i2) {
        }

        public void Z(int i, int i2) {
        }

        @SuppressLint({"UnknownNullness"})
        public void i(int i, androidx.recyclerview.widget.s.b bVar) {
        }

        public void U(@NonNull t tVar, @NonNull y yVar, @NonNull View view, @NonNull C5426n2 c5426n2) {
        }

        @SuppressLint({"UnknownNullness"})
        public void h(int i, int i2, y yVar, androidx.recyclerview.widget.s.b bVar) {
        }
    }

    public static abstract class l {
        public void c(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull y yVar) {
            ((n) view.getLayoutParams()).a.b();
            rect.set(0, 0, 0, 0);
        }

        public void d(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void e(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }
    }
}
