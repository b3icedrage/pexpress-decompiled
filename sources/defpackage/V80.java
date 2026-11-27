package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class V80 implements InterfaceC5541nb0<String> {
    public final UA0 a;

    public V80(UA0 ua0) {
        this.a = ua0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        String packageName = ((Context) this.a.a).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
