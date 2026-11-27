package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.a;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: aP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2712aP1 extends AbstractC6907u5 implements f.a {
    public Context g;
    public ActionBarContextView h;
    public LayoutInflaterFactory2C3192ce.c i;
    public WeakReference<View> j;
    public boolean k;
    public f l;

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(@NonNull f fVar, @NonNull MenuItem menuItem) {
        return this.i.a.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(@NonNull f fVar) {
        i();
        a aVar = this.h.h;
        if (aVar != null) {
            aVar.n();
        }
    }

    @Override // defpackage.AbstractC6907u5
    public final void c() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.i.a(this);
    }

    @Override // defpackage.AbstractC6907u5
    public final View d() {
        WeakReference<View> weakReference = this.j;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // defpackage.AbstractC6907u5
    public final f e() {
        return this.l;
    }

    @Override // defpackage.AbstractC6907u5
    public final MenuInflater f() {
        return new GV1(this.h.getContext());
    }

    @Override // defpackage.AbstractC6907u5
    public final CharSequence g() {
        return this.h.getSubtitle();
    }

    @Override // defpackage.AbstractC6907u5
    public final CharSequence h() {
        return this.h.getTitle();
    }

    @Override // defpackage.AbstractC6907u5
    public final void i() {
        this.i.b(this, this.l);
    }

    @Override // defpackage.AbstractC6907u5
    public final boolean j() {
        return this.h.w;
    }

    @Override // defpackage.AbstractC6907u5
    public final void k(View view) {
        this.h.setCustomView(view);
        this.j = view != null ? new WeakReference<>(view) : null;
    }

    @Override // defpackage.AbstractC6907u5
    public final void l(int i) {
        m(this.g.getString(i));
    }

    @Override // defpackage.AbstractC6907u5
    public final void m(CharSequence charSequence) {
        this.h.setSubtitle(charSequence);
    }

    @Override // defpackage.AbstractC6907u5
    public final void n(int i) {
        o(this.g.getString(i));
    }

    @Override // defpackage.AbstractC6907u5
    public final void o(CharSequence charSequence) {
        this.h.setTitle(charSequence);
    }

    @Override // defpackage.AbstractC6907u5
    public final void p(boolean z) {
        this.e = z;
        this.h.setTitleOptional(z);
    }
}
