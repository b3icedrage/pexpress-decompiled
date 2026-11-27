package defpackage;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: hm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4274hm0 extends ComponentCallbacks2C1166Hs1 {
    @Override // defpackage.ComponentCallbacks2C1166Hs1
    @NonNull
    public final C6025ps1 c(@NonNull Class cls) {
        return new C4064gm0(this.d, this, cls, this.e);
    }

    @Override // defpackage.ComponentCallbacks2C1166Hs1
    @NonNull
    public final C6025ps1 f() {
        return (C4064gm0) super.f();
    }

    @Override // defpackage.ComponentCallbacks2C1166Hs1
    @NonNull
    public final C6025ps1 g() {
        return (C4064gm0) c(Drawable.class);
    }

    @Override // defpackage.ComponentCallbacks2C1166Hs1
    @NonNull
    public final C6025ps1 m(Integer num) {
        return (C4064gm0) super.m(num);
    }

    @Override // defpackage.ComponentCallbacks2C1166Hs1
    @NonNull
    public final C6025ps1 n(String str) {
        return (C4064gm0) super.n(str);
    }

    @Override // defpackage.ComponentCallbacks2C1166Hs1
    public final void q(@NonNull C1400Ks1 c1400Ks1) {
        if (c1400Ks1 instanceof C3854fm0) {
            super.q(c1400Ks1);
        } else {
            super.q(new C3854fm0().I(c1400Ks1));
        }
    }
}
