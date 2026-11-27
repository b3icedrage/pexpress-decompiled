package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import defpackage.AbstractC4901kZ0;
import defpackage.C5345me2;
import defpackage.Cd2;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public final Context a;
    public final f b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public j.a h;
    public AbstractC4901kZ0 i;
    public a j;
    public int f = 8388611;
    public final a k = new a();

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public i(int i, @NonNull Context context, @NonNull View view, @NonNull f fVar, boolean z) {
        this.a = context;
        this.b = fVar;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    @NonNull
    public final AbstractC4901kZ0 a() {
        AbstractC4901kZ0 lVar;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            b.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                lVar = new androidx.appcompat.view.menu.b(context, this.e, this.d, this.c);
            } else {
                View view = this.e;
                Context context2 = this.a;
                boolean z = this.c;
                lVar = new l(this.d, context2, view, this.b, z);
            }
            lVar.n(this.b);
            lVar.t(this.k);
            lVar.p(this.e);
            lVar.f(this.h);
            lVar.q(this.g);
            lVar.r(this.f);
            this.i = lVar;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC4901kZ0 abstractC4901kZ0 = this.i;
        return abstractC4901kZ0 != null && abstractC4901kZ0.a();
    }

    public void c() {
        this.i = null;
        a aVar = this.j;
        if (aVar != null) {
            aVar.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        AbstractC4901kZ0 abstractC4901kZ0A = a();
        abstractC4901kZ0A.u(z2);
        if (z) {
            int i3 = this.f;
            View view = this.e;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            abstractC4901kZ0A.s(i);
            abstractC4901kZ0A.v(i2);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC4901kZ0A.d = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        abstractC4901kZ0A.b();
    }
}
