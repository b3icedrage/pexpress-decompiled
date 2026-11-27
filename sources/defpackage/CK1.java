package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class CK1 {

    @NotNull
    public final QA1 a;

    @NotNull
    public final AtomicBoolean b;

    @NotNull
    public final KW1 c;

    public static final class a extends ML0 implements Function0<InterfaceC4005gW1> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC4005gW1 invoke() {
            return CK1.this.b();
        }
    }

    public CK1(@NotNull QA1 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.a = database;
        this.b = new AtomicBoolean(false);
        this.c = XO0.b(new a());
    }

    @NotNull
    public final InterfaceC4005gW1 a() {
        this.a.a();
        return this.b.compareAndSet(false, true) ? (InterfaceC4005gW1) this.c.getValue() : b();
    }

    public final InterfaceC4005gW1 b() {
        String sql = c();
        QA1 qa1 = this.a;
        qa1.getClass();
        Intrinsics.checkNotNullParameter(sql, "sql");
        qa1.a();
        qa1.b();
        return qa1.g().A0().N(sql);
    }

    @NotNull
    public abstract String c();

    public final void d(@NotNull InterfaceC4005gW1 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == ((InterfaceC4005gW1) this.c.getValue())) {
            this.b.set(false);
        }
    }
}
