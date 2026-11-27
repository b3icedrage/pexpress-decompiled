package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Ti2 extends AbstractC6068q5 implements ActionBarOverlayLayout.d {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public BU e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public d i;
    public d j;
    public LayoutInflaterFactory2C3192ce.c k;
    public boolean l;
    public final ArrayList<AbstractC6068q5.b> m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public C5555ne2 s;
    public boolean t;
    public boolean u;
    public final a v;
    public final b w;
    public final c x;

    public class a extends C2432Xo {
        public a() {
        }

        @Override // defpackage.InterfaceC5765oe2
        public final void b() {
            View view;
            Ti2 ti2 = Ti2.this;
            if (ti2.o && (view = ti2.g) != null) {
                view.setTranslationY(0.0f);
                ti2.d.setTranslationY(0.0f);
            }
            ti2.d.setVisibility(8);
            ti2.d.setTransitioning(false);
            ti2.s = null;
            LayoutInflaterFactory2C3192ce.c cVar = ti2.k;
            if (cVar != null) {
                cVar.a(ti2.j);
                ti2.j = null;
                ti2.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = ti2.c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                Cd2.c.c(actionBarOverlayLayout);
            }
        }
    }

    public class b extends C2432Xo {
        public b() {
        }

        @Override // defpackage.InterfaceC5765oe2
        public final void b() {
            Ti2 ti2 = Ti2.this;
            ti2.s = null;
            ti2.d.requestLayout();
        }
    }

    public class c {
        public c() {
        }
    }

    public class d extends AbstractC6907u5 implements f.a {
        public final Context g;
        public final f h;
        public LayoutInflaterFactory2C3192ce.c i;
        public WeakReference<View> j;

        public d(Context context, LayoutInflaterFactory2C3192ce.c cVar) {
            this.g = context;
            this.i = cVar;
            f fVar = new f(context);
            fVar.l = 1;
            this.h = fVar;
            fVar.e = this;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(@NonNull f fVar, @NonNull MenuItem menuItem) {
            LayoutInflaterFactory2C3192ce.c cVar = this.i;
            if (cVar != null) {
                return cVar.a.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(@NonNull f fVar) {
            if (this.i == null) {
                return;
            }
            i();
            androidx.appcompat.widget.a aVar = Ti2.this.f.h;
            if (aVar != null) {
                aVar.n();
            }
        }

        @Override // defpackage.AbstractC6907u5
        public final void c() {
            Ti2 ti2 = Ti2.this;
            if (ti2.i != this) {
                return;
            }
            if (ti2.p) {
                ti2.j = this;
                ti2.k = this.i;
            } else {
                this.i.a(this);
            }
            this.i = null;
            ti2.r(false);
            ActionBarContextView actionBarContextView = ti2.f;
            if (actionBarContextView.o == null) {
                actionBarContextView.h();
            }
            ti2.c.setHideOnContentScrollEnabled(ti2.u);
            ti2.i = null;
        }

        @Override // defpackage.AbstractC6907u5
        public final View d() {
            WeakReference<View> weakReference = this.j;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // defpackage.AbstractC6907u5
        public final f e() {
            return this.h;
        }

        @Override // defpackage.AbstractC6907u5
        public final MenuInflater f() {
            return new GV1(this.g);
        }

        @Override // defpackage.AbstractC6907u5
        public final CharSequence g() {
            return Ti2.this.f.getSubtitle();
        }

        @Override // defpackage.AbstractC6907u5
        public final CharSequence h() {
            return Ti2.this.f.getTitle();
        }

        @Override // defpackage.AbstractC6907u5
        public final void i() {
            if (Ti2.this.i != this) {
                return;
            }
            f fVar = this.h;
            fVar.w();
            try {
                this.i.b(this, fVar);
            } finally {
                fVar.v();
            }
        }

        @Override // defpackage.AbstractC6907u5
        public final boolean j() {
            return Ti2.this.f.w;
        }

        @Override // defpackage.AbstractC6907u5
        public final void k(View view) {
            Ti2.this.f.setCustomView(view);
            this.j = new WeakReference<>(view);
        }

        @Override // defpackage.AbstractC6907u5
        public final void l(int i) {
            m(Ti2.this.a.getResources().getString(i));
        }

        @Override // defpackage.AbstractC6907u5
        public final void m(CharSequence charSequence) {
            Ti2.this.f.setSubtitle(charSequence);
        }

        @Override // defpackage.AbstractC6907u5
        public final void n(int i) {
            o(Ti2.this.a.getResources().getString(i));
        }

        @Override // defpackage.AbstractC6907u5
        public final void o(CharSequence charSequence) {
            Ti2.this.f.setTitle(charSequence);
        }

        @Override // defpackage.AbstractC6907u5
        public final void p(boolean z) {
            this.e = z;
            Ti2.this.f.setTitleOptional(z);
        }
    }

    public Ti2(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new a();
        this.w = new b();
        this.x = new c();
        View decorView = activity.getWindow().getDecorView();
        s(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.AbstractC6068q5
    public final boolean b() {
        BU bu = this.e;
        if (bu == null || !bu.i()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // defpackage.AbstractC6068q5
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList<AbstractC6068q5.b> arrayList = this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // defpackage.AbstractC6068q5
    public final int d() {
        return this.e.o();
    }

    @Override // defpackage.AbstractC6068q5
    public final Context e() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.pexpress.tool.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // defpackage.AbstractC6068q5
    public final void g() {
        t(this.a.getResources().getBoolean(com.pexpress.tool.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.AbstractC6068q5
    public final boolean i(int i, KeyEvent keyEvent) {
        f fVar;
        d dVar = this.i;
        if (dVar == null || (fVar = dVar.h) == null) {
            return false;
        }
        fVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return fVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.AbstractC6068q5
    public final void l(boolean z2) {
        if (this.h) {
            return;
        }
        m(z2);
    }

    @Override // defpackage.AbstractC6068q5
    public final void m(boolean z2) {
        int i = z2 ? 4 : 0;
        int iO = this.e.o();
        this.h = true;
        this.e.j((i & 4) | (iO & (-5)));
    }

    @Override // defpackage.AbstractC6068q5
    public final void n(boolean z2) {
        C5555ne2 c5555ne2;
        this.t = z2;
        if (z2 || (c5555ne2 = this.s) == null) {
            return;
        }
        c5555ne2.a();
    }

    @Override // defpackage.AbstractC6068q5
    public final void o(String str) {
        this.e.setTitle(str);
    }

    @Override // defpackage.AbstractC6068q5
    public final void p(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // defpackage.AbstractC6068q5
    public final AbstractC6907u5 q(LayoutInflaterFactory2C3192ce.c cVar) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.h();
        d dVar2 = new d(this.f.getContext(), cVar);
        f fVar = dVar2.h;
        fVar.w();
        try {
            boolean zC = dVar2.i.a.c(dVar2, fVar);
            fVar.v();
            if (!zC) {
                return null;
            }
            this.i = dVar2;
            dVar2.i();
            this.f.f(dVar2);
            r(true);
            return dVar2;
        } catch (Throwable th) {
            fVar.v();
            throw th;
        }
    }

    public final void r(boolean z2) {
        C5345me2 c5345me2M;
        C5345me2 c5345me2E;
        if (z2) {
            if (!this.q) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                u(false);
            }
        } else if (this.q) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            u(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (!actionBarContainer.isLaidOut()) {
            if (z2) {
                this.e.n(4);
                this.f.setVisibility(0);
                return;
            } else {
                this.e.n(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            c5345me2E = this.e.m(4, 100L);
            c5345me2M = this.f.e(0, 200L);
        } else {
            c5345me2M = this.e.m(0, 200L);
            c5345me2E = this.f.e(8, 100L);
        }
        C5555ne2 c5555ne2 = new C5555ne2();
        ArrayList<C5345me2> arrayList = c5555ne2.a;
        arrayList.add(c5345me2E);
        View view = c5345me2E.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = c5345me2M.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c5345me2M);
        c5555ne2.b();
    }

    public final void s(View view) {
        BU wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.pexpress.tool.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.pexpress.tool.R.id.action_bar);
        if (callbackFindViewById instanceof BU) {
            wrapper = (BU) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.pexpress.tool.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.pexpress.tool.R.id.action_bar_container);
        this.d = actionBarContainer;
        BU bu = this.e;
        if (bu == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(Ti2.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.a = bu.getContext();
        if ((this.e.o() & 4) != 0) {
            this.h = true;
        }
        Context context = this.a;
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        t(context.getResources().getBoolean(com.pexpress.tool.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, C3855fm1.a, com.pexpress.tool.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.l) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            Cd2.d.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void t(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            this.e.k();
        } else {
            this.e.k();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        this.e.p(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void u(boolean z2) {
        boolean z3 = this.q || !this.p;
        View view = this.g;
        final c cVar = this.x;
        if (!z3) {
            if (this.r) {
                this.r = false;
                C5555ne2 c5555ne2 = this.s;
                if (c5555ne2 != null) {
                    c5555ne2.a();
                }
                int i = this.n;
                a aVar = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    aVar.b();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                C5555ne2 c5555ne3 = new C5555ne2();
                float f = -this.d.getHeight();
                if (z2) {
                    int[] iArr = {0, 0};
                    this.d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                C5345me2 c5345me2A = Cd2.a(this.d);
                c5345me2A.e(f);
                final View view2 = c5345me2A.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener(view2) { // from class: ke2
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) Ti2.this.d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z4 = c5555ne3.e;
                ArrayList<C5345me2> arrayList = c5555ne3.a;
                if (!z4) {
                    arrayList.add(c5345me2A);
                }
                if (this.o && view != null) {
                    C5345me2 c5345me2A2 = Cd2.a(view);
                    c5345me2A2.e(f);
                    if (!c5555ne3.e) {
                        arrayList.add(c5345me2A2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = y;
                boolean z5 = c5555ne3.e;
                if (!z5) {
                    c5555ne3.c = accelerateInterpolator;
                }
                if (!z5) {
                    c5555ne3.b = 250L;
                }
                if (!z5) {
                    c5555ne3.d = aVar;
                }
                this.s = c5555ne3;
                c5555ne3.b();
                return;
            }
            return;
        }
        if (this.r) {
            return;
        }
        this.r = true;
        C5555ne2 c5555ne4 = this.s;
        if (c5555ne4 != null) {
            c5555ne4.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        b bVar = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.d.setTranslationY(f2);
            C5555ne2 c5555ne5 = new C5555ne2();
            C5345me2 c5345me2A3 = Cd2.a(this.d);
            c5345me2A3.e(0.0f);
            final View view3 = c5345me2A3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener(view3) { // from class: ke2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) Ti2.this.d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z6 = c5555ne5.e;
            ArrayList<C5345me2> arrayList2 = c5555ne5.a;
            if (!z6) {
                arrayList2.add(c5345me2A3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                C5345me2 c5345me2A4 = Cd2.a(view);
                c5345me2A4.e(0.0f);
                if (!c5555ne5.e) {
                    arrayList2.add(c5345me2A4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = z;
            boolean z7 = c5555ne5.e;
            if (!z7) {
                c5555ne5.c = decelerateInterpolator;
            }
            if (!z7) {
                c5555ne5.b = 250L;
            }
            if (!z7) {
                c5555ne5.d = bVar;
            }
            this.s = c5555ne5;
            c5555ne5.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            bVar.b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            Cd2.c.c(actionBarOverlayLayout);
        }
    }

    public Ti2(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new a();
        this.w = new b();
        this.x = new c();
        s(dialog.getWindow().getDecorView());
    }
}
