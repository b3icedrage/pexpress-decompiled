package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import java.util.ArrayList;

/* JADX INFO: renamed from: hV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4212hV1 extends ActionMode {
    public final Context a;
    public final AbstractC6907u5 b;

    /* JADX INFO: renamed from: hV1$a */
    public static class a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<C4212hV1> c = new ArrayList<>();
        public final C2703aM1<Menu, Menu> d = new C2703aM1<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        public final C4212hV1 a(AbstractC6907u5 abstractC6907u5) {
            ArrayList<C4212hV1> arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C4212hV1 c4212hV1 = arrayList.get(i);
                if (c4212hV1 != null && c4212hV1.b == abstractC6907u5) {
                    return c4212hV1;
                }
            }
            C4212hV1 c4212hV2 = new C4212hV1(this.b, abstractC6907u5);
            arrayList.add(c4212hV2);
            return c4212hV2;
        }

        public final boolean b(AbstractC6907u5 abstractC6907u5, MenuItem menuItem) {
            return this.a.onActionItemClicked(a(abstractC6907u5), new MenuItemC4433iZ0(this.b, (HV1) menuItem));
        }

        public final boolean c(AbstractC6907u5 abstractC6907u5, f fVar) {
            C4212hV1 c4212hV1A = a(abstractC6907u5);
            C2703aM1<Menu, Menu> c2703aM1 = this.d;
            Menu orDefault = c2703aM1.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new MenuC5534nZ0(this.b, fVar);
                c2703aM1.put(fVar, orDefault);
            }
            return this.a.onCreateActionMode(c4212hV1A, orDefault);
        }
    }

    public C4212hV1(Context context, AbstractC6907u5 abstractC6907u5) {
        this.a = context;
        this.b = abstractC6907u5;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC5534nZ0(this.a, this.b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.d;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.e;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.d = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.p(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.n(i);
    }
}
