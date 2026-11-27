package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: lM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5073lM1<T> implements InterfaceC3667et1<T> {
    public final T d;

    public C5073lM1(@NonNull T t) {
        UE.e(t, "Argument must not be null");
        this.d = t;
    }

    @Override // defpackage.InterfaceC3667et1
    public final int c() {
        return 1;
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final Class<T> d() {
        return (Class<T>) this.d.getClass();
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final T get() {
        return this.d;
    }

    @Override // defpackage.InterfaceC3667et1
    public final void b() {
    }
}
