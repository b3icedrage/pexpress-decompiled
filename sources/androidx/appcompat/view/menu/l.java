package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.pexpress.tool.R;
import defpackage.AbstractC4901kZ0;
import defpackage.C5111lZ0;
import defpackage.C5345me2;
import defpackage.Cd2;
import defpackage.Z30;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC4901kZ0 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context e;
    public final f g;
    public final e h;
    public final boolean i;
    public final int j;
    public final int k;
    public final C5111lZ0 l;
    public i.a o;
    public View p;
    public View q;
    public j.a r;
    public ViewTreeObserver s;
    public boolean t;
    public boolean u;
    public int v;
    public boolean x;
    public final a m = new a();
    public final b n = new b();
    public int w = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            l lVar = l.this;
            if (lVar.a()) {
                C5111lZ0 c5111lZ0 = lVar.l;
                if (c5111lZ0.C) {
                    return;
                }
                View view = lVar.q;
                if (view == null || !view.isShown()) {
                    lVar.dismiss();
                } else {
                    c5111lZ0.b();
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.s;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.s = view.getViewTreeObserver();
                }
                lVar.s.removeGlobalOnLayoutListener(lVar.m);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(int i, Context context, View view, f fVar, boolean z) {
        this.e = context;
        this.g = fVar;
        this.i = z;
        this.h = new e(fVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.p = view;
        this.l = new C5111lZ0(context, null, i);
        fVar.b(this, context);
    }

    @Override // defpackage.InterfaceC8013zL1
    public final boolean a() {
        return !this.t && this.l.D.isShowing();
    }

    @Override // defpackage.InterfaceC8013zL1
    public final void b() {
        View view;
        if (a()) {
            return;
        }
        if (this.t || (view = this.p) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.q = view;
        C5111lZ0 c5111lZ0 = this.l;
        c5111lZ0.D.setOnDismissListener(this);
        c5111lZ0.t = this;
        c5111lZ0.C = true;
        c5111lZ0.D.setFocusable(true);
        View view2 = this.q;
        boolean z = this.s == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.s = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.m);
        }
        view2.addOnAttachStateChangeListener(this.n);
        c5111lZ0.s = view2;
        c5111lZ0.p = this.w;
        boolean z2 = this.u;
        Context context = this.e;
        e eVar = this.h;
        if (!z2) {
            this.v = AbstractC4901kZ0.o(eVar, context, this.j);
            this.u = true;
        }
        c5111lZ0.r(this.v);
        c5111lZ0.D.setInputMethodMode(2);
        Rect rect = this.d;
        c5111lZ0.B = rect != null ? new Rect(rect) : null;
        c5111lZ0.b();
        Z30 z30 = c5111lZ0.g;
        z30.setOnKeyListener(this);
        if (this.x) {
            f fVar = this.g;
            if (fVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) z30, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(fVar.m);
                }
                frameLayout.setEnabled(false);
                z30.addHeaderView(frameLayout, null, false);
            }
        }
        c5111lZ0.p(eVar);
        c5111lZ0.b();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z) {
        if (fVar != this.g) {
            return;
        }
        dismiss();
        j.a aVar = this.r;
        if (aVar != null) {
            aVar.c(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z) {
        this.u = false;
        e eVar = this.h;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.InterfaceC8013zL1
    public final void dismiss() {
        if (a()) {
            this.l.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.r = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
    }

    @Override // defpackage.InterfaceC8013zL1
    public final Z30 j() {
        return this.l.g;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        if (mVar.hasVisibleItems()) {
            View view = this.q;
            i iVar = new i(this.k, this.e, view, mVar, this.i);
            j.a aVar = this.r;
            iVar.h = aVar;
            AbstractC4901kZ0 abstractC4901kZ0 = iVar.i;
            if (abstractC4901kZ0 != null) {
                abstractC4901kZ0.f(aVar);
            }
            boolean zW = AbstractC4901kZ0.w(mVar);
            iVar.g = zW;
            AbstractC4901kZ0 abstractC4901kZ1 = iVar.i;
            if (abstractC4901kZ1 != null) {
                abstractC4901kZ1.q(zW);
            }
            iVar.j = this.o;
            this.o = null;
            this.g.c(false);
            C5111lZ0 c5111lZ0 = this.l;
            int width = c5111lZ0.j;
            int iN = c5111lZ0.n();
            int i = this.w;
            View view2 = this.p;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if ((Gravity.getAbsoluteGravity(i, view2.getLayoutDirection()) & 7) == 5) {
                width += this.p.getWidth();
            }
            if (!iVar.b()) {
                if (iVar.e != null) {
                    iVar.d(width, iN, true, true);
                }
            }
            j.a aVar2 = this.r;
            if (aVar2 != null) {
                aVar2.d(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        return null;
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void n(f fVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.t = true;
        this.g.c(true);
        ViewTreeObserver viewTreeObserver = this.s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.s = this.q.getViewTreeObserver();
            }
            this.s.removeGlobalOnLayoutListener(this.m);
            this.s = null;
        }
        this.q.removeOnAttachStateChangeListener(this.n);
        i.a aVar = this.o;
        if (aVar != null) {
            aVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void p(View view) {
        this.p = view;
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void q(boolean z) {
        this.h.g = z;
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void r(int i) {
        this.w = i;
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void s(int i) {
        this.l.j = i;
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.o = (i.a) onDismissListener;
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void u(boolean z) {
        this.x = z;
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void v(int i) {
        this.l.k(i);
    }
}
