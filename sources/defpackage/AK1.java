package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import io.sentry.android.core.b0;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class AK1 {
    public final SharedPreferences a;
    public final ScheduledThreadPoolExecutor e;
    public final ArrayDeque<String> d = new ArrayDeque<>();
    public final String b = "topic_operation_queue";
    public final String c = ",";

    public AK1(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = sharedPreferences;
        this.e = scheduledThreadPoolExecutor;
    }

    public static AK1 a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        AK1 ak1 = new AK1(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (ak1.d) {
            try {
                ak1.d.clear();
                String string = ak1.a.getString(ak1.b, "");
                if (!TextUtils.isEmpty(string) && string.contains(ak1.c)) {
                    String[] strArrSplit = string.split(ak1.c, -1);
                    if (strArrSplit.length == 0) {
                        b0.c("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ak1.d.add(str);
                        }
                    }
                    return ak1;
                }
                return ak1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
