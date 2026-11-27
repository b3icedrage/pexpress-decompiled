package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.b0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class VO implements Callable<Task<Void>> {
    public final /* synthetic */ long d;
    public final /* synthetic */ Throwable e;
    public final /* synthetic */ Thread g;
    public final /* synthetic */ C7587xJ1 h;
    public final /* synthetic */ YO i;

    public VO(YO yo, long j, Throwable th, Thread thread, C7587xJ1 c7587xJ1) {
        this.i = yo;
        this.d = j;
        this.e = th;
        this.g = thread;
        this.h = c7587xJ1;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        long j = this.d;
        long j2 = j / 1000;
        YO yo = this.i;
        NavigableSet navigableSetC = yo.l.b.c();
        String str = !navigableSetC.isEmpty() ? (String) navigableSetC.first() : null;
        if (str == null) {
            b0.d("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        yo.c.a();
        WI1 wi1 = yo.l;
        wi1.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        C5923pP c5923pP = wi1.a;
        Context context = c5923pP.a;
        int i = context.getResources().getConfiguration().orientation;
        Throwable th = this.e;
        String localizedMessage = th.getLocalizedMessage();
        String name = th.getClass().getName();
        StackTraceElement[] stackTrace = th.getStackTrace();
        C4376iG0 c4376iG0 = c5923pP.d;
        StackTraceElement[] stackTraceElementArrB = c4376iG0.b(stackTrace);
        Throwable cause = th.getCause();
        C5441n52 c5441n52 = cause != null ? new C5441n52(cause, c4376iG0) : null;
        C4070go.a aVar = new C4070go.a();
        aVar.b = AppMeasurement.CRASH_ORIGIN;
        aVar.a = Long.valueOf(j2);
        C1434Le c1434Le = c5923pP.c;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            runningAppProcessInfo = null;
            break;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                runningAppProcessInfo = null;
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            Iterator<ActivityManager.RunningAppProcessInfo> it2 = it;
            if (next.processName.equals(c1434Le.e)) {
                runningAppProcessInfo = next;
                break;
            }
            it = it2;
        }
        Boolean boolValueOf = runningAppProcessInfo != null ? Boolean.valueOf(runningAppProcessInfo.importance != 100) : null;
        ArrayList arrayList = new ArrayList();
        Thread thread = this.g;
        Boolean bool = boolValueOf;
        arrayList.add(C5923pP.e(thread, stackTraceElementArrB, 4));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            if (!key.equals(thread)) {
                arrayList.add(C5923pP.e(key, c4376iG0.b(entry.getValue()), 0));
            }
            c4376iG0 = c4376iG0;
            thread = thread;
        }
        aVar.c = new C4280ho(new C4489io(new C1255Iw0(arrayList), new C4958ko(name, localizedMessage, new C1255Iw0(C5923pP.d(stackTraceElementArrB, 4)), c5441n52 != null ? C5923pP.c(c5441n52, 1) : null, 0), null, new C5168lo("0", "0", 0L), c5923pP.a()), null, null, bool, i);
        aVar.d = c5923pP.b(i);
        wi1.b.d(WI1.a(aVar.a(), wi1.d, wi1.e), str, true);
        try {
            C4448id0 c4448id0 = yo.g;
            String str2 = ".ae" + j;
            c4448id0.getClass();
            if (!new File(c4448id0.b, str2).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            b0.f("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        C7587xJ1 c7587xJ1 = this.h;
        yo.c(false, c7587xJ1);
        new C2839ax(yo.f);
        YO.a(yo, C2839ax.b);
        if (!yo.b.a()) {
            return Tasks.forResult(null);
        }
        ExecutorService executorService = (ExecutorService) yo.e.a;
        return c7587xJ1.i.get().getTask().onSuccessTask(executorService, new UO(this, executorService, str));
    }
}
