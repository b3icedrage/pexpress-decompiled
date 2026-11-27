package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7839yX1 {

    @NotNull
    public final C8049zX1 a;

    @NotNull
    public final String b;
    public boolean c;

    @Nullable
    public AbstractC6578sX1 d;

    @NotNull
    public final ArrayList e;
    public boolean f;

    public C7839yX1(@NotNull C8049zX1 taskRunner, @NotNull String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = taskRunner;
        this.b = name;
        this.e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = C6806tc2.a;
        synchronized (this.a) {
            try {
                if (b()) {
                    this.a.d(this);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        AbstractC6578sX1 abstractC6578sX1 = this.d;
        if (abstractC6578sX1 != null) {
            Intrinsics.checkNotNull(abstractC6578sX1);
            if (abstractC6578sX1.b) {
                this.f = true;
            }
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC6578sX1) arrayList.get(size)).b) {
                AbstractC6578sX1 abstractC6578sX2 = (AbstractC6578sX1) arrayList.get(size);
                if (C8049zX1.i.isLoggable(Level.FINE)) {
                    Cm2.b(abstractC6578sX2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(@NotNull AbstractC6578sX1 task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.a) {
            if (!this.c) {
                if (e(task, j, false)) {
                    this.a.d(this);
                }
                Unit unit = Unit.a;
            } else if (task.b) {
                if (C8049zX1.i.isLoggable(Level.FINE)) {
                    Cm2.b(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C8049zX1.i.isLoggable(Level.FINE)) {
                    Cm2.b(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084 A[LOOP:0: B:23:0x0070->B:28:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0088 A[EDGE_INSN: B:40:0x0088->B:30:0x0088 BREAK  A[LOOP:0: B:23:0x0070->B:28:0x0084], SYNTHETIC] */
    public final boolean e(@NotNull AbstractC6578sX1 task, long j, boolean z) {
        Iterator it;
        int size;
        String strConcat;
        Intrinsics.checkNotNullParameter(task, "task");
        task.getClass();
        Intrinsics.checkNotNullParameter(this, "queue");
        C7839yX1 c7839yX1 = task.c;
        if (c7839yX1 != this) {
            if (c7839yX1 != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.c = this;
        }
        C8049zX1.a aVar = this.a.a;
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf == -1) {
            task.d = j2;
            if (C8049zX1.i.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(Cm2.g(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(Cm2.g(j2 - jNanoTime));
                }
                Cm2.b(task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((AbstractC6578sX1) it.next()).d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (task.d > j2) {
            arrayList.remove(iIndexOf);
            task.d = j2;
            if (C8049zX1.i.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(Cm2.g(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(Cm2.g(j2 - jNanoTime));
                }
                Cm2.b(task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((AbstractC6578sX1) it.next()).d - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (C8049zX1.i.isLoggable(Level.FINE)) {
            Cm2.b(task, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void f() {
        byte[] bArr = C6806tc2.a;
        synchronized (this.a) {
            try {
                this.c = true;
                if (b()) {
                    this.a.d(this);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public final String toString() {
        return this.b;
    }
}
