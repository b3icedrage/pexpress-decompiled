package io.sentry.android.sqlite;

import android.database.CrossProcessCursor;
import defpackage.AbstractC3118cG1;
import defpackage.C3561eO1;
import defpackage.C6740tH1;
import defpackage.EnumC4869kO1;
import defpackage.EnumC6511sB0;
import defpackage.InterfaceC1171Hu0;
import defpackage.InterfaceC2347Wu0;
import defpackage.LG1;
import defpackage.SD1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public final InterfaceC1171Hu0 a;

    @Nullable
    public final String b;

    @NotNull
    public final C6740tH1 c;

    public a(String str) {
        SD1 scopes = SD1.a;
        Intrinsics.checkNotNullExpressionValue(scopes, "getInstance(...)");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.a = scopes;
        this.b = str;
        this.c = new C6740tH1(scopes.p());
        LG1.d().a("SQLite");
    }

    public final <T> T a(@NotNull String sql, @NotNull Function0<? extends T> operation) {
        InterfaceC2347Wu0 interfaceC2347Wu0V;
        C6740tH1 c6740tH1;
        C3561eO1 c3561eO1W;
        C6740tH1 c6740tH2 = this.c;
        String str = this.b;
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(operation, "operation");
        InterfaceC1171Hu0 interfaceC1171Hu0 = this.a;
        AbstractC3118cG1 abstractC3118cG1Now = interfaceC1171Hu0.p().getDateProvider().now();
        try {
            T tInvoke = operation.invoke();
            if (tInvoke instanceof CrossProcessCursor) {
                return (T) new b((CrossProcessCursor) tInvoke, this, sql);
            }
            InterfaceC2347Wu0 interfaceC2347Wu0E = interfaceC1171Hu0.e();
            interfaceC2347Wu0V = interfaceC2347Wu0E != null ? interfaceC2347Wu0E.v("db.sql.query", sql, abstractC3118cG1Now, EnumC6511sB0.SENTRY) : null;
            if (interfaceC2347Wu0V != null) {
                try {
                    c3561eO1W = interfaceC2347Wu0V.w();
                } catch (Throwable th) {
                    th = th;
                    try {
                        InterfaceC2347Wu0 interfaceC2347Wu0E2 = interfaceC1171Hu0.e();
                        if (interfaceC2347Wu0E2 != null) {
                            c6740tH1 = c6740tH2;
                            try {
                                interfaceC2347Wu0V = interfaceC2347Wu0E2.v("db.sql.query", sql, abstractC3118cG1Now, EnumC6511sB0.SENTRY);
                            } catch (Throwable th2) {
                                th = th2;
                                if (interfaceC2347Wu0V != null) {
                                    boolean zC = interfaceC1171Hu0.p().getThreadChecker().c();
                                    interfaceC2347Wu0V.m(Boolean.valueOf(zC), "blocked_main_thread");
                                    if (zC) {
                                        interfaceC2347Wu0V.m(c6740tH1.a(), "call_stack");
                                    }
                                    if (str != null) {
                                        interfaceC2347Wu0V.m("sqlite", "db.system");
                                        interfaceC2347Wu0V.m(str, "db.name");
                                    } else {
                                        interfaceC2347Wu0V.m("in-memory", "db.system");
                                    }
                                    interfaceC2347Wu0V.l();
                                }
                                throw th;
                            }
                        } else {
                            c6740tH1 = c6740tH2;
                            interfaceC2347Wu0V = null;
                        }
                        C3561eO1 c3561eO1W2 = interfaceC2347Wu0V != null ? interfaceC2347Wu0V.w() : null;
                        if (c3561eO1W2 != null) {
                            c3561eO1W2.m = "auto.db.sqlite";
                        }
                        if (interfaceC2347Wu0V != null) {
                            interfaceC2347Wu0V.o(EnumC4869kO1.INTERNAL_ERROR);
                        }
                        if (interfaceC2347Wu0V != null) {
                            interfaceC2347Wu0V.i(th);
                        }
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                        c6740tH1 = c6740tH2;
                    }
                }
            } else {
                c3561eO1W = null;
            }
            if (c3561eO1W != null) {
                c3561eO1W.m = "auto.db.sqlite";
            }
            if (interfaceC2347Wu0V != null) {
                interfaceC2347Wu0V.o(EnumC4869kO1.OK);
            }
            if (interfaceC2347Wu0V != null) {
                boolean zC2 = interfaceC1171Hu0.p().getThreadChecker().c();
                interfaceC2347Wu0V.m(Boolean.valueOf(zC2), "blocked_main_thread");
                if (zC2) {
                    interfaceC2347Wu0V.m(c6740tH2.a(), "call_stack");
                }
                if (str != null) {
                    interfaceC2347Wu0V.m("sqlite", "db.system");
                    interfaceC2347Wu0V.m(str, "db.name");
                } else {
                    interfaceC2347Wu0V.m("in-memory", "db.system");
                }
                interfaceC2347Wu0V.l();
            }
            return tInvoke;
        } catch (Throwable th4) {
            th = th4;
            interfaceC2347Wu0V = null;
        }
    }
}
