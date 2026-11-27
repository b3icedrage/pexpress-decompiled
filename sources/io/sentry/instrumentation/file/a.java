package io.sentry.instrumentation.file;

import defpackage.C1039Gc0;
import defpackage.C2688aH1;
import defpackage.C4694ja0;
import defpackage.C6740tH1;
import defpackage.EnumC4869kO1;
import defpackage.InterfaceC2347Wu0;
import defpackage.LG1;
import io.sentry.util.x;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @Nullable
    public final InterfaceC2347Wu0 a;

    @Nullable
    public final File b;

    @NotNull
    public final C2688aH1 c;

    @NotNull
    public EnumC4869kO1 d = EnumC4869kO1.OK;
    public long e;

    @NotNull
    public final C6740tH1 f;

    /* JADX INFO: renamed from: io.sentry.instrumentation.file.a$a, reason: collision with other inner class name */
    @FunctionalInterface
    public interface InterfaceC0395a<T> {
        T call();
    }

    public a(@Nullable InterfaceC2347Wu0 interfaceC2347Wu0, @Nullable File file, @NotNull C2688aH1 c2688aH1) {
        this.a = interfaceC2347Wu0;
        this.b = file;
        this.c = c2688aH1;
        this.f = new C6740tH1(c2688aH1);
        LG1.d().a("FileIO");
    }

    public final void a(@NotNull Closeable closeable) {
        try {
            try {
                closeable.close();
                b();
            } catch (IOException e) {
                this.d = EnumC4869kO1.INTERNAL_ERROR;
                InterfaceC2347Wu0 interfaceC2347Wu0 = this.a;
                if (interfaceC2347Wu0 != null) {
                    interfaceC2347Wu0.i(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }

    public final void b() {
        String strD;
        InterfaceC2347Wu0 interfaceC2347Wu0 = this.a;
        if (interfaceC2347Wu0 != null) {
            String strA = x.a(this.e);
            File file = this.b;
            C2688aH1 c2688aH1 = this.c;
            if (file != null) {
                String strA2 = x.a(this.e);
                if (c2688aH1.isSendDefaultPii()) {
                    strD = file.getName() + " (" + strA2 + ")";
                } else {
                    int iLastIndexOf = file.getName().lastIndexOf(46);
                    strD = (iLastIndexOf <= 0 || iLastIndexOf >= file.getName().length() + (-1)) ? C1039Gc0.d("*** (", strA2, ")") : C4694ja0.a("***", file.getName().substring(iLastIndexOf), " (", strA2, ")");
                }
                interfaceC2347Wu0.q(strD);
                if (c2688aH1.isSendDefaultPii()) {
                    interfaceC2347Wu0.m(file.getAbsolutePath(), "file.path");
                }
            } else {
                interfaceC2347Wu0.q(strA);
            }
            interfaceC2347Wu0.m(Long.valueOf(this.e), "file.size");
            boolean zC = c2688aH1.getThreadChecker().c();
            interfaceC2347Wu0.m(Boolean.valueOf(zC), "blocked_main_thread");
            if (zC) {
                interfaceC2347Wu0.m(this.f.a(), "call_stack");
            }
            interfaceC2347Wu0.A(this.d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T c(@NotNull InterfaceC0395a<T> interfaceC0395a) {
        try {
            T tCall = interfaceC0395a.call();
            if (tCall instanceof Integer) {
                int iIntValue = ((Integer) tCall).intValue();
                if (iIntValue != -1) {
                    this.e += (long) iIntValue;
                    return tCall;
                }
            } else if (tCall instanceof Long) {
                long jLongValue = ((Long) tCall).longValue();
                if (jLongValue != -1) {
                    this.e += jLongValue;
                }
            }
            return tCall;
        } catch (IOException e) {
            this.d = EnumC4869kO1.INTERNAL_ERROR;
            InterfaceC2347Wu0 interfaceC2347Wu0 = this.a;
            if (interfaceC2347Wu0 != null) {
                interfaceC2347Wu0.i(e);
            }
            throw e;
        }
    }
}
