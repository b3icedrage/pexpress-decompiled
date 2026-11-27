package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import com.pexpress.tool.R;
import defpackage.AbstractC6068q5;
import defpackage.AbstractC7727y;
import defpackage.BU;
import defpackage.C3803fZ0;
import defpackage.C3855fm1;
import defpackage.C5211m02;
import defpackage.C5345me2;
import defpackage.C6051q02;
import defpackage.C6722tB1;
import defpackage.C7652xe;
import defpackage.Cd2;
import defpackage.GV1;
import defpackage.InterfaceC3174cZ0;
import defpackage.InterfaceC5324mZ0;
import defpackage.Je2;
import defpackage.ME;
import defpackage.RunnableC2411Xh;
import defpackage.RunnableC2555Zd;
import defpackage.WZ1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC3174cZ0 {
    public final int A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D;
    public ColorStateList E;
    public boolean F;
    public boolean G;
    public final ArrayList<View> H;
    public final ArrayList<View> I;
    public final int[] J;
    public final C3803fZ0 K;
    public ArrayList<MenuItem> L;
    public h M;
    public final a N;
    public androidx.appcompat.widget.c O;
    public androidx.appcompat.widget.a P;
    public f Q;
    public C5211m02.c R;
    public C5211m02.d S;
    public boolean T;
    public OnBackInvokedCallback U;
    public OnBackInvokedDispatcher V;
    public boolean W;
    public final b a0;
    public ActionMenuView d;
    public AppCompatTextView e;
    public AppCompatTextView g;
    public AppCompatImageButton h;
    public AppCompatImageView i;
    public final Drawable j;
    public final CharSequence k;
    public AppCompatImageButton l;
    public View m;
    public Context n;
    public int o;
    public int p;
    public int q;
    public final int r;
    public final int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public C6722tB1 x;
    public int y;
    public int z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar.this.t();
        }
    }

    public class c implements androidx.appcompat.view.menu.f.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(@NonNull androidx.appcompat.view.menu.f fVar, @NonNull MenuItem menuItem) {
            C5211m02.d dVar = Toolbar.this.S;
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(@NonNull androidx.appcompat.view.menu.f fVar) {
            Toolbar toolbar = Toolbar.this;
            androidx.appcompat.widget.a aVar = toolbar.d.x;
            if (aVar == null || !aVar.j()) {
                Iterator<InterfaceC5324mZ0> it = toolbar.K.b.iterator();
                while (it.hasNext()) {
                    it.next().d(fVar);
                }
            }
            C5211m02.d dVar = toolbar.S;
            if (dVar != null) {
                dVar.b(fVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f fVar = Toolbar.this.Q;
            androidx.appcompat.view.menu.h hVar = fVar == null ? null : fVar.e;
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        public static OnBackInvokedCallback b(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: l02
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements j {
        public androidx.appcompat.view.menu.f d;
        public androidx.appcompat.view.menu.h e;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.j
        public final void d(boolean z) {
            if (this.e != null) {
                androidx.appcompat.view.menu.f fVar = this.d;
                if (fVar != null) {
                    int size = fVar.f.size();
                    for (int i = 0; i < size; i++) {
                        if (this.d.getItem(i) == this.e) {
                            return;
                        }
                    }
                }
                g(this.e);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean g(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.m;
            if (callback instanceof ME) {
                ((ME) callback).e();
            }
            toolbar.removeView(toolbar.m);
            toolbar.removeView(toolbar.l);
            toolbar.m = null;
            ArrayList<View> arrayList = toolbar.I;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                toolbar.addView(arrayList.get(size));
            }
            arrayList.clear();
            this.e = null;
            toolbar.requestLayout();
            hVar.C = false;
            hVar.n.p(false);
            toolbar.u();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.d;
            if (fVar2 != null && (hVar = this.e) != null) {
                fVar2.d(hVar);
            }
            this.d = fVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void i(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean k(m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final Parcelable l() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean m(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.l.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.l);
                }
                toolbar.addView(toolbar.l);
            }
            View actionView = hVar.getActionView();
            toolbar.m = actionView;
            this.e = hVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.m);
                }
                g gVar = new g();
                gVar.a = (toolbar.r & 112) | 8388611;
                gVar.b = 2;
                toolbar.m.setLayoutParams(gVar);
                toolbar.addView(toolbar.m);
            }
            for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = toolbar.getChildAt(childCount);
                if (((g) childAt.getLayoutParams()).b != 2 && childAt != toolbar.d) {
                    toolbar.removeViewAt(childCount);
                    toolbar.I.add(childAt);
                }
            }
            toolbar.requestLayout();
            hVar.C = true;
            hVar.n.p(false);
            KeyEvent.Callback callback = toolbar.m;
            if (callback instanceof ME) {
                ((ME) callback).c();
            }
            toolbar.u();
            return true;
        }
    }

    public static class g extends AbstractC6068q5.a {
        public int b;

        public g() {
            super(-2, -2);
            this.b = 0;
            this.a = 8388627;
        }
    }

    public interface h {
    }

    public static class i extends AbstractC7727y {
        public static final Parcelable.Creator<i> CREATOR = new a();
        public int g;
        public boolean h;

        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new i[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = parcel.readInt();
            this.h = parcel.readInt() != 0;
        }

        @Override // defpackage.AbstractC7727y, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h ? 1 : 0);
        }
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new GV1(getContext());
    }

    public static g h(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            g gVar = (g) layoutParams;
            g gVar2 = new g(gVar);
            gVar2.b = 0;
            gVar2.b = gVar.b;
            return gVar2;
        }
        if (layoutParams instanceof AbstractC6068q5.a) {
            g gVar3 = new g((AbstractC6068q5.a) layoutParams);
            gVar3.b = 0;
            return gVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            g gVar4 = new g(layoutParams);
            gVar4.b = 0;
            return gVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        g gVar5 = new g(marginLayoutParams);
        gVar5.b = 0;
        ((ViewGroup.MarginLayoutParams) gVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return gVar5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i2, ArrayList arrayList) {
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.b == 0 && s(childAt)) {
                    int i4 = gVar.a;
                    WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i4, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.b == 0 && s(childAt2)) {
                int i6 = gVar2.a;
                WeakHashMap<View, C5345me2> weakHashMap3 = Cd2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i6, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3174cZ0
    public final void addMenuProvider(@NonNull InterfaceC5324mZ0 interfaceC5324mZ0) {
        C3803fZ0 c3803fZ0 = this.K;
        c3803fZ0.b.add(interfaceC5324mZ0);
        c3803fZ0.a.run();
    }

    public final void b(View view, boolean z) {
        g gVarH;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVarH = new g();
        } else {
            gVarH = !checkLayoutParams(layoutParams) ? h(layoutParams) : (g) layoutParams;
        }
        gVarH.b = 1;
        if (!z || this.m == null) {
            addView(view, gVarH);
        } else {
            view.setLayoutParams(gVarH);
            this.I.add(view);
        }
    }

    public final void c() {
        if (this.l == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.l = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.j);
            this.l.setContentDescription(this.k);
            g gVar = new g();
            gVar.a = (this.r & 112) | 8388611;
            gVar.b = 2;
            this.l.setLayoutParams(gVar);
            this.l.setOnClickListener(new d());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public final void d() {
        if (this.x == null) {
            C6722tB1 c6722tB1 = new C6722tB1();
            c6722tB1.a = 0;
            c6722tB1.b = 0;
            c6722tB1.c = Integer.MIN_VALUE;
            c6722tB1.d = Integer.MIN_VALUE;
            c6722tB1.e = 0;
            c6722tB1.f = 0;
            c6722tB1.g = false;
            c6722tB1.h = false;
            this.x = c6722tB1;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.d;
        if (actionMenuView.t == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.Q == null) {
                this.Q = new f();
            }
            this.d.setExpandedActionViewsExclusive(true);
            fVar.b(this.Q, this.n);
            u();
        }
    }

    public final void f() {
        if (this.d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.d = actionMenuView;
            actionMenuView.setPopupTheme(this.o);
            this.d.setOnMenuItemClickListener(this.N);
            ActionMenuView actionMenuView2 = this.d;
            C5211m02.c cVar = this.R;
            c cVar2 = new c();
            actionMenuView2.y = cVar;
            actionMenuView2.z = cVar2;
            g gVar = new g();
            gVar.a = (this.r & 112) | 8388613;
            this.d.setLayoutParams(gVar);
            b(this.d, false);
        }
    }

    public final void g() {
        if (this.h == null) {
            this.h = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g gVar = new g();
            gVar.a = (this.r & 112) | 8388611;
            this.h.setLayoutParams(gVar);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.l;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.l;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C6722tB1 c6722tB1 = this.x;
        if (c6722tB1 != null) {
            return c6722tB1.g ? c6722tB1.a : c6722tB1.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.z;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C6722tB1 c6722tB1 = this.x;
        if (c6722tB1 != null) {
            return c6722tB1.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C6722tB1 c6722tB1 = this.x;
        if (c6722tB1 != null) {
            return c6722tB1.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C6722tB1 c6722tB1 = this.x;
        if (c6722tB1 != null) {
            return c6722tB1.g ? c6722tB1.b : c6722tB1.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.y;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.d;
        return (actionMenuView == null || (fVar = actionMenuView.t) == null || !fVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.z, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.i;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.i;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.d.getMenu();
    }

    public View getNavButtonView() {
        return this.h;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.h;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.h;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.P;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.d.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.n;
    }

    public int getPopupTheme() {
        return this.o;
    }

    public CharSequence getSubtitle() {
        return this.C;
    }

    public final TextView getSubtitleTextView() {
        return this.g;
    }

    public CharSequence getTitle() {
        return this.B;
    }

    public int getTitleMarginBottom() {
        return this.w;
    }

    public int getTitleMarginEnd() {
        return this.u;
    }

    public int getTitleMarginStart() {
        return this.t;
    }

    public int getTitleMarginTop() {
        return this.v;
    }

    public final TextView getTitleTextView() {
        return this.e;
    }

    public BU getWrapper() {
        if (this.O == null) {
            this.O = new androidx.appcompat.widget.c(this, true);
        }
        return this.O;
    }

    public final int i(View view, int i2) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = gVar.a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.A & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i5) {
            iMax = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i6 < i7) {
                iMax = Math.max(0, iMax - (i7 - i6));
            }
        }
        return paddingTop + iMax;
    }

    public void l(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public final void m() {
        Iterator<MenuItem> it = this.L.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<InterfaceC5324mZ0> it2 = this.K.b.iterator();
        while (it2.hasNext()) {
            it2.next().c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.L = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.I.contains(view);
    }

    public final int o(View view, int i2, int i3, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int i5 = i(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, i5, iMax + measuredWidth, view.getMeasuredHeight() + i5);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.a0);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.G = false;
        }
        if (!this.G) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.G = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.G = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0281  */
    /* JADX WARN: Code duplicated, block: B:102:0x0286  */
    /* JADX WARN: Code duplicated, block: B:105:0x0295 A[LOOP:0: B:104:0x0293->B:105:0x0295, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02ad A[LOOP:1: B:107:0x02ab->B:108:0x02ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02cd A[LOOP:2: B:110:0x02cb->B:111:0x02cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0313 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0315  */
    /* JADX WARN: Code duplicated, block: B:117:0x0319  */
    /* JADX WARN: Code duplicated, block: B:120:0x0321 A[LOOP:3: B:119:0x031f->B:120:0x0321, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012c  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0133  */
    /* JADX WARN: Code duplicated, block: B:53:0x0136  */
    /* JADX WARN: Code duplicated, block: B:56:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x017e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Code duplicated, block: B:89:0x021c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x021e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0222  */
    /* JADX WARN: Code duplicated, block: B:95:0x0236  */
    /* JADX WARN: Code duplicated, block: B:96:0x0259  */
    /* JADX WARN: Code duplicated, block: B:98:0x025c  */
    /* JADX WARN: Code duplicated, block: B:99:0x027e  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int iO;
        int iP;
        int iMax;
        int iMin;
        boolean zS;
        boolean zS2;
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        g gVar;
        g gVar2;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        int paddingTop;
        int i8;
        int iMax2;
        int i9;
        int i10;
        int iMax3;
        int i11;
        int i12;
        int i13;
        int iMax4;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList<View> arrayList;
        int size;
        int iO2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int size4;
        int i25;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.J;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i5 - i3) : 0;
        if (s(this.h)) {
            if (z4) {
                iP = p(this.h, i26, iMin2, iArr);
                iO = paddingLeft;
            } else {
                iO = o(this.h, paddingLeft, iMin2, iArr);
            }
            if (s(this.l)) {
                if (z4) {
                    iP = p(this.l, iP, iMin2, iArr);
                } else {
                    iO = o(this.l, iO, iMin2, iArr);
                }
            }
            if (s(this.d)) {
                if (z4) {
                    iO = o(this.d, iO, iMin2, iArr);
                } else {
                    iP = p(this.d, iP, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iO);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iP));
            iMax = Math.max(iO, currentContentInsetLeft);
            iMin = Math.min(iP, i26 - currentContentInsetRight);
            if (s(this.m)) {
                if (z4) {
                    iMin = p(this.m, iMin, iMin2, iArr);
                } else {
                    iMax = o(this.m, iMax, iMin2, iArr);
                }
            }
            if (s(this.i)) {
                if (z4) {
                    iMin = p(this.i, iMin, iMin2, iArr);
                } else {
                    iMax = o(this.i, iMax, iMin2, iArr);
                }
            }
            zS = s(this.e);
            zS2 = s(this.g);
            if (zS) {
                g gVar3 = (g) this.e.getLayoutParams();
                measuredHeight = this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zS2) {
                g gVar4 = (g) this.g.getLayoutParams();
                measuredHeight = this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar4).topMargin + ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin + measuredHeight;
            }
            if (!zS || zS2) {
                if (zS) {
                    appCompatTextView = this.e;
                } else {
                    appCompatTextView = this.g;
                }
                if (zS2) {
                    appCompatTextView2 = this.g;
                } else {
                    appCompatTextView2 = this.e;
                }
                gVar = (g) appCompatTextView.getLayoutParams();
                gVar2 = (g) appCompatTextView2.getLayoutParams();
                i6 = measuredHeight;
                z2 = (!zS && this.e.getMeasuredWidth() > 0) || (zS2 && this.g.getMeasuredWidth() > 0);
                i7 = this.A & 112;
                z3 = z4;
                if (i7 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.v;
                } else if (i7 != 80) {
                    iMax4 = (((height - paddingTop2) - paddingBottom) - i6) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.v;
                    if (iMax4 < i14) {
                        iMax4 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i6) - iMax4) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                        i17 = this.w;
                        if (i15 < i16 + i17) {
                            iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax4;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.w) - i6;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.t;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zS) {
                        g gVar5 = (g) this.e.getLayoutParams();
                        int measuredWidth2 = iMin - this.e.getMeasuredWidth();
                        int measuredHeight2 = this.e.getMeasuredHeight() + paddingTop;
                        this.e.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.u;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zS2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.g.getLayoutParams())).topMargin;
                        this.g.layout(iMin - this.g.getMeasuredWidth(), i28, iMin, this.g.getMeasuredHeight() + i28);
                        i13 = iMin - this.u;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax3 = iMax;
                } else {
                    if (z2) {
                        i8 = this.t;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax2 = Math.max(0, i29) + iMax;
                    iArr[0] = Math.max(0, -i29);
                    if (zS) {
                        g gVar6 = (g) this.e.getLayoutParams();
                        int measuredWidth3 = this.e.getMeasuredWidth() + iMax2;
                        int measuredHeight3 = this.e.getMeasuredHeight() + paddingTop;
                        this.e.layout(iMax2, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.u;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i9 = iMax2;
                    }
                    if (zS2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.g.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.g.getMeasuredWidth() + iMax2;
                        this.g.layout(iMax2, i30, measuredWidth4, this.g.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.u;
                    } else {
                        i10 = iMax2;
                    }
                    if (z2) {
                        iMax3 = Math.max(i9, i10);
                    } else {
                        iMax3 = iMax2;
                    }
                }
            } else {
                iMax3 = iMax;
            }
            arrayList = this.H;
            a(3, arrayList);
            size = arrayList.size();
            iO2 = iMax3;
            for (i18 = 0; i18 < size; i18++) {
                iO2 = o(arrayList.get(i18), iO2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = p(arrayList.get(i19), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view = arrayList.get(i22);
                g gVar7 = (g) view.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) gVar7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) gVar7).rightMargin - i32;
                int iMax5 = Math.max(0, i33);
                int iMax6 = Math.max(0, i34);
                int iMax7 = Math.max(0, -i33);
                int iMax8 = Math.max(0, -i34);
                measuredWidth += view.getMeasuredWidth() + iMax5 + iMax6;
                i22++;
                i21 = iMax7;
                i20 = iMax8;
            }
            i23 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i24 = measuredWidth + i23;
            if (i23 >= iO2) {
                if (i24 > iMin) {
                    iO2 = i23 - (i24 - iMin);
                } else {
                    iO2 = i23;
                }
            }
            size4 = arrayList.size();
            for (i25 = 0; i25 < size4; i25++) {
                iO2 = o(arrayList.get(i25), iO2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iO = paddingLeft;
        iP = i26;
        if (s(this.l)) {
            if (z4) {
                iP = p(this.l, iP, iMin2, iArr);
            } else {
                iO = o(this.l, iO, iMin2, iArr);
            }
        }
        if (s(this.d)) {
            if (z4) {
                iO = o(this.d, iO, iMin2, iArr);
            } else {
                iP = p(this.d, iP, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iP));
        iMax = Math.max(iO, currentContentInsetLeft2);
        iMin = Math.min(iP, i26 - currentContentInsetRight2);
        if (s(this.m)) {
            if (z4) {
                iMin = p(this.m, iMin, iMin2, iArr);
            } else {
                iMax = o(this.m, iMax, iMin2, iArr);
            }
        }
        if (s(this.i)) {
            if (z4) {
                iMin = p(this.i, iMin, iMin2, iArr);
            } else {
                iMax = o(this.i, iMax, iMin2, iArr);
            }
        }
        zS = s(this.e);
        zS2 = s(this.g);
        if (zS) {
            g gVar8 = (g) this.e.getLayoutParams();
            measuredHeight = this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar8).topMargin + ((ViewGroup.MarginLayoutParams) gVar8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zS2) {
            g gVar9 = (g) this.g.getLayoutParams();
            measuredHeight = this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar9).topMargin + ((ViewGroup.MarginLayoutParams) gVar9).bottomMargin + measuredHeight;
        }
        if (zS) {
            if (zS) {
                appCompatTextView = this.e;
            } else {
                appCompatTextView = this.g;
            }
            if (zS2) {
                appCompatTextView2 = this.g;
            } else {
                appCompatTextView2 = this.e;
            }
            gVar = (g) appCompatTextView.getLayoutParams();
            gVar2 = (g) appCompatTextView2.getLayoutParams();
            i6 = measuredHeight;
            if (zS) {
            }
            i7 = this.A & 112;
            z3 = z4;
            if (i7 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.v;
            } else if (i7 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - i6) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.v;
                if (iMax4 < i14) {
                    iMax4 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i6) - iMax4) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i17 = this.w;
                    if (i15 < i16 + i17) {
                        iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.w) - i6;
            }
            if (z3) {
                if (z2) {
                    i11 = this.t;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zS) {
                    g gVar10 = (g) this.e.getLayoutParams();
                    int measuredWidth5 = iMin - this.e.getMeasuredWidth();
                    int measuredHeight4 = this.e.getMeasuredHeight() + paddingTop;
                    this.e.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.u;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) gVar10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zS2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.g.getLayoutParams())).topMargin;
                    this.g.layout(iMin - this.g.getMeasuredWidth(), i211, iMin, this.g.getMeasuredHeight() + i211);
                    i13 = iMin - this.u;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax3 = iMax;
            } else {
                if (z2) {
                    i8 = this.t;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax2 = Math.max(0, i212) + iMax;
                iArr[0] = Math.max(0, -i212);
                if (zS) {
                    g gVar11 = (g) this.e.getLayoutParams();
                    int measuredWidth6 = this.e.getMeasuredWidth() + iMax2;
                    int measuredHeight5 = this.e.getMeasuredHeight() + paddingTop;
                    this.e.layout(iMax2, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.u;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) gVar11).bottomMargin;
                } else {
                    i9 = iMax2;
                }
                if (zS2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.g.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.g.getMeasuredWidth() + iMax2;
                    this.g.layout(iMax2, i35, measuredWidth7, this.g.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.u;
                } else {
                    i10 = iMax2;
                }
                if (z2) {
                    iMax3 = Math.max(i9, i10);
                } else {
                    iMax3 = iMax2;
                }
            }
        } else {
            if (zS) {
                appCompatTextView = this.e;
            } else {
                appCompatTextView = this.g;
            }
            if (zS2) {
                appCompatTextView2 = this.g;
            } else {
                appCompatTextView2 = this.e;
            }
            gVar = (g) appCompatTextView.getLayoutParams();
            gVar2 = (g) appCompatTextView2.getLayoutParams();
            i6 = measuredHeight;
            if (zS) {
            }
            i7 = this.A & 112;
            z3 = z4;
            if (i7 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.v;
            } else if (i7 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - i6) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.v;
                if (iMax4 < i14) {
                    iMax4 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i6) - iMax4) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i17 = this.w;
                    if (i15 < i16 + i17) {
                        iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.w) - i6;
            }
            if (z3) {
                if (z2) {
                    i11 = this.t;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zS) {
                    g gVar12 = (g) this.e.getLayoutParams();
                    int measuredWidth8 = iMin - this.e.getMeasuredWidth();
                    int measuredHeight6 = this.e.getMeasuredHeight() + paddingTop;
                    this.e.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.u;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) gVar12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zS2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.g.getLayoutParams())).topMargin;
                    this.g.layout(iMin - this.g.getMeasuredWidth(), i214, iMin, this.g.getMeasuredHeight() + i214);
                    i13 = iMin - this.u;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax3 = iMax;
            } else {
                if (z2) {
                    i8 = this.t;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax2 = Math.max(0, i215) + iMax;
                iArr[0] = Math.max(0, -i215);
                if (zS) {
                    g gVar13 = (g) this.e.getLayoutParams();
                    int measuredWidth9 = this.e.getMeasuredWidth() + iMax2;
                    int measuredHeight7 = this.e.getMeasuredHeight() + paddingTop;
                    this.e.layout(iMax2, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.u;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) gVar13).bottomMargin;
                } else {
                    i9 = iMax2;
                }
                if (zS2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.g.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.g.getMeasuredWidth() + iMax2;
                    this.g.layout(iMax2, i36, measuredWidth10, this.g.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.u;
                } else {
                    i10 = iMax2;
                }
                if (z2) {
                    iMax3 = Math.max(i9, i10);
                } else {
                    iMax3 = iMax2;
                }
            }
        }
        arrayList = this.H;
        a(3, arrayList);
        size = arrayList.size();
        iO2 = iMax3;
        while (i18 < size) {
            iO2 = o(arrayList.get(i18), iO2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = p(arrayList.get(i19), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view2 = arrayList.get(i22);
            g gVar14 = (g) view2.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) gVar14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) gVar14).rightMargin - i38;
            int iMax9 = Math.max(0, i39);
            int iMax10 = Math.max(0, i310);
            int iMax11 = Math.max(0, -i39);
            int iMax12 = Math.max(0, -i310);
            measuredWidth += view2.getMeasuredWidth() + iMax9 + iMax10;
            i22++;
            i21 = iMax11;
            i20 = iMax12;
        }
        i23 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i24 = measuredWidth + i23;
        if (i23 >= iO2) {
            if (i24 > iMin) {
                iO2 = i23 - (i24 - iMin);
            } else {
                iO2 = i23;
            }
        }
        size4 = arrayList.size();
        while (i25 < size4) {
            iO2 = o(arrayList.get(i25), iO2, iMin2, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int iJ;
        int iMax;
        int iCombineMeasuredStates;
        int iJ2;
        int iK;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = Je2.a(this);
        int i4 = !zA ? 1 : 0;
        int i5 = 0;
        if (s(this.h)) {
            r(this.h, i2, 0, i3, this.s);
            iJ = j(this.h) + this.h.getMeasuredWidth();
            iMax = Math.max(0, k(this.h) + this.h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.h.getMeasuredState());
        } else {
            iJ = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.l)) {
            r(this.l, i2, 0, i3, this.s);
            iJ = j(this.l) + this.l.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.l) + this.l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iJ);
        int iMax4 = Math.max(0, currentContentInsetStart - iJ);
        int[] iArr = this.J;
        iArr[zA ? 1 : 0] = iMax4;
        if (s(this.d)) {
            r(this.d, i2, iMax3, i3, this.s);
            iJ2 = j(this.d) + this.d.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.d.getMeasuredState());
        } else {
            iJ2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iJ2);
        iArr[i4] = Math.max(0, currentContentInsetEnd - iJ2);
        if (s(this.m)) {
            iMax5 += q(this.m, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, k(this.m) + this.m.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.m.getMeasuredState());
        }
        if (s(this.i)) {
            iMax5 += q(this.i, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, k(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (((g) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                iMax5 += q(childAt, i2, iMax5, i3, 0, iArr);
                int iMax6 = Math.max(iMax, k(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i7 = iMax5;
        int i8 = this.v + this.w;
        int i9 = this.t + this.u;
        if (s(this.e)) {
            q(this.e, i2, i7 + i9, i3, i8, iArr);
            int iJ3 = j(this.e) + this.e.getMeasuredWidth();
            iK = k(this.e) + this.e.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
            iMax2 = iJ3;
        } else {
            iK = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.g)) {
            iMax2 = Math.max(iMax2, q(this.g, i2, i7 + i9, i3, i8 + iK, iArr));
            iK += k(this.g) + this.g.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.g.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iK);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i7 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16);
        if (!this.T) {
            i5 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            View childAt2 = getChildAt(i10);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i5 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i5);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.d);
        ActionMenuView actionMenuView = this.d;
        androidx.appcompat.view.menu.f fVar = actionMenuView != null ? actionMenuView.t : null;
        int i2 = iVar.g;
        if (i2 != 0 && this.Q != null && fVar != null && (menuItemFindItem = fVar.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.h) {
            b bVar = this.a0;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        C6722tB1 c6722tB1 = this.x;
        boolean z = i2 == 1;
        if (z == c6722tB1.g) {
            return;
        }
        c6722tB1.g = z;
        if (!c6722tB1.h) {
            c6722tB1.a = c6722tB1.e;
            c6722tB1.b = c6722tB1.f;
            return;
        }
        if (z) {
            int i3 = c6722tB1.d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c6722tB1.e;
            }
            c6722tB1.a = i3;
            int i4 = c6722tB1.c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = c6722tB1.f;
            }
            c6722tB1.b = i4;
            return;
        }
        int i5 = c6722tB1.c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c6722tB1.e;
        }
        c6722tB1.a = i5;
        int i6 = c6722tB1.d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = c6722tB1.f;
        }
        c6722tB1.b = i6;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.widget.a aVar;
        androidx.appcompat.view.menu.h hVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.Q;
        if (fVar != null && (hVar = fVar.e) != null) {
            iVar.g = hVar.a;
        }
        ActionMenuView actionMenuView = this.d;
        iVar.h = (actionMenuView == null || (aVar = actionMenuView.x) == null || !aVar.j()) ? false : true;
        return iVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F = false;
        }
        if (!this.F) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.F = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.F = false;
        return true;
    }

    public final int p(View view, int i2, int i3, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int i5 = i(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, i5, iMax, view.getMeasuredHeight() + i5);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int q(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // defpackage.InterfaceC3174cZ0
    public final void removeMenuProvider(@NonNull InterfaceC5324mZ0 interfaceC5324mZ0) {
        this.K.a(interfaceC5324mZ0);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.W != z) {
            this.W = z;
            u();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(C7652xe.d(getContext(), i2));
    }

    public void setCollapsible(boolean z) {
        this.T = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.z) {
            this.z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.y) {
            this.y = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(C7652xe.d(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(C7652xe.d(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.M = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.o != i2) {
            this.o = i2;
            if (i2 == 0) {
                this.n = getContext();
            } else {
                this.n = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.w = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.u = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.v = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public final boolean t() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.d;
        return (actionMenuView == null || (aVar = actionMenuView.x) == null || !aVar.n()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    public final void u() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            f fVar = this.Q;
            if (fVar == null || fVar.e == null || onBackInvokedDispatcherA == null) {
                z = false;
            } else {
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                if (isAttachedToWindow() && this.W) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z && this.V == null) {
                if (this.U == null) {
                    this.U = e.b(new RunnableC2555Zd(this, 7));
                }
                e.c(onBackInvokedDispatcherA, this.U);
                this.V = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.V) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.U);
            this.V = null;
        }
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = 8388627;
        this.H = new ArrayList<>();
        this.I = new ArrayList<>();
        this.J = new int[2];
        this.K = new C3803fZ0(new RunnableC2411Xh(this, 2));
        this.L = new ArrayList<>();
        this.N = new a();
        this.a0 = new b();
        Context context2 = getContext();
        int[] iArr = C3855fm1.y;
        WZ1 wz1E = WZ1.e(context2, attributeSet, iArr, i2);
        Cd2.k(this, context, iArr, attributeSet, wz1E.b, i2);
        TypedArray typedArray = wz1E.b;
        this.p = typedArray.getResourceId(28, 0);
        this.q = typedArray.getResourceId(19, 0);
        this.A = typedArray.getInteger(0, 8388627);
        this.r = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.w = dimensionPixelOffset;
        this.v = dimensionPixelOffset;
        this.u = dimensionPixelOffset;
        this.t = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.t = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.u = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.v = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.w = dimensionPixelOffset5;
        }
        this.s = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        C6722tB1 c6722tB1 = this.x;
        c6722tB1.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c6722tB1.e = dimensionPixelSize;
            c6722tB1.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c6722tB1.f = dimensionPixelSize2;
            c6722tB1.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c6722tB1.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.y = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.z = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.j = wz1E.b(4);
        this.k = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.n = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableB = wz1E.b(16);
        if (drawableB != null) {
            setNavigationIcon(drawableB);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableB2 = wz1E.b(11);
        if (drawableB2 != null) {
            setLogo(drawableB2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(wz1E.a(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(wz1E.a(20));
        }
        if (typedArray.hasValue(14)) {
            l(typedArray.getResourceId(14, 0));
        }
        wz1E.f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        g gVar = new g(context, attributeSet);
        gVar.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3855fm1.b);
        gVar.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        gVar.b = 0;
        return gVar;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.l;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.l.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.l;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.j);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.i == null) {
                this.i = new AppCompatImageView(getContext(), null);
            }
            if (!n(this.i)) {
                b(this.i, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.i;
            if (appCompatImageView != null && n(appCompatImageView)) {
                removeView(this.i);
                this.I.remove(this.i);
            }
        }
        AppCompatImageView appCompatImageView2 = this.i;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.i == null) {
            this.i = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.i;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.h;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            C6051q02.a(this.h, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.h)) {
                b(this.h, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.h;
            if (appCompatImageButton != null && n(appCompatImageButton)) {
                removeView(this.h);
                this.I.remove(this.h);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.h;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.g;
            if (appCompatTextView != null && n(appCompatTextView)) {
                removeView(this.g);
                this.I.remove(this.g);
            }
        } else {
            if (this.g == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.g = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.q;
                if (i2 != 0) {
                    this.g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.g.setTextColor(colorStateList);
                }
            }
            if (!n(this.g)) {
                b(this.g, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.g;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.E = colorStateList;
        AppCompatTextView appCompatTextView = this.g;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.e;
            if (appCompatTextView != null && n(appCompatTextView)) {
                removeView(this.e);
                this.I.remove(this.e);
            }
        } else {
            if (this.e == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.e = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.e.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.p;
                if (i2 != 0) {
                    this.e.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.e.setTextColor(colorStateList);
                }
            }
            if (!n(this.e)) {
                b(this.e, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.e;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.D = colorStateList;
        AppCompatTextView appCompatTextView = this.e;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
