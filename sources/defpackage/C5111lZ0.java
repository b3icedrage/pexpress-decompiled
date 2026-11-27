package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5111lZ0 extends NQ0 implements InterfaceC4223hZ0 {
    public static final Method H;
    public androidx.appcompat.view.menu.b.c G;

    /* JADX INFO: renamed from: lZ0$a */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* JADX INFO: renamed from: lZ0$b */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* JADX INFO: renamed from: lZ0$c */
    public static class c extends Z30 {
        public final int q;
        public final int r;
        public InterfaceC4223hZ0 s;
        public h t;

        /* JADX INFO: renamed from: lZ0$c$a */
        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z) {
            super(context, z);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.q = 21;
                this.r = 22;
            } else {
                this.q = 22;
                this.r = 21;
            }
        }

        @Override // defpackage.Z30, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            e eVar;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.s != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                    headersCount = 0;
                }
                h item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= eVar.getCount()) ? null : eVar.getItem(i);
                h hVar = this.t;
                if (hVar != item) {
                    f fVar = eVar.d;
                    if (hVar != null) {
                        this.s.o(fVar, hVar);
                    }
                    this.t = item;
                    if (item != null) {
                        this.s.d(fVar, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.q) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.r) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (e) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (e) adapter).d.c(false);
            return true;
        }

        public void setHoverListener(InterfaceC4223hZ0 interfaceC4223hZ0) {
            this.s = interfaceC4223hZ0;
        }

        @Override // defpackage.Z30, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                H = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // defpackage.InterfaceC4223hZ0
    public final void d(@NonNull f fVar, @NonNull h hVar) {
        androidx.appcompat.view.menu.b.c cVar = this.G;
        if (cVar != null) {
            cVar.d(fVar, hVar);
        }
    }

    @Override // defpackage.InterfaceC4223hZ0
    public final void o(@NonNull f fVar, @NonNull h hVar) {
        androidx.appcompat.view.menu.b.c cVar = this.G;
        if (cVar != null) {
            cVar.o(fVar, hVar);
        }
    }

    @Override // defpackage.NQ0
    @NonNull
    public final Z30 q(Context context, boolean z) {
        c cVar = new c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}
