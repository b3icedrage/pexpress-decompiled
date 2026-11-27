package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import defpackage.C6180qd1;
import defpackage.InterfaceC6030pu0;
import defpackage.NG1;
import io.sentry.ILogger;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.sentry.android.core.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4499j implements InterfaceC6030pu0 {

    @NotNull
    public final ILogger g;
    public long a = 0;
    public long b = 0;
    public long c = 1;
    public long d = 1;
    public double e = 1.0E9d / 1;

    @NotNull
    public final File f = new File("/proc/self/stat");
    public boolean h = false;

    @NotNull
    public final Pattern i = Pattern.compile("[\n\t\r ]");

    public C4499j(@NotNull ILogger iLogger) {
        io.sentry.util.p.b(iLogger, "Logger is required.");
        this.g = iLogger;
    }

    @Override // defpackage.InterfaceC6030pu0
    public final void a() {
        this.h = true;
        this.c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.e = 1.0E9d / this.c;
        this.b = d();
    }

    @Override // defpackage.InterfaceC6030pu0
    public final void c(@NotNull C6180qd1 c6180qd1) {
        if (this.h) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = jElapsedRealtimeNanos - this.a;
            this.a = jElapsedRealtimeNanos;
            long jD = d();
            long j2 = jD - this.b;
            this.b = jD;
            c6180qd1.a = Double.valueOf(((j2 / j) / this.d) * 100.0d);
        }
    }

    public final long d() {
        String strC;
        ILogger iLogger = this.g;
        try {
            strC = io.sentry.util.f.c(this.f);
        } catch (IOException e) {
            this.h = false;
            iLogger.d(NG1.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e);
            strC = null;
        }
        if (strC != null) {
            String[] strArrSplit = this.i.split(strC.trim());
            try {
                return (long) ((Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.e);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e2) {
                iLogger.d(NG1.ERROR, "Error parsing /proc/self/stat file.", e2);
            }
        }
        return 0L;
    }
}
