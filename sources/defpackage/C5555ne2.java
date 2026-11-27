package defpackage;

import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ne2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5555ne2 {
    public BaseInterpolator c;
    public C2432Xo d;
    public boolean e;
    public long b = -1;
    public final a f = new a();
    public final ArrayList<C5345me2> a = new ArrayList<>();

    /* JADX INFO: renamed from: ne2$a */
    public class a extends C2432Xo {
        public boolean d = false;
        public int e = 0;

        public a() {
        }

        @Override // defpackage.InterfaceC5765oe2
        public final void b() {
            int i = this.e + 1;
            this.e = i;
            C5555ne2 c5555ne2 = C5555ne2.this;
            if (i == c5555ne2.a.size()) {
                C2432Xo c2432Xo = c5555ne2.d;
                if (c2432Xo != null) {
                    c2432Xo.b();
                }
                this.e = 0;
                this.d = false;
                c5555ne2.e = false;
            }
        }

        @Override // defpackage.C2432Xo, defpackage.InterfaceC5765oe2
        public final void e() {
            if (this.d) {
                return;
            }
            this.d = true;
            C2432Xo c2432Xo = C5555ne2.this.d;
            if (c2432Xo != null) {
                c2432Xo.e();
            }
        }
    }

    public final void a() {
        if (this.e) {
            Iterator<C5345me2> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        for (C5345me2 c5345me2 : this.a) {
            long j = this.b;
            if (j >= 0) {
                c5345me2.c(j);
            }
            BaseInterpolator baseInterpolator = this.c;
            if (baseInterpolator != null && (view = c5345me2.a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                c5345me2.d(this.f);
            }
            View view2 = c5345me2.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
