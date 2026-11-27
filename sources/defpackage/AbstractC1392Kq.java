package defpackage;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.pexpress.tool.R;
import defpackage.AbstractC1470Lq;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1392Kq<S extends AbstractC1470Lq> extends ProgressBar {
    public final S d;
    public int e;
    public final boolean g;
    public final int h;
    public C0570Ac i;
    public boolean j;
    public int k;
    public final a l;
    public final b m;
    public final c n;
    public final d o;

    /* JADX INFO: renamed from: Kq$a */
    public class a implements Runnable {
        public final /* synthetic */ CircularProgressIndicator d;

        public a(CircularProgressIndicator circularProgressIndicator) {
            this.d = circularProgressIndicator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CircularProgressIndicator circularProgressIndicator = this.d;
            if (circularProgressIndicator.h > 0) {
                SystemClock.uptimeMillis();
            }
            circularProgressIndicator.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: Kq$b */
    public class b implements Runnable {
        public final /* synthetic */ CircularProgressIndicator d;

        public b(CircularProgressIndicator circularProgressIndicator) {
            this.d = circularProgressIndicator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CircularProgressIndicator circularProgressIndicator = this.d;
            ((V30) circularProgressIndicator.getCurrentDrawable()).e(false, false, true);
            if (circularProgressIndicator.getProgressDrawable() == null || !circularProgressIndicator.getProgressDrawable().isVisible()) {
                if (circularProgressIndicator.getIndeterminateDrawable() == null || !circularProgressIndicator.getIndeterminateDrawable().isVisible()) {
                    circularProgressIndicator.setVisibility(4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Kq$c */
    public class c extends InterfaceC1817Qb.a {
        public final /* synthetic */ CircularProgressIndicator b;

        public c(CircularProgressIndicator circularProgressIndicator) {
            this.b = circularProgressIndicator;
        }

        @Override // defpackage.InterfaceC1817Qb.a
        public final void a(Drawable drawable) {
            CircularProgressIndicator circularProgressIndicator = this.b;
            circularProgressIndicator.setIndeterminate(false);
            circularProgressIndicator.a(circularProgressIndicator.e);
        }
    }

    /* JADX INFO: renamed from: Kq$d */
    public class d extends InterfaceC1817Qb.a {
        public final /* synthetic */ CircularProgressIndicator b;

        public d(CircularProgressIndicator circularProgressIndicator) {
            this.b = circularProgressIndicator;
        }

        @Override // defpackage.InterfaceC1817Qb.a
        public final void a(Drawable drawable) {
            CircularProgressIndicator circularProgressIndicator = this.b;
            if (circularProgressIndicator.j) {
                return;
            }
            circularProgressIndicator.setVisibility(circularProgressIndicator.k);
        }
    }

    public AbstractC1392Kq(@NonNull Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, R.attr.circularProgressIndicatorStyle);
        this.j = false;
        this.k = 4;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) this;
        this.l = new a(circularProgressIndicator);
        this.m = new b(circularProgressIndicator);
        this.n = new c(circularProgressIndicator);
        this.o = new d(circularProgressIndicator);
        Context context2 = getContext();
        C6513sC c6513sC = new C6513sC();
        c6513sC.c = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        int[] iArr = C2083Tl1.d;
        C7001uY1.a(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        C7001uY1.b(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        c6513sC.a = MX0.c(context2, typedArrayObtainStyledAttributes, 8, dimensionPixelSize);
        c6513sC.b = Math.min(MX0.c(context2, typedArrayObtainStyledAttributes, 7, 0), c6513sC.a / 2);
        c6513sC.e = typedArrayObtainStyledAttributes.getInt(4, 0);
        c6513sC.f = typedArrayObtainStyledAttributes.getInt(1, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            c6513sC.c = new int[]{C8056za.g(context2, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            c6513sC.c = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            c6513sC.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            c6513sC.d = typedArrayObtainStyledAttributes.getColor(6, -1);
        } else {
            c6513sC.d = c6513sC.c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            c6513sC.d = C8056za.b(c6513sC.d, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        int[] iArr2 = C2083Tl1.j;
        C7001uY1.a(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        C7001uY1.b(context2, attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        c6513sC.g = Math.max(MX0.c(context2, typedArrayObtainStyledAttributes3, 2, dimensionPixelSize2), c6513sC.a * 2);
        c6513sC.h = MX0.c(context2, typedArrayObtainStyledAttributes3, 1, dimensionPixelSize3);
        c6513sC.i = typedArrayObtainStyledAttributes3.getInt(0, 0);
        typedArrayObtainStyledAttributes3.recycle();
        this.d = c6513sC;
        C7001uY1.a(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        C7001uY1.b(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        typedArrayObtainStyledAttributes4.getInt(5, -1);
        this.h = Math.min(typedArrayObtainStyledAttributes4.getInt(3, -1), CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        typedArrayObtainStyledAttributes4.recycle();
        this.i = new C0570Ac();
        this.g = true;
    }

    private Y30<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().p;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().p;
    }

    public final void a(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.e = i;
            this.j = true;
            if (getIndeterminateDrawable().isVisible()) {
                C0570Ac c0570Ac = this.i;
                ContentResolver contentResolver = getContext().getContentResolver();
                c0570Ac.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    C6303rC c6303rC = getIndeterminateDrawable().q;
                    ObjectAnimator objectAnimator = c6303rC.e;
                    if (objectAnimator == null || objectAnimator.isRunning()) {
                        return;
                    }
                    if (c6303rC.a.isVisible()) {
                        c6303rC.e.start();
                        return;
                    }
                    ObjectAnimator objectAnimator2 = c6303rC.d;
                    if (objectAnimator2 != null) {
                        objectAnimator2.cancel();
                        return;
                    }
                    return;
                }
            }
            this.n.a(getIndeterminateDrawable());
        }
    }

    public final boolean b() {
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.d.f;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.d.c;
    }

    public int getShowAnimationBehavior() {
        return this.d.e;
    }

    public int getTrackColor() {
        return this.d.d;
    }

    public int getTrackCornerRadius() {
        return this.d.b;
    }

    public int getTrackThickness() {
        return this.d.a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().q.k = this.n;
        }
        C4318i00<S> progressDrawable = getProgressDrawable();
        d dVar = this.o;
        if (progressDrawable != null) {
            getProgressDrawable().c(dVar);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c(dVar);
        }
        if (b()) {
            if (this.h > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.m);
        removeCallbacks(this.l);
        ((V30) getCurrentDrawable()).e(false, false, false);
        C1180Hx0<S> indeterminateDrawable = getIndeterminateDrawable();
        d dVar = this.o;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().g(dVar);
            getIndeterminateDrawable().q.k = null;
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().g(dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(@NonNull Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            Y30<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(((C5464nC) currentDrawingDelegate).e() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : ((C5464nC) currentDrawingDelegate).e() + getPaddingLeft() + getPaddingRight(), ((C5464nC) currentDrawingDelegate).e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : ((C5464nC) currentDrawingDelegate).e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.g) {
            ((V30) getCurrentDrawable()).e(b(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.g) {
            ((V30) getCurrentDrawable()).e(b(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(@NonNull C0570Ac c0570Ac) {
        this.i = c0570Ac;
        if (getProgressDrawable() != null) {
            getProgressDrawable().g = c0570Ac;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().g = c0570Ac;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.d.f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            V30 v30 = (V30) getCurrentDrawable();
            if (v30 != null) {
                v30.e(false, false, false);
            }
            super.setIndeterminate(z);
            V30 v31 = (V30) getCurrentDrawable();
            if (v31 != null) {
                v31.e(b(), false, false);
            }
            if ((v31 instanceof C1180Hx0) && b()) {
                ((C1180Hx0) v31).q.a();
            }
            this.j = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof C1180Hx0)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((V30) drawable).e(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C8056za.g(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.d.c = iArr;
        C6303rC c6303rC = getIndeterminateDrawable().q;
        c6303rC.h = 0;
        c6303rC.c[0] = C8056za.b(c6303rC.g.c[0], c6303rC.a.n);
        c6303rC.j = 0.0f;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        a(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof C4318i00)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            C4318i00 c4318i00 = (C4318i00) drawable;
            c4318i00.e(false, false, false);
            super.setProgressDrawable(c4318i00);
            c4318i00.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.d.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.d;
        if (s.d != i) {
            s.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.d;
        if (s.b != i) {
            s.b = Math.min(i, s.a / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.d;
        if (s.a != i) {
            s.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.k = i;
    }

    @Override // android.widget.ProgressBar
    public C1180Hx0<S> getIndeterminateDrawable() {
        return (C1180Hx0) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public C4318i00<S> getProgressDrawable() {
        return (C4318i00) super.getProgressDrawable();
    }
}
