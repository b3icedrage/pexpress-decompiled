package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public final class LH1 implements Executor {
    public static final Logger j = Logger.getLogger(LH1.class.getName());
    public final Executor d;
    public final ArrayDeque e = new ArrayDeque();
    public c g = c.d;
    public long h = 0;
    public final b i = new b();

    public class a implements Runnable {
        public final /* synthetic */ Runnable d;

        public a(Runnable runnable) {
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.run();
        }

        public final String toString() {
            return this.d.toString();
        }
    }

    public final class b implements Runnable {

        @CheckForNull
        public Runnable d;

        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0036 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        
            r9.d.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
        
            defpackage.LH1.j.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.d, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
        
            r9.d = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                LH1 r2 = defpackage.LH1.this     // Catch: java.lang.Throwable -> L50
                java.util.ArrayDeque r2 = r2.e     // Catch: java.lang.Throwable -> L50
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L50
                if (r0 != 0) goto L28
                LH1 r0 = defpackage.LH1.this     // Catch: java.lang.Throwable -> L1c
                LH1$c r3 = r0.g     // Catch: java.lang.Throwable -> L1c
                LH1$c r4 = LH1.c.h     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L40
            L14:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L40
            L1c:
                r0 = move-exception
                goto L73
            L1e:
                long r5 = r0.h     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.h = r5     // Catch: java.lang.Throwable -> L1c
                r0.g = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                LH1 r3 = defpackage.LH1.this     // Catch: java.lang.Throwable -> L1c
                java.util.ArrayDeque r3 = r3.e     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                r9.d = r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L41
                LH1 r0 = defpackage.LH1.this     // Catch: java.lang.Throwable -> L1c
                LH1$c r3 = LH1.c.d     // Catch: java.lang.Throwable -> L1c
                r0.g = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L40
                goto L14
            L40:
                return
            L41:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L50
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r9.d     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
                r3.run()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            L4d:
                r9.d = r2     // Catch: java.lang.Throwable -> L50
                goto L2
            L50:
                r0 = move-exception
                goto L75
            L52:
                r0 = move-exception
                goto L70
            L54:
                r3 = move-exception
                java.util.logging.Logger r4 = defpackage.LH1.j     // Catch: java.lang.Throwable -> L52
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L52
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
                r6.<init>()     // Catch: java.lang.Throwable -> L52
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L52
                java.lang.Runnable r7 = r9.d     // Catch: java.lang.Throwable -> L52
                r6.append(r7)     // Catch: java.lang.Throwable -> L52
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L52
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L52
                goto L4d
            L70:
                r9.d = r2     // Catch: java.lang.Throwable -> L50
                throw r0     // Catch: java.lang.Throwable -> L50
            L73:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L50
            L75:
                if (r1 == 0) goto L7e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L7e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: LH1.b.a():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e) {
                synchronized (LH1.this.e) {
                    LH1.this.g = c.d;
                    throw e;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.d;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + LH1.this.g + "}";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c d;
        public static final c e;
        public static final c g;
        public static final c h;
        public static final /* synthetic */ c[] i;

        static {
            c cVar = new c("IDLE", 0);
            d = cVar;
            c cVar2 = new c("QUEUING", 1);
            e = cVar2;
            c cVar3 = new c("QUEUED", 2);
            g = cVar3;
            c cVar4 = new c("RUNNING", 3);
            h = cVar4;
            i = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) i.clone();
        }
    }

    public LH1(Executor executor) {
        this.d = (Executor) Preconditions.checkNotNull(executor);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c cVar;
        boolean z;
        Preconditions.checkNotNull(runnable);
        synchronized (this.e) {
            c cVar2 = this.g;
            if (cVar2 != c.h && cVar2 != (cVar = c.g)) {
                long j2 = this.h;
                a aVar = new a(runnable);
                this.e.add(aVar);
                c cVar3 = c.e;
                this.g = cVar3;
                try {
                    this.d.execute(this.i);
                    if (this.g != cVar3) {
                        return;
                    }
                    synchronized (this.e) {
                        try {
                            if (this.h == j2 && this.g == cVar3) {
                                this.g = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.e) {
                        try {
                            c cVar4 = this.g;
                            if (cVar4 != c.d && cVar4 != c.e) {
                                z = false;
                            } else if (this.e.removeLastOccurrence(aVar)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.e.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.d + "}";
    }
}
