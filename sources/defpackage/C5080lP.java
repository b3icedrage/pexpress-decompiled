package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5080lP implements InterfaceC4660jP {
    public static final a c = new a();
    public final InterfaceC7203vW<InterfaceC4660jP> a;
    public final AtomicReference<InterfaceC4660jP> b = new AtomicReference<>(null);

    /* JADX INFO: renamed from: lP$a */
    public static final class a implements InterfaceC7738y21 {
    }

    public C5080lP(InterfaceC7203vW<InterfaceC4660jP> interfaceC7203vW) {
        this.a = interfaceC7203vW;
        ((C4017ga1) interfaceC7203vW).a(new C6629sl(this));
    }

    @Override // defpackage.InterfaceC4660jP
    @NonNull
    public final InterfaceC7738y21 a(@NonNull String str) {
        InterfaceC4660jP interfaceC4660jP = this.b.get();
        return interfaceC4660jP == null ? c : interfaceC4660jP.a(str);
    }

    @Override // defpackage.InterfaceC4660jP
    public final boolean b() {
        InterfaceC4660jP interfaceC4660jP = this.b.get();
        return interfaceC4660jP != null && interfaceC4660jP.b();
    }

    @Override // defpackage.InterfaceC4660jP
    public final boolean c(@NonNull String str) {
        InterfaceC4660jP interfaceC4660jP = this.b.get();
        return interfaceC4660jP != null && interfaceC4660jP.c(str);
    }

    @Override // defpackage.InterfaceC4660jP
    public final void d(@NonNull final String str, final long j, @NonNull final C1386Ko c1386Ko) {
        Log.isLoggable("FirebaseCrashlytics", 2);
        ((C4017ga1) this.a).a(new InterfaceC7203vW.a() { // from class: kP
            @Override // defpackage.InterfaceC7203vW.a
            public final void d(InterfaceC1612Nk1 interfaceC1612Nk1) {
                ((InterfaceC4660jP) interfaceC1612Nk1.get()).d(str, j, c1386Ko);
            }
        });
    }
}
