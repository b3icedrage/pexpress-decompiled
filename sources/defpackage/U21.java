package defpackage;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;

/* JADX INFO: loaded from: classes.dex */
public final class U21 extends f {
    public final int A;

    @NonNull
    public final Class<?> z;

    public U21(@NonNull Context context, @NonNull Class<?> cls, int i) {
        super(context);
        this.z = cls;
        this.A = i;
    }

    @Override // androidx.appcompat.view.menu.f
    @NonNull
    public final h a(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        int size = this.f.size() + 1;
        int i4 = this.A;
        if (size <= i4) {
            w();
            h hVarA = super.a(i, i2, i3, charSequence);
            hVarA.f(true);
            v();
            return hVarA;
        }
        String simpleName = this.z.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i4);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(C5807oq.b(sb, simpleName, "#getMaxItemCount()"));
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    @NonNull
    public final SubMenu addSubMenu(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        throw new UnsupportedOperationException(this.z.getSimpleName().concat(" does not support submenus"));
    }
}
