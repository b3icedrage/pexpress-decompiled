package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import defpackage.A30;
import defpackage.AbstractC7727y;
import defpackage.C1516Mf1;
import defpackage.C2503Yl1;
import defpackage.C2703aM1;
import defpackage.C3006bj2;
import defpackage.C4121h31;
import defpackage.C5345me2;
import defpackage.C5491nL;
import defpackage.C6333rM;
import defpackage.Cd2;
import defpackage.D10;
import defpackage.InterfaceC3701f31;
import defpackage.InterfaceC3911g31;
import defpackage.K81;
import defpackage.Ld2;
import io.jsonwebtoken.JwtParser;
import io.sentry.android.core.b0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC3701f31, InterfaceC3911g31 {
    public static final i A;
    public static final C1516Mf1 B;
    public static final String x;
    public static final Class<?>[] y;
    public static final ThreadLocal<Map<String, Constructor<c>>> z;
    public final ArrayList d;
    public final D10<View> e;
    public final ArrayList g;
    public final ArrayList h;
    public final int[] i;
    public final int[] j;
    public boolean k;
    public boolean l;
    public final int[] m;
    public View n;
    public View o;
    public g p;
    public boolean q;
    public C3006bj2 r;
    public boolean s;
    public Drawable t;
    public ViewGroup.OnHierarchyChangeListener u;
    public a v;
    public final C4121h31 w;

    public class a implements K81 {
        public a() {
        }

        @Override // defpackage.K81
        public final C3006bj2 N(View view, C3006bj2 c3006bj2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.r, c3006bj2)) {
                coordinatorLayout.r = c3006bj2;
                boolean z = c3006bj2.d() > 0;
                coordinatorLayout.s = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                C3006bj2.k kVar = c3006bj2.a;
                if (!kVar.m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                        if (childAt.getFitsSystemWindows() && ((f) childAt.getLayoutParams()).a != null && kVar.m()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return c3006bj2;
        }
    }

    public interface b {
        @NonNull
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean a(@NonNull View view, @NonNull Rect rect) {
            return false;
        }

        public boolean b(@NonNull View view, @NonNull View view2) {
            return false;
        }

        public void c(@NonNull f fVar) {
        }

        public boolean d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        public void f() {
        }

        public boolean g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
            return false;
        }

        public boolean i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            return false;
        }

        public boolean j(@NonNull View view) {
            return false;
        }

        public void k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        }

        public void l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i2;
            iArr[1] = iArr[1] + i3;
        }

        public boolean m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect, boolean z) {
            return false;
        }

        public Parcelable o(@NonNull View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            return false;
        }

        public void q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        }

        public boolean r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        }

        public void n(@NonNull View view, @NonNull Parcelable parcelable) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    public static class h extends AbstractC7727y {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public SparseArray<Parcelable> g;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new h[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.g = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.g.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // defpackage.AbstractC7727y, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.g;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.g.keyAt(i2);
                parcelableArr[i2] = this.g.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            float fM = Cd2.d.m(view);
            float fM2 = Cd2.d.m(view2);
            if (fM > fM2) {
                return -1;
            }
            return fM < fM2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        x = r0 != null ? r0.getName() : null;
        A = new i();
        y = new Class[]{Context.class, AttributeSet.class};
        z = new ThreadLocal<>();
        B = new C1516Mf1(12);
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.d = new ArrayList();
        this.e = new D10<>();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new int[2];
        this.j = new int[2];
        this.w = new C4121h31();
        int[] iArr = C2503Yl1.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.m = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = this.m;
                iArr2[i2] = (int) (iArr2[i2] * f2);
            }
        }
        this.t = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @NonNull
    public static Rect a() {
        Rect rect = (Rect) B.a();
        return rect == null ? new Rect() : rect;
    }

    public static void g(int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int iWidth;
        int iHeight;
        int i5 = fVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = fVar.d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        if (i9 != 1) {
            iWidth = i9 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i10 != 16) {
            iHeight = i10 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i7 == 1) {
            iWidth -= i3 / 2;
        } else if (i7 != 5) {
            iWidth -= i3;
        }
        if (i8 == 16) {
            iHeight -= i4 / 2;
        } else if (i8 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f i(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    b0.c("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
                fVar.b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.b(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e2) {
                    b0.d("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            fVar.b = true;
        }
        return fVar;
    }

    public static void w(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.i;
        if (i3 != i2) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            view.offsetLeftAndRight(i2 - i3);
            fVar.i = i2;
        }
    }

    public static void x(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.j;
        if (i3 != i2) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            view.offsetTopAndBottom(i2 - i3);
            fVar.j = i2;
        }
    }

    public final void b(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    public final void c(@NonNull View view) {
        ArrayList<View> orDefault = this.e.b.getOrDefault(view, null);
        if (orDefault == null || orDefault.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < orDefault.size(); i2++) {
            View view2 = orDefault.get(i2);
            c cVar = ((f) view2.getLayoutParams()).a;
            if (cVar != null) {
                cVar.d(this, view2, view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            f(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        c cVar = ((f) view.getLayoutParams()).a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.t;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @NonNull
    public final ArrayList e(@NonNull View view) {
        C2703aM1<View, ArrayList<View>> c2703aM1 = this.e.b;
        int i2 = c2703aM1.g;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList<View> arrayListM = c2703aM1.m(i3);
            if (arrayListM != null && arrayListM.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c2703aM1.i(i3));
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        return arrayList2;
    }

    public final void f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = Ld2.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = Ld2.a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        Ld2.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = Ld2.b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.d);
    }

    public final C3006bj2 getLastWindowInsets() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C4121h31 c4121h31 = this.w;
        return c4121h31.b | c4121h31.a;
    }

    public Drawable getStatusBarBackground() {
        return this.t;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final int h(int i2) {
        int[] iArr = this.m;
        if (iArr == null) {
            b0.c("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        b0.c("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    @Override // defpackage.InterfaceC3911g31
    public final void j(@NonNull View view, int i2, int i3, int i4, int i5, int i6, @NonNull int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i6) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.i;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, i3, i4, i5, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z2) {
            q(1);
        }
    }

    @Override // defpackage.InterfaceC3701f31
    public final void k(View view, int i2, int i3, int i4, int i5, int i6) {
        j(view, i2, i3, i4, i5, 0, this.j);
    }

    @Override // defpackage.InterfaceC3701f31
    public final boolean l(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.a;
                if (cVar != null) {
                    boolean zP = cVar.p(this, childAt, view, view2, i2, i3);
                    z2 |= zP;
                    if (i3 == 0) {
                        fVar.m = zP;
                    } else if (i3 == 1) {
                        fVar.n = zP;
                    }
                } else if (i3 == 0) {
                    fVar.m = false;
                } else if (i3 == 1) {
                    fVar.n = false;
                }
            }
        }
        return z2;
    }

    @Override // defpackage.InterfaceC3701f31
    public final void m(View view, View view2, int i2, int i3) {
        C4121h31 c4121h31 = this.w;
        if (i3 == 1) {
            c4121h31.b = i2;
        } else {
            c4121h31.a = i2;
        }
        this.o = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((f) getChildAt(i4).getLayoutParams()).getClass();
        }
    }

    @Override // defpackage.InterfaceC3701f31
    public final void n(View view, int i2) {
        C4121h31 c4121h31 = this.w;
        if (i2 == 1) {
            c4121h31.b = 0;
        } else {
            c4121h31.a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i2)) {
                c cVar = fVar.a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i2);
                }
                if (i2 == 0) {
                    fVar.m = false;
                } else if (i2 == 1) {
                    fVar.n = false;
                }
                fVar.o = false;
            }
        }
        this.o = null;
    }

    @Override // defpackage.InterfaceC3701f31
    public final void o(View view, int i2, int i3, int[] iArr, int i4) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i4) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.i;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i2, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.q) {
            if (this.p == null) {
                this.p = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.p);
        }
        if (this.r == null) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if (getFitsSystemWindows()) {
                Cd2.c.c(this);
            }
        }
        this.l = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.q && this.p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.p);
        }
        View view = this.o;
        if (view != null) {
            n(view, 0);
        }
        this.l = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.s || this.t == null) {
            return;
        }
        C3006bj2 c3006bj2 = this.r;
        int iD = c3006bj2 != null ? c3006bj2.d() : 0;
        if (iD > 0) {
            this.t.setBounds(0, 0, getWidth(), iD);
            this.t.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean zT = t(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zT;
        }
        v(true);
        return zT;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        c cVar;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).a) == null || !cVar.h(this, view, layoutDirection))) {
                r(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012b  */
    /* JADX WARN: Code duplicated, block: B:72:0x015c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX WARN: Code duplicated, block: B:78:0x0187  */
    /* JADX WARN: Code duplicated, block: B:79:0x018a  */
    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        int i5;
        int i6;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVar;
        int i7;
        View view;
        ArrayList arrayList;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        boolean zI;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.u();
        int childCount = coordinatorLayout.getChildCount();
        int i14 = 0;
        loop0: while (true) {
            if (i14 >= childCount) {
                z2 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i14);
            C2703aM1<View, ArrayList<View>> c2703aM1 = coordinatorLayout.e.b;
            int i15 = c2703aM1.g;
            for (int i16 = 0; i16 < i15; i16++) {
                ArrayList<View> arrayListM = c2703aM1.m(i16);
                if (arrayListM != null && arrayListM.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i14++;
        }
        if (z2 != coordinatorLayout.q) {
            if (z2) {
                if (coordinatorLayout.l) {
                    if (coordinatorLayout.p == null) {
                        coordinatorLayout.p = coordinatorLayout.new g();
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.p);
                }
                coordinatorLayout.q = true;
            } else {
                if (coordinatorLayout.l && coordinatorLayout.p != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.p);
                }
                coordinatorLayout.q = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i17 = paddingLeft + paddingRight;
        int i18 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.r != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList2 = coordinatorLayout.d;
        int size3 = arrayList2.size();
        int i19 = 0;
        int iCombineMeasuredStates = 0;
        while (i19 < size3) {
            View view2 = (View) arrayList2.get(i19);
            int i20 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i5 = size3;
                i11 = paddingLeft;
                i9 = paddingRight;
                suggestedMinimumWidth = i20;
                z3 = false;
                i13 = i19;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i21 = fVar.e;
                if (i21 < 0 || mode == 0) {
                    i4 = suggestedMinimumHeight;
                } else {
                    int iH = coordinatorLayout.h(i21);
                    int i22 = fVar.c;
                    if (i22 == 0) {
                        i22 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i22, layoutDirection) & 7;
                    i4 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z4) && !(absoluteGravity == 5 && z4)) {
                        if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                            iMax = Math.max(0, iH - paddingLeft);
                        }
                        if (z5 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i2;
                            iMakeMeasureSpec2 = i3;
                        } else {
                            int iC = coordinatorLayout.r.c() + coordinatorLayout.r.b();
                            int iA = coordinatorLayout.r.a() + coordinatorLayout.r.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        cVar = fVar.a;
                        if (cVar != null) {
                            ArrayList arrayList3 = arrayList2;
                            int i23 = iMakeMeasureSpec;
                            arrayList = arrayList3;
                            z3 = false;
                            i9 = paddingRight;
                            i10 = i4;
                            i11 = paddingLeft;
                            i12 = i20;
                            i13 = i19;
                            int i24 = iMakeMeasureSpec2;
                            zI = cVar.i(this, view2, i23, i6, i24);
                            view = view2;
                            iMakeMeasureSpec = i23;
                            i8 = i6;
                            i7 = i24;
                            if (zI) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int iMax3 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            int i25 = i6;
                            i7 = iMakeMeasureSpec2;
                            view = view2;
                            arrayList = arrayList2;
                            i8 = i25;
                            i9 = paddingRight;
                            i10 = i4;
                            z3 = false;
                            i11 = paddingLeft;
                            i12 = i20;
                            i13 = i19;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i8, i7, 0);
                        int iMax4 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax5 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iH);
                    }
                    int i26 = size3;
                    i6 = iMax;
                    i5 = i26;
                    if (z5) {
                        iMakeMeasureSpec = i2;
                        iMakeMeasureSpec2 = i3;
                    } else {
                        iMakeMeasureSpec = i2;
                        iMakeMeasureSpec2 = i3;
                    }
                    cVar = fVar.a;
                    if (cVar != null) {
                        ArrayList arrayList4 = arrayList2;
                        int i27 = iMakeMeasureSpec;
                        arrayList = arrayList4;
                        z3 = false;
                        i9 = paddingRight;
                        i10 = i4;
                        i11 = paddingLeft;
                        i12 = i20;
                        i13 = i19;
                        int i28 = iMakeMeasureSpec2;
                        zI = cVar.i(this, view2, i27, i6, i28);
                        view = view2;
                        iMakeMeasureSpec = i27;
                        i8 = i6;
                        i7 = i28;
                        if (zI) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax7 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        int i29 = i6;
                        i7 = iMakeMeasureSpec2;
                        view = view2;
                        arrayList = arrayList2;
                        i8 = i29;
                        i9 = paddingRight;
                        i10 = i4;
                        z3 = false;
                        i11 = paddingLeft;
                        i12 = i20;
                        i13 = i19;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i8, i7, 0);
                    int iMax8 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax9 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i5 = size3;
                i6 = 0;
                if (z5) {
                    iMakeMeasureSpec = i2;
                    iMakeMeasureSpec2 = i3;
                } else {
                    iMakeMeasureSpec = i2;
                    iMakeMeasureSpec2 = i3;
                }
                cVar = fVar.a;
                if (cVar != null) {
                    ArrayList arrayList5 = arrayList2;
                    int i210 = iMakeMeasureSpec;
                    arrayList = arrayList5;
                    z3 = false;
                    i9 = paddingRight;
                    i10 = i4;
                    i11 = paddingLeft;
                    i12 = i20;
                    i13 = i19;
                    int i211 = iMakeMeasureSpec2;
                    zI = cVar.i(this, view2, i210, i6, i211);
                    view = view2;
                    iMakeMeasureSpec = i210;
                    i8 = i6;
                    i7 = i211;
                    if (zI) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax11 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    int i212 = i6;
                    i7 = iMakeMeasureSpec2;
                    view = view2;
                    arrayList = arrayList2;
                    i8 = i212;
                    i9 = paddingRight;
                    i10 = i4;
                    z3 = false;
                    i11 = paddingLeft;
                    i12 = i20;
                    i13 = i19;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i8, i7, 0);
                int iMax12 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int iMax13 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i19 = i13 + 1;
            arrayList2 = arrayList;
            size3 = i5;
            paddingLeft = i11;
            paddingRight = i9;
        }
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i2, (-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(suggestedMinimumHeight, i3, iCombineMeasuredStates << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        c cVar;
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.a) != null) {
                    zJ |= cVar.j(view);
                }
            }
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        o(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        k(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        m(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.d);
        SparseArray<Parcelable> sparseArray = hVar.g;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = i(childAt).a;
            if (id != -1 && cVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableO;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (id != -1 && cVar != null && (parcelableO = cVar.o(childAt)) != null) {
                sparseArray.append(id, parcelableO);
            }
        }
        hVar.g = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return l(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zT;
        boolean zR;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.n == null) {
            zT = t(motionEvent, 1);
            if (!zT) {
                zR = false;
            }
            motionEventObtain = null;
            if (this.n == null) {
                zR |= super.onTouchEvent(motionEvent);
            } else if (zT) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zR;
            }
            v(false);
            return zR;
        }
        zT = false;
        c cVar = ((f) this.n.getLayoutParams()).a;
        if (cVar != null) {
            zR = cVar.r(this, this.n, motionEvent);
        } else {
            zR = false;
        }
        motionEventObtain = null;
        if (this.n == null) {
            zR |= super.onTouchEvent(motionEvent);
        } else if (zT) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        v(false);
        return zR;
    }

    public final boolean p(@NonNull View view, int i2, int i3) {
        C1516Mf1 c1516Mf1 = B;
        Rect rectA = a();
        f(view, rectA);
        try {
            return rectA.contains(i2, i3);
        } finally {
            rectA.setEmpty();
            c1516Mf1.b(rectA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0271  */
    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    public final void q(int i2) {
        Rect rect;
        int i3;
        Rect rect2;
        int i4;
        ArrayList arrayList;
        int i5;
        boolean zD;
        boolean z2;
        boolean z3;
        int width;
        int i6;
        int i7;
        int i8;
        int height;
        int i9;
        int i10;
        int i11;
        Rect rect3;
        C1516Mf1 c1516Mf1;
        c cVar;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i12 = 0;
        while (true) {
            C1516Mf1 c1516Mf2 = B;
            if (i12 >= size) {
                Rect rect4 = rectA2;
                Rect rect5 = rectA3;
                rectA.setEmpty();
                c1516Mf2.b(rectA);
                rect4.setEmpty();
                c1516Mf2.b(rect4);
                rect5.setEmpty();
                c1516Mf2.b(rect5);
                return;
            }
            View view = (View) arrayList2.get(i12);
            f fVar = (f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                int i13 = 0;
                while (i13 < i12) {
                    if (fVar.l == ((View) arrayList2.get(i13))) {
                        f fVar2 = (f) view.getLayoutParams();
                        if (fVar2.k != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            Rect rect6 = rectA3;
                            Rect rectA6 = a();
                            f(fVar2.k, rectA4);
                            d(view, rectA5, false);
                            int measuredWidth = view.getMeasuredWidth();
                            C1516Mf1 c1516Mf3 = c1516Mf2;
                            int measuredHeight = view.getMeasuredHeight();
                            c1516Mf1 = c1516Mf3;
                            g(layoutDirection, rectA4, rectA6, fVar2, measuredWidth, measuredHeight);
                            rect3 = rect6;
                            boolean z4 = (rectA6.left == rectA5.left && rectA6.top == rectA5.top) ? false : true;
                            b(fVar2, rectA6, measuredWidth, measuredHeight);
                            int i14 = rectA6.left - rectA5.left;
                            int i15 = rectA6.top - rectA5.top;
                            if (i14 != 0) {
                                WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                                view.offsetLeftAndRight(i14);
                            }
                            if (i15 != 0) {
                                WeakHashMap<View, C5345me2> weakHashMap3 = Cd2.a;
                                view.offsetTopAndBottom(i15);
                            }
                            if (z4 && (cVar = fVar2.a) != null) {
                                cVar.d(this, view, fVar2.k);
                            }
                            rectA4.setEmpty();
                            c1516Mf1.b(rectA4);
                            rectA5.setEmpty();
                            c1516Mf1.b(rectA5);
                            rectA6.setEmpty();
                            c1516Mf1.b(rectA6);
                        } else {
                            rect3 = rectA3;
                            c1516Mf1 = c1516Mf2;
                        }
                    } else {
                        rect3 = rectA3;
                        c1516Mf1 = c1516Mf2;
                    }
                    c1516Mf2 = c1516Mf1;
                    i13++;
                    rectA2 = rectA2;
                    i12 = i12;
                    arrayList2 = arrayList2;
                    size = size;
                    rectA3 = rect3;
                }
                ArrayList arrayList3 = arrayList2;
                rect = rectA2;
                Rect rect7 = rectA3;
                i3 = i12;
                C1516Mf1 c1516Mf4 = c1516Mf2;
                int i16 = size;
                d(view, rect, true);
                if (fVar.g != 0 && !rect.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar.g, layoutDirection);
                    int i17 = absoluteGravity & 112;
                    if (i17 == 48) {
                        rectA.top = Math.max(rectA.top, rect.bottom);
                    } else if (i17 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rect.top);
                    }
                    int i18 = absoluteGravity & 7;
                    if (i18 == 3) {
                        rectA.left = Math.max(rectA.left, rect.right);
                    } else if (i18 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rect.left);
                    }
                }
                if (fVar.h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, C5345me2> weakHashMap4 = Cd2.a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar3 = (f) view.getLayoutParams();
                        c cVar2 = fVar3.a;
                        Rect rectA7 = a();
                        Rect rectA8 = a();
                        rectA8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar2 == null || !cVar2.a(view, rectA7)) {
                            rectA7.set(rectA8);
                        } else if (!rectA8.contains(rectA7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA7.toShortString() + " | Bounds:" + rectA8.toShortString());
                        }
                        rectA8.setEmpty();
                        c1516Mf4.b(rectA8);
                        if (rectA7.isEmpty()) {
                            rectA7.setEmpty();
                            c1516Mf4.b(rectA7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar3.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i10 = (rectA7.top - ((ViewGroup.MarginLayoutParams) fVar3).topMargin) - fVar3.j) >= (i11 = rectA.top)) {
                                z2 = false;
                            } else {
                                x(view, i11 - i10);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectA7.bottom) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin) + fVar3.j) < (i9 = rectA.bottom)) {
                                x(view, height - i9);
                                z2 = true;
                            }
                            if (!z2) {
                                x(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i7 = (rectA7.left - ((ViewGroup.MarginLayoutParams) fVar3).leftMargin) - fVar3.i) >= (i8 = rectA.left)) {
                                z3 = false;
                            } else {
                                w(view, i8 - i7);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectA7.right) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin) + fVar3.i) < (i6 = rectA.right)) {
                                w(view, width - i6);
                                z3 = true;
                            }
                            if (!z3) {
                                w(view, 0);
                            }
                            rectA7.setEmpty();
                            c1516Mf4.b(rectA7);
                        }
                    }
                }
                if (i2 != 2) {
                    rect2 = rect7;
                    rect2.set(((f) view.getLayoutParams()).p);
                    if (rect2.equals(rect)) {
                        arrayList = arrayList3;
                        i4 = i16;
                    } else {
                        ((f) view.getLayoutParams()).p.set(rect);
                    }
                } else {
                    rect2 = rect7;
                }
                int i19 = i3 + 1;
                i4 = i16;
                while (true) {
                    arrayList = arrayList3;
                    if (i19 >= i4) {
                        break;
                    }
                    View view2 = (View) arrayList.get(i19);
                    f fVar4 = (f) view2.getLayoutParams();
                    c cVar3 = fVar4.a;
                    if (cVar3 == null || !cVar3.b(view2, view)) {
                        i5 = 1;
                    } else if (i2 == 0 && fVar4.o) {
                        fVar4.o = false;
                        i5 = 1;
                    } else {
                        if (i2 != 2) {
                            zD = cVar3.d(this, view2, view);
                        } else {
                            cVar3.e(this, view);
                            zD = true;
                        }
                        i5 = 1;
                        if (i2 == 1) {
                            fVar4.o = zD;
                        }
                    }
                    i19 += i5;
                    arrayList3 = arrayList;
                }
            } else {
                int i20 = size;
                arrayList = arrayList2;
                i4 = i20;
                rect = rectA2;
                rect2 = rectA3;
                i3 = i12;
            }
            i12 = i3 + 1;
            ArrayList arrayList4 = arrayList;
            size = i4;
            arrayList2 = arrayList4;
            rectA3 = rect2;
            rectA2 = rect;
        }
    }

    public final void r(@NonNull View view, int i2) {
        int i3;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.k;
        if (view2 == null && fVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C1516Mf1 c1516Mf1 = B;
        if (view2 != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            try {
                f(view2, rectA);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                g(i2, rectA, rectA2, fVar2, measuredWidth, measuredHeight);
                b(fVar2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                c1516Mf1.b(rectA);
                rectA2.setEmpty();
                c1516Mf1.b(rectA2);
            }
        }
        int i4 = fVar.e;
        if (i4 < 0) {
            f fVar3 = (f) view.getLayoutParams();
            Rect rectA3 = a();
            rectA3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin);
            if (this.r != null) {
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectA3.left = this.r.b() + rectA3.left;
                    rectA3.top = this.r.d() + rectA3.top;
                    rectA3.right -= this.r.c();
                    rectA3.bottom -= this.r.a();
                }
            }
            Rect rectA4 = a();
            int i5 = fVar3.c;
            if ((i5 & 7) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            Gravity.apply(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, i2);
            view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
            rectA3.setEmpty();
            c1516Mf1.b(rectA3);
            rectA4.setEmpty();
            c1516Mf1.b(rectA4);
            return;
        }
        f fVar4 = (f) view.getLayoutParams();
        int i6 = fVar4.c;
        if (i6 == 0) {
            i6 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i4 = width - i4;
        }
        int iH = h(i4) - measuredWidth2;
        if (i7 == 1) {
            iH += measuredWidth2 / 2;
        } else if (i7 == 5) {
            iH += measuredWidth2;
        }
        if (i8 != 16) {
            i3 = i8 != 80 ? 0 : measuredHeight2;
        } else {
            i3 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, Math.min(iH, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        c cVar = ((f) view.getLayoutParams()).a;
        if (cVar == null || !cVar.m(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.k) {
            return;
        }
        v(false);
        this.k = true;
    }

    public final void s(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.u = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.t = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.t.setState(getDrawableState());
                }
                Drawable drawable3 = this.t;
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                A30.b.b(drawable3, getLayoutDirection());
                this.t.setVisible(getVisibility() == 0, false);
                this.t.setCallback(this);
            }
            WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? C6333rM.getDrawable(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.t;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.t.setVisible(z2, false);
    }

    public final boolean t(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.g;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        i iVar = A;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zG = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            c cVar = ((f) view.getLayoutParams()).a;
            if (zG && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i2 == 0) {
                        cVar.g(this, view, motionEventObtain);
                    } else if (i2 == 1) {
                        cVar.r(this, view, motionEventObtain);
                    }
                }
            } else if (!zG && cVar != null) {
                if (i2 == 0) {
                    zG = cVar.g(this, view, motionEvent);
                } else if (i2 == 1) {
                    zG = cVar.r(this, view, motionEvent);
                }
                if (zG) {
                    this.n = view;
                }
            }
        }
        arrayList.clear();
        return zG;
    }

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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v4 android.view.View
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final void u() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (cVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    cVar.g(this, childAt, motionEventObtain);
                } else {
                    cVar.r(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).getClass();
        }
        this.n = null;
        this.k = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t;
    }

    public final void y() {
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (!getFitsSystemWindows()) {
            Cd2.d.u(this, null);
            return;
        }
        if (this.v == null) {
            this.v = new a();
        }
        Cd2.d.u(this, this.v);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        public c a;
        public boolean b;
        public final int c;
        public int d;
        public final int e;
        public final int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public final Rect p;

        public f() {
            super(-2, -2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }

        public final boolean a(int i) {
            if (i == 0) {
                return this.m;
            }
            if (i != 1) {
                return false;
            }
            return this.n;
        }

        public final void b(c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.f();
                }
                this.a = cVar;
                this.b = true;
                if (cVar != null) {
                    cVar.c(this);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(@NonNull Context context, AttributeSet attributeSet) {
            c cVarNewInstance;
            super(context, attributeSet);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2503Yl1.b);
            this.c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.b = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.x;
                if (TextUtils.isEmpty(string)) {
                    cVarNewInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.x;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + JwtParser.SEPARATOR_CHAR + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.z;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.y);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVarNewInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        throw new RuntimeException(C5491nL.c("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.a = cVarNewInstance;
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.c(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }
    }
}
