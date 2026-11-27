package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ho1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4282ho1 {
    public final long a;

    @NotNull
    public final C7839yX1 b;

    @NotNull
    public final C4072go1 c;

    @NotNull
    public final ConcurrentLinkedQueue<C3442do1> d;

    public C4282ho1(@NotNull C8049zX1 taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.a = timeUnit.toNanos(5L);
        this.b = taskRunner.e();
        this.c = new C4072go1(this, C5807oq.b(new StringBuilder(), C6806tc2.g, " ConnectionPool"));
        this.d = new ConcurrentLinkedQueue<>();
    }

    public final boolean a(@NotNull C5450n8 address, @NotNull C3233co1 call, @Nullable ArrayList arrayList, boolean z) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator<C3442do1> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            C3442do1 connection = it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z) {
                    if (connection.g != null) {
                    }
                    Unit unit = Unit.a;
                }
                if (connection.i(address, arrayList)) {
                    call.b(connection);
                    return true;
                }
                Unit unit2 = Unit.a;
            }
        }
    }

    public final int b(C3442do1 c3442do1, long j) {
        byte[] bArr = C6806tc2.a;
        ArrayList arrayList = c3442do1.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + c3442do1.b.a.h + " was leaked. Did you forget to close a response body?";
                C1903Rd1 c1903Rd1 = C1903Rd1.a;
                C1903Rd1.a.k(((C3233co1.b) reference).a, str);
                arrayList.remove(i);
                c3442do1.j = true;
                if (arrayList.isEmpty()) {
                    c3442do1.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
