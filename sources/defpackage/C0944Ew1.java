package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Ew1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0944Ew1 implements InterfaceC7441wd2 {

    @NonNull
    public final LinearLayout d;

    @NonNull
    public final C4254hh0 e;

    @NonNull
    public final C4254hh0 g;

    @NonNull
    public final C4254hh0 h;

    public C0944Ew1(@NonNull LinearLayout linearLayout, @NonNull C4254hh0 c4254hh0, @NonNull C4254hh0 c4254hh1, @NonNull C4254hh0 c4254hh2) {
        this.d = linearLayout;
        this.e = c4254hh0;
        this.g = c4254hh1;
        this.h = c4254hh2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
