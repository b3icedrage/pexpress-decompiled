package defpackage;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.instrumentation.file.k;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class LO {
    public static final C6170qb g = C6170qb.d();
    public static final long h = TimeUnit.SECONDS.toMicros(1);
    public ScheduledFuture e = null;
    public long f = -1;
    public final ConcurrentLinkedQueue<MO> a = new ConcurrentLinkedQueue<>();
    public final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public final String c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
    public final long d = Os.sysconf(OsConstants._SC_CLK_TCK);

    @SuppressLint({"ThreadPoolCreation"})
    public LO() {
    }

    public final synchronized void a(long j, QZ1 qz1) {
        this.f = j;
        try {
            this.e = this.b.scheduleAtFixedRate(new JO(0, this, qz1), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            g.f("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    public final MO b(QZ1 qz1) {
        long j = this.d;
        C6170qb c6170qb = g;
        if (qz1 == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new k(this.c));
            try {
                long jA = qz1.a() + qz1.d;
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                long j2 = Long.parseLong(strArrSplit[13]);
                long j3 = Long.parseLong(strArrSplit[15]);
                long j4 = Long.parseLong(strArrSplit[14]);
                long j5 = Long.parseLong(strArrSplit[16]);
                MO.a aVarZ = MO.z();
                aVarZ.p();
                MO.w((MO) aVarZ.e, jA);
                double d = (j4 + j5) / j;
                long j6 = h;
                long jRound = Math.round(d * j6);
                aVarZ.p();
                MO.y((MO) aVarZ.e, jRound);
                long jRound2 = Math.round(((j2 + j3) / j) * j6);
                aVarZ.p();
                MO.x((MO) aVarZ.e, jRound2);
                MO moN = aVarZ.n();
                bufferedReader.close();
                return moN;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            c6170qb.f("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            c6170qb.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            c6170qb.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            c6170qb.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }
}
