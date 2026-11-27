package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: jS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4670jS0<Z> implements InterfaceC3667et1<Z>, C5751ob0.d {
    public static final C5751ob0.c i = C5751ob0.a(20, new a());
    public final RP1.a d = new RP1.a();
    public InterfaceC3667et1<Z> e;
    public boolean g;
    public boolean h;

    /* JADX INFO: renamed from: jS0$a */
    public class a implements C5751ob0.b<C4670jS0<?>> {
        @Override // defpackage.C5751ob0.b
        public final C4670jS0<?> a() {
            return new C4670jS0<>();
        }
    }

    public final synchronized void a() {
        this.d.a();
        if (!this.g) {
            throw new IllegalStateException("Already unlocked");
        }
        this.g = false;
        if (this.h) {
            b();
        }
    }

    @Override // defpackage.InterfaceC3667et1
    public final synchronized void b() {
        this.d.a();
        this.h = true;
        if (!this.g) {
            this.e.b();
            this.e = null;
            i.b(this);
        }
    }

    @Override // defpackage.InterfaceC3667et1
    public final int c() {
        return this.e.c();
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final Class<Z> d() {
        return this.e.d();
    }

    @Override // defpackage.C5751ob0.d
    @NonNull
    public final RP1.a f() {
        return this.d;
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final Z get() {
        return this.e.get();
    }
}
