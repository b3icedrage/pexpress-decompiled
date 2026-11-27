package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;

/* JADX INFO: renamed from: q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6068q5 {

    /* JADX INFO: renamed from: q5$b */
    public interface b {
        void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g();

    public abstract boolean i(int i, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(boolean z);

    public abstract void m(boolean z);

    public abstract void n(boolean z);

    public abstract void o(String str);

    public abstract void p(CharSequence charSequence);

    public AbstractC6907u5 q(LayoutInflaterFactory2C3192ce.c cVar) {
        return null;
    }

    /* JADX INFO: renamed from: q5$a */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int a;

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.a = 0;
            this.a = aVar.a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }

    public void h() {
    }
}
