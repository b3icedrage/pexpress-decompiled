package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: m02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5211m02 extends AbstractC6068q5 {
    public final androidx.appcompat.widget.c a;
    public final Window.Callback b;
    public final e c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList<AbstractC6068q5.b> g = new ArrayList<>();
    public final a h = new a();

    /* JADX INFO: renamed from: m02$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5211m02 c5211m02 = C5211m02.this;
            Window.Callback callback = c5211m02.b;
            Menu menuR = c5211m02.r();
            f fVar = menuR instanceof f ? (f) menuR : null;
            if (fVar != null) {
                fVar.w();
            }
            try {
                menuR.clear();
                if (!callback.onCreatePanelMenu(0, menuR) || !callback.onPreparePanel(0, null, menuR)) {
                    menuR.clear();
                }
            } finally {
                if (fVar != null) {
                    fVar.v();
                }
            }
        }
    }

    /* JADX INFO: renamed from: m02$b */
    public class b implements Toolbar.h {
        public b() {
        }
    }

    /* JADX INFO: renamed from: m02$c */
    public final class c implements j.a {
        public boolean d;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(@NonNull f fVar, boolean z) {
            if (this.d) {
                return;
            }
            this.d = true;
            C5211m02 c5211m02 = C5211m02.this;
            c5211m02.a.h();
            c5211m02.b.onPanelClosed(108, fVar);
            this.d = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(@NonNull f fVar) {
            C5211m02.this.b.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: m02$d */
    public final class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(@NonNull f fVar, @NonNull MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(@NonNull f fVar) {
            androidx.appcompat.widget.a aVar;
            C5211m02 c5211m02 = C5211m02.this;
            ActionMenuView actionMenuView = c5211m02.a.a.d;
            boolean z = (actionMenuView == null || (aVar = actionMenuView.x) == null || !aVar.j()) ? false : true;
            Window.Callback callback = c5211m02.b;
            if (z) {
                callback.onPanelClosed(108, fVar);
            } else if (callback.onPreparePanel(0, null, fVar)) {
                callback.onMenuOpened(108, fVar);
            }
        }
    }

    /* JADX INFO: renamed from: m02$e */
    public class e {
        public e() {
        }
    }

    public C5211m02(@NonNull Toolbar toolbar, CharSequence charSequence, @NonNull Window.Callback callback) {
        b bVar = new b();
        toolbar.getClass();
        androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(toolbar, false);
        this.a = cVar;
        callback.getClass();
        this.b = callback;
        cVar.k = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        cVar.setWindowTitle(charSequence);
        this.c = new e();
    }

    @Override // defpackage.AbstractC6068q5
    public final boolean a() {
        return this.a.f();
    }

    @Override // defpackage.AbstractC6068q5
    public final boolean b() {
        androidx.appcompat.widget.c cVar = this.a;
        Toolbar.f fVar = cVar.a.Q;
        if (fVar == null || fVar.e == null) {
            return false;
        }
        cVar.collapseActionView();
        return true;
    }

    @Override // defpackage.AbstractC6068q5
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList<AbstractC6068q5.b> arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // defpackage.AbstractC6068q5
    public final int d() {
        return this.a.b;
    }

    @Override // defpackage.AbstractC6068q5
    public final Context e() {
        return this.a.a.getContext();
    }

    @Override // defpackage.AbstractC6068q5
    public final boolean f() {
        androidx.appcompat.widget.c cVar = this.a;
        Toolbar toolbar = cVar.a;
        a aVar = this.h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = cVar.a;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        toolbar2.postOnAnimation(aVar);
        return true;
    }

    @Override // defpackage.AbstractC6068q5
    public final void h() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // defpackage.AbstractC6068q5
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu menuR = r();
        if (menuR == null) {
            return false;
        }
        menuR.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuR.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.AbstractC6068q5
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // defpackage.AbstractC6068q5
    public final boolean k() {
        return this.a.a.t();
    }

    @Override // defpackage.AbstractC6068q5
    public final void m(boolean z) {
        androidx.appcompat.widget.c cVar = this.a;
        cVar.j((cVar.b & (-5)) | 4);
    }

    @Override // defpackage.AbstractC6068q5
    public final void o(String str) {
        this.a.setTitle(str);
    }

    @Override // defpackage.AbstractC6068q5
    public final void p(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public final Menu r() {
        boolean z = this.e;
        androidx.appcompat.widget.c cVar = this.a;
        if (!z) {
            c cVar2 = new c();
            d dVar = new d();
            Toolbar toolbar = cVar.a;
            toolbar.R = cVar2;
            toolbar.S = dVar;
            ActionMenuView actionMenuView = toolbar.d;
            if (actionMenuView != null) {
                actionMenuView.y = cVar2;
                actionMenuView.z = dVar;
            }
            this.e = true;
        }
        return cVar.a.getMenu();
    }

    @Override // defpackage.AbstractC6068q5
    public final void g() {
    }

    @Override // defpackage.AbstractC6068q5
    public final void l(boolean z) {
    }

    @Override // defpackage.AbstractC6068q5
    public final void n(boolean z) {
    }
}
