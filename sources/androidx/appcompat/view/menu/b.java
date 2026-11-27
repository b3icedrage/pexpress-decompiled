package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import defpackage.AbstractC4901kZ0;
import defpackage.C1742Pc;
import defpackage.C5111lZ0;
import defpackage.C5345me2;
import defpackage.C6601se;
import defpackage.Cd2;
import defpackage.InterfaceC4223hZ0;
import defpackage.Z30;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC4901kZ0 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public j.a A;
    public ViewTreeObserver B;
    public i.a C;
    public boolean D;
    public final Context e;
    public final int g;
    public final int h;
    public final boolean i;
    public final Handler j;
    public View r;
    public View s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public boolean z;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final a m = new a();
    public final ViewOnAttachStateChangeListenerC0219b n = new ViewOnAttachStateChangeListenerC0219b();
    public final c o = new c();
    public int p = 0;
    public int q = 0;
    public boolean y = false;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            b bVar = b.this;
            if (bVar.a()) {
                ArrayList arrayList = bVar.l;
                if (arrayList.size() <= 0 || ((d) arrayList.get(0)).a.C) {
                    return;
                }
                View view = bVar.s;
                if (view == null || !view.isShown()) {
                    bVar.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a.b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0219b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0219b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.B;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.B = view.getViewTreeObserver();
                }
                bVar.B.removeGlobalOnLayoutListener(bVar.m);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements InterfaceC4223hZ0 {
        public c() {
        }

        @Override // defpackage.InterfaceC4223hZ0
        public final void d(@NonNull f fVar, @NonNull h hVar) {
            b bVar = b.this;
            bVar.j.removeCallbacksAndMessages(null);
            ArrayList arrayList = bVar.l;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (fVar == ((d) arrayList.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            bVar.j.postAtTime(new androidx.appcompat.view.menu.c(this, i2 < arrayList.size() ? (d) arrayList.get(i2) : null, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // defpackage.InterfaceC4223hZ0
        public final void o(@NonNull f fVar, @NonNull h hVar) {
            b.this.j.removeCallbacksAndMessages(fVar);
        }
    }

    public static class d {
        public final C5111lZ0 a;
        public final f b;
        public final int c;

        public d(@NonNull C5111lZ0 c5111lZ0, @NonNull f fVar, int i) {
            this.a = c5111lZ0;
            this.b = fVar;
            this.c = i;
        }
    }

    public b(@NonNull Context context, @NonNull View view, int i, boolean z) {
        this.e = context;
        this.r = view;
        this.h = i;
        this.i = z;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        this.t = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.j = new Handler();
    }

    @Override // defpackage.InterfaceC8013zL1
    public final boolean a() {
        ArrayList arrayList = this.l;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).a.D.isShowing();
    }

    @Override // defpackage.InterfaceC8013zL1
    public final void b() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x((f) it.next());
        }
        arrayList.clear();
        View view = this.r;
        this.s = view;
        if (view != null) {
            boolean z = this.B == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.B = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.m);
            }
            this.s.addOnAttachStateChangeListener(this.n);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (fVar == ((d) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((d) arrayList.get(i2)).b.c(false);
        }
        d dVar = (d) arrayList.remove(i);
        dVar.b.r(this);
        boolean z2 = this.D;
        C5111lZ0 c5111lZ0 = dVar.a;
        if (z2) {
            C5111lZ0.a.b(c5111lZ0.D, null);
            c5111lZ0.D.setAnimationStyle(0);
        }
        c5111lZ0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.t = ((d) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.r;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            this.t = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((d) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.A;
        if (aVar != null) {
            aVar.c(fVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.B.removeGlobalOnLayoutListener(this.m);
            }
            this.B = null;
        }
        this.s.removeOnAttachStateChangeListener(this.n);
        this.C.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).a.g.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.InterfaceC8013zL1
    public final void dismiss() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.D.isShowing()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.A = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
    }

    @Override // defpackage.InterfaceC8013zL1
    public final Z30 j() {
        ArrayList arrayList = this.l;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) C1742Pc.c(1, arrayList)).a.g;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        for (d dVar : this.l) {
            if (mVar == dVar.b) {
                dVar.a.g.requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        n(mVar);
        j.a aVar = this.A;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        return null;
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void n(f fVar) {
        fVar.b(this, this.e);
        if (a()) {
            x(fVar);
        } else {
            this.k.add(fVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i);
            if (!dVar.a.D.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.b.c(false);
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
    public final void p(@NonNull View view) {
        if (this.r != view) {
            this.r = view;
            int i = this.p;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            this.q = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void q(boolean z) {
        this.y = z;
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void r(int i) {
        if (this.p != i) {
            this.p = i;
            View view = this.r;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            this.q = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void s(int i) {
        this.u = true;
        this.w = i;
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.C = (i.a) onDismissListener;
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void u(boolean z) {
        this.z = z;
    }

    @Override // defpackage.AbstractC4901kZ0
    public final void v(int i) {
        this.v = true;
        this.x = i;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:55:0x012f  */
    /* JADX WARN: Code duplicated, block: B:57:0x013b  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0140  */
    /* JADX WARN: Code duplicated, block: B:64:0x0148  */
    /* JADX WARN: Code duplicated, block: B:65:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:69:0x0159  */
    /* JADX WARN: Code duplicated, block: B:71:0x016c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0193  */
    /* JADX WARN: Code duplicated, block: B:77:0x0195  */
    /* JADX WARN: Code duplicated, block: B:78:0x0199 A[PHI: r5
      0x0199: PHI (r5v13 int) = (r5v5 int), (r5v14 int) binds: [B:79:0x019b, B:77:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x019b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x019d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c8  */
    public final void x(@NonNull f fVar) {
        int i;
        d dVar;
        View childAt;
        Rect rect;
        Rect rect2;
        int i2;
        C6601se c6601se;
        Z30 z30;
        int[] iArr;
        Rect rect3;
        int i3;
        boolean z;
        int[] iArr2;
        int[] iArr3;
        int i4;
        int i5;
        int width;
        Method method;
        MenuItem item;
        e eVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.e;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        e eVar2 = new e(fVar, layoutInflaterFrom, this.i, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.y) {
            eVar2.g = true;
        } else if (a()) {
            eVar2.g = AbstractC4901kZ0.w(fVar);
        }
        int iO = AbstractC4901kZ0.o(eVar2, context, this.g);
        C5111lZ0 c5111lZ0 = new C5111lZ0(context, null, this.h);
        c5111lZ0.G = this.o;
        c5111lZ0.t = this;
        c5111lZ0.D.setOnDismissListener(this);
        c5111lZ0.s = this.r;
        c5111lZ0.p = this.q;
        c5111lZ0.C = true;
        c5111lZ0.D.setFocusable(true);
        c5111lZ0.D.setInputMethodMode(2);
        c5111lZ0.p(eVar2);
        c5111lZ0.r(iO);
        c5111lZ0.p = this.q;
        ArrayList arrayList = this.l;
        if (arrayList.size() > 0) {
            dVar = (d) C1742Pc.c(1, arrayList);
            f fVar2 = dVar.b;
            int size = fVar2.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    item = null;
                    break;
                }
                item = fVar2.getItem(i6);
                if (item.hasSubMenu() && fVar == item.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (item == null) {
                i = 1;
                childAt = null;
            } else {
                Z30 z31 = dVar.a.g;
                ListAdapter adapter = z31.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                    headersCount = 0;
                }
                int count = eVar.getCount();
                i = 1;
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == eVar.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - z31.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < z31.getChildCount()) {
                    childAt = z31.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i2 = Build.VERSION.SDK_INT;
                c6601se = c5111lZ0.D;
                if (i2 <= 28) {
                    method = C5111lZ0.H;
                    if (method != null) {
                        try {
                            method.invoke(c6601se, Boolean.FALSE);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    C5111lZ0.b.a(c6601se, false);
                }
                C5111lZ0.a.a(c5111lZ0.D, null);
                z30 = ((d) arrayList.get(arrayList.size() - 1)).a.g;
                iArr = new int[2];
                z30.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.s.getWindowVisibleDisplayFrame(rect3);
                if (this.t == i) {
                    if (z30.getWidth() + iArr[0] + iO > rect3.right) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                } else if (iArr[0] - iO < 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (i3 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.t = i3;
                if (Build.VERSION.SDK_INT >= 26) {
                    c5111lZ0.s = childAt;
                    i5 = 0;
                    i4 = 0;
                } else {
                    iArr2 = new int[2];
                    this.r.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.q & 7) == 5) {
                        iArr2[0] = this.r.getWidth() + iArr2[0];
                        iArr3[0] = childAt.getWidth() + iArr3[0];
                    }
                    i4 = iArr3[0] - iArr2[0];
                    i5 = iArr3[1] - iArr2[1];
                }
                if ((this.q & 5) == 5) {
                    if (z) {
                        width = i4 + iO;
                    } else {
                        iO = childAt.getWidth();
                        width = i4 - iO;
                    }
                } else if (z) {
                    width = i4 + childAt.getWidth();
                } else {
                    width = i4 - iO;
                }
                c5111lZ0.j = width;
                c5111lZ0.o = true;
                c5111lZ0.n = true;
                c5111lZ0.k(i5);
            } else {
                if (this.u) {
                    c5111lZ0.j = this.w;
                }
                if (this.v) {
                    c5111lZ0.k(this.x);
                }
                rect = this.d;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                c5111lZ0.B = rect2;
            }
            arrayList.add(new d(c5111lZ0, fVar, this.t));
            c5111lZ0.b();
            Z30 z32 = c5111lZ0.g;
            z32.setOnKeyListener(this);
            if (dVar == null || !this.z || fVar.m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) z32, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(fVar.m);
            z32.addHeaderView(frameLayout, null, false);
            c5111lZ0.b();
            return;
        }
        i = 1;
        dVar = null;
        childAt = null;
        if (childAt != null) {
            i2 = Build.VERSION.SDK_INT;
            c6601se = c5111lZ0.D;
            if (i2 <= 28) {
                method = C5111lZ0.H;
                if (method != null) {
                    method.invoke(c6601se, Boolean.FALSE);
                }
            } else {
                C5111lZ0.b.a(c6601se, false);
            }
            C5111lZ0.a.a(c5111lZ0.D, null);
            z30 = ((d) arrayList.get(arrayList.size() - 1)).a.g;
            iArr = new int[2];
            z30.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.s.getWindowVisibleDisplayFrame(rect3);
            if (this.t == i) {
                if (z30.getWidth() + iArr[0] + iO > rect3.right) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
            } else if (iArr[0] - iO < 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 == 1) {
                z = true;
            } else {
                z = false;
            }
            this.t = i3;
            if (Build.VERSION.SDK_INT >= 26) {
                c5111lZ0.s = childAt;
                i5 = 0;
                i4 = 0;
            } else {
                iArr2 = new int[2];
                this.r.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.q & 7) == 5) {
                    iArr2[0] = this.r.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                i4 = iArr3[0] - iArr2[0];
                i5 = iArr3[1] - iArr2[1];
            }
            if ((this.q & 5) == 5) {
                if (z) {
                    width = i4 + iO;
                } else {
                    iO = childAt.getWidth();
                    width = i4 - iO;
                }
            } else if (z) {
                width = i4 + childAt.getWidth();
            } else {
                width = i4 - iO;
            }
            c5111lZ0.j = width;
            c5111lZ0.o = true;
            c5111lZ0.n = true;
            c5111lZ0.k(i5);
        } else {
            if (this.u) {
                c5111lZ0.j = this.w;
            }
            if (this.v) {
                c5111lZ0.k(this.x);
            }
            rect = this.d;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            c5111lZ0.B = rect2;
        }
        arrayList.add(new d(c5111lZ0, fVar, this.t));
        c5111lZ0.b();
        Z30 z33 = c5111lZ0.g;
        z33.setOnKeyListener(this);
        if (dVar == null) {
        }
    }
}
