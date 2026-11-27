package defpackage;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: yd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7861yd2 extends Cd2.b<Boolean> {
    @Override // Cd2.b
    public final Boolean a(@NonNull View view) {
        return Boolean.valueOf(Cd2.h.d(view));
    }

    @Override // Cd2.b
    public final void b(@NonNull View view, Boolean bool) {
        Cd2.h.j(view, bool.booleanValue());
    }

    @Override // Cd2.b
    public final boolean d(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
    }
}
