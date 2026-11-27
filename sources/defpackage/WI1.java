package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.b0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class WI1 {
    public final C5923pP a;
    public final C7393wP b;
    public final C3994gT c;
    public final C5303mS0 d;
    public final C6592sb2 e;

    public WI1(C5923pP c5923pP, C7393wP c7393wP, C3994gT c3994gT, C5303mS0 c5303mS0, C6592sb2 c6592sb2) {
        this.a = c5923pP;
        this.b = c7393wP;
        this.c = c3994gT;
        this.d = c5303mS0;
        this.e = c6592sb2;
    }

    public static C4070go a(C4070go c4070go, C5303mS0 c5303mS0, C6592sb2 c6592sb2) {
        C4070go.a aVar = new C4070go.a();
        aVar.a = Long.valueOf(c4070go.a);
        aVar.b = c4070go.b;
        AbstractC5713oP.e.d.a aVar2 = c4070go.c;
        aVar.c = aVar2;
        aVar.d = c4070go.d;
        aVar.e = c4070go.e;
        String strB = c5303mS0.b.b();
        if (strB != null) {
            aVar.e = new C6011po(strB);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 2);
        }
        ArrayList arrayListC = c(c6592sb2.d.a());
        ArrayList arrayListC2 = c(c6592sb2.e.a());
        if (!arrayListC.isEmpty() || !arrayListC2.isEmpty()) {
            C4280ho.a aVarF = aVar2.f();
            aVarF.b = new C1255Iw0<>(arrayListC);
            aVarF.c = new C1255Iw0<>(arrayListC2);
            String strConcat = aVarF.a == null ? " execution" : "";
            if (aVarF.e == null) {
                strConcat = strConcat.concat(" uiOrientation");
            }
            if (!strConcat.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(strConcat));
            }
            aVar.c = new C4280ho(aVarF.a, aVarF.b, aVarF.c, aVarF.d, aVarF.e.intValue());
        }
        return aVar.a();
    }

    public static WI1 b(Context context, C7503wv0 c7503wv0, C4448id0 c4448id0, C1434Le c1434Le, C5303mS0 c5303mS0, C6592sb2 c6592sb2, C4376iG0 c4376iG0, C7587xJ1 c7587xJ1, X81 x81) {
        C5923pP c5923pP = new C5923pP(context, c7503wv0, c1434Le, c4376iG0, c7587xJ1);
        C7393wP c7393wP = new C7393wP(c4448id0, c7587xJ1);
        C6342rP c6342rP = C3994gT.b;
        C3081c52.b(context);
        return new WI1(c5923pP, c7393wP, new C3994gT(new C3036bs1(C3081c52.a().c(new C2612Zw(C3994gT.c, C3994gT.d)).a("FIREBASE_CRASHLYTICS_REPORT", new H60("json"), C3994gT.e), c7587xJ1.b(), x81)), c5303mS0, c6592sb2);
    }

    @NonNull
    public static ArrayList c(@NonNull Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new C2507Yn(str, str2));
        }
        Collections.sort(arrayList, new UI1());
        return arrayList;
    }

    public final Task d(String str, @NonNull ExecutorService executorService) {
        TaskCompletionSource<AbstractC7603xP> taskCompletionSource;
        ArrayList<File> arrayListB = this.b.b();
        ArrayList<AbstractC7603xP> arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                C6342rP c6342rP = C7393wP.f;
                String strE = C7393wP.e(file);
                c6342rP.getClass();
                arrayList.add(new C2243Vn(C6342rP.g(strE), file.getName(), file));
            } catch (IOException e) {
                b0.f("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC7603xP abstractC7603xP : arrayList) {
            if (str == null || str.equals(abstractC7603xP.c())) {
                C3994gT c3994gT = this.c;
                boolean z = str != null;
                C3036bs1 c3036bs1 = c3994gT.a;
                synchronized (c3036bs1.e) {
                    try {
                        taskCompletionSource = new TaskCompletionSource<>();
                        if (z) {
                            ((AtomicInteger) c3036bs1.h.a).getAndIncrement();
                            if (c3036bs1.e.size() < c3036bs1.d) {
                                abstractC7603xP.getClass();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                c3036bs1.e.size();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                c3036bs1.f.execute(new C3036bs1.a(abstractC7603xP, c3036bs1, taskCompletionSource));
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                taskCompletionSource.trySetResult(abstractC7603xP);
                            } else {
                                c3036bs1.a();
                                abstractC7603xP.getClass();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                ((AtomicInteger) c3036bs1.h.b).getAndIncrement();
                                taskCompletionSource.trySetResult(abstractC7603xP);
                            }
                        } else {
                            c3036bs1.b(abstractC7603xP, taskCompletionSource);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executorService, new VI1(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
