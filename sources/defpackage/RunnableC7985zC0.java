package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7985zC0 implements Runnable {
    public final /* synthetic */ C7775yC0 d;

    public RunnableC7985zC0(C7775yC0 c7775yC0) {
        this.d = c7775yC0;
    }

    public final C3337dJ1 a() throws IOException {
        C7775yC0 c7775yC0 = this.d;
        C3337dJ1 c3337dJ1 = new C3337dJ1();
        Cursor cursorL = c7775yC0.a.l(new C5496nM1("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (cursorL.moveToNext()) {
            try {
                c3337dJ1.add(Integer.valueOf(cursorL.getInt(0)));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C6621sj.b(cursorL, th);
                    throw th2;
                }
            }
        }
        Unit unit = Unit.a;
        cursorL.close();
        C3337dJ1 c3337dJ1A = C5487nJ1.a(c3337dJ1);
        if (c3337dJ1A.d.isEmpty()) {
            return c3337dJ1A;
        }
        if (this.d.g == null) {
            throw new IllegalStateException("Required value was null.");
        }
        InterfaceC4005gW1 interfaceC4005gW1 = this.d.g;
        if (interfaceC4005gW1 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        interfaceC4005gW1.M();
        return c3337dJ1A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Collection invalidatedTablesIds;
        ReentrantReadWriteLock.ReadLock lock = this.d.a.h.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        lock.lock();
        try {
            try {
                if (!this.d.a()) {
                    lock.unlock();
                    this.d.getClass();
                    return;
                }
                if (!this.d.e.compareAndSet(true, false)) {
                    lock.unlock();
                    this.d.getClass();
                    return;
                }
                if (this.d.a.g().A0().T0()) {
                    lock.unlock();
                    this.d.getClass();
                    return;
                }
                InterfaceC3166cW1 interfaceC3166cW1A0 = this.d.a.g().A0();
                interfaceC3166cW1A0.r0();
                try {
                    invalidatedTablesIds = a();
                    interfaceC3166cW1A0.p0();
                    interfaceC3166cW1A0.F0();
                    lock.unlock();
                    this.d.getClass();
                    if (invalidatedTablesIds.isEmpty()) {
                        return;
                    }
                    C7775yC0 c7775yC0 = this.d;
                    synchronized (c7775yC0.i) {
                        C3945gC1.e eVar = (C3945gC1.e) c7775yC0.i.iterator();
                        if (eVar.hasNext()) {
                            ((C7775yC0.d) ((Map.Entry) eVar.next()).getValue()).getClass();
                            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
                            throw null;
                        }
                        Unit unit = Unit.a;
                    }
                } catch (Throwable th) {
                    interfaceC3166cW1A0.F0();
                    throw th;
                }
            } catch (Throwable th2) {
                lock.unlock();
                this.d.getClass();
                throw th2;
            }
        } catch (SQLiteException e) {
            b0.d("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            invalidatedTablesIds = C6702t60.d;
        } catch (IllegalStateException e2) {
            b0.d("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
            invalidatedTablesIds = C6702t60.d;
        }
    }
}
