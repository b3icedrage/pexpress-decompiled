package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3992gS0<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C3992gS0.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C4202hS0(8, false);

    public final boolean a(@NotNull Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C4202hS0 c4202hS0 = (C4202hS0) atomicReferenceFieldUpdater.get(this);
            int iA = c4202hS0.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                C4202hS0<E> c4202hS0C = c4202hS0.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c4202hS0, c4202hS0C) && atomicReferenceFieldUpdater.get(this) == c4202hS0) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C4202hS0 c4202hS0 = (C4202hS0) atomicReferenceFieldUpdater.get(this);
            if (c4202hS0.b()) {
                return;
            }
            C4202hS0<E> c4202hS0C = c4202hS0.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c4202hS0, c4202hS0C) && atomicReferenceFieldUpdater.get(this) == c4202hS0) {
            }
        }
    }

    public final int c() {
        C4202hS0 c4202hS0 = (C4202hS0) a.get(this);
        c4202hS0.getClass();
        long j = C4202hS0.f.get(c4202hS0);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    @Nullable
    public final E d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C4202hS0 c4202hS0 = (C4202hS0) atomicReferenceFieldUpdater.get(this);
            E e = (E) c4202hS0.d();
            if (e != C4202hS0.g) {
                return e;
            }
            C4202hS0<E> c4202hS0C = c4202hS0.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c4202hS0, c4202hS0C) && atomicReferenceFieldUpdater.get(this) == c4202hS0) {
            }
        }
    }
}
