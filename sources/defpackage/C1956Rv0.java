package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Rv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1956Rv0 {

    @NotNull
    public final C1821Qc0 a;

    @NotNull
    public final ReentrantReadWriteLock b;

    @NotNull
    public C1252Iv0 c;

    @NotNull
    public final Object d;

    @NotNull
    public final LinkedHashSet e;
    public boolean f;

    public C1956Rv0(@NotNull C1821Qc0 identityStorage) {
        Intrinsics.checkNotNullParameter(identityStorage, "identityStorage");
        this.a = identityStorage;
        this.b = new ReentrantReadWriteLock(true);
        this.c = new C1252Iv0(null, null);
        this.d = new Object();
        this.e = new LinkedHashSet();
        b(identityStorage.a(), EnumC2532Yv0.d);
    }

    @NotNull
    public final C1252Iv0 a() {
        ReentrantReadWriteLock.ReadLock lock = this.b.readLock();
        lock.lock();
        try {
            return this.c;
        } finally {
            lock.unlock();
        }
    }

    public final void b(@NotNull C1252Iv0 identity, @NotNull EnumC2532Yv0 updateType) {
        Set<InterfaceC1878Qv0> setH0;
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        C1252Iv0 c1252Iv0A = a();
        ReentrantReadWriteLock reentrantReadWriteLock = this.b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.c = identity;
            if (updateType == EnumC2532Yv0.d) {
                this.f = true;
            }
            Unit unit = Unit.a;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            if (Intrinsics.a(identity, c1252Iv0A)) {
                return;
            }
            synchronized (this.d) {
                setH0 = CollectionsKt.h0(this.e);
            }
            if (updateType != EnumC2532Yv0.d) {
                if (!Intrinsics.a(identity.a, c1252Iv0A.a)) {
                    this.a.c(identity.a);
                }
                if (!Intrinsics.a(identity.b, c1252Iv0A.b)) {
                    this.a.b(identity.b);
                }
            }
            for (InterfaceC1878Qv0 interfaceC1878Qv0 : setH0) {
                if (!Intrinsics.a(identity.a, c1252Iv0A.a)) {
                    interfaceC1878Qv0.b(identity.a);
                }
                if (!Intrinsics.a(identity.b, c1252Iv0A.b)) {
                    interfaceC1878Qv0.a(identity.b);
                }
                interfaceC1878Qv0.c(identity, updateType);
            }
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }
}
