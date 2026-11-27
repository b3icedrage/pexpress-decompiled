package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.C3195ce2;
import defpackage.C3226cm1;
import defpackage.C5345me2;
import defpackage.C5426n2;
import defpackage.C8061zb0;
import defpackage.Cd2;
import defpackage.InterfaceC6265r2;
import defpackage.SP1;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public final Rect d;
    public final Rect e;
    public final androidx.viewpager2.widget.a g;
    public int h;
    public boolean i;
    public final a j;
    public final d k;
    public int l;
    public Parcelable m;
    public final i n;
    public final h o;
    public final androidx.viewpager2.widget.c p;
    public final androidx.viewpager2.widget.a q;
    public final C8061zb0 r;
    public final androidx.viewpager2.widget.b s;
    public RecyclerView.j t;
    public boolean u;
    public boolean v;
    public int w;
    public final f x;

    public class a extends c {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c, androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.i = true;
            viewPager2.p.l = true;
        }
    }

    public abstract class b {
    }

    public static abstract class c extends RecyclerView.g {
        @Override // androidx.recyclerview.widget.RecyclerView.g
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b() {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(Object obj, int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i, int i2) {
            a();
        }
    }

    public class d extends LinearLayoutManager {
        public d() {
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void B0(@NonNull RecyclerView.y yVar, @NonNull int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.B0(yVar, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void S(@NonNull RecyclerView.t tVar, @NonNull RecyclerView.y yVar, @NonNull C5426n2 c5426n2) {
            super.S(tVar, yVar, c5426n2);
            ViewPager2.this.x.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean f0(@NonNull RecyclerView.t tVar, @NonNull RecyclerView.y yVar, int i, Bundle bundle) {
            ViewPager2.this.x.getClass();
            return super.f0(tVar, yVar, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean l0(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    public class f extends b {
        public final a a = new a();
        public final b b = new b();
        public androidx.viewpager2.widget.f c;

        public class a implements InterfaceC6265r2 {
            public a() {
            }

            @Override // defpackage.InterfaceC6265r2
            public final boolean a(@NonNull View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.v) {
                    viewPager2.d(currentItem, true);
                }
                return true;
            }
        }

        public class b implements InterfaceC6265r2 {
            public b() {
            }

            @Override // defpackage.InterfaceC6265r2
            public final boolean a(@NonNull View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.v) {
                    viewPager2.d(currentItem, true);
                }
                return true;
            }
        }

        public f() {
        }

        public final void a() {
            int iC;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = R.id.accessibilityActionPageLeft;
            Cd2.i(viewPager2, R.id.accessibilityActionPageLeft);
            Cd2.g(viewPager2, 0);
            Cd2.i(viewPager2, R.id.accessibilityActionPageRight);
            Cd2.g(viewPager2, 0);
            Cd2.i(viewPager2, R.id.accessibilityActionPageUp);
            Cd2.g(viewPager2, 0);
            Cd2.i(viewPager2, R.id.accessibilityActionPageDown);
            Cd2.g(viewPager2, 0);
            if (viewPager2.getAdapter() == null || (iC = viewPager2.getAdapter().c()) == 0 || !viewPager2.v) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            b bVar = this.b;
            a aVar = this.a;
            if (orientation != 0) {
                if (viewPager2.h < iC - 1) {
                    Cd2.j(viewPager2, new C5426n2.a(R.id.accessibilityActionPageDown), aVar);
                }
                if (viewPager2.h > 0) {
                    Cd2.j(viewPager2, new C5426n2.a(R.id.accessibilityActionPageUp), bVar);
                    return;
                }
                return;
            }
            boolean z = viewPager2.k.A() == 1;
            int i2 = z ? 16908360 : 16908361;
            if (z) {
                i = 16908361;
            }
            if (viewPager2.h < iC - 1) {
                Cd2.j(viewPager2, new C5426n2.a(i2), aVar);
            }
            if (viewPager2.h > 0) {
                Cd2.j(viewPager2, new C5426n2.a(i), bVar);
            }
        }
    }

    public interface g {
    }

    public class h extends B {
        public h() {
        }

        @Override // androidx.recyclerview.widget.B, androidx.recyclerview.widget.H
        public final View c(RecyclerView.m mVar) {
            androidx.viewpager2.widget.c cVar = ViewPager2.this.r.a;
            return super.c(mVar);
        }
    }

    public class i extends RecyclerView {
        public i(Context context) {
            super(context, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.x.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.h);
            accessibilityEvent.setToIndex(viewPager2.h);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.v && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.v && super.onTouchEvent(motionEvent);
        }
    }

    public static class k implements Runnable {
        public final int d;
        public final i e;

        public k(int i, i iVar) {
            this.d = i;
            this.e = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.e.i0(this.d);
        }
    }

    public ViewPager2(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a();
        this.g = aVar;
        this.i = false;
        this.j = new a();
        this.l = -1;
        this.t = null;
        this.u = false;
        this.v = true;
        this.w = -1;
        this.x = new f();
        i iVar = new i(context);
        this.n = iVar;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        iVar.setId(View.generateViewId());
        this.n.setDescendantFocusability(131072);
        d dVar = new d();
        this.k = dVar;
        this.n.setLayoutManager(dVar);
        this.n.setScrollingTouchSlop(1);
        int[] iArr = C3226cm1.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.n.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            i iVar2 = this.n;
            C3195ce2 c3195ce2 = new C3195ce2();
            if (iVar2.H == null) {
                iVar2.H = new ArrayList();
            }
            iVar2.H.add(c3195ce2);
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(this);
            this.p = cVar;
            this.r = new C8061zb0(cVar);
            h hVar = new h();
            this.o = hVar;
            hVar.a(this.n);
            this.n.h(this.p);
            androidx.viewpager2.widget.a aVar2 = new androidx.viewpager2.widget.a();
            this.q = aVar2;
            this.p.a = aVar2;
            androidx.viewpager2.widget.d dVar2 = new androidx.viewpager2.widget.d(this);
            androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
            this.q.a.add(dVar2);
            this.q.a.add(eVar);
            f fVar = this.x;
            i iVar3 = this.n;
            fVar.getClass();
            iVar3.setImportantForAccessibility(2);
            fVar.c = new androidx.viewpager2.widget.f(fVar);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            this.q.a.add(aVar);
            androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b();
            this.s = bVar;
            this.q.a.add(bVar);
            i iVar4 = this.n;
            attachViewToParent(iVar4, 0, iVar4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(@NonNull e eVar) {
        this.g.a.add(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        RecyclerView.e adapter;
        if (this.l == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.m;
        if (parcelable != null) {
            if (adapter instanceof SP1) {
                ((SP1) adapter).b(parcelable);
            }
            this.m = null;
        }
        int iMax = Math.max(0, Math.min(this.l, adapter.c() - 1));
        this.h = iMax;
        this.l = -1;
        this.n.f0(iMax);
        this.x.a();
    }

    public final void c(int i2, boolean z) {
        androidx.viewpager2.widget.c cVar = this.r.a;
        d(i2, z);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.n.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.n.canScrollVertically(i2);
    }

    public final void d(int i2, boolean z) {
        androidx.viewpager2.widget.a aVar;
        RecyclerView.e adapter = getAdapter();
        if (adapter == null) {
            if (this.l != -1) {
                this.l = Math.max(i2, 0);
                return;
            }
            return;
        }
        if (adapter.c() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i2, 0), adapter.c() - 1);
        int i3 = this.h;
        if (iMin == i3 && this.p.f == 0) {
            return;
        }
        if (iMin == i3 && z) {
            return;
        }
        double d2 = i3;
        this.h = iMin;
        this.x.a();
        androidx.viewpager2.widget.c cVar = this.p;
        if (cVar.f != 0) {
            cVar.e();
            androidx.viewpager2.widget.c.a aVar2 = cVar.g;
            d2 = ((double) aVar2.a) + ((double) aVar2.b);
        }
        androidx.viewpager2.widget.c cVar2 = this.p;
        cVar2.getClass();
        cVar2.e = z ? 2 : 3;
        boolean z2 = cVar2.i != iMin;
        cVar2.i = iMin;
        cVar2.c(2);
        if (z2 && (aVar = cVar2.a) != null) {
            aVar.c(iMin);
        }
        if (!z) {
            this.n.f0(iMin);
            return;
        }
        double d3 = iMin;
        if (Math.abs(d3 - d2) <= 3.0d) {
            this.n.i0(iMin);
            return;
        }
        this.n.f0(d3 > d2 ? iMin - 3 : iMin + 3);
        i iVar = this.n;
        iVar.post(new k(iMin, iVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof j) {
            int i2 = ((j) parcelable).d;
            sparseArray.put(this.n.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    public final void e() {
        h hVar = this.o;
        if (hVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewC = hVar.c(this.k);
        if (viewC == null) {
            return;
        }
        this.k.getClass();
        int iF = RecyclerView.m.F(viewC);
        if (iF != this.h && getScrollState() == 0) {
            this.q.c(iF);
        }
        this.i = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.x.getClass();
        this.x.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.e getAdapter() {
        return this.n.getAdapter();
    }

    public int getCurrentItem() {
        return this.h;
    }

    public int getItemDecorationCount() {
        return this.n.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.w;
    }

    public int getOrientation() {
        return this.k.p;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        i iVar = this.n;
        if (getOrientation() == 0) {
            height = iVar.getWidth() - iVar.getPaddingLeft();
            paddingBottom = iVar.getPaddingRight();
        } else {
            height = iVar.getHeight() - iVar.getPaddingTop();
            paddingBottom = iVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.p.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iC;
        int iC2;
        int iC3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() == null) {
            iC = 0;
            iC2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iC = viewPager2.getAdapter().c();
            iC2 = 0;
        } else {
            iC2 = viewPager2.getAdapter().c();
            iC = 0;
        }
        accessibilityNodeInfo.setCollectionInfo(C5426n2.e.a(iC, iC2, 0).a);
        RecyclerView.e adapter = viewPager2.getAdapter();
        if (adapter == null || (iC3 = adapter.c()) == 0 || !viewPager2.v) {
            return;
        }
        if (viewPager2.h > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.h < iC3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.n.getMeasuredWidth();
        int measuredHeight = this.n.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.d;
        rect.left = paddingLeft;
        rect.right = (i4 - i2) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i5 - i3) - getPaddingBottom();
        Rect rect2 = this.e;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.n.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.i) {
            e();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        measureChild(this.n, i2, i3);
        int measuredWidth = this.n.getMeasuredWidth();
        int measuredHeight = this.n.getMeasuredHeight();
        int measuredState = this.n.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.l = jVar.e;
        this.m = jVar.g;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.d = this.n.getId();
        int i2 = this.l;
        if (i2 == -1) {
            i2 = this.h;
        }
        jVar.e = i2;
        Parcelable parcelable = this.m;
        if (parcelable != null) {
            jVar.g = parcelable;
            return jVar;
        }
        Object adapter = this.n.getAdapter();
        if (adapter instanceof SP1) {
            jVar.g = ((SP1) adapter).a();
        }
        return jVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i2, Bundle bundle) {
        this.x.getClass();
        if (i2 != 8192 && i2 != 4096) {
            return super.performAccessibilityAction(i2, bundle);
        }
        f fVar = this.x;
        fVar.getClass();
        if (i2 != 8192 && i2 != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = ViewPager2.this;
        int currentItem = i2 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.v) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    public void setAdapter(RecyclerView.e eVar) {
        RecyclerView.e adapter = this.n.getAdapter();
        f fVar = this.x;
        if (adapter != null) {
            adapter.a.unregisterObserver(fVar.c);
        } else {
            fVar.getClass();
        }
        a aVar = this.j;
        if (adapter != null) {
            adapter.a.unregisterObserver(aVar);
        }
        this.n.setAdapter(eVar);
        this.h = 0;
        b();
        f fVar2 = this.x;
        fVar2.a();
        if (eVar != null) {
            eVar.n(fVar2.c);
        }
        if (eVar != null) {
            eVar.n(aVar);
        }
    }

    public void setCurrentItem(int i2) {
        c(i2, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.x.a();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.w = i2;
        this.n.requestLayout();
    }

    public void setOrientation(int i2) {
        this.k.b1(i2);
        this.x.a();
    }

    public void setPageTransformer(g gVar) {
        if (gVar != null) {
            if (!this.u) {
                this.t = this.n.getItemAnimator();
                this.u = true;
            }
            this.n.setItemAnimator(null);
        } else if (this.u) {
            this.n.setItemAnimator(this.t);
            this.t = null;
            this.u = false;
        }
        this.s.getClass();
        if (gVar == null) {
            return;
        }
        this.s.getClass();
        this.s.getClass();
    }

    public void setUserInputEnabled(boolean z) {
        this.v = z;
        this.x.a();
    }

    public static class j extends View.BaseSavedState {
        public static final Parcelable.Creator<j> CREATOR = new a();
        public int d;
        public int e;
        public Parcelable g;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeParcelable(this.g, i);
        }

        public static class a implements Parcelable.ClassLoaderCreator<j> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                j jVar = new j(parcel, null);
                jVar.d = parcel.readInt();
                jVar.e = parcel.readInt();
                jVar.g = parcel.readParcelable(null);
                return jVar;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new j[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                j jVar = new j(parcel, classLoader);
                jVar.d = parcel.readInt();
                jVar.e = parcel.readInt();
                jVar.g = parcel.readParcelable(classLoader);
                return jVar;
            }
        }
    }

    public static abstract class e {
        public void a(int i) {
        }

        public void c(int i) {
        }

        public void b(float f, int i, int i2) {
        }
    }
}
