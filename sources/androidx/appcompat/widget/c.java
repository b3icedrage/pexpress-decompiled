package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar.f;
import com.pexpress.tool.R;
import defpackage.BU;
import defpackage.C2432Xo;
import defpackage.C3855fm1;
import defpackage.C5345me2;
import defpackage.C7652xe;
import defpackage.Cd2;
import defpackage.ViewOnClickListenerC5841p02;
import defpackage.WZ1;

/* JADX INFO: loaded from: classes.dex */
public final class c implements BU {
    public final Toolbar a;
    public int b;
    public final View c;
    public Drawable d;
    public Drawable e;
    public final Drawable f;
    public boolean g;
    public CharSequence h;
    public final CharSequence i;
    public final CharSequence j;
    public Window.Callback k;
    public boolean l;
    public androidx.appcompat.widget.a m;
    public final int n;
    public final Drawable o;

    public class a extends C2432Xo {
        public boolean d = false;
        public final /* synthetic */ int e;

        public a(int i) {
            this.e = i;
        }

        @Override // defpackage.InterfaceC5765oe2
        public final void b() {
            if (this.d) {
                return;
            }
            c.this.a.setVisibility(this.e);
        }

        @Override // defpackage.C2432Xo, defpackage.InterfaceC5765oe2
        public final void c() {
            this.d = true;
        }

        @Override // defpackage.C2432Xo, defpackage.InterfaceC5765oe2
        public final void e() {
            c.this.a.setVisibility(0);
        }
    }

    public c(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar.getNavigationIcon();
        WZ1 wz1E = WZ1.e(toolbar.getContext(), null, C3855fm1.a, R.attr.actionBarStyle);
        int i = 15;
        this.o = wz1E.b(15);
        if (z) {
            TypedArray typedArray = wz1E.b;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableB = wz1E.b(20);
            if (drawableB != null) {
                this.e = drawableB;
                r();
            }
            Drawable drawableB2 = wz1E.b(17);
            if (drawableB2 != null) {
                setIcon(drawableB2);
            }
            if (this.f == null && (drawable = this.o) != null) {
                this.f = drawable;
                int i2 = this.b & 4;
                Toolbar toolbar2 = this.a;
                if (i2 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            j(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.c;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.c = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                j(this.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.x.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.p = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.e;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.q = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.g;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.b = i;
        }
        wz1E.f();
        if (R.string.abc_action_bar_up_description != this.n) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i3 = this.n;
                this.j = i3 != 0 ? toolbar.getContext().getString(i3) : null;
                q();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC5841p02(this));
    }

    @Override // defpackage.BU
    public final boolean a() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.a.d;
        return (actionMenuView == null || (aVar = actionMenuView.x) == null || !aVar.j()) ? false : true;
    }

    @Override // defpackage.BU
    public final void b() {
        this.l = true;
    }

    @Override // defpackage.BU
    public final boolean c() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.d) != null && actionMenuView.w;
    }

    @Override // defpackage.BU
    public final void collapseActionView() {
        Toolbar.f fVar = this.a.Q;
        h hVar = fVar == null ? null : fVar.e;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    @Override // defpackage.BU
    public final void d(f fVar, j.a aVar) {
        androidx.appcompat.widget.a aVar2 = this.m;
        Toolbar toolbar = this.a;
        if (aVar2 == null) {
            androidx.appcompat.widget.a aVar3 = new androidx.appcompat.widget.a(toolbar.getContext());
            this.m = aVar3;
            aVar3.m = R.id.action_menu_presenter;
        }
        androidx.appcompat.widget.a aVar4 = this.m;
        aVar4.i = aVar;
        if (fVar == null && toolbar.d == null) {
            return;
        }
        toolbar.f();
        f fVar2 = toolbar.d.t;
        if (fVar2 == fVar) {
            return;
        }
        if (fVar2 != null) {
            fVar2.r(toolbar.P);
            fVar2.r(toolbar.Q);
        }
        if (toolbar.Q == null) {
            toolbar.Q = toolbar.new f();
        }
        aVar4.v = true;
        if (fVar != null) {
            fVar.b(aVar4, toolbar.n);
            fVar.b(toolbar.Q, toolbar.n);
        } else {
            aVar4.h(toolbar.n, null);
            toolbar.Q.h(toolbar.n, null);
            aVar4.d(true);
            toolbar.Q.d(true);
        }
        toolbar.d.setPopupTheme(toolbar.o);
        toolbar.d.setPresenter(aVar4);
        toolbar.P = aVar4;
        toolbar.u();
    }

    @Override // defpackage.BU
    public final boolean e() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.a.d;
        if (actionMenuView == null || (aVar = actionMenuView.x) == null) {
            return false;
        }
        return aVar.z != null || aVar.j();
    }

    @Override // defpackage.BU
    public final boolean f() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.a.d;
        return (actionMenuView == null || (aVar = actionMenuView.x) == null || !aVar.b()) ? false : true;
    }

    @Override // defpackage.BU
    public final boolean g() {
        return this.a.t();
    }

    @Override // defpackage.BU
    public final Context getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.BU
    public final CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // defpackage.BU
    public final void h() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.a.d;
        if (actionMenuView == null || (aVar = actionMenuView.x) == null) {
            return;
        }
        aVar.b();
        androidx.appcompat.widget.a.C0220a c0220a = aVar.y;
        if (c0220a == null || !c0220a.b()) {
            return;
        }
        c0220a.i.dismiss();
    }

    @Override // defpackage.BU
    public final boolean i() {
        Toolbar.f fVar = this.a.Q;
        return (fVar == null || fVar.e == null) ? false : true;
    }

    @Override // defpackage.BU
    public final void j(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    q();
                }
                int i3 = this.b & 4;
                Toolbar toolbar = this.a;
                if (i3 != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                r();
            }
            int i4 = i2 & 8;
            Toolbar toolbar2 = this.a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    @Override // defpackage.BU
    public final void l(int i) {
        this.e = i != 0 ? C7652xe.d(this.a.getContext(), i) : null;
        r();
    }

    @Override // defpackage.BU
    public final C5345me2 m(int i, long j) {
        C5345me2 c5345me2A = Cd2.a(this.a);
        c5345me2A.a(i == 0 ? 1.0f : 0.0f);
        c5345me2A.c(j);
        c5345me2A.d(new a(i));
        return c5345me2A;
    }

    @Override // defpackage.BU
    public final void n(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.BU
    public final int o() {
        return this.b;
    }

    @Override // defpackage.BU
    public final void p(boolean z) {
        this.a.setCollapsible(z);
    }

    public final void q() {
        if ((this.b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void r() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.e) == null) {
            drawable = this.d;
        }
        this.a.setLogo(drawable);
    }

    @Override // defpackage.BU
    public final void setIcon(int i) {
        setIcon(i != 0 ? C7652xe.d(this.a.getContext(), i) : null);
    }

    @Override // defpackage.BU
    public final void setTitle(CharSequence charSequence) {
        this.g = true;
        this.h = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.setTitle(charSequence);
            if (this.g) {
                Cd2.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.BU
    public final void setWindowCallback(Window.Callback callback) {
        this.k = callback;
    }

    @Override // defpackage.BU
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.g) {
            return;
        }
        this.h = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.setTitle(charSequence);
            if (this.g) {
                Cd2.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.BU
    public final void setIcon(Drawable drawable) {
        this.d = drawable;
        r();
    }

    @Override // defpackage.BU
    public final void k() {
    }
}
