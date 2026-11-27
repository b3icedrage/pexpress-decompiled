package defpackage;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.android.core.b0;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: In0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1228In0 {
    public static final boolean g;
    public static final boolean h;
    public static final File i;
    public static volatile C1228In0 j;
    public static volatile int k;
    public final boolean a;
    public final int b;
    public final int c;
    public int d;
    public boolean e = true;
    public final AtomicBoolean f = new AtomicBoolean(false);

    static {
        int i2 = Build.VERSION.SDK_INT;
        g = i2 < 29;
        h = i2 >= 26;
        i = new File("/proc/self/fd");
        k = -1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0060  */
    /* JADX WARN: Code duplicated, block: B:14:0x0062  */
    public C1228In0() {
        boolean zContains;
        boolean z;
        if (Build.VERSION.SDK_INT != 26) {
            if (Build.VERSION.SDK_INT != 27) {
                zContains = false;
            } else {
                zContains = Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
            }
            z = zContains ? false : true;
        } else {
            Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Build.MODEL.startsWith((String) it.next())) {
                    }
                } else {
                    if (Build.VERSION.SDK_INT != 27) {
                        zContains = false;
                    } else {
                        zContains = Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
                    }
                    if (zContains) {
                    }
                }
            }
        }
        this.a = z;
        if (Build.VERSION.SDK_INT >= 28) {
            this.b = 20000;
            this.c = 0;
        } else {
            this.b = 700;
            this.c = UserVerificationMethods.USER_VERIFY_PATTERN;
        }
    }

    public static C1228In0 a() {
        if (j == null) {
            synchronized (C1228In0.class) {
                try {
                    if (j == null) {
                        j = new C1228In0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public final boolean b(int i2, int i3, boolean z, boolean z2) {
        boolean z3;
        if (!z) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!this.a) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!h) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (g && !this.f.get()) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (z2) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        int i4 = this.c;
        if (i2 < i4) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (i3 < i4) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        synchronized (this) {
            try {
                int i5 = this.d + 1;
                this.d = i5;
                if (i5 >= 50) {
                    this.d = 0;
                    int length = i.list().length;
                    long j2 = k != -1 ? k : this.b;
                    boolean z4 = ((long) length) < j2;
                    this.e = z4;
                    if (!z4 && Log.isLoggable("Downsampler", 5)) {
                        b0.e("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j2);
                    }
                }
                z3 = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            return true;
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }
}
