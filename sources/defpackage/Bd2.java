package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class Bd2 extends Cd2.b<Boolean> {
    @Override // Cd2.b
    public final Boolean a(View view) {
        return Boolean.valueOf(Cd2.h.c(view));
    }

    @Override // Cd2.b
    public final void b(View view, Boolean bool) {
        Cd2.h.g(view, bool.booleanValue());
    }

    @Override // Cd2.b
    public final boolean d(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
    }
}
