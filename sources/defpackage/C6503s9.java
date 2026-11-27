package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: s9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6503s9 {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: renamed from: s9$a */
    public static class a {
        public static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    static {
        AS0.d("Alarms");
    }

    public static void a(@NonNull Context context, @NonNull C3429dk2 c3429dk2, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = C5683oF.i;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        C5683oF.d(intent, c3429dk2);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        AS0 as0C = AS0.c();
        c3429dk2.toString();
        as0C.getClass();
        alarmManager.cancel(service);
    }

    public static void b(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull C3429dk2 generationalId, long j) {
        VW1 vw1R = workDatabase.r();
        UW1 uw1B = vw1R.b(generationalId);
        if (uw1B != null) {
            int i = uw1B.c;
            a(context, generationalId, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = C5683oF.i;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            C5683oF.d(intent, generationalId);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        final C7292vv0 c7292vv0 = new C7292vv0(workDatabase);
        Object objM = workDatabase.m(new Callable() { // from class: tv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C7292vv0 this$0 = c7292vv0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                WorkDatabase workDatabase2 = this$0.a;
                Long lA = workDatabase2.q().a("next_alarm_manager_id");
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                workDatabase2.q().b(new C5562ng1("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objM, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int iIntValue = ((Number) objM).intValue();
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        vw1R.d(new UW1(generationalId.a, generationalId.b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = C5683oF.i;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        C5683oF.d(intent2, generationalId);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j, service2);
        }
    }
}
