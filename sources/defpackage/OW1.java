package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OW1 implements R90 {
    public static final String n = AS0.d("SystemAlarmDispatcher");
    public final Context d;
    public final C4946kk2 e;
    public final Vk2 g;
    public final C0743Ch1 h;
    public final C4736jk2 i;
    public final C5683oF j;
    public final ArrayList k;
    public Intent l;
    public SystemAlarmService m;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AS0 as0C;
            OW1 ow1;
            synchronized (OW1.this.k) {
                OW1 ow2 = OW1.this;
                ow2.l = (Intent) ow2.k.get(0);
            }
            Intent intent = OW1.this.l;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = OW1.this.l.getIntExtra("KEY_START_ID", 0);
                AS0 as0C2 = AS0.c();
                String str = OW1.n;
                Objects.toString(OW1.this.l);
                as0C2.getClass();
                PowerManager.WakeLock wakeLockA = Bf2.a(OW1.this.d, action + " (" + intExtra + ")");
                try {
                    AS0 as0C3 = AS0.c();
                    Objects.toString(wakeLockA);
                    as0C3.getClass();
                    wakeLockA.acquire();
                    OW1 ow3 = OW1.this;
                    ow3.j.b(intExtra, ow3, ow3.l);
                    AS0 as0C4 = AS0.c();
                    wakeLockA.toString();
                    as0C4.getClass();
                    wakeLockA.release();
                    OW1 ow4 = OW1.this;
                    ow4.e.c.execute(new c(ow4));
                } catch (Throwable th) {
                    try {
                        AS0.c().b(OW1.n, "Unexpected error in onHandleIntent", th);
                        as0C = AS0.c();
                    } finally {
                        as0C = AS0.c();
                        String str2 = OW1.n;
                        Objects.toString(wakeLockA);
                        as0C.getClass();
                        wakeLockA.release();
                        ow1 = OW1.this;
                        ow1.e.c.execute(new c(ow1));
                    }
                }
            }
        }
    }

    public static class b implements Runnable {
        public final OW1 d;
        public final Intent e;
        public final int g;

        public b(int i, @NonNull OW1 ow1, @NonNull Intent intent) {
            this.d = ow1;
            this.e = intent;
            this.g = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Intent intent = this.e;
            this.d.b(this.g, intent);
        }
    }

    public static class c implements Runnable {
        public final OW1 d;

        public c(@NonNull OW1 ow1) {
            this.d = ow1;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:4:0x0012, B:6:0x0016, B:8:0x0033, B:11:0x0039, B:12:0x0040, B:13:0x0041, B:14:0x0049, B:18:0x0053, B:20:0x005b, B:21:0x005d, B:25:0x0067, B:27:0x0072, B:35:0x0084, B:31:0x0078, B:32:0x0079, B:34:0x0081, B:39:0x0088, B:22:0x005e, B:23:0x0064, B:15:0x004a, B:16:0x0050), top: B:46:0x0012, inners: #0, #1 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:4:0x0012, B:6:0x0016, B:8:0x0033, B:11:0x0039, B:12:0x0040, B:13:0x0041, B:14:0x0049, B:18:0x0053, B:20:0x005b, B:21:0x005d, B:25:0x0067, B:27:0x0072, B:35:0x0084, B:31:0x0078, B:32:0x0079, B:34:0x0081, B:39:0x0088, B:22:0x005e, B:23:0x0064, B:15:0x004a, B:16:0x0050), top: B:46:0x0012, inners: #0, #1 }] */
        @Override // java.lang.Runnable
        public final void run() {
            boolean zIsEmpty;
            boolean zIsEmpty2;
            OW1 ow1 = this.d;
            ow1.getClass();
            AS0.c().getClass();
            OW1.c();
            synchronized (ow1.k) {
                try {
                    if (ow1.l != null) {
                        AS0 as0C = AS0.c();
                        Objects.toString(ow1.l);
                        as0C.getClass();
                        if (!((Intent) ow1.k.remove(0)).equals(ow1.l)) {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                        ow1.l = null;
                    }
                    TH1 th1 = ow1.e.a;
                    C5683oF c5683oF = ow1.j;
                    synchronized (c5683oF.g) {
                        zIsEmpty = c5683oF.e.isEmpty();
                    }
                    if (zIsEmpty && ow1.k.isEmpty()) {
                        synchronized (th1.h) {
                            zIsEmpty2 = th1.d.isEmpty();
                        }
                        if (zIsEmpty2) {
                            AS0.c().getClass();
                            SystemAlarmService systemAlarmService = ow1.m;
                            if (systemAlarmService != null) {
                                systemAlarmService.a();
                            }
                        } else if (!ow1.k.isEmpty()) {
                            ow1.d();
                        }
                    } else if (!ow1.k.isEmpty()) {
                        ow1.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public OW1(@NonNull SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.d = applicationContext;
        this.j = new C5683oF(applicationContext, new C6344rP1());
        C4736jk2 c4736jk2B = C4736jk2.b(systemAlarmService);
        this.i = c4736jk2B;
        this.g = new Vk2(c4736jk2B.b.e);
        C0743Ch1 c0743Ch1 = c4736jk2B.f;
        this.h = c0743Ch1;
        this.e = c4736jk2B.d;
        c0743Ch1.b(this);
        this.k = new ArrayList();
        this.l = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // defpackage.R90
    public final void a(@NonNull C3429dk2 c3429dk2, boolean z) {
        C4946kk2.a aVar = this.e.c;
        String str = C5683oF.i;
        Intent intent = new Intent(this.d, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        C5683oF.d(intent, c3429dk2);
        aVar.execute(new b(0, this, intent));
    }

    public final void b(int i, @NonNull Intent intent) {
        AS0 as0C = AS0.c();
        String str = n;
        Objects.toString(intent);
        as0C.getClass();
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AS0.c().e(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.k) {
                try {
                    Iterator it = this.k.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.k) {
            try {
                boolean zIsEmpty = this.k.isEmpty();
                this.k.add(intent);
                if (zIsEmpty) {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        c();
        PowerManager.WakeLock wakeLockA = Bf2.a(this.d, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.i.d.a(new a());
        } finally {
            wakeLockA.release();
        }
    }
}
