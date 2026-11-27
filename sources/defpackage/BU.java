package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;

/* JADX INFO: loaded from: classes.dex */
public interface BU {
    boolean a();

    void b();

    boolean c();

    void collapseActionView();

    void d(f fVar, j.a aVar);

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    boolean i();

    void j(int i);

    void k();

    void l(int i);

    C5345me2 m(int i, long j);

    void n(int i);

    int o();

    void p(boolean z);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
