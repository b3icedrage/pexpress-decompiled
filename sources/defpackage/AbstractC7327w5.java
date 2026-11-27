package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;
import io.sentry.android.core.b0;

/* JADX INFO: renamed from: w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7327w5 {
    public h.a a;

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    @NonNull
    public abstract View c();

    @NonNull
    public View d(@NonNull h hVar) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h(h.a aVar) {
        if (this.a != null) {
            b0.e("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.a = aVar;
    }

    public void f(@NonNull m mVar) {
    }
}
