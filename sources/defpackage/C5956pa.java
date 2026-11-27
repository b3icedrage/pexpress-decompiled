package defpackage;

import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5956pa extends AbstractC4609j81 {
    public C5536na d;

    @Override // defpackage.InterfaceC5978pf1
    public final void a(@NotNull C3595ea amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.a(amplitude);
        String str = amplitude.a.d;
        Object obj = C5536na.c;
        C5536na c5536naA = C5536na.a.a(str);
        this.d = c5536naA;
        BP1 bp1 = amplitude.b;
        c5536naA.a.a(new C1330Jv0(4, bp1.a, bp1.b));
    }

    @Override // defpackage.InterfaceC5978pf1
    public final void e(@NotNull C3595ea c3595ea) {
        Intrinsics.checkNotNullParameter(c3595ea, "<set-?>");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.AbstractC4609j81
    public final void h(@Nullable String str) {
        C5536na c5536na = this.d;
        if (c5536na == null) {
            Intrinsics.l("connector");
            throw null;
        }
        C2454Xv0 c2454Xv0 = c5536na.a;
        ReentrantReadWriteLock.ReadLock lock = c2454Xv0.a.readLock();
        lock.lock();
        try {
            C1330Jv0 c1330Jv0 = c2454Xv0.b;
            lock.unlock();
            c2454Xv0.a(new C1330Jv0((Map) c1330Jv0.c, c1330Jv0.a, str));
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.AbstractC4609j81
    public final void i(@Nullable String str) {
        C5536na c5536na = this.d;
        if (c5536na == null) {
            Intrinsics.l("connector");
            throw null;
        }
        C2454Xv0 c2454Xv0 = c5536na.a;
        ReentrantReadWriteLock.ReadLock lock = c2454Xv0.a.readLock();
        lock.lock();
        try {
            C1330Jv0 c1330Jv0 = c2454Xv0.b;
            lock.unlock();
            String str2 = c1330Jv0.a;
            c2454Xv0.a(new C1330Jv0((Map) c1330Jv0.c, str, c1330Jv0.b));
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
