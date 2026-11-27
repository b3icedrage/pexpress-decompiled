package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import com.pexpress.tool.R;
import defpackage.A30;
import defpackage.AbstractC4901kZ0;
import defpackage.AbstractC7327w5;
import defpackage.AbstractViewOnTouchListenerC1366Kh0;
import defpackage.C6051q02;
import defpackage.InterfaceC8013zL1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends androidx.appcompat.view.menu.a {
    public b A;
    public final f B;
    public int C;
    public d n;
    public Drawable o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public final SparseBooleanArray w;
    public e x;
    public C0220a y;
    public c z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0220a extends i {
        public C0220a(Context context, m mVar, View view) {
            super(R.attr.actionOverflowMenuStyle, context, view, mVar, false);
            if ((mVar.A.x & 32) != 32) {
                View view2 = a.this.n;
                this.e = view2 == null ? (View) a.this.l : view2;
            }
            f fVar = a.this.B;
            this.h = fVar;
            AbstractC4901kZ0 abstractC4901kZ0 = this.i;
            if (abstractC4901kZ0 != null) {
                abstractC4901kZ0.f(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            a aVar = a.this;
            aVar.y = null;
            aVar.C = 0;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    public class c implements Runnable {
        public final e d;

        public c(e eVar) {
            this.d = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.view.menu.f.a aVar;
            a aVar2 = a.this;
            androidx.appcompat.view.menu.f fVar = aVar2.g;
            if (fVar != null && (aVar = fVar.e) != null) {
                aVar.b(fVar);
            }
            View view = (View) aVar2.l;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.d;
                if (eVar.b()) {
                    aVar2.x = eVar;
                } else if (eVar.e != null) {
                    eVar.d(0, 0, false, false);
                    aVar2.x = eVar;
                }
            }
            aVar2.z = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        public class C0221a extends AbstractViewOnTouchListenerC1366Kh0 {
            public C0221a(d dVar) {
                super(dVar);
            }

            @Override // defpackage.AbstractViewOnTouchListenerC1366Kh0
            public final InterfaceC8013zL1 b() {
                e eVar = a.this.x;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // defpackage.AbstractViewOnTouchListenerC1366Kh0
            public final boolean c() {
                a.this.n();
                return true;
            }

            @Override // defpackage.AbstractViewOnTouchListenerC1366Kh0
            public final boolean d() {
                a aVar = a.this;
                if (aVar.z != null) {
                    return false;
                }
                aVar.b();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C6051q02.a(this, getContentDescription());
            setOnTouchListener(new C0221a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.n();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                A30.a.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, View view) {
            super(R.attr.actionOverflowMenuStyle, context, view, fVar, true);
            this.f = 8388613;
            f fVar2 = a.this.B;
            this.h = fVar2;
            AbstractC4901kZ0 abstractC4901kZ0 = this.i;
            if (abstractC4901kZ0 != null) {
                abstractC4901kZ0.f(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            a aVar = a.this;
            androidx.appcompat.view.menu.f fVar = aVar.g;
            if (fVar != null) {
                fVar.c(true);
            }
            aVar.x = null;
            super.c();
        }
    }

    public class f implements j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(@NonNull androidx.appcompat.view.menu.f fVar, boolean z) {
            if (fVar instanceof m) {
                ((m) fVar).z.k().c(false);
            }
            j.a aVar = a.this.i;
            if (aVar != null) {
                aVar.c(fVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(@NonNull androidx.appcompat.view.menu.f fVar) {
            a aVar = a.this;
            if (fVar == aVar.g) {
                return false;
            }
            aVar.C = ((m) fVar).A.a;
            j.a aVar2 = aVar.i;
            if (aVar2 != null) {
                return aVar2.d(fVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new C0222a();
        public int d;

        /* JADX INFO: renamed from: androidx.appcompat.widget.a$g$a, reason: collision with other inner class name */
        public class C0222a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                g gVar = new g();
                gVar.d = parcel.readInt();
                return gVar;
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i) {
                return new g[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.d);
        }
    }

    public a(Context context) {
        this.d = context;
        this.h = LayoutInflater.from(context);
        this.j = R.layout.abc_action_menu_layout;
        this.k = R.layout.abc_action_menu_item_layout;
        this.w = new SparseBooleanArray();
        this.B = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(h hVar, View view, ViewGroup viewGroup) {
        k.a aVar;
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.e()) {
            if (view instanceof k.a) {
                aVar = (k.a) view;
            } else {
                aVar = (k.a) this.h.inflate(this.k, viewGroup, false);
            }
            aVar.d(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.l);
            if (this.A == null) {
                this.A = new b();
            }
            actionMenuItemView.setPopupCallback(this.A);
            actionView = (View) aVar;
        }
        actionView.setVisibility(hVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.c)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        Object obj;
        c cVar = this.z;
        if (cVar != null && (obj = this.l) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.z = null;
            return true;
        }
        e eVar = this.x;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.i.dismiss();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
        b();
        C0220a c0220a = this.y;
        if (c0220a != null && c0220a.b()) {
            c0220a.i.dismiss();
        }
        j.a aVar = this.i;
        if (aVar != null) {
            aVar.c(fVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.l;
        ArrayList<h> arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.g;
            if (fVar != null) {
                fVar.i();
                ArrayList<h> arrayListL = this.g.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    h hVar = arrayListL.get(i2);
                    if ((hVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        h itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View viewA = a(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.l).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.n) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.l).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.g;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<h> arrayList2 = fVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC7327w5 abstractC7327w5 = arrayList2.get(i3).A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.g;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.j;
        }
        if (this.q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.n == null) {
                this.n = new d(this.d);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.n.getParent();
            if (viewGroup3 != this.l) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.l;
                d dVar = this.n;
                actionMenuView.getClass();
                ActionMenuView.c cVarL = ActionMenuView.l();
                cVarL.a = true;
                actionMenuView.addView(dVar, cVarL);
            }
        } else {
            d dVar2 = this.n;
            if (dVar2 != null) {
                Object parent = dVar2.getParent();
                Object obj = this.l;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.n);
                }
            }
        }
        ((ActionMenuView) this.l).setOverflowReserved(this.q);
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        int size;
        ArrayList<h> arrayListL;
        int i;
        boolean z;
        a aVar = this;
        androidx.appcompat.view.menu.f fVar = aVar.g;
        if (fVar != null) {
            arrayListL = fVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = aVar.u;
        int i3 = aVar.t;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.l;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            h hVar = arrayListL.get(i4);
            int i7 = hVar.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (aVar.v && hVar.C) {
                i2 = 0;
            }
            i4++;
        }
        if (aVar.q && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = aVar.w;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            h hVar2 = arrayListL.get(i9);
            int i11 = hVar2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = hVar2.b;
            if (z3) {
                View viewA = aVar.a(hVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                hVar2.g(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewA2 = aVar.a(hVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            h hVar3 = arrayListL.get(i13);
                            if (hVar3.b == i12) {
                                if ((hVar3.x & 32) == 32) {
                                    i8++;
                                }
                                hVar3.g(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    hVar2.g(z5);
                } else {
                    hVar2.g(false);
                }
                i9++;
                i = 2;
                aVar = this;
                z = true;
            }
            i9++;
            i = 2;
            aVar = this;
            z = true;
        }
        return z;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(@NonNull Context context, androidx.appcompat.view.menu.f fVar) {
        this.e = context;
        LayoutInflater.from(context);
        this.g = fVar;
        Resources resources = context.getResources();
        if (!this.r) {
            this.q = true;
        }
        int i = 2;
        this.s = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.u = i;
        int measuredWidth = this.s;
        if (this.q) {
            if (this.n == null) {
                d dVar = new d(this.d);
                this.n = dVar;
                if (this.p) {
                    dVar.setImageDrawable(this.o);
                    this.o = null;
                    this.p = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.n.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.n.getMeasuredWidth();
        } else {
            this.n = null;
        }
        this.t = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (i = ((g) parcelable).d) > 0 && (menuItemFindItem = this.g.findItem(i)) != null) {
            k((m) menuItemFindItem.getSubMenu());
        }
    }

    public final boolean j() {
        e eVar = this.x;
        return eVar != null && eVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        boolean z;
        if (mVar.hasVisibleItems()) {
            m mVar2 = mVar;
            while (true) {
                androidx.appcompat.view.menu.f fVar = mVar2.z;
                if (fVar == this.g) {
                    break;
                }
                mVar2 = (m) fVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.l;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == mVar2.A) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.C = mVar.A.a;
                int size = mVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = mVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C0220a c0220a = new C0220a(this.e, mVar, view);
                this.y = c0220a;
                c0220a.g = z;
                AbstractC4901kZ0 abstractC4901kZ0 = c0220a.i;
                if (abstractC4901kZ0 != null) {
                    abstractC4901kZ0.q(z);
                }
                C0220a c0220a2 = this.y;
                if (!c0220a2.b()) {
                    if (c0220a2.e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0220a2.d(0, 0, false, false);
                }
                j.a aVar = this.i;
                if (aVar != null) {
                    aVar.d(mVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        g gVar = new g();
        gVar.d = this.C;
        return gVar;
    }

    public final boolean n() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.q || j() || (fVar = this.g) == null || this.l == null || this.z != null) {
            return false;
        }
        fVar.i();
        if (fVar.j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.e, this.g, this.n));
        this.z = cVar;
        ((View) this.l).post(cVar);
        return true;
    }
}
