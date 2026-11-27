package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: pP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5923pP {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final C7503wv0 b;
    public final C1434Le c;
    public final C4376iG0 d;
    public final C7587xJ1 e;

    static {
        HashMap map = new HashMap();
        f = map;
        Z0.e(5, map, "armeabi", 6, "armeabi-v7a");
        Z0.e(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/18.3.5";
    }

    public C5923pP(Context context, C7503wv0 c7503wv0, C1434Le c1434Le, C4376iG0 c4376iG0, C7587xJ1 c7587xJ1) {
        this.a = context;
        this.b = c7503wv0;
        this.c = c1434Le;
        this.d = c4376iG0;
        this.e = c7587xJ1;
    }

    public static C4958ko c(C5441n52 c5441n52, int i) {
        String str = c5441n52.b;
        int i2 = 0;
        StackTraceElement[] stackTraceElementArr = c5441n52.c;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C5441n52 c5441n53 = c5441n52.d;
        if (i >= 8) {
            for (C5441n52 c5441n54 = c5441n53; c5441n54 != null; c5441n54 = c5441n54.d) {
                i2++;
            }
        }
        int i3 = i2;
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        C1255Iw0 c1255Iw0 = new C1255Iw0(d(stackTraceElementArr, 4));
        C4958ko c4958koC = null;
        if (c5441n53 != null && i3 == 0) {
            c4958koC = c(c5441n53, i + 1);
        }
        return new C4958ko(str, c5441n52.a, c1255Iw0, c4958koC, i3);
    }

    public static C1255Iw0 d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            C5591no.a aVar = new C5591no.a();
            aVar.e = Integer.valueOf(i);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            aVar.a = Long.valueOf(jMax);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            aVar.b = str;
            aVar.c = fileName;
            aVar.d = Long.valueOf(lineNumber);
            arrayList.add(aVar.a());
        }
        return new C1255Iw0(arrayList);
    }

    public static C5381mo e(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        String name = thread.getName();
        if (name != null) {
            return new C5381mo(name, i, new C1255Iw0(d(stackTraceElementArr, i)));
        }
        throw new NullPointerException("Null name");
    }

    public final C1255Iw0<AbstractC5713oP.e.d.a.b.AbstractC0459a> a() {
        C1434Le c1434Le = this.c;
        String str = c1434Le.e;
        if (str != null) {
            return new C1255Iw0<>(Arrays.asList(new C4748jo(0L, 0L, str, c1434Le.b)));
        }
        throw new NullPointerException("Null name");
    }

    public final C5801oo b(int i) {
        boolean z;
        Float fValueOf;
        Context context = this.a;
        int i2 = 2;
        boolean z2 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    fValueOf = (intExtra2 == -1 || intExtra3 == -1) ? null : Float.valueOf(intExtra2 / intExtra3);
                } catch (IllegalStateException e) {
                    e = e;
                    b0.d("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
            } else {
                fValueOf = null;
                z = false;
            }
        } catch (IllegalStateException e2) {
            e = e2;
            z = false;
        }
        Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
        if (!z || fValueOf == null) {
            i2 = 1;
        } else if (fValueOf.floatValue() >= 0.99d) {
            i2 = 3;
        }
        if (!C7155vG.g() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z2 = true;
        }
        long jE = C7155vG.e();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = jE - memoryInfo.availMem;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
        C5801oo.a aVar = new C5801oo.a();
        aVar.a = dValueOf;
        aVar.b = Integer.valueOf(i2);
        aVar.c = Boolean.valueOf(z2);
        aVar.d = Integer.valueOf(i);
        aVar.e = Long.valueOf(j);
        aVar.f = Long.valueOf(blockCount);
        return aVar.a();
    }
}
